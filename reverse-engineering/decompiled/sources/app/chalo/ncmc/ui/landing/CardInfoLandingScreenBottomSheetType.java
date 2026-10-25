package app.chalo.ncmc.ui.landing;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/ncmc/ui/landing/CardInfoLandingScreenBottomSheetType;", "", "None", "CardLinking", "NfcTapUnavailable", "Lapp/chalo/ncmc/ui/landing/CardInfoLandingScreenBottomSheetType$CardLinking;", "Lapp/chalo/ncmc/ui/landing/CardInfoLandingScreenBottomSheetType$NfcTapUnavailable;", "Lapp/chalo/ncmc/ui/landing/CardInfoLandingScreenBottomSheetType$None;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CardInfoLandingScreenBottomSheetType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/CardInfoLandingScreenBottomSheetType$CardLinking;", "Lapp/chalo/ncmc/ui/landing/CardInfoLandingScreenBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardLinking extends CardInfoLandingScreenBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6339a;

        public CardLinking(String cardNumber) {
            Intrinsics.i(cardNumber, "cardNumber");
            this.f6339a = cardNumber;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CardLinking) && Intrinsics.d(this.f6339a, ((CardLinking) obj).f6339a);
        }

        public final int hashCode() {
            return this.f6339a.hashCode();
        }

        public final String toString() {
            return vo1.B("CardLinking(cardNumber=", this.f6339a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/CardInfoLandingScreenBottomSheetType$NfcTapUnavailable;", "Lapp/chalo/ncmc/ui/landing/CardInfoLandingScreenBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NfcTapUnavailable extends CardInfoLandingScreenBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NfcTapUnavailable f6340a = new NfcTapUnavailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NfcTapUnavailable);
        }

        public final int hashCode() {
            return -463879043;
        }

        public final String toString() {
            return "NfcTapUnavailable";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/CardInfoLandingScreenBottomSheetType$None;", "Lapp/chalo/ncmc/ui/landing/CardInfoLandingScreenBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class None extends CardInfoLandingScreenBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f6341a = new None();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return 1187551699;
        }

        public final String toString() {
            return "None";
        }
    }
}
