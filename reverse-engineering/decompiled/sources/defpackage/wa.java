package defpackage;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback;
import androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt;
import androidx.compose.material3.BottomAppBarState;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.chalo.appsupport.BookingHelpBottomSheetType;
import app.chalo.appsupport.BookingHelpScreenDataState;
import app.chalo.appsupport.data.remote.BookingHelpRemoteException;
import app.chalo.busesaroundyou.BusesAroundYouDataState;
import app.chalo.compose.components.chalomap.MapCameraUpdate;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetValue;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.validationsdk.blevalidation.ui.BleValidationBottomsheetType;
import app.chalo.validationsdk.blevalidation.ui.BleValidationLayoutInfo;
import app.chalo.validationsdk.blevalidation.ui.BleValidationLayoutType;
import app.chalo.validationsdk.blevalidation.ui.BleValidationState;
import app.chalo.validationsdk.blevalidation.ui.QRScreenLayoutInfo;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.maps.android.compose.CameraPositionState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wa implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19908a;

    public /* synthetic */ wa(int i) {
        this.f19908a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19908a) {
            case 0:
                BleValidationState currentState = (BleValidationState) obj;
                Intrinsics.i(currentState, "currentState");
                return BleValidationState.a(currentState, BleValidationLayoutType.SWITCH_TO_QR_VALIDATION_SCREEN, null, null, null, null, false, null, false, null, null, 4094);
            case 1:
                BleValidationState currentState2 = (BleValidationState) obj;
                Intrinsics.i(currentState2, "currentState");
                return BleValidationState.a(currentState2, BleValidationLayoutType.QR_SCREEN, null, null, null, null, false, null, false, null, null, 4094);
            case 2:
                BleValidationState currentState3 = (BleValidationState) obj;
                Intrinsics.i(currentState3, "currentState");
                return BleValidationState.a(currentState3, null, null, null, BleValidationBottomsheetType.NONE, null, false, null, false, null, null, 4087);
            case 3:
                BleValidationState it = (BleValidationState) obj;
                Intrinsics.i(it, "it");
                return BleValidationState.a(it, null, null, null, BleValidationBottomsheetType.NONE, null, false, null, false, null, null, 4087);
            case 4:
                BleValidationState currentState4 = (BleValidationState) obj;
                Intrinsics.i(currentState4, "currentState");
                BleValidationLayoutInfo bleValidationLayoutInfo = currentState4.b;
                QRScreenLayoutInfo qRScreenLayoutInfoA = bleValidationLayoutInfo != null ? QRScreenLayoutInfo.a(bleValidationLayoutInfo.c, false, null, false, 6) : null;
                return BleValidationState.a(currentState4, null, qRScreenLayoutInfoA != null ? BleValidationLayoutInfo.a(bleValidationLayoutInfo, null, qRScreenLayoutInfoA, 3) : null, null, BleValidationBottomsheetType.NEARBY_DEVICES_PERMISSION_RATIONALE, null, false, null, false, null, null, 4085);
            case 5:
                BleValidationState currentState5 = (BleValidationState) obj;
                Intrinsics.i(currentState5, "currentState");
                BleValidationLayoutInfo bleValidationLayoutInfo2 = currentState5.b;
                QRScreenLayoutInfo qRScreenLayoutInfoA2 = bleValidationLayoutInfo2 != null ? QRScreenLayoutInfo.a(bleValidationLayoutInfo2.c, false, null, false, 6) : null;
                return BleValidationState.a(currentState5, BleValidationLayoutType.BLE_TURN_ON_FULL_SCREEN_EXPLAINER, qRScreenLayoutInfoA2 != null ? BleValidationLayoutInfo.a(bleValidationLayoutInfo2, null, qRScreenLayoutInfoA2, 3) : null, null, null, null, false, null, false, null, null, 4092);
            case 6:
                return BleValidationState.a((BleValidationState) obj, null, null, null, BleValidationBottomsheetType.NONE, null, false, null, false, null, null, 4087);
            case 7:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                return new BookingHelpRemoteException(genericChaloErrorResponse, genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 8:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                return new BookingHelpRemoteException(genericChaloErrorResponse2, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
            case 9:
                BookingHelpScreenDataState it2 = (BookingHelpScreenDataState) obj;
                Intrinsics.i(it2, "it");
                return BookingHelpScreenDataState.a(it2, null, null, false, BookingHelpBottomSheetType.None.f966a, 31);
            case 10:
                BookingHelpScreenDataState it3 = (BookingHelpScreenDataState) obj;
                Intrinsics.i(it3, "it");
                return BookingHelpScreenDataState.a(it3, null, null, true, BookingHelpBottomSheetType.None.f966a, 23);
            case 11:
                BookingHelpScreenDataState it4 = (BookingHelpScreenDataState) obj;
                Intrinsics.i(it4, "it");
                return BookingHelpScreenDataState.a(it4, null, null, false, BookingHelpBottomSheetType.CancellationError.f962a, 23);
            case 12:
                BookingHelpScreenDataState it5 = (BookingHelpScreenDataState) obj;
                Intrinsics.i(it5, "it");
                return BookingHelpScreenDataState.a(it5, null, null, false, BookingHelpBottomSheetType.CancellationInitiated.f964a, 23);
            case 13:
                BookingHelpScreenDataState it6 = (BookingHelpScreenDataState) obj;
                Intrinsics.i(it6, "it");
                return BookingHelpScreenDataState.a(it6, null, null, false, BookingHelpBottomSheetType.CancellationSuccess.f965a, 23);
            case 14:
                BookingHelpScreenDataState it7 = (BookingHelpScreenDataState) obj;
                Intrinsics.i(it7, "it");
                return BookingHelpScreenDataState.a(it7, null, null, false, BookingHelpBottomSheetType.CancellationError.f962a, 23);
            case 15:
                return BorderKt.drawContentWithoutBorder$lambda$0((ContentDrawScope) obj);
            case 16:
                return BottomAppBarState.Companion.Saver$lambda$1((List) obj);
            case 17:
                float f = BottomSheetScaffoldKt.f4445a;
                Intrinsics.i((BottomSheetValue) obj, "it");
                return Boolean.TRUE;
            case 18:
                return Boolean.valueOf(androidx.compose.material3.BottomSheetScaffoldKt.rememberStandardBottomSheetState$lambda$5$lambda$4((SheetValue) obj));
            case 19:
                Intrinsics.i((BottomSheetValue) obj, "it");
                return Boolean.TRUE;
            case 20:
                return BringIntoViewSpec_androidKt.LocalBringIntoViewSpec$lambda$0((CompositionLocalAccessorScope) obj);
            case 21:
                BusesAroundYouDataState it8 = (BusesAroundYouDataState) obj;
                Intrinsics.i(it8, "it");
                return BusesAroundYouDataState.a(it8, false, false, null, null, null, null, 0L, 0L, false, 1023);
            case 22:
                BusesAroundYouDataState it9 = (BusesAroundYouDataState) obj;
                Intrinsics.i(it9, "it");
                return BusesAroundYouDataState.a(it9, false, false, null, null, null, null, 0L, 0L, false, 2045);
            case 23:
                BusesAroundYouDataState it10 = (BusesAroundYouDataState) obj;
                Intrinsics.i(it10, "it");
                return BusesAroundYouDataState.a(it10, false, false, null, null, null, null, 0L, 0L, false, 1023);
            case 24:
                Intrinsics.i((MapCameraUpdate) obj, "it");
                return Unit.f17538a;
            case 25:
                BusesAroundYouDataState it11 = (BusesAroundYouDataState) obj;
                Intrinsics.i(it11, "it");
                return BusesAroundYouDataState.a(it11, false, false, null, null, null, null, 0L, 0L, true, 1023);
            case 26:
                return ButtonKt.Button$lambda$2$lambda$1((SemanticsPropertyReceiver) obj);
            case 27:
                CharSequence it12 = (CharSequence) obj;
                Intrinsics.i(it12, "it");
                return it12.toString();
            case 28:
                return CacheDrawScopeDragShadowCallback.cachePicture$lambda$0$0$0((ContentDrawScope) obj);
            default:
                CameraPosition it13 = (CameraPosition) obj;
                Saver saver = CameraPositionState.h;
                Intrinsics.i(it13, "it");
                return new CameraPositionState(it13);
        }
    }
}
