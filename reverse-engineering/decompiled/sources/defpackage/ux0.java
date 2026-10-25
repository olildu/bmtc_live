package defpackage;

import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshDefaults;
import androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.core.app.FrameMetricsAggregator;
import app.chalo.home.ui.profile.ProfileScreenBottomSheetType;
import app.chalo.home.ui.profile.ProfileScreenDialogType;
import app.chalo.home.ui.profile.ProfileScreenViewState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerDataState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ux0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19784a;

    public /* synthetic */ ux0(int i) {
        this.f19784a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19784a) {
            case 0:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("product_activation_details_table");
                return Unit.f17538a;
            case 1:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("product_activation_details_table");
                return Unit.f17538a;
            case 2:
                Function1 emit3 = (Function1) obj;
                Intrinsics.i(emit3, "emit");
                emit3.invoke("super_pass_trip_receipt_table");
                return Unit.f17538a;
            case 3:
                Function1 emit4 = (Function1) obj;
                Intrinsics.i(emit4, "emit");
                emit4.invoke("super_pass_trip_receipt_table");
                return Unit.f17538a;
            case 4:
                Function1 emit5 = (Function1) obj;
                Intrinsics.i(emit5, "emit");
                emit5.invoke("super_pass_trip_receipt_table");
                return Unit.f17538a;
            case 5:
                ProfileScreenViewState it = (ProfileScreenViewState) obj;
                Intrinsics.i(it, "it");
                return ProfileScreenViewState.a(it, null, null, null, false, null, false, false, null, false, false, 1019);
            case 6:
                ProfileScreenViewState it2 = (ProfileScreenViewState) obj;
                Intrinsics.i(it2, "it");
                return ProfileScreenViewState.a(it2, null, null, null, false, null, false, false, null, false, false, 1019);
            case 7:
                ProfileScreenViewState it3 = (ProfileScreenViewState) obj;
                Intrinsics.i(it3, "it");
                return ProfileScreenViewState.a(it3, null, null, null, false, null, false, false, null, false, false, 959);
            case 8:
                ProfileScreenViewState it4 = (ProfileScreenViewState) obj;
                Intrinsics.i(it4, "it");
                return ProfileScreenViewState.a(it4, null, null, null, false, null, false, false, null, false, true, FrameMetricsAggregator.EVERY_DURATION);
            case 9:
                ProfileScreenViewState it5 = (ProfileScreenViewState) obj;
                Intrinsics.i(it5, "it");
                return ProfileScreenViewState.a(it5, null, null, null, false, null, false, true, null, false, false, 959);
            case 10:
                ProfileScreenViewState it6 = (ProfileScreenViewState) obj;
                Intrinsics.i(it6, "it");
                return ProfileScreenViewState.a(it6, null, null, ProfileScreenDialogType.DeleteAccountConfirmation.f3598a, false, null, false, false, null, false, false, 1019);
            case 11:
                ProfileScreenViewState it7 = (ProfileScreenViewState) obj;
                Intrinsics.i(it7, "it");
                return ProfileScreenViewState.a(it7, null, null, null, false, null, false, false, null, false, false, 1021);
            case 12:
                ProfileScreenViewState it8 = (ProfileScreenViewState) obj;
                Intrinsics.i(it8, "it");
                return ProfileScreenViewState.a(it8, null, null, null, false, null, false, false, null, false, false, 255);
            case 13:
                ProfileScreenViewState it9 = (ProfileScreenViewState) obj;
                Intrinsics.i(it9, "it");
                return ProfileScreenViewState.a(it9, null, null, null, false, null, false, false, null, false, false, 1021);
            case 14:
                return ProfileScreenViewState.a((ProfileScreenViewState) obj, null, null, null, true, null, false, false, null, false, false, 1011);
            case 15:
                return ProfileScreenViewState.a((ProfileScreenViewState) obj, null, null, null, false, null, false, false, null, false, false, 1013);
            case 16:
                return ProfileScreenViewState.a((ProfileScreenViewState) obj, null, null, null, false, null, false, false, null, false, false, 1015);
            case 17:
                return ProfileScreenViewState.a((ProfileScreenViewState) obj, null, null, null, true, null, false, false, null, false, false, 1015);
            case 18:
                return ProfileScreenViewState.a((ProfileScreenViewState) obj, null, null, null, false, null, false, false, null, false, false, 1013);
            case 19:
                return ProfileScreenViewState.a((ProfileScreenViewState) obj, null, ProfileScreenBottomSheetType.ChaloWalletIntroBottomSheet.f3595a, null, false, null, false, false, null, false, false, 1021);
            case 20:
                return ProgressIndicatorKt._get_linearIndeterminateFirstLineHeadAnimationSpec_$lambda$43((KeyframesSpec.KeyframesSpecConfig) obj);
            case 21:
                return ProgressIndicatorKt._get_linearIndeterminateFirstLineTailAnimationSpec_$lambda$44((KeyframesSpec.KeyframesSpecConfig) obj);
            case 22:
                return ProgressIndicatorKt._get_circularIndeterminateProgressAnimationSpec_$lambda$42((KeyframesSpec.KeyframesSpecConfig) obj);
            case 23:
                return ProgressIndicatorKt._get_circularIndeterminateRotationAnimationSpec_$lambda$41((KeyframesSpec.KeyframesSpecConfig) obj);
            case 24:
                return ProgressIndicatorKt._get_linearIndeterminateSecondLineHeadAnimationSpec_$lambda$45((KeyframesSpec.KeyframesSpecConfig) obj);
            case 25:
                return ProgressIndicatorKt._get_linearIndeterminateSecondLineTailAnimationSpec_$lambda$46((KeyframesSpec.KeyframesSpecConfig) obj);
            case 26:
                return ProgressSemanticsKt.progressSemantics$lambda$1((SemanticsPropertyReceiver) obj);
            case 27:
                return PullToRefreshDefaults.IndicatorBox_1CPYgEU$lambda$2$lambda$1((ContentDrawScope) obj);
            case 28:
                return PullToRefreshStateImpl.Saver$lambda$1(((Float) obj).floatValue());
            default:
                QRScannerDataState it10 = (QRScannerDataState) obj;
                Intrinsics.i(it10, "it");
                return QRScannerDataState.a(it10, null, null, null, null, null, null, null, null, false, false, null, null, null, 13823);
        }
    }
}
