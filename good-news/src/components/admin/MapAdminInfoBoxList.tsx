import React, { useState } from "react";

import styled from "styled-components";
import Button from "../@common/Button";

// 대피소 상세 정보 모음 (대피소 정보들 + 수정 버튼)
const MapAdminInfoBoxList = () => {
  const [infoModal, setInfoModal] = useState(false);
  const handleEditInfoClick = () => {
    console.log("대피소 상세 정보 모음의 수정 버튼을 클릭했습니다.");
    setInfoModal(true);
  };

  return (
    <>
      <div>
        대피소 상세 정보 모음 (대피소 정보들 + 수정 버튼)
        <div>대피소 정보들 들어가요</div>
        <Button
          size="Medium"
          color="Sub"
          onClick={handleEditInfoClick}
          isActive={true}
        >
          수정
        </Button>
      </div>
      {infoModal && (
        <div>
          이것은 수정버튼 눌렀을 때 모달창 나오는 것
          <StyledModalBackground />
          <StyledModalContent>모달창</StyledModalContent>
        </div>
      )}
    </>
  );
};

export default MapAdminInfoBoxList;

const StyledModalBackground = styled.div`
  position: absolute;
  top: 0;
  left: 0;
  width: 100vw;
  height: 100vh;
  background: rgba(0, 0, 0, 0.6);
`;

const StyledModalContent = styled.div`
  width: 60%;
  height: 75%;
  position: absolute;
  border-radius: 30px;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  background-color: #fff;
`;
