package defpackage;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import app.chalo.compose.components.chalomap.ChaloMap_androidKt;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.titoridedetail.data.ui.TitoRideDetailsScreenLiveBusMarker;
import app.chalo.titoridedetail.ui.TITORideDetailMapUiModel;
import app.chalo.titoridedetail.ui.TitoRideDetailsViewState;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pj1 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19042a;
    public final /* synthetic */ TitoRideDetailsViewState b;

    public /* synthetic */ pj1(TitoRideDetailsViewState titoRideDetailsViewState, int i) {
        this.f19042a = i;
        this.b = titoRideDetailsViewState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f19042a) {
            case 0:
                PaddingValues it = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(it, "it");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1554439981, iIntValue, -1, "app.chalo.titoridedetail.ui.compose.TapInDoneSuccessScreen.<anonymous> (TitoRideDataScreen.kt:332)");
                    }
                    ArrayList arrayList = new ArrayList();
                    TitoRideDetailsViewState titoRideDetailsViewState = this.b;
                    arrayList.addAll(titoRideDetailsViewState.f);
                    TitoRideDetailsScreenLiveBusMarker titoRideDetailsScreenLiveBusMarker = titoRideDetailsViewState.g;
                    if (titoRideDetailsScreenLiveBusMarker != null) {
                        arrayList.add(titoRideDetailsScreenLiveBusMarker);
                    }
                    TITORideDetailMapUiModel tITORideDetailMapUiModel = titoRideDetailsViewState.e;
                    ChaloMap_androidKt.b(null, tITORideDetailMapUiModel.f9703a, tITORideDetailMapUiModel.b, tITORideDetailMapUiModel.c, arrayList, null, null, false, null, null, null, null, composer, 0, 0, 4065);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                PaddingValues it2 = (PaddingValues) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(it2, "it");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1311620008, iIntValue2, -1, "app.chalo.titoridedetail.ui.compose.TapInDoneErrorScreen.<anonymous> (TitoRideDataScreen.kt:367)");
                    }
                    ArrayList arrayList2 = new ArrayList();
                    TitoRideDetailsViewState titoRideDetailsViewState2 = this.b;
                    arrayList2.addAll(titoRideDetailsViewState2.f);
                    TitoRideDetailsScreenLiveBusMarker titoRideDetailsScreenLiveBusMarker2 = titoRideDetailsViewState2.g;
                    if (titoRideDetailsScreenLiveBusMarker2 != null) {
                        arrayList2.add(titoRideDetailsScreenLiveBusMarker2);
                    }
                    EmptyList emptyList = EmptyList.f17557a;
                    TITORideDetailMapUiModel tITORideDetailMapUiModel2 = titoRideDetailsViewState2.e;
                    boolean z = tITORideDetailMapUiModel2.b;
                    MapCameraViewState mapCameraViewState = tITORideDetailMapUiModel2.c;
                    Object objRememberedValue = composer2.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new wi1(20);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    ChaloMap_androidKt.b(null, emptyList, z, mapCameraViewState, emptyList, null, null, false, (Function1) objRememberedValue, null, null, null, composer2, 100687920, 0, 3809);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.f17538a;
    }
}
