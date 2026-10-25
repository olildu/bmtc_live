package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ml0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18407a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Function d;

    public /* synthetic */ ml0(float f, Arrangement.HorizontalOrVertical horizontalOrVertical, Function3 function3) {
        this.b = f;
        this.c = horizontalOrVertical;
        this.d = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18407a) {
            case 0:
                Arrangement.HorizontalOrVertical horizontalOrVertical = (Arrangement.HorizontalOrVertical) this.c;
                Function3 function3 = (Function3) this.d;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(572690519, iIntValue, -1, "app.chalo.compose.components.navigationbar.NavigationBar.<anonymous> (NavigationBar.kt:47)");
                    }
                    Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(SizeKt.m813defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, this.b, 1, null));
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVertical, Alignment.INSTANCE.getCenterVertically(), composer, 48);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierSelectableGroup);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
                    function3.invoke(RowScopeInstance.INSTANCE, composer, 6);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.f17538a;
            default:
                Function2<? super Composer, ? super Integer, Unit> function2 = (Function2) this.c;
                Function2<? super Composer, ? super Integer, Unit> function4 = (Function2) this.d;
                SubcomposeMeasureScope SubcomposeLayout = (SubcomposeMeasureScope) obj;
                Constraints constraints = (Constraints) obj2;
                Intrinsics.i(SubcomposeLayout, "$this$SubcomposeLayout");
                Placeable placeableMo5939measureBRTryo0 = ((Measurable) CollectionsKt.F(SubcomposeLayout.subcompose("vehicle", function2))).mo5939measureBRTryo0(constraints.getValue());
                Placeable placeableMo5939measureBRTryo1 = function4 != null ? ((Measurable) CollectionsKt.F(SubcomposeLayout.subcompose("driver", function4))).mo5939measureBRTryo0(constraints.getValue()) : null;
                if (placeableMo5939measureBRTryo1 == null) {
                    return MeasureScope.CC.s(SubcomposeLayout, placeableMo5939measureBRTryo0.getWidth(), placeableMo5939measureBRTryo0.getHeight(), null, new h(8, placeableMo5939measureBRTryo0), 4, null);
                }
                int iMin = (int) (Math.min(placeableMo5939measureBRTryo0.getWidth(), placeableMo5939measureBRTryo1.getWidth()) * this.b);
                int width = (placeableMo5939measureBRTryo1.getWidth() + placeableMo5939measureBRTryo0.getWidth()) - iMin;
                int iMax = Math.max(placeableMo5939measureBRTryo0.getHeight(), placeableMo5939measureBRTryo1.getHeight());
                return MeasureScope.CC.s(SubcomposeLayout, width, iMax, null, new di(placeableMo5939measureBRTryo0, iMax, placeableMo5939measureBRTryo1, iMin), 4, null);
        }
    }

    public /* synthetic */ ml0(Function2 function2, Function2 function3, float f) {
        this.c = function2;
        this.d = function3;
        this.b = f;
    }
}
