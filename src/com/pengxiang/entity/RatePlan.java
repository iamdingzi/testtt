package com.pengxiang.entity;

import java.util.List;

public class RatePlan {


    private String roomID;
    private List<RatesBean> rates;
    private List<CancelPoliciesBean> cancelPolicies;

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public List<RatesBean> getRates() {
        return rates;
    }

    public void setRates(List<RatesBean> rates) {
        this.rates = rates;
    }

    public List<CancelPoliciesBean> getCancelPolicies() {
        return cancelPolicies;
    }

    public void setCancelPolicies(List<CancelPoliciesBean> cancelPolicies) {
        this.cancelPolicies = cancelPolicies;
    }

    public static class RatesBean {


        private String effectiveDate;
        private boolean isInstantConfirm;
        private int numberOfUnits;
        private PriceBean price;
        private MealsIncludedBean mealsIncluded;
        private List<?> gifts;

        public String getEffectiveDate() {
            return effectiveDate;
        }

        public void setEffectiveDate(String effectiveDate) {
            this.effectiveDate = effectiveDate;
        }

        public boolean isIsInstantConfirm() {
            return isInstantConfirm;
        }

        public void setIsInstantConfirm(boolean isInstantConfirm) {
            this.isInstantConfirm = isInstantConfirm;
        }

        public int getNumberOfUnits() {
            return numberOfUnits;
        }

        public void setNumberOfUnits(int numberOfUnits) {
            this.numberOfUnits = numberOfUnits;
        }

        public PriceBean getPrice() {
            return price;
        }

        public void setPrice(PriceBean price) {
            this.price = price;
        }

        public MealsIncludedBean getMealsIncluded() {
            return mealsIncluded;
        }

        public void setMealsIncluded(MealsIncludedBean mealsIncluded) {
            this.mealsIncluded = mealsIncluded;
        }

        public List<?> getGifts() {
            return gifts;
        }

        public void setGifts(List<?> gifts) {
            this.gifts = gifts;
        }

        public static class PriceBean {


            private int exclusiveAmount;
            private int inclusiveAmount;
            private String currency;

            public int getExclusiveAmount() {
                return exclusiveAmount;
            }

            public void setExclusiveAmount(int exclusiveAmount) {
                this.exclusiveAmount = exclusiveAmount;
            }

            public int getInclusiveAmount() {
                return inclusiveAmount;
            }

            public void setInclusiveAmount(int inclusiveAmount) {
                this.inclusiveAmount = inclusiveAmount;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }
        }

        public static class MealsIncludedBean {

            private int mealType;
            private int mealCount;

            public int getMealType() {
                return mealType;
            }

            public void setMealType(int mealType) {
                this.mealType = mealType;
            }

            public int getMealCount() {
                return mealCount;
            }

            public void setMealCount(int mealCount) {
                this.mealCount = mealCount;
            }
        }
    }

    public static class CancelPoliciesBean {


        private boolean canCancel;
        private int deductProportion;

        public boolean isCanCancel() {
            return canCancel;
        }

        public void setCanCancel(boolean canCancel) {
            this.canCancel = canCancel;
        }

        public int getDeductProportion() {
            return deductProportion;
        }

        public void setDeductProportion(int deductProportion) {
            this.deductProportion = deductProportion;
        }
    }
}
