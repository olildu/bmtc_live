package defpackage;

import android.animation.Animator;
import android.content.Context;
import androidx.compose.foundation.text.BasicSecureTextFieldKt;
import androidx.compose.foundation.text.BasicSecureTextField_androidKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BadgeKt;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.core.animation.AnimatorKt;
import app.chalo.appmigrationpreconditions.AppMigrationPreconditionsDataState;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.validationsdk.blevalidation.ui.BleValidationBottomsheetType;
import app.chalo.validationsdk.blevalidation.ui.BleValidationLayoutInfo;
import app.chalo.validationsdk.blevalidation.ui.BleValidationLayoutType;
import app.chalo.validationsdk.blevalidation.ui.BleValidationState;
import app.chalo.validationsdk.blevalidation.ui.QRScreenLayoutInfo;
import coil3.compose.AsyncImagePainter;
import com.silencelaboratories.silentride.events.SilentRideEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.ext.KClassExtKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v5 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19803a;

    public /* synthetic */ v5(int i) {
        this.f19803a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PremiumReserveTicketStatus premiumReserveTicketStatus;
        switch (this.f19803a) {
            case 0:
                return AnimatorKt.addPauseListener$lambda$0((Animator) obj);
            case 1:
                return AnimatorKt.addPauseListener$lambda$1((Animator) obj);
            case 2:
                return Boolean.valueOf(AnnotatedStringKt.substringWithoutParagraphStyles$lambda$0((AnnotatedString.Annotation) obj));
            case 3:
                return AppBarKt.TopAppBarLayout_lyUyIHI$lambda$51$lambda$41$lambda$40((SemanticsPropertyReceiver) obj);
            case 4:
                return AppBarKt.TopAppBarLayout_lyUyIHI$lambda$51$lambda$46$lambda$45((SemanticsPropertyReceiver) obj);
            case 5:
                AppMigrationPreconditionsDataState it = (AppMigrationPreconditionsDataState) obj;
                Intrinsics.i(it, "it");
                return new AppMigrationPreconditionsDataState(false, it.b);
            case 6:
                Intrinsics.i((AppMigrationPreconditionsDataState) obj, "it");
                return new AppMigrationPreconditionsDataState(true, false);
            case 7:
                Intrinsics.i((AppMigrationPreconditionsDataState) obj, "it");
                return new AppMigrationPreconditionsDataState(false, true);
            case 8:
                CharSequence it2 = (CharSequence) obj;
                Intrinsics.i(it2, "it");
                return Integer.valueOf(it2.length());
            case 9:
                return (AsyncImagePainter.State) obj;
            case 10:
                SilentRideEvent scanEvent = (SilentRideEvent) obj;
                Intrinsics.i(scanEvent, "scanEvent");
                vo1.x("BLECommPassengerSideActiveModeScanEvent: ", scanEvent.f15361a, "message");
                return Unit.f17538a;
            case 11:
                PremiumReserveTicketAppModel it3 = (PremiumReserveTicketAppModel) obj;
                Intrinsics.i(it3, "it");
                PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = it3.f7113a;
                return Boolean.valueOf(premiumReserveTicketBookingPropertiesAppModel.h == PremiumReserveTicketStatus.USER_CANCELLED || it3.d() || (premiumReserveTicketStatus = premiumReserveTicketBookingPropertiesAppModel.h) == PremiumReserveTicketStatus.USER_RESCHEDULED || premiumReserveTicketStatus == PremiumReserveTicketStatus.SYSTEM_RESCHEDULED);
            case 12:
                PremiumReserveTicketAppModel it4 = (PremiumReserveTicketAppModel) obj;
                Intrinsics.i(it4, "it");
                PremiumReserveTicketStatus premiumReserveTicketStatus2 = it4.f7113a.h;
                return Boolean.valueOf(premiumReserveTicketStatus2 == PremiumReserveTicketStatus.PUNCHED || premiumReserveTicketStatus2 == PremiumReserveTicketStatus.USED || premiumReserveTicketStatus2 == PremiumReserveTicketStatus.EXPIRED);
            case 13:
                return BadgeKt.badgeBounds$lambda$7$lambda$5((RulerScope) obj);
            case 14:
                return BasicSecureTextFieldKt.BasicSecureTextField_ltb6GB4$lambda$4$0((SemanticsPropertyReceiver) obj);
            case 15:
                return BasicSecureTextField_androidKt.DefaultContentResolverForSecureTextField$lambda$0((Context) obj);
            case 16:
                return BasicTextFieldKt.BasicTextField$lambda$16$0((TextLayoutResult) obj);
            case 17:
                return BasicTextFieldKt.BasicTextField$lambda$26$0((TextLayoutResult) obj);
            case 18:
                return BasicTextFieldKt.BasicTextField$lambda$29$0((TextLayoutResult) obj);
            case 19:
                return BasicTextFieldKt.BasicTextField$lambda$32$0((TextLayoutResult) obj);
            case 20:
                return Long.valueOf(((Long) obj).longValue());
            case 21:
                KClass it5 = (KClass) obj;
                Intrinsics.i(it5, "it");
                return KClassExtKt.a(it5);
            case 22:
                BleValidationState currentState = (BleValidationState) obj;
                Intrinsics.i(currentState, "currentState");
                BleValidationLayoutInfo bleValidationLayoutInfo = currentState.b;
                QRScreenLayoutInfo qRScreenLayoutInfoA = bleValidationLayoutInfo != null ? QRScreenLayoutInfo.a(bleValidationLayoutInfo.c, true, null, false, 6) : null;
                return BleValidationState.a(currentState, null, qRScreenLayoutInfoA != null ? BleValidationLayoutInfo.a(bleValidationLayoutInfo, null, qRScreenLayoutInfoA, 3) : null, null, BleValidationBottomsheetType.TAP_TO_VALIDATE_TUTORIAL, null, false, null, false, null, null, 4085);
            case 23:
                BleValidationState currentState2 = (BleValidationState) obj;
                Intrinsics.i(currentState2, "currentState");
                BleValidationLayoutInfo bleValidationLayoutInfo2 = currentState2.b;
                QRScreenLayoutInfo qRScreenLayoutInfoA2 = bleValidationLayoutInfo2 != null ? QRScreenLayoutInfo.a(bleValidationLayoutInfo2.c, true, null, false, 6) : null;
                return BleValidationState.a(currentState2, null, qRScreenLayoutInfoA2 != null ? BleValidationLayoutInfo.a(bleValidationLayoutInfo2, null, qRScreenLayoutInfoA2, 3) : null, null, null, null, false, null, false, null, null, 4093);
            case 24:
                BleValidationState currentState3 = (BleValidationState) obj;
                Intrinsics.i(currentState3, "currentState");
                BleValidationLayoutInfo bleValidationLayoutInfo3 = currentState3.b;
                QRScreenLayoutInfo qRScreenLayoutInfoA3 = bleValidationLayoutInfo3 != null ? QRScreenLayoutInfo.a(bleValidationLayoutInfo3.c, true, null, false, 6) : null;
                return BleValidationState.a(currentState3, BleValidationLayoutType.BLE_VALIDATION, qRScreenLayoutInfoA3 != null ? BleValidationLayoutInfo.a(bleValidationLayoutInfo3, null, qRScreenLayoutInfoA3, 3) : null, null, null, null, false, null, false, null, null, 4092);
            case 25:
                BleValidationState currentState4 = (BleValidationState) obj;
                Intrinsics.i(currentState4, "currentState");
                BleValidationLayoutInfo bleValidationLayoutInfo4 = currentState4.b;
                QRScreenLayoutInfo qRScreenLayoutInfoA4 = bleValidationLayoutInfo4 != null ? QRScreenLayoutInfo.a(bleValidationLayoutInfo4.c, false, null, false, 6) : null;
                return BleValidationState.a(currentState4, BleValidationLayoutType.QR_SCREEN, qRScreenLayoutInfoA4 != null ? BleValidationLayoutInfo.a(bleValidationLayoutInfo4, null, qRScreenLayoutInfoA4, 3) : null, null, null, null, false, null, false, null, null, 4092);
            case 26:
                BleValidationState currentState5 = (BleValidationState) obj;
                Intrinsics.i(currentState5, "currentState");
                return BleValidationState.a(currentState5, BleValidationLayoutType.BLE_VALIDATION, null, null, BleValidationBottomsheetType.NONE, null, false, null, false, null, null, 4086);
            case 27:
                BleValidationState currentState6 = (BleValidationState) obj;
                Intrinsics.i(currentState6, "currentState");
                return BleValidationState.a(currentState6, null, null, null, BleValidationBottomsheetType.PRODUCT_AND_USER_DETAILS, null, false, null, false, null, null, 4087);
            case 28:
                BleValidationState currentState7 = (BleValidationState) obj;
                Intrinsics.i(currentState7, "currentState");
                return BleValidationState.a(currentState7, null, null, null, BleValidationBottomsheetType.NONE, null, false, null, false, null, null, 4087);
            default:
                BleValidationState currentState8 = (BleValidationState) obj;
                Intrinsics.i(currentState8, "currentState");
                return BleValidationState.a(currentState8, BleValidationLayoutType.BLE_VALIDATION, null, null, null, null, false, null, false, null, null, 4094);
        }
    }
}
