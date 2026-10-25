package defpackage;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetValue;
import app.chalo.instantticket.data.exception.ProductBookingRemoteDataException;
import app.chalo.kyc.min.ui.minkycotp.KycLoadingPurpose;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpDataState;
import app.chalo.kyc.min.ui.minkycotp.MinKycScreenBottomSheetType;
import app.chalo.kyc.min.ui.minkycotp.OtpError;
import app.chalo.metro.ui.landing.MetroLandingScreenBottomSheetType;
import app.chalo.metro.ui.landing.MetroLandingScreenDataState;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.productbooking.common.data.exception.MobileTicketProductFetchFailedException;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateDataState;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateDialogType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qi0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19124a;

    public /* synthetic */ qi0(int i) {
        this.f19124a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19124a) {
            case 0:
                return MetroLandingScreenDataState.a((MetroLandingScreenDataState) obj, false, null, null, null, null, null, null, null, null, null, null, null, MetroLandingScreenBottomSheetType.LineSelectionBottomSheet, 4095);
            case 1:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                return new MobileTicketProductFetchFailedException(genericChaloErrorResponse, genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 2:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                return new ProductBookingRemoteDataException(genericChaloErrorResponse2, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
            case 3:
                GenericChaloErrorResponse genericChaloErrorResponse3 = (GenericChaloErrorResponse) obj;
                return new ProductBookingRemoteDataException(genericChaloErrorResponse3, genericChaloErrorResponse3 != null ? genericChaloErrorResponse3.b : null);
            case 4:
                GenericChaloErrorResponse genericChaloErrorResponse4 = (GenericChaloErrorResponse) obj;
                return new ProductBookingRemoteDataException(genericChaloErrorResponse4, genericChaloErrorResponse4 != null ? genericChaloErrorResponse4.b : null);
            case 5:
                GenericChaloErrorResponse genericChaloErrorResponse5 = (GenericChaloErrorResponse) obj;
                return new ProductBookingRemoteDataException(genericChaloErrorResponse5, genericChaloErrorResponse5 != null ? genericChaloErrorResponse5.b : null);
            case 6:
                GenericChaloErrorResponse genericChaloErrorResponse6 = (GenericChaloErrorResponse) obj;
                return new MobileTicketProductFetchFailedException(genericChaloErrorResponse6, genericChaloErrorResponse6 != null ? genericChaloErrorResponse6.b : null);
            case 7:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("metro_ticket_table");
                return Unit.f17538a;
            case 8:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("metro_ticket_table");
                return Unit.f17538a;
            case 9:
                Function1 emit3 = (Function1) obj;
                Intrinsics.i(emit3, "emit");
                emit3.invoke("metro_ticket_table");
                return Unit.f17538a;
            case 10:
                Function1 emit4 = (Function1) obj;
                Intrinsics.i(emit4, "emit");
                emit4.invoke("metro_ticket_table");
                return Unit.f17538a;
            case 11:
                MinKycOtpDataState it = (MinKycOtpDataState) obj;
                Intrinsics.i(it, "it");
                return MinKycOtpDataState.a(it, null, null, null, false, false, 0L, false, OtpError.INVALID_OTP, null, null, null, null, 15615);
            case 12:
                MinKycOtpDataState it2 = (MinKycOtpDataState) obj;
                Intrinsics.i(it2, "it");
                return MinKycOtpDataState.a(it2, null, null, null, false, false, 0L, false, null, null, null, MinKycScreenBottomSheetType.NONE, null, 12283);
            case 13:
                MinKycOtpDataState it3 = (MinKycOtpDataState) obj;
                Intrinsics.i(it3, "it");
                return MinKycOtpDataState.a(it3, null, null, null, false, false, 0L, false, null, null, null, MinKycScreenBottomSheetType.NONE, null, 12283);
            case 14:
                MinKycOtpDataState it4 = (MinKycOtpDataState) obj;
                Intrinsics.i(it4, "it");
                return MinKycOtpDataState.a(it4, null, null, null, true, false, 0L, false, null, null, null, null, null, 16367);
            case 15:
                MinKycOtpDataState it5 = (MinKycOtpDataState) obj;
                Intrinsics.i(it5, "it");
                return MinKycOtpDataState.a(it5, null, null, KycLoadingPurpose.VERIFYING_KYC, true, false, 0L, false, null, null, null, null, null, 16359);
            case 16:
                MinKycOtpDataState it6 = (MinKycOtpDataState) obj;
                Intrinsics.i(it6, "it");
                return MinKycOtpDataState.a(it6, null, null, KycLoadingPurpose.VERIFYING_KYC, true, false, 0L, false, null, null, null, null, null, 16359);
            case 17:
                MinKycOtpDataState it7 = (MinKycOtpDataState) obj;
                Intrinsics.i(it7, "it");
                return MinKycOtpDataState.a(it7, null, null, null, false, false, 0L, false, OtpError.VERIFICATION_FAILED, null, null, null, null, 15599);
            case 18:
                MinKycOtpDataState it8 = (MinKycOtpDataState) obj;
                Intrinsics.i(it8, "it");
                return MinKycOtpDataState.a(it8, null, null, null, false, false, 0L, false, null, null, null, null, null, 16367);
            case 19:
                MinKycOtpDataState it9 = (MinKycOtpDataState) obj;
                Intrinsics.i(it9, "it");
                return MinKycOtpDataState.a(it9, null, null, null, false, false, 0L, false, OtpError.OTP_EMPTY, null, null, null, null, 15615);
            case 20:
                return MinKycOtpDataState.a((MinKycOtpDataState) obj, null, null, KycLoadingPurpose.REQUESTING_OTP, true, false, 0L, false, null, null, null, null, null, 16359);
            case 21:
                return MinKycOtpDataState.a((MinKycOtpDataState) obj, null, null, null, false, false, 0L, false, null, null, null, null, null, 16367);
            case 22:
                MinProfileUpdateDataState it10 = (MinProfileUpdateDataState) obj;
                Intrinsics.i(it10, "it");
                return MinProfileUpdateDataState.a(it10, null, null, null, 0, false, null, null, null, 239);
            case 23:
                MinProfileUpdateDataState it11 = (MinProfileUpdateDataState) obj;
                Intrinsics.i(it11, "it");
                return MinProfileUpdateDataState.a(it11, null, null, null, 0, true, null, null, null, 239);
            case 24:
                MinProfileUpdateDataState it12 = (MinProfileUpdateDataState) obj;
                Intrinsics.i(it12, "it");
                return MinProfileUpdateDataState.a(it12, null, null, null, 0, false, null, null, null, 127);
            case 25:
                MinProfileUpdateDataState it13 = (MinProfileUpdateDataState) obj;
                Intrinsics.i(it13, "it");
                return MinProfileUpdateDataState.a(it13, null, null, null, 0, false, null, null, null, 127);
            case 26:
                MinProfileUpdateDataState it14 = (MinProfileUpdateDataState) obj;
                Intrinsics.i(it14, "it");
                return MinProfileUpdateDataState.a(it14, null, null, null, 0, false, null, null, MinProfileUpdateDialogType.GalleryPermissionRationale.f10392a, 127);
            case 27:
                return MinProfileUpdateDataState.a((MinProfileUpdateDataState) obj, null, null, null, 0, false, null, null, null, 239);
            case 28:
                return MinProfileUpdateDataState.a((MinProfileUpdateDataState) obj, null, null, null, 0, false, null, null, null, 239);
            default:
                return Boolean.valueOf(ModalBottomSheetKt.rememberModalBottomSheetState$lambda$26$lambda$25((SheetValue) obj));
        }
    }
}
