package app.chalo.premiumbus.ui.seatselection;

import app.chalo.constants.Source;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.userprofile.Gender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0015\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0082\u0001\u0015\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "", "InitializationIntent", "SelectSeatsClickIntent", "ToggleSeatSelectionIntent", "SeatChangeSuccessScreenOkayBtnClickIntent", "SeatChangeConfirmationDialogDismissIntent", "SeatChangeConfirmationDialogPositiveBtnClickIntent", "OnBackPressedIntent", "GenderConfirmationBottomSheetDismissIntent", "OnGenderConfirmationSuccessAnimationCompletedIntent", "GenderSelectionOptionSelectedIntent", "GenderConfirmationBottomSheetConfirmBtnClickIntent", "GenderConfirmationBottomSheetSkipBtnClickIntent", "GenderConfirmationErrorBottomSheetTryAgainBtnClickIntent", "GenderConfirmationErrorBottomSheetSkipBtnClickIntent", "GenderPreferenceNudgeCardUpdateGenderClickIntent", "AutoAssignMySeatsCtaClickIntent", "IWillPickMySeatCtaClickIntent", "EditPassengerCountClickIntent", "PassengerCountIncrementIntent", "PassengerCountDecrementIntent", "PassengerCountConfirmIntent", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$AutoAssignMySeatsCtaClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$EditPassengerCountClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$GenderConfirmationBottomSheetConfirmBtnClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$GenderConfirmationBottomSheetDismissIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$GenderConfirmationBottomSheetSkipBtnClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$GenderConfirmationErrorBottomSheetSkipBtnClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$GenderConfirmationErrorBottomSheetTryAgainBtnClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$GenderPreferenceNudgeCardUpdateGenderClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$GenderSelectionOptionSelectedIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$IWillPickMySeatCtaClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$InitializationIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$OnBackPressedIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$OnGenderConfirmationSuccessAnimationCompletedIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$PassengerCountConfirmIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$PassengerCountDecrementIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$PassengerCountIncrementIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$SeatChangeConfirmationDialogDismissIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$SeatChangeConfirmationDialogPositiveBtnClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$SeatChangeSuccessScreenOkayBtnClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$SelectSeatsClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$ToggleSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusSeatSelectionIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$AutoAssignMySeatsCtaClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AutoAssignMySeatsCtaClickIntent extends PremiumBusSeatSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AutoAssignMySeatsCtaClickIntent f7731a = new AutoAssignMySeatsCtaClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AutoAssignMySeatsCtaClickIntent);
        }

        public final int hashCode() {
            return 628094604;
        }

        public final String toString() {
            return "AutoAssignMySeatsCtaClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$EditPassengerCountClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EditPassengerCountClickIntent extends PremiumBusSeatSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EditPassengerCountClickIntent f7732a = new EditPassengerCountClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditPassengerCountClickIntent);
        }

        public final int hashCode() {
            return 206943353;
        }

        public final String toString() {
            return "EditPassengerCountClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$GenderConfirmationBottomSheetConfirmBtnClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderConfirmationBottomSheetConfirmBtnClickIntent extends PremiumBusSeatSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Gender f7733a;

        public GenderConfirmationBottomSheetConfirmBtnClickIntent(Gender gender) {
            this.f7733a = gender;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GenderConfirmationBottomSheetConfirmBtnClickIntent) && this.f7733a == ((GenderConfirmationBottomSheetConfirmBtnClickIntent) obj).f7733a;
        }

        public final int hashCode() {
            Gender gender = this.f7733a;
            if (gender == null) {
                return 0;
            }
            return gender.hashCode();
        }

        public final String toString() {
            return "GenderConfirmationBottomSheetConfirmBtnClickIntent(selectedGender=" + this.f7733a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$GenderConfirmationBottomSheetDismissIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderConfirmationBottomSheetDismissIntent extends PremiumBusSeatSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GenderConfirmationBottomSheetDismissIntent f7734a = new GenderConfirmationBottomSheetDismissIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GenderConfirmationBottomSheetDismissIntent);
        }

        public final int hashCode() {
            return 1537302388;
        }

        public final String toString() {
            return "GenderConfirmationBottomSheetDismissIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$GenderConfirmationBottomSheetSkipBtnClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderConfirmationBottomSheetSkipBtnClickIntent extends PremiumBusSeatSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GenderConfirmationBottomSheetSkipBtnClickIntent f7735a = new GenderConfirmationBottomSheetSkipBtnClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GenderConfirmationBottomSheetSkipBtnClickIntent);
        }

        public final int hashCode() {
            return -270277447;
        }

        public final String toString() {
            return "GenderConfirmationBottomSheetSkipBtnClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$GenderConfirmationErrorBottomSheetSkipBtnClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderConfirmationErrorBottomSheetSkipBtnClickIntent extends PremiumBusSeatSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GenderConfirmationErrorBottomSheetSkipBtnClickIntent f7736a = new GenderConfirmationErrorBottomSheetSkipBtnClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GenderConfirmationErrorBottomSheetSkipBtnClickIntent);
        }

        public final int hashCode() {
            return 513925717;
        }

        public final String toString() {
            return "GenderConfirmationErrorBottomSheetSkipBtnClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$GenderConfirmationErrorBottomSheetTryAgainBtnClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderConfirmationErrorBottomSheetTryAgainBtnClickIntent extends PremiumBusSeatSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GenderConfirmationErrorBottomSheetTryAgainBtnClickIntent f7737a = new GenderConfirmationErrorBottomSheetTryAgainBtnClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GenderConfirmationErrorBottomSheetTryAgainBtnClickIntent);
        }

        public final int hashCode() {
            return -375600709;
        }

        public final String toString() {
            return "GenderConfirmationErrorBottomSheetTryAgainBtnClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$GenderPreferenceNudgeCardUpdateGenderClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderPreferenceNudgeCardUpdateGenderClickIntent extends PremiumBusSeatSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GenderPreferenceNudgeCardUpdateGenderClickIntent f7738a = new GenderPreferenceNudgeCardUpdateGenderClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GenderPreferenceNudgeCardUpdateGenderClickIntent);
        }

        public final int hashCode() {
            return -373021481;
        }

        public final String toString() {
            return "GenderPreferenceNudgeCardUpdateGenderClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$GenderSelectionOptionSelectedIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderSelectionOptionSelectedIntent extends PremiumBusSeatSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Gender f7739a;

        public GenderSelectionOptionSelectedIntent(Gender gender) {
            Intrinsics.i(gender, "gender");
            this.f7739a = gender;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GenderSelectionOptionSelectedIntent) && this.f7739a == ((GenderSelectionOptionSelectedIntent) obj).f7739a;
        }

        public final int hashCode() {
            return this.f7739a.hashCode();
        }

        public final String toString() {
            return "GenderSelectionOptionSelectedIntent(gender=" + this.f7739a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$IWillPickMySeatCtaClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IWillPickMySeatCtaClickIntent extends PremiumBusSeatSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IWillPickMySeatCtaClickIntent f7740a = new IWillPickMySeatCtaClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof IWillPickMySeatCtaClickIntent);
        }

        public final int hashCode() {
            return -439092235;
        }

        public final String toString() {
            return "IWillPickMySeatCtaClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$InitializationIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends PremiumBusSeatSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Source f7741a;
        public final PremiumBusSeatSelectionFlowType b;

        public InitializationIntent(Source source, PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType) {
            Intrinsics.i(source, "source");
            Intrinsics.i(premiumBusSeatSelectionFlowType, "premiumBusSeatSelectionFlowType");
            this.f7741a = source;
            this.b = premiumBusSeatSelectionFlowType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return this.f7741a == initializationIntent.f7741a && Intrinsics.d(this.b, initializationIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7741a.hashCode() * 31);
        }

        public final String toString() {
            return "InitializationIntent(source=" + this.f7741a + ", premiumBusSeatSelectionFlowType=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$OnBackPressedIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBackPressedIntent extends PremiumBusSeatSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBackPressedIntent f7742a = new OnBackPressedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnBackPressedIntent);
        }

        public final int hashCode() {
            return 39684492;
        }

        public final String toString() {
            return "OnBackPressedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$OnGenderConfirmationSuccessAnimationCompletedIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnGenderConfirmationSuccessAnimationCompletedIntent extends PremiumBusSeatSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnGenderConfirmationSuccessAnimationCompletedIntent f7743a = new OnGenderConfirmationSuccessAnimationCompletedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnGenderConfirmationSuccessAnimationCompletedIntent);
        }

        public final int hashCode() {
            return -1389683419;
        }

        public final String toString() {
            return "OnGenderConfirmationSuccessAnimationCompletedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$PassengerCountConfirmIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerCountConfirmIntent extends PremiumBusSeatSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PassengerCountConfirmIntent f7744a = new PassengerCountConfirmIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PassengerCountConfirmIntent);
        }

        public final int hashCode() {
            return -430216997;
        }

        public final String toString() {
            return "PassengerCountConfirmIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$PassengerCountDecrementIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerCountDecrementIntent extends PremiumBusSeatSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PassengerCountDecrementIntent f7745a = new PassengerCountDecrementIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PassengerCountDecrementIntent);
        }

        public final int hashCode() {
            return -1644885842;
        }

        public final String toString() {
            return "PassengerCountDecrementIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$PassengerCountIncrementIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerCountIncrementIntent extends PremiumBusSeatSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PassengerCountIncrementIntent f7746a = new PassengerCountIncrementIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PassengerCountIncrementIntent);
        }

        public final int hashCode() {
            return 1342845578;
        }

        public final String toString() {
            return "PassengerCountIncrementIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$SeatChangeConfirmationDialogDismissIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatChangeConfirmationDialogDismissIntent extends PremiumBusSeatSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeatChangeConfirmationDialogDismissIntent f7747a = new SeatChangeConfirmationDialogDismissIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SeatChangeConfirmationDialogDismissIntent);
        }

        public final int hashCode() {
            return -285986552;
        }

        public final String toString() {
            return "SeatChangeConfirmationDialogDismissIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$SeatChangeConfirmationDialogPositiveBtnClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatChangeConfirmationDialogPositiveBtnClickIntent extends PremiumBusSeatSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeatChangeConfirmationDialogPositiveBtnClickIntent f7748a = new SeatChangeConfirmationDialogPositiveBtnClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SeatChangeConfirmationDialogPositiveBtnClickIntent);
        }

        public final int hashCode() {
            return -441968737;
        }

        public final String toString() {
            return "SeatChangeConfirmationDialogPositiveBtnClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$SeatChangeSuccessScreenOkayBtnClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatChangeSuccessScreenOkayBtnClickIntent extends PremiumBusSeatSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeatChangeSuccessScreenOkayBtnClickIntent f7749a = new SeatChangeSuccessScreenOkayBtnClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SeatChangeSuccessScreenOkayBtnClickIntent);
        }

        public final int hashCode() {
            return 900280650;
        }

        public final String toString() {
            return "SeatChangeSuccessScreenOkayBtnClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$SelectSeatsClickIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectSeatsClickIntent extends PremiumBusSeatSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectSeatsClickIntent f7750a = new SelectSeatsClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SelectSeatsClickIntent);
        }

        public final int hashCode() {
            return 1450891518;
        }

        public final String toString() {
            return "SelectSeatsClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent$ToggleSeatSelectionIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ToggleSeatSelectionIntent extends PremiumBusSeatSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SeatInfoAppModel f7751a;

        public ToggleSeatSelectionIntent(SeatInfoAppModel seatInfoAppModel) {
            this.f7751a = seatInfoAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleSeatSelectionIntent) && Intrinsics.d(this.f7751a, ((ToggleSeatSelectionIntent) obj).f7751a);
        }

        public final int hashCode() {
            return this.f7751a.hashCode();
        }

        public final String toString() {
            return "ToggleSeatSelectionIntent(seat=" + this.f7751a + ")";
        }
    }
}
