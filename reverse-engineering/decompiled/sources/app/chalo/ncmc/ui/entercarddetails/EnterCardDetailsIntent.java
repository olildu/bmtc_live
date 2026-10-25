package app.chalo.ncmc.ui.entercarddetails;

import app.chalo.constants.Source;
import defpackage.gf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent;", "", "InitializationIntent", "OnAmountEnteredIntentEnter", "ProceedBtnClickedIntentEnter", "OnRetryClicked", "EnterCardLinkBottomContinueWithRechargeClicked", "CardLinkBottomSheetLinkEnterCardClicked", "OnBottomsheetDismissed", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent$CardLinkBottomSheetLinkEnterCardClicked;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent$EnterCardLinkBottomContinueWithRechargeClicked;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent$InitializationIntent;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent$OnAmountEnteredIntentEnter;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent$OnBottomsheetDismissed;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent$OnRetryClicked;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent$ProceedBtnClickedIntentEnter;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EnterCardDetailsIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent$CardLinkBottomSheetLinkEnterCardClicked;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardLinkBottomSheetLinkEnterCardClicked extends EnterCardDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CardLinkBottomSheetLinkEnterCardClicked f6324a = new CardLinkBottomSheetLinkEnterCardClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CardLinkBottomSheetLinkEnterCardClicked);
        }

        public final int hashCode() {
            return 1764132524;
        }

        public final String toString() {
            return "CardLinkBottomSheetLinkEnterCardClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent$EnterCardLinkBottomContinueWithRechargeClicked;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EnterCardLinkBottomContinueWithRechargeClicked extends EnterCardDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnterCardLinkBottomContinueWithRechargeClicked f6325a = new EnterCardLinkBottomContinueWithRechargeClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EnterCardLinkBottomContinueWithRechargeClicked);
        }

        public final int hashCode() {
            return 1935796317;
        }

        public final String toString() {
            return "EnterCardLinkBottomContinueWithRechargeClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent$InitializationIntent;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends EnterCardDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Source f6326a;

        public InitializationIntent(Source source) {
            Intrinsics.i(source, "source");
            this.f6326a = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && this.f6326a == ((InitializationIntent) obj).f6326a;
        }

        public final int hashCode() {
            return this.f6326a.hashCode();
        }

        public final String toString() {
            return gf.f(this.f6326a, "InitializationIntent(source=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent$OnAmountEnteredIntentEnter;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnAmountEnteredIntentEnter extends EnterCardDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6327a;
        public final CardNumberFieldType b;

        public OnAmountEnteredIntentEnter(String enteredAmount, CardNumberFieldType fieldType) {
            Intrinsics.i(enteredAmount, "enteredAmount");
            Intrinsics.i(fieldType, "fieldType");
            this.f6327a = enteredAmount;
            this.b = fieldType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAmountEnteredIntentEnter)) {
                return false;
            }
            OnAmountEnteredIntentEnter onAmountEnteredIntentEnter = (OnAmountEnteredIntentEnter) obj;
            return Intrinsics.d(this.f6327a, onAmountEnteredIntentEnter.f6327a) && this.b == onAmountEnteredIntentEnter.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6327a.hashCode() * 31);
        }

        public final String toString() {
            return "OnAmountEnteredIntentEnter(enteredAmount=" + this.f6327a + ", fieldType=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent$OnBottomsheetDismissed;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBottomsheetDismissed extends EnterCardDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBottomsheetDismissed f6328a = new OnBottomsheetDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnBottomsheetDismissed);
        }

        public final int hashCode() {
            return 2142125131;
        }

        public final String toString() {
            return "OnBottomsheetDismissed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent$OnRetryClicked;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnRetryClicked extends EnterCardDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnRetryClicked f6329a = new OnRetryClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnRetryClicked);
        }

        public final int hashCode() {
            return -1670670923;
        }

        public final String toString() {
            return "OnRetryClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent$ProceedBtnClickedIntentEnter;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProceedBtnClickedIntentEnter extends EnterCardDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProceedBtnClickedIntentEnter f6330a = new ProceedBtnClickedIntentEnter();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProceedBtnClickedIntentEnter);
        }

        public final int hashCode() {
            return 1926143994;
        }

        public final String toString() {
            return "ProceedBtnClickedIntentEnter";
        }
    }
}
