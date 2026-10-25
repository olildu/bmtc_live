package defpackage;

import androidx.compose.runtime.retain.RetainedValuesStoreRegistry;
import androidx.compose.ui.layout.Placeable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.home.data.model.app.LocationTooltipData;
import app.chalo.home.data.model.app.LocationTurnOnTooltipType;
import app.chalo.home.ui.regularbus.RegularBusDialogType;
import app.chalo.home.ui.regularbus.RegularBusViewState;
import app.chalo.location.LatLng;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.reportproblem.ReportProblemDataState;
import app.chalo.ridefeedback.data.RideFeedbackRepository;
import app.chalo.ridefeedback.data.exception.RideFeedbackRemoteDataException;
import app.chalo.ridefeedback.data.remote.RideFeedbackRemoteDataSource;
import app.chalo.ridehailing.data.RideHailingRepository;
import app.chalo.ridehailing.data.exception.RideHailingRemoteDataException;
import app.chalo.ridehailing.data.local.RideHailingLocalDataSource;
import app.chalo.ridehailing.data.remote.RideHailingRemoteDataSource;
import app.chalo.tripreceipt.tripreceiptnew.RideReceiptDataState;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.compose.resources.ResourceEnvironmentKt;
import org.jetbrains.compose.resources.ResourceEnvironmentKt$DefaultComposeEnvironment$1;
import org.jetbrains.compose.resources.ResourceItem;
import org.koin.core.definition.BeanDefinition;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g11 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15692a;

    public /* synthetic */ g11(int i) {
        this.f15692a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f15692a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                RegularBusViewState it = (RegularBusViewState) obj;
                Intrinsics.i(it, "it");
                return RegularBusViewState.a(it, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 4128767);
            case 1:
                RegularBusViewState it2 = (RegularBusViewState) obj;
                Intrinsics.i(it2, "it");
                return RegularBusViewState.a(it2, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, RegularBusDialogType.JuspayPermissionRationale.f3630a, null, false, false, false, false, 4128767);
            case 2:
                Intrinsics.i((Map) obj, "<this>");
                return unit;
            case 3:
                RegularBusViewState it3 = (RegularBusViewState) obj;
                Intrinsics.i(it3, "it");
                return RegularBusViewState.a(it3, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 4186111);
            case 4:
                RegularBusViewState it4 = (RegularBusViewState) obj;
                Intrinsics.i(it4, "it");
                return RegularBusViewState.a(it4, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, true, 2097151);
            case 5:
                return RegularBusViewState.a((RegularBusViewState) obj, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 4192255);
            case 6:
                return RegularBusViewState.a((RegularBusViewState) obj, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 4192255);
            case 7:
                return RegularBusViewState.a((RegularBusViewState) obj, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 4192255);
            case 8:
                RegularBusViewState it5 = (RegularBusViewState) obj;
                Intrinsics.i(it5, "it");
                return RegularBusViewState.a(it5, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, RegularBusDialogType.LocationPermissionRationale.f3631a, null, false, false, false, false, 4128767);
            case 9:
                RegularBusViewState it6 = (RegularBusViewState) obj;
                Intrinsics.i(it6, "it");
                return RegularBusViewState.a(it6, false, null, null, null, false, null, null, null, null, null, null, null, new LocationTooltipData(false, LocationTurnOnTooltipType.Unknown.f2947a), null, null, null, null, false, false, false, false, 4186111);
            case 10:
                Intrinsics.i((LatLng) obj, "it");
                return unit;
            case 11:
                Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
                Intrinsics.i(layout, "$this$layout");
                return unit;
            case 12:
                ReportProblemDataState it7 = (ReportProblemDataState) obj;
                Intrinsics.i(it7, "it");
                return ReportProblemDataState.a(it7, false, null, null, null, null, false, false, false, false, 479);
            case 13:
                ReportProblemDataState it8 = (ReportProblemDataState) obj;
                Intrinsics.i(it8, "it");
                return ReportProblemDataState.a(it8, false, null, null, null, null, false, false, false, false, 255);
            case 14:
                ReportProblemDataState it9 = (ReportProblemDataState) obj;
                Intrinsics.i(it9, "it");
                return ReportProblemDataState.a(it9, false, null, null, null, null, false, false, false, false, 447);
            case 15:
                ReportProblemDataState it10 = (ReportProblemDataState) obj;
                Intrinsics.i(it10, "it");
                return ReportProblemDataState.a(it10, false, null, null, null, null, true, false, false, false, 479);
            case 16:
                ReportProblemDataState it11 = (ReportProblemDataState) obj;
                Intrinsics.i(it11, "it");
                return ReportProblemDataState.a(it11, false, null, null, null, null, false, false, false, false, 447);
            case 17:
                ReportProblemDataState it12 = (ReportProblemDataState) obj;
                Intrinsics.i(it12, "it");
                return ReportProblemDataState.a(it12, true, null, null, null, null, false, false, false, false, 478);
            case 18:
                return ReportProblemDataState.a((ReportProblemDataState) obj, false, null, null, null, null, false, false, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE);
            case 19:
                return ReportProblemDataState.a((ReportProblemDataState) obj, false, null, null, null, null, false, false, false, false, 447);
            case 20:
                ResourceItem it13 = (ResourceItem) obj;
                ResourceEnvironmentKt$DefaultComposeEnvironment$1 resourceEnvironmentKt$DefaultComposeEnvironment$1 = ResourceEnvironmentKt.f18782a;
                Intrinsics.i(it13, "it");
                return it13.b;
            case 21:
                return Boolean.valueOf(RetainedValuesStoreRegistry.dispose$lambda$0(obj));
            case 22:
                BeanDefinition singleOf = (BeanDefinition) obj;
                Intrinsics.i(singleOf, "$this$singleOf");
                singleOf.f = CollectionsKt.d0(Reflection.a(RideFeedbackRemoteDataSource.class), singleOf.f);
                return unit;
            case 23:
                BeanDefinition singleOf2 = (BeanDefinition) obj;
                Intrinsics.i(singleOf2, "$this$singleOf");
                singleOf2.f = CollectionsKt.d0(Reflection.a(RideFeedbackRepository.class), singleOf2.f);
                return unit;
            case 24:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                return new RideFeedbackRemoteDataException(genericChaloErrorResponse, genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 25:
                BeanDefinition singleOf3 = (BeanDefinition) obj;
                Intrinsics.i(singleOf3, "$this$singleOf");
                singleOf3.f = CollectionsKt.d0(Reflection.a(RideHailingRemoteDataSource.class), singleOf3.f);
                return unit;
            case 26:
                BeanDefinition singleOf4 = (BeanDefinition) obj;
                Intrinsics.i(singleOf4, "$this$singleOf");
                singleOf4.f = CollectionsKt.d0(Reflection.a(RideHailingLocalDataSource.class), singleOf4.f);
                return unit;
            case 27:
                BeanDefinition singleOf5 = (BeanDefinition) obj;
                Intrinsics.i(singleOf5, "$this$singleOf");
                singleOf5.f = CollectionsKt.d0(Reflection.a(RideHailingRepository.class), singleOf5.f);
                return unit;
            case 28:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                return new RideHailingRemoteDataException(genericChaloErrorResponse2, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
            default:
                RideReceiptDataState it14 = (RideReceiptDataState) obj;
                Intrinsics.i(it14, "it");
                return RideReceiptDataState.a(it14, false, null, null, 6);
        }
    }
}
