package ksmart31.team02.document.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart31.team02.document.mapper.DocumentManagementMapper;
import ksmart31.team02.document.vo.ApprovalProcess;
import ksmart31.team02.document.vo.DocumentFormCategory;
import ksmart31.team02.document.vo.DraftDocument;

@Service
public class DocumentManagementService {
	@Autowired private DocumentManagementMapper documentManagementMapper;
	
	// 기안문서 삭제
	public int removeDraftDocument(DraftDocument draftDocument) {
		System.out.println("(S) removeDraftDocument() 실행");
		return documentManagementMapper.deleteDraftDocument(draftDocument);
	}
	
	// 기안문서 조회(워크플로우 문서 관리)
	public List<DraftDocument> getDraftDocument() {
		System.out.println("(S) getDraftDocument() 실행");
		List<DraftDocument> list = documentManagementMapper.selectDraftDocument();
		System.out.println("(S) getDraftDocument() list : "+ list);
		return list;
	}
	
	// 관리자 결재선 관리(공통프로세스 목록)
	public List<ApprovalProcess> getApprovalProcess() {
		System.out.println("(S) getApprovalProcess() 실행");
		List<ApprovalProcess> list = documentManagementMapper.selectApprovalProcess();
		System.out.println("(S) getApprovalProcess() list : " + list);
		return list;
	}
	
	// 공통양식 카테고리 목록
	public List<DocumentFormCategory> getDocumentFormManagement() {
		System.out.println("(S) getDocumentFormManagement() 실행");
		List<DocumentFormCategory> list = documentManagementMapper.selectDocumentFormCategory();
		System.out.println("(S) getDocumentFormManagement() list : " + list);
		return list;
	}
}
