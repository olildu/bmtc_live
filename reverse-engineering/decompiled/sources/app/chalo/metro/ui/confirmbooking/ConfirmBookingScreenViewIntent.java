package app.chalo.metro.ui.confirmbooking;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenViewIntent;", "", "InitialisationIntent", "OnRetryFareFetchClicked", "OnProceedButtonClicked", "OnPaymentCompletedIntent", "OnTermsAndConditionsClicked", "TnCAcceptClickIntent", "Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenViewIntent$InitialisationIntent;", "Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenViewIntent$OnPaymentCompletedIntent;", "Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenViewIntent$OnProceedButtonClicked;", "Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenViewIntent$OnRetryFareFetchClicked;", "Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenViewIntent$OnTermsAndConditionsClicked;", "Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenViewIntent$TnCAcceptClickIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ConfirmBookingScreenViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenViewIntent$InitialisationIntent;", "Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialisationIntent extends ConfirmBookingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConfirmationBookingScreenData f5464a;

        public InitialisationIntent(ConfirmationBookingScreenData screenData) {
            Intrinsics.i(screenData, "screenData");
            this.f5464a = screenData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitialisationIntent) && Intrinsics.d(this.f5464a, ((InitialisationIntent) obj).f5464a);
        }

        public final int hashCode() {
            return this.f5464a.hashCode();
        }

        public final String toString() {
            return "InitialisationIntent(screenData=" + this.f5464a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenViewIntent$OnPaymentCompletedIntent;", "Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnPaymentCompletedIntent extends ConfirmBookingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5465a;

        public OnPaymentCompletedIntent(String bookingId) {
            Intrinsics.i(bookingId, "bookingId");
            this.f5465a = bookingId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPaymentCompletedIntent) && Intrinsics.d(this.f5465a, ((OnPaymentCompletedIntent) obj).f5465a);
        }

        public final int hashCode() {
            return this.f5465a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnPaymentCompletedIntent(bookingId=", this.f5465a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenViewIntent$OnProceedButtonClicked;", "Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnProceedButtonClicked extends ConfirmBookingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnProceedButtonClicked f5466a = new OnProceedButtonClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenViewIntent$OnRetryFareFetchClicked;", "Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnRetryFareFetchClicked extends ConfirmBookingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnRetryFareFetchClicked f5467a = new OnRetryFareFetchClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenViewIntent$OnTermsAndConditionsClicked;", "Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnTermsAndConditionsClicked extends ConfirmBookingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnTermsAndConditionsClicked f5468a = new OnTermsAndConditionsClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenViewIntent$TnCAcceptClickIntent;", "Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TnCAcceptClickIntent extends ConfirmBookingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TnCAcceptClickIntent f5469a = new TnCAcceptClickIntent();
    }
}
