import React from 'react';
import styled from 'styled-components';
import AccountIcon from './AccountIcon.jsx';
import MenuIcon from './MenuIcon.jsx';

const AccountMenu = () => {
  return (
    <IconContainer>
      <MenuIcon />
      <AccountIcon />
    </IconContainer>
  );
};

const IconContainer = styled.div`
  display: flex;
  align-items: center;
  background: white;
  justify-content: space-around;
  padding-left: 0.3rem;
  width: 4.8rem;
  height: 2.5rem;
  border-radius: 30px;
`;

export default AccountMenu;
