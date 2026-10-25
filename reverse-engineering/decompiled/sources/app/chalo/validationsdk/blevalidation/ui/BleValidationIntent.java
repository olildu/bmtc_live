package app.chalo.validationsdk.blevalidation.ui;

import app.chalo.models.validation.BleValidationArgs;
import app.chalo.notification.models.AppNotification;
import defpackage.b3;
import defpackage.cb0;
import defpackage.r30;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001c\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u0082\u0001\u001c\u001e\u001f !\"#$%&'()*+,-./0123456789¨\u0006:"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "", "InitializationIntent", "ProductDetailsBottomSheetCardOkClickedIntent", "BleManualTurnOnOperationCompleteIntent", "TurnOnBluetoothManuallyIntent", "BlePermissionsUpdatedIntent", "BlePermissionsUpdatedFromFullScreenExplainerIntent", "ReturnedFromAndroidSettingsIntent", "ShowNearbyDevicesPermRationaleBottomsheetOkClickedIntent", "AskBlePermissionsAgainOrOpenSettingsPageIfNeededIntent", "TapToValidateBottomsheetTutorialOkClickedIntent", "UnableToVerifyTapHereClickedIntent", "UseQRCodeClicked", "SwitchToQRAfterDenyingBlePermissionsClickedIntent", "ViewTripReceiptMenuOptionClickedIntent", "ActivationExpiredDialogOkClickedIntent", "ActivationExpiredDialogSeeDetailsClickedIntent", "PunchReceivedIntent", "RideFeedbackRatingSelectedIntent", "RideFeedbackRatingSubmittedIntent", "ViewTripReceiptPostConductorValidationCompleteIntent", "ViewTripReceiptPostTapOutIntent", "ReportProblemIntent", "BackClickedIntent", "ShowProductDetailsBottomSheetIntent", "ConductorValidationExitBtnClickedPostValidationIntent", "TITOValidationExitBtnClickedPostTapOutIntent", "DismissBottomSheetIntent", "SendEventIntent", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ActivationExpiredDialogOkClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ActivationExpiredDialogSeeDetailsClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$AskBlePermissionsAgainOrOpenSettingsPageIfNeededIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$BackClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$BleManualTurnOnOperationCompleteIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$BlePermissionsUpdatedFromFullScreenExplainerIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$BlePermissionsUpdatedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ConductorValidationExitBtnClickedPostValidationIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$DismissBottomSheetIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$InitializationIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ProductDetailsBottomSheetCardOkClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$PunchReceivedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ReportProblemIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ReturnedFromAndroidSettingsIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$RideFeedbackRatingSelectedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$RideFeedbackRatingSubmittedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$SendEventIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ShowNearbyDevicesPermRationaleBottomsheetOkClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ShowProductDetailsBottomSheetIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$SwitchToQRAfterDenyingBlePermissionsClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$TITOValidationExitBtnClickedPostTapOutIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$TapToValidateBottomsheetTutorialOkClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$TurnOnBluetoothManuallyIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$UnableToVerifyTapHereClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$UseQRCodeClicked;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ViewTripReceiptMenuOptionClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ViewTripReceiptPostConductorValidationCompleteIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ViewTripReceiptPostTapOutIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BleValidationIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ActivationExpiredDialogOkClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActivationExpiredDialogOkClickedIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ActivationExpiredDialogOkClickedIntent f10579a = new ActivationExpiredDialogOkClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ActivationExpiredDialogSeeDetailsClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActivationExpiredDialogSeeDetailsClickedIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ActivationExpiredDialogSeeDetailsClickedIntent f10580a = new ActivationExpiredDialogSeeDetailsClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$AskBlePermissionsAgainOrOpenSettingsPageIfNeededIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AskBlePermissionsAgainOrOpenSettingsPageIfNeededIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AskBlePermissionsAgainOrOpenSettingsPageIfNeededIntent f10581a = new AskBlePermissionsAgainOrOpenSettingsPageIfNeededIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$BackClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BackClickedIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackClickedIntent f10582a = new BackClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$BleManualTurnOnOperationCompleteIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BleManualTurnOnOperationCompleteIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10583a;

        public BleManualTurnOnOperationCompleteIntent(boolean z) {
            this.f10583a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BleManualTurnOnOperationCompleteIntent) && this.f10583a == ((BleManualTurnOnOperationCompleteIntent) obj).f10583a;
        }

        public final int hashCode() {
            return this.f10583a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("BleManualTurnOnOperationCompleteIntent(isTurnedOn=", ")", this.f10583a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$BlePermissionsUpdatedFromFullScreenExplainerIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BlePermissionsUpdatedFromFullScreenExplainerIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10584a;

        public BlePermissionsUpdatedFromFullScreenExplainerIntent(boolean z) {
            this.f10584a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BlePermissionsUpdatedFromFullScreenExplainerIntent) && this.f10584a == ((BlePermissionsUpdatedFromFullScreenExplainerIntent) obj).f10584a;
        }

        public final int hashCode() {
            return this.f10584a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("BlePermissionsUpdatedFromFullScreenExplainerIntent(arePermissionsGranted=", ")", this.f10584a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$BlePermissionsUpdatedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BlePermissionsUpdatedIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10585a;

        public BlePermissionsUpdatedIntent(boolean z) {
            this.f10585a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BlePermissionsUpdatedIntent) && this.f10585a == ((BlePermissionsUpdatedIntent) obj).f10585a;
        }

        public final int hashCode() {
            return this.f10585a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("BlePermissionsUpdatedIntent(arePermissionsGranted=", ")", this.f10585a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ConductorValidationExitBtnClickedPostValidationIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConductorValidationExitBtnClickedPostValidationIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConductorValidationExitBtnClickedPostValidationIntent f10586a = new ConductorValidationExitBtnClickedPostValidationIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$DismissBottomSheetIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DismissBottomSheetIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissBottomSheetIntent f10587a = new DismissBottomSheetIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$InitializationIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BleValidationArgs f10588a;

        static {
            BleValidationArgs.Companion companion = BleValidationArgs.INSTANCE;
        }

        public InitializationIntent(BleValidationArgs bleValidationArgs) {
            Intrinsics.i(bleValidationArgs, "bleValidationArgs");
            this.f10588a = bleValidationArgs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && Intrinsics.d(this.f10588a, ((InitializationIntent) obj).f10588a);
        }

        public final int hashCode() {
            return this.f10588a.hashCode();
        }

        public final String toString() {
            return "InitializationIntent(bleValidationArgs=" + this.f10588a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ProductDetailsBottomSheetCardOkClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProductDetailsBottomSheetCardOkClickedIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductDetailsBottomSheetCardOkClickedIntent f10589a = new ProductDetailsBottomSheetCardOkClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$PunchReceivedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PunchReceivedIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AppNotification.PunchNotification f10590a;

        public PunchReceivedIntent(AppNotification.PunchNotification punchEvent) {
            Intrinsics.i(punchEvent, "punchEvent");
            this.f10590a = punchEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PunchReceivedIntent) && Intrinsics.d(this.f10590a, ((PunchReceivedIntent) obj).f10590a);
        }

        public final int hashCode() {
            return this.f10590a.hashCode();
        }

        public final String toString() {
            return "PunchReceivedIntent(punchEvent=" + this.f10590a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ReportProblemIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReportProblemIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReportProblemIntent f10591a = new ReportProblemIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ReturnedFromAndroidSettingsIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReturnedFromAndroidSettingsIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReturnedFromAndroidSettingsIntent f10592a = new ReturnedFromAndroidSettingsIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$RideFeedbackRatingSelectedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RideFeedbackRatingSelectedIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10593a;

        public RideFeedbackRatingSelectedIntent(int i) {
            this.f10593a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RideFeedbackRatingSelectedIntent) && this.f10593a == ((RideFeedbackRatingSelectedIntent) obj).f10593a;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getF10593a() {
            return this.f10593a;
        }

        public final String toString() {
            return b3.d(this.f10593a, "RideFeedbackRatingSelectedIntent(selectedRating=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$RideFeedbackRatingSubmittedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RideFeedbackRatingSubmittedIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10594a;
        public final List b;
        public final String c;

        public RideFeedbackRatingSubmittedIntent(int i, String str, List selectedTags) {
            Intrinsics.i(selectedTags, "selectedTags");
            this.f10594a = i;
            this.b = selectedTags;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RideFeedbackRatingSubmittedIntent)) {
                return false;
            }
            RideFeedbackRatingSubmittedIntent rideFeedbackRatingSubmittedIntent = (RideFeedbackRatingSubmittedIntent) obj;
            return this.f10594a == rideFeedbackRatingSubmittedIntent.f10594a && Intrinsics.d(this.b, rideFeedbackRatingSubmittedIntent.b) && Intrinsics.d(this.c, rideFeedbackRatingSubmittedIntent.c);
        }

        public final int hashCode() {
            int iB = r30.b(this.f10594a * 31, 31, this.b);
            String str = this.c;
            return iB + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RideFeedbackRatingSubmittedIntent(finalRating=");
            sb.append(this.f10594a);
            sb.append(", selectedTags=");
            sb.append(this.b);
            sb.append(", additionalTextFeedback=");
            return vo1.p(sb, this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$SendEventIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SendEventIntent extends BleValidationIntent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SendEventIntent);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "SendEventIntent(eventName=null, bookingId=null, tone=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ShowNearbyDevicesPermRationaleBottomsheetOkClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowNearbyDevicesPermRationaleBottomsheetOkClickedIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowNearbyDevicesPermRationaleBottomsheetOkClickedIntent f10595a = new ShowNearbyDevicesPermRationaleBottomsheetOkClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ShowProductDetailsBottomSheetIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowProductDetailsBottomSheetIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowProductDetailsBottomSheetIntent f10596a = new ShowProductDetailsBottomSheetIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$SwitchToQRAfterDenyingBlePermissionsClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SwitchToQRAfterDenyingBlePermissionsClickedIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SwitchToQRAfterDenyingBlePermissionsClickedIntent f10597a = new SwitchToQRAfterDenyingBlePermissionsClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$TITOValidationExitBtnClickedPostTapOutIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TITOValidationExitBtnClickedPostTapOutIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TITOValidationExitBtnClickedPostTapOutIntent f10598a = new TITOValidationExitBtnClickedPostTapOutIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$TapToValidateBottomsheetTutorialOkClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TapToValidateBottomsheetTutorialOkClickedIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TapToValidateBottomsheetTutorialOkClickedIntent f10599a = new TapToValidateBottomsheetTutorialOkClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$TurnOnBluetoothManuallyIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TurnOnBluetoothManuallyIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TurnOnBluetoothManuallyIntent f10600a = new TurnOnBluetoothManuallyIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$UnableToVerifyTapHereClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnableToVerifyTapHereClickedIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnableToVerifyTapHereClickedIntent f10601a = new UnableToVerifyTapHereClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$UseQRCodeClicked;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UseQRCodeClicked extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UseQRCodeClicked f10602a = new UseQRCodeClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ViewTripReceiptMenuOptionClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewTripReceiptMenuOptionClickedIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ViewTripReceiptMenuOptionClickedIntent f10603a = new ViewTripReceiptMenuOptionClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ViewTripReceiptPostConductorValidationCompleteIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewTripReceiptPostConductorValidationCompleteIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ViewTripReceiptPostConductorValidationCompleteIntent f10604a = new ViewTripReceiptPostConductorValidationCompleteIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent$ViewTripReceiptPostTapOutIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewTripReceiptPostTapOutIntent extends BleValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ViewTripReceiptPostTapOutIntent f10605a = new ViewTripReceiptPostTapOutIntent();
    }
}
