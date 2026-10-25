package defpackage;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsZoomedImageState;
import app.chalo.premiumbus.ui.stopdetails.PremiumBusStopDetailsViewState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateDataState;
import defpackage.pk0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dj0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15468a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;

    public /* synthetic */ dj0(List list, int i, int i2) {
        this.f15468a = i2;
        this.b = list;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15468a) {
            case 0:
                MinProfileUpdateDataState it = (MinProfileUpdateDataState) obj;
                Intrinsics.i(it, "it");
                return MinProfileUpdateDataState.a(it, null, this.b, null, this.c, false, null, null, null, 245);
            case 1:
                PremiumBusStopDetailsViewState it2 = (PremiumBusStopDetailsViewState) obj;
                Intrinsics.i(it2, "it");
                return PremiumBusStopDetailsViewState.a(it2, false, false, null, null, null, new PBStopDetailsZoomedImageState.Show(this.b, this.c), 31);
            default:
                LazyListScope LazyRow = (LazyListScope) obj;
                Intrinsics.i(LazyRow, "$this$LazyRow");
                final List list = this.b;
                int size = list.size();
                Function1<Integer, Object> function1 = new Function1<Integer, Object>() { // from class: app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt$TripPlannerItineraryLegsRow$lambda$0$0$$inlined$itemsIndexed$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list.get(((Number) obj2).intValue());
                        return null;
                    }
                };
                final int i = this.c;
                LazyRow.items(size, null, function1, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt$TripPlannerItineraryLegsRow$lambda$0$0$$inlined$itemsIndexed$default$3
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i2;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int iIntValue2 = ((Number) obj5).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i2 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i2 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i2 |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2039820996, i2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                            }
                            Object obj6 = list.get(iIntValue);
                            int i3 = i2 & WebSocketProtocol.PAYLOAD_SHORT;
                            TripPlannerLegUiModel tripPlannerLegUiModel = (TripPlannerLegUiModel) obj6;
                            composer.startReplaceGroup(-1879510882);
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                            int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
                            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            TripPlannerResultsScreenKt.l(tripPlannerLegUiModel, null, i, iIntValue, composer, (i3 << 6) & 7168);
                            if (iIntValue != list.size() - 1) {
                                composer.startReplaceGroup(89445279);
                                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composer, 0).f), composer, 0);
                                ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_ARROW_BACK_BLACK, composer, 6), (String) null, RotateKt.rotate(companion, 180.0f), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer, Painter.$stable | 25008, 104);
                            } else {
                                composer.startReplaceGroup(53091920);
                            }
                            composer.endReplaceGroup();
                            composer.endNode();
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }));
                return Unit.f17538a;
        }
    }
}
