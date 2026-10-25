package defpackage;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt;
import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TabIndicatorOffsetNode;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.home.ui.history.compose.ComposableSingletons$MyTicketsScreenUIKt;
import app.chalo.home.ui.history.compose.MyTicketsScreenUIKt;
import app.chalo.home.ui.history.uistate.EmptyScreenUiState;
import app.chalo.home.ui.history.uistate.MyTicketsHeaderUiState;
import app.chalo.home.ui.history.uistate.ProductReclaimUiState;
import app.chalo.models.contactsupport.ContactSupportUIState;
import app.chalo.stoptripdetails.data.model.StopTripDetailsUiModel;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.zophop.homescreen.MyTicketsViewState;
import app.zophop.homescreen.MyTicketsViewStateSpec;
import defpackage.de0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19711a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u3(float f, Object obj, Object obj2, int i) {
        this.f19711a = i;
        this.b = f;
        this.c = obj;
        this.d = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        List list2;
        switch (this.f19711a) {
            case 0:
                return AndroidCursorHandle_androidKt.drawCursorHandle$lambda$0$0$0$0(this.b, (ImageBitmap) this.c, (ColorFilter) this.d, (ContentDrawScope) obj);
            case 1:
                return LazyLayoutScrollScopeKt.animateScrollToItem$lambda$7(this.b, (Ref.FloatRef) this.c, (LazyLayoutScrollScope) this.d, (AnimationScope) obj);
            case 2:
                return ModalBottomSheetKt.ModalBottomSheetContent_7___e2Q$lambda$18$lambda$17$lambda$16(this.b, (IntSize) this.c, (SheetState) this.d, (DraggableAnchorsConfig) obj);
            case 3:
                MyTicketsViewState myTicketsViewState = (MyTicketsViewState) this.c;
                final MyTicketsViewStateSpec myTicketsViewStateSpec = (MyTicketsViewStateSpec) this.d;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1723614604, true, new wk0(myTicketsViewState, 3)), 3, null);
                EmptyScreenUiState emptyScreenUiState = myTicketsViewState.i;
                boolean z = myTicketsViewState.d;
                float f = this.b;
                if (emptyScreenUiState != null) {
                    LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1964594567, true, new xk0(f, 0, myTicketsViewState)), 3, null);
                } else {
                    LazyListScope.CC.s(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(53688772, true, new o4(myTicketsViewState, 6)), 3, null);
                    if (myTicketsViewState.r != null) {
                        LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1358551893, true, new xk0(myTicketsViewState, f)), 3, null);
                    } else if (myTicketsViewState.n) {
                        LazyListScope.CC.m(LazyColumn, null, null, ComposableSingletons$MyTicketsScreenUIKt.f3449a, 3, null);
                    } else if (myTicketsViewState.j != null) {
                        LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1817415631, true, new xk0(f, 2, myTicketsViewState)), 3, null);
                    } else {
                        ProductReclaimUiState productReclaimUiState = myTicketsViewState.l;
                        if (productReclaimUiState != null) {
                            LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-923174614, true, new u50(7, myTicketsViewStateSpec, productReclaimUiState)), 3, null);
                        }
                        if (z) {
                            list = myTicketsViewState.s;
                        } else {
                            if (z) {
                                throw new NoWhenBranchMatchedException();
                            }
                            list = myTicketsViewState.u;
                        }
                        List list3 = list;
                        if (list3 != null && !list3.isEmpty()) {
                            LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1910816639, true, new wk0(myTicketsViewState, 1)), 3, null);
                            final MyTicketsHeaderUiState myTicketsHeaderUiState = myTicketsViewState.f;
                            if (myTicketsHeaderUiState != null) {
                                final int i = 0;
                                LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1865318781, true, new Function3() { // from class: yk0
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        int i2 = i;
                                        Unit unit = Unit.f17538a;
                                        ChaloColorToken.White white = ChaloColorToken.White.f9870a;
                                        MyTicketsHeaderUiState myTicketsHeaderUiState2 = myTicketsHeaderUiState;
                                        MyTicketsViewStateSpec myTicketsViewStateSpec2 = myTicketsViewStateSpec;
                                        switch (i2) {
                                            case 0:
                                                LazyItemScope item = (LazyItemScope) obj2;
                                                Composer composer = (Composer) obj3;
                                                int iIntValue = ((Integer) obj4).intValue();
                                                Intrinsics.i(item, "$this$item");
                                                if (!composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                                    composer.skipToGroupEnd();
                                                } else {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1865318781, iIntValue, -1, "app.chalo.home.ui.history.compose.TicketsScreenContentUI.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:336)");
                                                    }
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(white), null, 2, null);
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                                                    int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM264backgroundbw27NRU$default);
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
                                                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                                                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                    ChaloSpacersKt.a(myTicketsViewStateSpec2.h, composer, 0);
                                                    MyTicketsScreenUIKt.d(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), myTicketsHeaderUiState2, composer, 6);
                                                    composer.endNode();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                                break;
                                            default:
                                                LazyItemScope item2 = (LazyItemScope) obj2;
                                                Composer composer2 = (Composer) obj3;
                                                int iIntValue2 = ((Integer) obj4).intValue();
                                                Intrinsics.i(item2, "$this$item");
                                                if (!composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                                    composer2.skipToGroupEnd();
                                                } else {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(473501602, iIntValue2, -1, "app.chalo.home.ui.history.compose.TicketsScreenContentUI.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:407)");
                                                    }
                                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                                    Modifier modifierM264backgroundbw27NRU$default2 = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloColorTokenKt.c(white), null, 2, null);
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM264backgroundbw27NRU$default2);
                                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                                    if (composer2.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer2.startReusableNode();
                                                    if (composer2.getInserting()) {
                                                        composer2.createNode(constructor2);
                                                    } else {
                                                        composer2.useNode();
                                                    }
                                                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer2);
                                                    pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                                                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                                    ChaloSpacersKt.a(myTicketsViewStateSpec2.h, composer2, 0);
                                                    MyTicketsScreenUIKt.d(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), myTicketsHeaderUiState2, composer2, 6);
                                                    composer2.endNode();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                                break;
                                        }
                                        return unit;
                                    }
                                }), 3, null);
                            }
                            LazyListScope.CC.o(LazyColumn, list3.size(), null, null, ComposableLambdaKt.composableLambdaInstance(-1648213304, true, new rs(list3, 1)), 6, null);
                            final int i2 = 1;
                            LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-92529738, true, new Function3() { // from class: vk0
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    int i3 = i2;
                                    Unit unit = Unit.f17538a;
                                    ChaloColorToken.White white = ChaloColorToken.White.f9870a;
                                    MyTicketsViewStateSpec myTicketsViewStateSpec2 = myTicketsViewStateSpec;
                                    switch (i3) {
                                        case 0:
                                            LazyItemScope item = (LazyItemScope) obj2;
                                            Composer composer = (Composer) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            Intrinsics.i(item, "$this$item");
                                            if (!composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                                composer.skipToGroupEnd();
                                            } else {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-2048676651, iIntValue, -1, "app.chalo.home.ui.history.compose.TicketsScreenContentUI.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:434)");
                                                }
                                                Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloColorTokenKt.c(white), null, 2, null);
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                                                int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM264backgroundbw27NRU$default);
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
                                                pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                                                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                ChaloSpacersKt.a(myTicketsViewStateSpec2.i, composer, 0);
                                                composer.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                            break;
                                        default:
                                            LazyItemScope item2 = (LazyItemScope) obj2;
                                            Composer composer2 = (Composer) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            Intrinsics.i(item2, "$this$item");
                                            if (!composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                                composer2.skipToGroupEnd();
                                            } else {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-92529738, iIntValue2, -1, "app.chalo.home.ui.history.compose.TicketsScreenContentUI.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:377)");
                                                }
                                                Modifier modifierM264backgroundbw27NRU$default2 = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloColorTokenKt.c(white), null, 2, null);
                                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                                int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM264backgroundbw27NRU$default2);
                                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                                if (composer2.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer2.startReusableNode();
                                                if (composer2.getInserting()) {
                                                    composer2.createNode(constructor2);
                                                } else {
                                                    composer2.useNode();
                                                }
                                                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer2);
                                                pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                                                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
                                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                                ChaloSpacersKt.a(myTicketsViewStateSpec2.i, composer2, 0);
                                                composer2.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                            break;
                                    }
                                    return unit;
                                }
                            }), 3, null);
                        }
                        if (z) {
                            list2 = myTicketsViewState.t;
                        } else {
                            if (z) {
                                throw new NoWhenBranchMatchedException();
                            }
                            list2 = myTicketsViewState.v;
                        }
                        List list4 = list2;
                        if (list4 != null && !list4.isEmpty()) {
                            LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-45330274, true, new wk0(myTicketsViewState, 4)), 3, null);
                            final MyTicketsHeaderUiState myTicketsHeaderUiState2 = myTicketsViewState.g;
                            if (myTicketsHeaderUiState2 != null) {
                                final int i3 = 1;
                                LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(473501602, true, new Function3() { // from class: yk0
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        int i4 = i3;
                                        Unit unit = Unit.f17538a;
                                        ChaloColorToken.White white = ChaloColorToken.White.f9870a;
                                        MyTicketsHeaderUiState myTicketsHeaderUiState3 = myTicketsHeaderUiState2;
                                        MyTicketsViewStateSpec myTicketsViewStateSpec2 = myTicketsViewStateSpec;
                                        switch (i4) {
                                            case 0:
                                                LazyItemScope item = (LazyItemScope) obj2;
                                                Composer composer = (Composer) obj3;
                                                int iIntValue = ((Integer) obj4).intValue();
                                                Intrinsics.i(item, "$this$item");
                                                if (!composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                                    composer.skipToGroupEnd();
                                                } else {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1865318781, iIntValue, -1, "app.chalo.home.ui.history.compose.TicketsScreenContentUI.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:336)");
                                                    }
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(white), null, 2, null);
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                                                    int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM264backgroundbw27NRU$default);
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
                                                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                                                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
                                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                    ChaloSpacersKt.a(myTicketsViewStateSpec2.h, composer, 0);
                                                    MyTicketsScreenUIKt.d(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), myTicketsHeaderUiState3, composer, 6);
                                                    composer.endNode();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                                break;
                                            default:
                                                LazyItemScope item2 = (LazyItemScope) obj2;
                                                Composer composer2 = (Composer) obj3;
                                                int iIntValue2 = ((Integer) obj4).intValue();
                                                Intrinsics.i(item2, "$this$item");
                                                if (!composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                                    composer2.skipToGroupEnd();
                                                } else {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(473501602, iIntValue2, -1, "app.chalo.home.ui.history.compose.TicketsScreenContentUI.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:407)");
                                                    }
                                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                                    Modifier modifierM264backgroundbw27NRU$default2 = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloColorTokenKt.c(white), null, 2, null);
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                                    int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM264backgroundbw27NRU$default2);
                                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                                    if (composer2.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer2.startReusableNode();
                                                    if (composer2.getInserting()) {
                                                        composer2.createNode(constructor2);
                                                    } else {
                                                        composer2.useNode();
                                                    }
                                                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer2);
                                                    pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                                                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
                                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                                    ChaloSpacersKt.a(myTicketsViewStateSpec2.h, composer2, 0);
                                                    MyTicketsScreenUIKt.d(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), myTicketsHeaderUiState3, composer2, 6);
                                                    composer2.endNode();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                                break;
                                        }
                                        return unit;
                                    }
                                }), 3, null);
                            }
                            LazyListScope.CC.o(LazyColumn, list4.size(), null, null, ComposableLambdaKt.composableLambdaInstance(690607079, true, new rs(list4, 2)), 6, null);
                            final int i4 = 0;
                            LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2048676651, true, new Function3() { // from class: vk0
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    int i5 = i4;
                                    Unit unit = Unit.f17538a;
                                    ChaloColorToken.White white = ChaloColorToken.White.f9870a;
                                    MyTicketsViewStateSpec myTicketsViewStateSpec2 = myTicketsViewStateSpec;
                                    switch (i5) {
                                        case 0:
                                            LazyItemScope item = (LazyItemScope) obj2;
                                            Composer composer = (Composer) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            Intrinsics.i(item, "$this$item");
                                            if (!composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                                composer.skipToGroupEnd();
                                            } else {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-2048676651, iIntValue, -1, "app.chalo.home.ui.history.compose.TicketsScreenContentUI.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:434)");
                                                }
                                                Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloColorTokenKt.c(white), null, 2, null);
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                                                int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM264backgroundbw27NRU$default);
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
                                                pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                                                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                ChaloSpacersKt.a(myTicketsViewStateSpec2.i, composer, 0);
                                                composer.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                            break;
                                        default:
                                            LazyItemScope item2 = (LazyItemScope) obj2;
                                            Composer composer2 = (Composer) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            Intrinsics.i(item2, "$this$item");
                                            if (!composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                                composer2.skipToGroupEnd();
                                            } else {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-92529738, iIntValue2, -1, "app.chalo.home.ui.history.compose.TicketsScreenContentUI.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:377)");
                                                }
                                                Modifier modifierM264backgroundbw27NRU$default2 = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloColorTokenKt.c(white), null, 2, null);
                                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                                int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM264backgroundbw27NRU$default2);
                                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                                if (composer2.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer2.startReusableNode();
                                                if (composer2.getInserting()) {
                                                    composer2.createNode(constructor2);
                                                } else {
                                                    composer2.useNode();
                                                }
                                                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer2);
                                                pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                                                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
                                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                                ChaloSpacersKt.a(myTicketsViewStateSpec2.i, composer2, 0);
                                                composer2.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                            break;
                                    }
                                    return unit;
                                }
                            }), 3, null);
                        }
                        ContactSupportUIState contactSupportUIState = myTicketsViewState.z;
                        if (contactSupportUIState != null) {
                            LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(433284358, true, new u50(6, myTicketsViewStateSpec, contactSupportUIState)), 3, null);
                        }
                        LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1989539848, true, new wk0(myTicketsViewState, 0)), 3, null);
                    }
                }
                return Unit.f17538a;
            case 4:
                Density density = (Density) this.c;
                MutableState mutableState = (MutableState) this.d;
                LayoutCoordinates it = (LayoutCoordinates) obj;
                Intrinsics.i(it, "it");
                mutableState.setValue(Dp.m7276boximpl(((Dp) ComparisonsKt.d(Dp.m7276boximpl(density.mo401toDpu2uoSUM((int) (it.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax))), Dp.m7276boximpl(this.b))).m7292unboximpl()));
                return Unit.f17538a;
            case 5:
                LazyListState lazyListState = (LazyListState) this.c;
                Function4 function4 = (Function4) this.d;
                LazyListScope LazyColumn2 = (LazyListScope) obj;
                Intrinsics.i(LazyColumn2, "$this$LazyColumn");
                LazyListScope.CC.o(LazyColumn2, 4, null, null, ComposableLambdaKt.composableLambdaInstance(-2116576124, true, new wv0(lazyListState, this.b, function4)), 6, null);
                return Unit.f17538a;
            case 6:
                List list5 = (List) this.c;
                State state = (State) this.d;
                DrawScope Canvas = (DrawScope) obj;
                Intrinsics.i(Canvas, "$this$Canvas");
                float fHypot = (float) Math.hypot(Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() & BodyPartID.bodyIdMax)));
                float f2 = this.b * fHypot;
                float fFloatValue = (-f2) + ((((Number) state.getValue()).floatValue() * ((2.0f * f2) + fHypot)) - f2);
                long jM4357constructorimpl = Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue)) & BodyPartID.bodyIdMax));
                DrawScope.CC.L(Canvas, Brush.Companion.m4560linearGradientmHitzGk$default(Brush.INSTANCE, list5, jM4357constructorimpl, Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM4357constructorimpl >> 32)) + f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM4357constructorimpl & BodyPartID.bodyIdMax)) + f2)) & BodyPartID.bodyIdMax)), 0, 8, (Object) null), 0L, Canvas.mo5073getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
                return Unit.f17538a;
            case 7:
                final List list6 = (List) this.c;
                final Function2 function2 = (Function2) this.d;
                LazyListScope LazyColumn3 = (LazyListScope) obj;
                Intrinsics.i(LazyColumn3, "$this$LazyColumn");
                int size = list6.size();
                Function1<Integer, Object> function1 = new Function1<Integer, Object>() { // from class: app.chalo.stoptripdetails.ui.StopTripDetailsScreenKt$StopTripDetailsUiContent_UuyPYSY$lambda$0$0$$inlined$itemsIndexed$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list6.get(((Number) obj2).intValue());
                        return null;
                    }
                };
                final float f3 = this.b;
                LazyColumn3.items(size, null, function1, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.stoptripdetails.ui.StopTripDetailsScreenKt$StopTripDetailsUiContent_UuyPYSY$lambda$0$0$$inlined$itemsIndexed$default$3
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i5;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int iIntValue2 = ((Number) obj5).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i5 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i5 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i5 |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i5 & 147) != 146, i5 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2039820996, i5, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                            }
                            StopTripDetailsUiModel stopTripDetailsUiModel = (StopTripDetailsUiModel) list6.get(iIntValue);
                            composer.startReplaceGroup(-1202997021);
                            Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(de0.c(lazyItemScope, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, 7, null), null, null, 3, null);
                            final Function2 function3 = function2;
                            boolean zChanged = composer.changed(function3);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1<StopTripDetailsUiModel, Unit>() { // from class: app.chalo.stoptripdetails.ui.StopTripDetailsScreenKt$StopTripDetailsUiContent$1$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj6) {
                                        StopTripDetailsUiModel it2 = (StopTripDetailsUiModel) obj6;
                                        Intrinsics.i(it2, "it");
                                        function3.invoke(it2.c, it2.f9470a);
                                        return Unit.f17538a;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            StopTripDetailsScreenKt.p(stopTripDetailsUiModel, (Function1) objRememberedValue, modifierAnimateContentSize$default, false, f3, composer, 0, 8);
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
            case 8:
                return TabIndicatorOffsetNode.measure_3p2s80s$lambda$3((Placeable) this.c, (MeasureScope) this.d, this.b, (Placeable.PlacementScope) obj);
            default:
                return UpdatableAnimationState.animateToZero$lambda$1((UpdatableAnimationState) this.c, this.b, (Function1) this.d, ((Long) obj).longValue());
        }
    }

    public /* synthetic */ u3(Object obj, float f, Object obj2, int i) {
        this.f19711a = i;
        this.c = obj;
        this.b = f;
        this.d = obj2;
    }

    public /* synthetic */ u3(Object obj, Object obj2, float f, int i) {
        this.f19711a = i;
        this.c = obj;
        this.d = obj2;
        this.b = f;
    }
}
