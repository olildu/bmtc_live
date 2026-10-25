package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.input.TextFieldValue;
import app.chalo.compose.components.ChaloSearchBarComposableKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.livetracking.universalsearch.ui.compose.SearchStopAndLocationItemComposableKt;
import app.chalo.providers.stringprovider.StringEnum;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18521a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nl(boolean z, TextFieldValue textFieldValue, Function1 function1, Function0 function0) {
        this.b = z;
        this.d = textFieldValue;
        this.e = function1;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f18521a;
        Unit unit = Unit.f17538a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                TextFieldValue textFieldValue = (TextFieldValue) obj4;
                Function1 function1 = (Function1) obj3;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2038388539, iIntValue, -1, "app.chalo.compose.components.ChaloSearchBarComposable.<anonymous>.<anonymous>.<anonymous> (ChaloSearchBarComposable.kt:71)");
                    }
                    ChaloSearchBarComposableKt.b(this.b, textFieldValue, function1, this.c, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                MutableState mutableState = (MutableState) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1271715090, iIntValue2, -1, "app.chalo.livetracking.universalsearch.ui.compose.SearchStopAndLocationItemComposable.<anonymous>.<anonymous> (SearchStopAndLocationItemComposable.kt:127)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierWidth = IntrinsicKt.width(companion, IntrinsicSize.Min);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierWidth);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    if (this.b) {
                        composer2.startReplaceGroup(537619847);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        String strC = StringResourcesHelperKt.c(StringEnum.EDIT, new Object[0], composer2, 6);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new c2(mutableState, mutableState2, 7);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        SearchStopAndLocationItemComposableKt.a(390, composer2, modifierFillMaxWidth$default, strC, (Function0) objRememberedValue);
                        DividerKt.m1950HorizontalDivider9IZ8Weo(null, 0.0f, 0L, composer2, 0, 7);
                    } else {
                        composer2.startReplaceGroup(532520998);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    String strC2 = StringResourcesHelperKt.c(StringEnum.REMOVE, new Object[0], composer2, r10);
                    Function0 function0 = this.c;
                    boolean zChanged = composer2.changed(function0);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new v1(mutableState, function0, 4);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    SearchStopAndLocationItemComposableKt.a(6, composer2, modifierFillMaxWidth$default2, strC2, (Function0) objRememberedValue2);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return unit;
    }

    public /* synthetic */ nl(boolean z, Function0 function0, MutableState mutableState, MutableState mutableState2) {
        this.b = z;
        this.c = function0;
        this.d = mutableState;
        this.e = mutableState2;
    }
}
