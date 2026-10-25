package app.chalo.premiumbus.ui.faredetails.contract;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.hq0;
import defpackage.n21;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsBottomSheetUiState;", "", "TncSection", "FareNoteSection", "FareValidationFailed", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsBottomSheetUiState$FareNoteSection;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsBottomSheetUiState$FareValidationFailed;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsBottomSheetUiState$TncSection;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusFareDetailsBottomSheetUiState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsBottomSheetUiState$FareNoteSection;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsBottomSheetUiState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FareNoteSection extends PremiumBusFareDetailsBottomSheetUiState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.ChaloTextUIState f7569a;
        public final ButtonUIState b;

        public FareNoteSection(TextUIState.ChaloTextUIState fareNoteTextUIState, ButtonUIState dismissButtonUIState) {
            Intrinsics.i(fareNoteTextUIState, "fareNoteTextUIState");
            Intrinsics.i(dismissButtonUIState, "dismissButtonUIState");
            this.f7569a = fareNoteTextUIState;
            this.b = dismissButtonUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FareNoteSection)) {
                return false;
            }
            FareNoteSection fareNoteSection = (FareNoteSection) obj;
            return Intrinsics.d(this.f7569a, fareNoteSection.f7569a) && Intrinsics.d(this.b, fareNoteSection.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7569a.hashCode() * 31);
        }

        public final String toString() {
            return "FareNoteSection(fareNoteTextUIState=" + this.f7569a + ", dismissButtonUIState=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsBottomSheetUiState$FareValidationFailed;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsBottomSheetUiState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FareValidationFailed extends PremiumBusFareDetailsBottomSheetUiState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.ChaloTextUIState f7570a;
        public final ImageUIState b;
        public final ButtonUIState c;
        public final ButtonUIState d;

        public FareValidationFailed(ButtonUIState payButtonUIState, ButtonUIState cancelButtonUIState, ImageUIState closeIconUIState, TextUIState.ChaloTextUIState messageTextUIState) {
            Intrinsics.i(messageTextUIState, "messageTextUIState");
            Intrinsics.i(closeIconUIState, "closeIconUIState");
            Intrinsics.i(payButtonUIState, "payButtonUIState");
            Intrinsics.i(cancelButtonUIState, "cancelButtonUIState");
            this.f7570a = messageTextUIState;
            this.b = closeIconUIState;
            this.c = payButtonUIState;
            this.d = cancelButtonUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FareValidationFailed)) {
                return false;
            }
            FareValidationFailed fareValidationFailed = (FareValidationFailed) obj;
            return Intrinsics.d(this.f7570a, fareValidationFailed.f7570a) && Intrinsics.d(this.b, fareValidationFailed.b) && Intrinsics.d(this.c, fareValidationFailed.c) && Intrinsics.d(this.d, fareValidationFailed.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + r30.d(this.c, r30.e(this.b, this.f7570a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            return "FareValidationFailed(messageTextUIState=" + this.f7570a + ", closeIconUIState=" + this.b + ", payButtonUIState=" + this.c + ", cancelButtonUIState=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsBottomSheetUiState$TncSection;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsBottomSheetUiState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TncSection extends PremiumBusFareDetailsBottomSheetUiState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.ChaloTextUIState f7571a;
        public final TextUIState.ChaloTextUIState b;
        public final ButtonUIState c;

        public TncSection(ButtonUIState confirmButtonUIState, TextUIState.ChaloTextUIState titleTextUIState, TextUIState.ChaloTextUIState tncTextUIState) {
            Intrinsics.i(titleTextUIState, "titleTextUIState");
            Intrinsics.i(tncTextUIState, "tncTextUIState");
            Intrinsics.i(confirmButtonUIState, "confirmButtonUIState");
            this.f7571a = titleTextUIState;
            this.b = tncTextUIState;
            this.c = confirmButtonUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TncSection)) {
                return false;
            }
            TncSection tncSection = (TncSection) obj;
            return Intrinsics.d(this.f7571a, tncSection.f7571a) && Intrinsics.d(this.b, tncSection.b) && Intrinsics.d(this.c, tncSection.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + r30.f(this.b, this.f7571a.hashCode() * 31, 31);
        }

        public final String toString() {
            return hq0.j(n21.j("TncSection(titleTextUIState=", this.f7571a, ", tncTextUIState=", this.b, ", confirmButtonUIState="), this.c, ")");
        }
    }
}
