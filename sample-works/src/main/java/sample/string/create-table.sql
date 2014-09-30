-- �u�V���b�v�G���e�B�e�B�v�e�[�u���̒�`�B
CREATE TABLE M_SHOP (
  SHOP_ID  VARCHAR(8) NOT NULL,
  SHOP_CODE  VARCHAR(80),
  DISTRIBUTOR_NAME_SHOP_NAME  VARCHAR(40),
  SALES_MANAGER_LAST_NAME  VARCHAR(20),
  SALES_MANAGER_FIRST_NAME  VARCHAR(20),
  POSTAL_CODE  VARCHAR(7),
  PREFECTURE  VARCHAR(5),
  CITY  VARCHAR(20),
  TOWN_VILLAGE  VARCHAR(20),
  BUILDING_NAME_ETC  VARCHAR(20),
  TELEPHONE_NUMBER  VARCHAR(15),
  FAX_NUMBER  VARCHAR(15),
  PUBLIC_MAIL_ADDR  VARCHAR(64),
  HOMEPAGE_ADDR  VARCHAR(45),
  SERVICE_GOODS_EXPOSITION  VARCHAR(45),
  CONSTRAINT M_SHOP_PK PRIMARY KEY (SHOP_ID)
)
;

-- �u�V���b�v�T�C�g�G���e�B�e�B�v�e�[�u���̒�`�B
CREATE TABLE M_SHOP_SITE (
  SHOP_ID  VARCHAR(8) NOT NULL,
  TEMPLATE_ID_TOP  VARCHAR(64),
  TEMPLATE_ID_SHELF  VARCHAR(64),
  HEADER  VARCHAR(45),
  FOOTER  VARCHAR(45),
  SITE_NAME  VARCHAR(40),
  SITE_NAME_KANA  VARCHAR(128),
  INTRODUCTION_SENTENCE  VARCHAR(45),
  SHOP_CATEGORY_1  VARCHAR(45),
  SHOP_CATEGORY_2  VARCHAR(45),
  SHOP_CATEGORY_3  VARCHAR(45),
  SHOP_IMAGE_ID  VARCHAR(64),
  MAPION_POS_INFO_LATITUDE  VARCHAR(45),
  MAPION_POS_INFO_LONGITUDE  VARCHAR(45),
  MAPION_POS_INFO_REDUCED_SCALE  VARCHAR(45),
  SITE_PUBLISHING_FAX_NUMBER  VARCHAR(15),
  BUSINESS_TIME  VARCHAR(45),
  REGULAR_HOLIDAY  VARCHAR(45),
  BUSINESS_CONTENTS  VARCHAR(45),
  TRAFFIC_GUIDE  VARCHAR(45),
  SITE_PUBLIC_BEGINNING_DTIME  NUMERIC(8, 0),
  SITE_PUBLIC_ENDING_DTIME  NUMERIC(8, 0),
  ORDER_LIST_DEFAULT_DISP_SEQ  VARCHAR(45),
  ORDER_LIST_DEFAULT_DISP_NUM  NUMERIC(10, 0),
  GOODS_LIST_DEFAULT_DISP_SEQ  VARCHAR(45),
  GOODS_LIST_DEFAULT_DISP_NUM  NUMERIC(10, 0),
  CONSTRAINT M_SHOP_SITE_PK PRIMARY KEY (SHOP_ID)
)
;

-- �u�⍇���v�e�[�u���̒�`�B
CREATE TABLE M_INQUIRY (
  INQUIRY_ID  VARCHAR(8) NOT NULL,
  SHOP_ID  VARCHAR(8),
  GOODS_ID  VARCHAR(64),
  INQUIRY_NUMBER  NUMERIC(3, 0),
  INQUIRY_DAY  NUMERIC(8, 0),
  ANWER_DAY  NUMERIC(8, 0),
  MAIL_ADDR  VARCHAR(64),
  NAME  VARCHAR(20),
  INQUIRY_KIND_TYPE  VARCHAR(1),
  INQUIRY_CONTENTS  VARCHAR(45),
  ANWER_CONTENTS  VARCHAR(45),
  CORRESPONDENCE_SITUATION_TYPE  VARCHAR(1),
  CONSTRAINT M_INQUIRY_PK PRIMARY KEY (INQUIRY_ID)
)
;

-- �u�V���b�v�J�e�S���v�e�[�u���̒�`�B
CREATE TABLE M_SHOP_CATEGORY (
  SHOP_CATEGORY_ID  VARCHAR(45) NOT NULL,
  SHOP_ID  VARCHAR(8),
  SHOP_CATEGORY_NAME  VARCHAR(45),
  CONSTRAINT M_SHOP_CATEGORY_PK PRIMARY KEY (SHOP_CATEGORY_ID)
)
;

-- �u�d����v�e�[�u���̒�`�B
CREATE TABLE M_SUPPLIER (
  SUPPLIER_ID  VARCHAR(8) NOT NULL,
  SHOP_ID  VARCHAR(8),
  SUPPLIER_NAME  VARCHAR(40),
  TELEPHONE_NUMBER  VARCHAR(15),
  CONSTRAINT M_SUPPLIER_PK PRIMARY KEY (SUPPLIER_ID)
)
;

-- �u�V���b�v�y�[�W�R���e���c�v�e�[�u���̒�`�B
CREATE TABLE M_SHOP_PAGE_CONTENTS (
  SHOP_PAGE_CONTENTS_ID  VARCHAR(8) NOT NULL,
  SHOP_ID  VARCHAR(8),
  TEMPLATE_TYPE  VARCHAR(1),
  CONTENTS_SEQUENCE  NUMERIC(10, 0),
  CONTENTS_TYPE  VARCHAR(1),
  CONTENTS_TITLE  VARCHAR(45),
  CONTENTS_DATA  VARCHAR(45),
  CONTENTS_IMAGE_ID  VARCHAR(64),
  CONTENTS_URL  VARCHAR(45),
  GOODS_ID  VARCHAR(64),
  CONSTRAINT M_SHOP_PAGE_CONTENTS_PK PRIMARY KEY (SHOP_PAGE_CONTENTS_ID)
)
;

-- �u�Z�b�V�����v�e�[�u���̒�`�B
CREATE TABLE T_SESSION (
  SESSION_ID  VARCHAR(8) NOT NULL,
  MEMBER_ID  VARCHAR(8),
  REGIST_DTIME  TIMESTAMP,
  UPDATING_DTIME  TIMESTAMP,
  CONSTRAINT T_SESSION_PK PRIMARY KEY (SESSION_ID)
)
;

-- �u�󒍁v�e�[�u���̒�`�B
CREATE TABLE T_ORDER (
  ORDER_ID  VARCHAR(8) NOT NULL,
  SHOP_ID  VARCHAR(8),
  ORDER_NUMBER  VARCHAR(8),
  ORDER_DTIME  NUMERIC(8, 0),
  DELIVERY_ADDR_DESIGNATED_FLAG  VARCHAR(1),
  MEMBER_ID  VARCHAR(8),
  GOODS_TOTAL_AMOUNT  NUMERIC(10, 0),
  POSTAGE_TYPE  VARCHAR(1),
  POSTAGE_AMOUNT  NUMERIC(10, 0),
  COMMISSION_AMOUNT  NUMERIC(10, 0),
  SETTLEMENT_TYPE  VARCHAR(1),
  CARD_COMPANY_CODE  VARCHAR(2),
  USE_POINT_NUMBER  NUMERIC(10, 0),
  CARD_PAYMENT_NUMBER  NUMERIC(10, 0),
  DELIVERY_EXPECT_DAY  NUMERIC(8, 0),
  DELIVERY_EXPECT_TIMEZONE  VARCHAR(8),
  COMMENT  VARCHAR(45),
  STATUS  VARCHAR(1),
  CONSTRAINT T_ORDER_PK PRIMARY KEY (ORDER_ID)
)
;

-- �u�󒍏��i�v�e�[�u���̒�`�B
CREATE TABLE T_ORDER_GOODS (
  ORDER_GOODS_ID  VARCHAR(8) NOT NULL,
  ORDER_ID  VARCHAR(8),
  GOODS_ID  VARCHAR(64),
  GOODS_SKU_ID  VARCHAR(8),
  ORDER_QTY  NUMERIC(10, 0),
  ACQUISITION_POINT_NUMBER  NUMERIC(10, 0),
  CONSTRAINT T_ORDER_GOODS_PK PRIMARY KEY (ORDER_GOODS_ID)
)
;

-- �u���i��{�v�e�[�u���̒�`�B
CREATE TABLE M_GOODS_BASIC (
  GOODS_ID  VARCHAR(64) NOT NULL,
  SHOP_ID  VARCHAR(8),
  GOODS_CODE  VARCHAR(64),
  JAN_CODE  VARCHAR(14),
  GOODS_TYPE_ID  VARCHAR(8),
  TEMPLATE_ID  VARCHAR(64),
  GOODS_NAME  VARCHAR(128),
  BASIC_DATA  VARCHAR(45),
  MANUFACTURES  VARCHAR(45),
  GOODS_EXPOSITION  VARCHAR(45),
  GOODS_FORM_TYPE  VARCHAR(1),
  POSTAGE_TYPE  VARCHAR(1),
  POSTAGE_SETTING_ID  VARCHAR(8),
  KEY_WORD  VARCHAR(45),
  VARIATION_EXIST_NOT_EXIST_FLAG  VARCHAR(1),
  VARIATION_NAME  VARCHAR(45),
  QTY_UNIT_NAME  VARCHAR(10),
  PUBLIC_TYPE  VARCHAR(1),
  PUBLIC_BEGINNING_DTIME  NUMERIC(8, 0),
  PUBLIC_ENDING_DTIME  NUMERIC(8, 0),
  TOPPAN_INTERFACE_DTIME  NUMERIC(8, 0),
  PACKING_SIZE_LENGTH  NUMERIC(10, 0),
  PACKING_SIZE_SIDE  NUMERIC(10, 0),
  PACKING_SIZE_HEIGHT  NUMERIC(10, 0),
  SIZE_UNIT_TYPE  VARCHAR(2),
  PACKING_WEIGHT  NUMERIC(10, 0),
  WEIGHT_UNIT_TYPE  VARCHAR(2),
  GOODS_SIZE_LENGTH  NUMERIC(10, 0),
  GOODS_SIZE_SIDE  NUMERIC(10, 0),
  GOODS_SIZE_HEIGHT  NUMERIC(10, 0),
  GOODS_WEIGHT  NUMERIC(10, 0),
  CONSTRAINT M_GOODS_BASIC_PK PRIMARY KEY (GOODS_ID)
)
;

-- �u���i�P�i�v�e�[�u���̒�`�B
CREATE TABLE M_GOODS_SKU (
  GOODS_SKU_ID  VARCHAR(8) NOT NULL,
  GOODS_ID  VARCHAR(64),
  DISPLAY_SEQUENCE  NUMERIC(10, 0),
  VARIATION_VALUE  VARCHAR(45),
  SALES_PRICE  NUMERIC(10, 0),
  CONSTRAINT M_GOODS_SKU_PK PRIMARY KEY (GOODS_SKU_ID)
)
;

-- �u���i�݌Ɂv�e�[�u���̒�`�B
CREATE TABLE M_GOODS_STOCK (
  GOODS_SKU_ID  VARCHAR(8) NOT NULL,
  STOCK_QTY  NUMERIC(10, 0),
  CONSTRAINT M_GOODS_STOCK_PK PRIMARY KEY (GOODS_SKU_ID)
)
;

-- �u���i��ʁv�e�[�u���̒�`�B
CREATE TABLE M_GOODS_TYPE (
  GOODS_TYPE_ID  VARCHAR(8) NOT NULL,
  GOODS_TYPE_NAME  VARCHAR(45),
  CONSTRAINT M_GOODS_TYPE_PK PRIMARY KEY (GOODS_TYPE_ID)
)
;

-- �u�����v�e�[�u���̒�`�B
CREATE TABLE M_ATTRIBUTE (
  ATTRIBUTE_ID  VARCHAR(8) NOT NULL,
  GOODS_TYPE_ID  VARCHAR(8),
  ATTRIBUTE_NAME  VARCHAR(45),
  INDISPENSABILITY_FLAG  VARCHAR(1),
  CONSTRAINT M_ATTRIBUTE_PK PRIMARY KEY (ATTRIBUTE_ID)
)
;

-- �u���i�����v�e�[�u���̒�`�B
CREATE TABLE M_GOODS_ATTRIBUTE (
  GOODS_ID  VARCHAR(64) NOT NULL,
  ATTRIBUTE_ID  VARCHAR(8) NOT NULL,
  GOODS_TYPE_ID  VARCHAR(8),
  ATTRIBUTE_DATA  VARCHAR(45),
  CONSTRAINT M_GOODS_ATTRIBUTE_PK PRIMARY KEY (GOODS_ID, ATTRIBUTE_ID)
)
;

-- �u�}�[�L���O�v�e�[�u���̒�`�B
CREATE TABLE M_MARKING (
  MARKING_ID  VARCHAR(8) NOT NULL,
  GOODS_ID  VARCHAR(64),
  MARK_TYPE  VARCHAR(1),
  CONSTRAINT M_MARKING_PK PRIMARY KEY (MARKING_ID)
)
;

-- �u�I�J�e�S���v�e�[�u���̒�`�B
CREATE TABLE M_SHELF_CATEGORY (
  SHELF_CATEGORY_ID  VARCHAR(45) NOT NULL,
  SHOP_ID  VARCHAR(8),
  SHELF_CATEGORY_NAME  VARCHAR(45),
  CONSTRAINT M_SHELF_CATEGORY_PK PRIMARY KEY (SHELF_CATEGORY_ID)
)
;

-- �u�I�J�e�S���K�w�v�e�[�u���̒�`�B
CREATE TABLE M_SHELF_CATEGORY_HIERARCHY (
  PARENTS_SHELF_CATEGORY_ID  VARCHAR(45) NOT NULL,
  CHILD_SHELF_CATEGORY_ID  VARCHAR(45) NOT NULL,
  DISPLAY_SEQUENCE  NUMERIC(10, 0),
  CONSTRAINT M_SHELF_CATEGORY_HIERARCHY_PK PRIMARY KEY (PARENTS_SHELF_CATEGORY_ID, CHILD_SHELF_CATEGORY_ID)
)
;

-- �u���i���[���J�e�S���v�e�[�u���̒�`�B
CREATE TABLE M_GOODS_MALL_CATEGORY (
  MALL_CATEGORY_ID  VARCHAR(45) NOT NULL,
  GOODS_ID  VARCHAR(64),
  CONSTRAINT M_GOODS_MALL_CATEGORY_PK PRIMARY KEY (MALL_CATEGORY_ID)
)
;

-- �u���i�I�J�e�S���v�e�[�u���̒�`�B
CREATE TABLE M_GOODS_SHELF_CATEGORY (
  SHELF_CATEGORY_ID  VARCHAR(45) NOT NULL,
  CONSTRAINT M_GOODS_SHELF_CATEGORY_PK PRIMARY KEY (SHELF_CATEGORY_ID)
)
;

-- �u���i�d����v�e�[�u���̒�`�B
CREATE TABLE M_GOODS_SUPPLIER (
  GOODS_ID  VARCHAR(64) NOT NULL,
  SUPPLIER_ID  VARCHAR(8) NOT NULL,
  PURCHASING_UNIT_PRICE  NUMERIC(10, 0),
  CONSTRAINT M_GOODS_SUPPLIER_PK PRIMARY KEY (GOODS_ID, SUPPLIER_ID)
)
;

-- �u���i�y�[�W�R���e���c�v�e�[�u���̒�`�B
CREATE TABLE M_GOODS_PAGE_CONTENTS (
  GOODS_PAGE_CONTENTS_ID  VARCHAR(8) NOT NULL,
  GOODS_ID  VARCHAR(64),
  CONTENTS_SEQUENCE  NUMERIC(10, 0),
  CONTENTS_TYPE  VARCHAR(1),
  CONTENTS_DATA  VARCHAR(45),
  CONTENTS_IMAGE_ID  VARCHAR(64),
  CONTENTS_URL  VARCHAR(45),
  CONSTRAINT M_GOODS_PAGE_CONTENTS_PK PRIMARY KEY (GOODS_PAGE_CONTENTS_ID)
)
;

-- �u�f�B���N�g���v�e�[�u���̒�`�B
CREATE TABLE M_DIRECTORY (
  DIRECTORY_ID  VARCHAR(8) NOT NULL,
  PARENTS_DIRECTORY_ID  VARCHAR(8),
  SHOP_ID  VARCHAR(8),
  DIRECTORY_NAME  VARCHAR(45),
  CONSTRAINT M_DIRECTORY_PK PRIMARY KEY (DIRECTORY_ID)
)
;

-- �u�摜�v�e�[�u���̒�`�B
CREATE TABLE M_IMAGE (
  IMAGE_ID  VARCHAR(64) NOT NULL,
  DIRECTORY_ID  VARCHAR(8),
  FILE_NAME  VARCHAR(45),
  SAVE_FILE_NAME  VARCHAR(45),
  IMAGE_SIZE_LENGTH  NUMERIC(10, 0),
  IMAGE_SIZE_SIDE  NUMERIC(10, 0),
  FILE_CAPACITY  NUMERIC(10, 0),
  CONSTRAINT M_IMAGE_PK PRIMARY KEY (IMAGE_ID)
)
;

-- �u�e���v���[�g�v�e�[�u���̒�`�B
CREATE TABLE T_TEMPLATE (
  TEMPLATE_ID  VARCHAR(64) NOT NULL,
  TEMPLATE_TYPE  VARCHAR(1),
  TEMPLATE_NAME  VARCHAR(45),
  THUMBNAIL_IMAGE_FILE_NAME  VARCHAR(45),
  TEMPLATE_FILE_NAME  VARCHAR(45),
  CONTENTS_NUMBER  NUMERIC(10, 0),
  CONSTRAINT T_TEMPLATE_PK PRIMARY KEY (TEMPLATE_ID)
)
;

-- �u�e���v���[�g�R���e���c�v�e�[�u���̒�`�B
CREATE TABLE T_TEMPLATE_CONTENTS (
  TEMPLATE_ID  VARCHAR(64) NOT NULL,
  CONTENTS_SEQUENCE  NUMERIC(10, 0) NOT NULL,
  CONTENTS_TYPE  VARCHAR(1),
  CONTENTS_EXPLANATION  VARCHAR(45),
  CONSTRAINT T_TEMPLATE_CONTENTS_PK PRIMARY KEY (TEMPLATE_ID, CONTENTS_SEQUENCE)
)
;

-- �u�`�F�b�N�A�E�g�v�e�[�u���̒�`�B
CREATE TABLE T_CHECKOUT (
  CHECKOUT_ID  VARCHAR(8) NOT NULL,
  CART_ID  VARCHAR(8),
  SHOP_ID  VARCHAR(8),
  ORDER_NUMBER  VARCHAR(8),
  DELIVERY_ADDR_DESIGNATED_FLAG  VARCHAR(1),
  MEMBER_ID  VARCHAR(8),
  GOODS_TOTAL_AMOUNT  NUMERIC(10, 0),
  POSTAGE_TYPE  VARCHAR(1),
  POSTAGE_AMOUNT  NUMERIC(10, 0),
  COMMISSION_AMOUNT  NUMERIC(10, 0),
  SETTLEMENT_TYPE  VARCHAR(1),
  CARD_COMPANY_CODE  VARCHAR(2),
  USE_POINT_NUMBER  NUMERIC(10, 0),
  CARD_NUMBER  VARCHAR(45),
  CARD_EXPIRATION  NUMERIC(8, 0),
  CARD_NAME_LAST_NAME  VARCHAR(20),
  CARD_NAME_FIRST_NAME  VARCHAR(20),
  CARD_PAYMENT_NUMBER  NUMERIC(10, 0),
  DELIVERY_EXPECT_DAY  NUMERIC(8, 0),
  DELIVERY_EXPECT_TIMEZONE  VARCHAR(8),
  COMMENT  VARCHAR(45),
  CONSTRAINT T_CHECKOUT_PK PRIMARY KEY (CHECKOUT_ID)
)
;

-- �u���[���J�e�S���v�e�[�u���̒�`�B
CREATE TABLE M_MALL_CATEGORY (
  MALL_CATEGORY_ID  VARCHAR(45) NOT NULL,
  MALL_CATEGORY_NAME  VARCHAR(45),
  CONSTRAINT M_MALL_CATEGORY_PK PRIMARY KEY (MALL_CATEGORY_ID)
)
;

-- �u���[���J�e�S���K�w�v�e�[�u���̒�`�B
CREATE TABLE M_MALL_CATEGORY_HIERARCHY (
  PARENTS_MALL_CATEGORY_ID  VARCHAR(45) NOT NULL,
  CHILD_MALL_CATEGORY_ID  VARCHAR(45) NOT NULL,
  DISPLAY_SEQUENCE  NUMERIC(10, 0),
  CONSTRAINT M_MALL_CATEGORY_HIERARCHY_PK PRIMARY KEY (PARENTS_MALL_CATEGORY_ID, CHILD_MALL_CATEGORY_ID)
)
;

-- �u�V���b�v�J�[�g�v�e�[�u���̒�`�B
CREATE TABLE T_SHOP_CART (
  CART_ID  VARCHAR(8) NOT NULL,
  SESSION_ID  VARCHAR(8),
  SHOP_ID  VARCHAR(8),
  SITE_NAME  VARCHAR(40),
  CHECKED_OUT_FLAG  VARCHAR(1),
  CONSTRAINT T_SHOP_CART_PK PRIMARY KEY (CART_ID)
)
;

-- �u�V���b�v�J�[�g�A�C�e���v�e�[�u���̒�`�B
CREATE TABLE T_SHOP_CART_ITEM (
  CART_ITEM_ID  VARCHAR(8) NOT NULL,
  CART_ID  VARCHAR(8),
  GOODS_ID  VARCHAR(64),
  GOODS_SKU_ID  VARCHAR(8),
  GOODS_CODE  VARCHAR(64),
  GOODS_NAME  VARCHAR(128),
  VARIATION_VALUE  VARCHAR(45),
  SALES_PRICE  NUMERIC(10, 0),
  QTY  NUMERIC(10, 0),
  ACQUISITION_POINT_NUMBER  NUMERIC(10, 0),
  SUBTOTAL  NUMERIC(10, 0),
  ORDER_FIXED_FLAG  VARCHAR(1),
  CONSTRAINT T_SHOP_CART_ITEM_PK PRIMARY KEY (CART_ITEM_ID)
)
;
