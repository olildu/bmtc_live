package app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.amazon.device.ads.DtbDeviceData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.gf;
import defpackage.i81;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SwipeableKt {
    public static final float a(float f, float f2, Set set, Function2 function2, float f3, float f4) {
        Set set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            if (((Number) obj).floatValue() <= ((double) f) + 0.001d) {
                arrayList.add(obj);
            }
        }
        Float fV = CollectionsKt.V(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : set2) {
            if (((Number) obj2).floatValue() >= ((double) f) - 0.001d) {
                arrayList2.add(obj2);
            }
        }
        Float fX = CollectionsKt.X(arrayList2);
        List listR = fV == null ? CollectionsKt.T(fX) : (fX == null || fV.floatValue() == fX.floatValue()) ? CollectionsKt.R(fV) : CollectionsKt.S(fV, fX);
        int size = listR.size();
        if (size == 0) {
            return f2;
        }
        if (size == 1) {
            return ((Number) listR.get(0)).floatValue();
        }
        float fFloatValue = ((Number) listR.get(0)).floatValue();
        float fFloatValue2 = ((Number) listR.get(1)).floatValue();
        return (f2 > f ? f3 > (-f4) && f > ((Number) function2.invoke(Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue))).floatValue() : f3 >= f4 || f >= ((Number) function2.invoke(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue()) ? fFloatValue2 : fFloatValue;
    }

    public static final Float b(Map map, Object obj) {
        Object next;
        Iterator it = map.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((Map.Entry) next).getValue(), obj));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    public static Modifier c(Modifier swipeable, final SwipeableState state, final Map map, final Orientation orientation, final boolean z, boolean z2, Function2 function2, float f, int i) {
        final boolean z3 = (i & 16) != 0 ? false : z2;
        final Function2 thresholds = (i & 64) != 0 ? new i81(10) : function2;
        final float f2 = (i & 256) != 0 ? SwipeableDefaults.b : f;
        Intrinsics.i(swipeable, "$this$swipeable");
        Intrinsics.i(state, "state");
        Intrinsics.i(orientation, "orientation");
        Intrinsics.i(thresholds, "thresholds");
        return ComposedModifierKt.composed(swipeable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1
            final /* synthetic */ MutableInteractionSource $interactionSource$inlined = null;
            final /* synthetic */ ResistanceConfig $resistance$inlined = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.setName("swipeable");
                inspectorInfo.getProperties().set(RemoteConfigConstants.ResponseFieldKey.STATE, state);
                inspectorInfo.getProperties().set("anchors", map);
                inspectorInfo.getProperties().set(DtbDeviceData.DEVICE_DATA_ORIENTATION_KEY, orientation);
                gf.e(z3, gf.e(z, inspectorInfo.getProperties(), "enabled", inspectorInfo), "reverseDirection", inspectorInfo).set("interactionSource", this.$interactionSource$inlined);
                inspectorInfo.getProperties().set("thresholds", thresholds);
                inspectorInfo.getProperties().set("resistance", this.$resistance$inlined);
                inspectorInfo.getProperties().set("velocityThreshold", Dp.m7276boximpl(f2));
                return Unit.f17538a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3() { // from class: app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.c
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Modifier composed = (Modifier) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(composed, "$this$composed");
                composer.startReplaceGroup(-717165616);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-717165616, iIntValue, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.swipeable.<anonymous> (Swipeable.kt:574)");
                }
                ?? r8 = map;
                if (r8.isEmpty()) {
                    throw new IllegalArgumentException("You must have at least one anchor.");
                }
                if (CollectionsKt.z(r8.values()).size() != r8.size()) {
                    throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                SwipeableState swipeableState = state;
                swipeableState.getClass();
                if (swipeableState.c().isEmpty()) {
                    Float fB = SwipeableKt.b(r8, swipeableState.c.getValue());
                    if (fB == null) {
                        throw new IllegalArgumentException("The initial value must have an associated anchor.");
                    }
                    swipeableState.e.setValue(fB);
                    swipeableState.g.setValue(fB);
                }
                boolean zChanged = composer.changed(swipeableState) | composer.changedInstance(r8) | composer.changed((Object) null);
                Function2 function3 = thresholds;
                boolean zChanged2 = zChanged | composer.changed(function3) | composer.changed(density);
                float f3 = f2;
                boolean zChanged3 = zChanged2 | composer.changed(f3);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    SwipeableKt$swipeable$3$3$1 swipeableKt$swipeable$3$3$1 = new SwipeableKt$swipeable$3$3$1(swipeableState, r8, null, density, function3, f3, null);
                    composer.updateRememberedValue(swipeableKt$swipeable$3$3$1);
                    objRememberedValue = swipeableKt$swipeable$3$3$1;
                }
                EffectsKt.LaunchedEffect(r8, swipeableState, (Function2) objRememberedValue, composer, 0);
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean zBooleanValue = ((Boolean) swipeableState.d.getValue()).booleanValue();
                DraggableState draggableState = swipeableState.p;
                boolean zChanged4 = composer.changed(swipeableState);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new SwipeableKt$swipeable$3$4$1(swipeableState, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierDraggable$default = DraggableKt.draggable$default(companion, draggableState, orientation, z, null, zBooleanValue, null, (Function3) objRememberedValue2, z3, 32, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierDraggable$default;
            }
        });
    }
}
