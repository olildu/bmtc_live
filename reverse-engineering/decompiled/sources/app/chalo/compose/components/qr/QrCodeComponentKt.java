package app.chalo.compose.components.qr;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.pk0;
import defpackage.t1;
import defpackage.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "qrRendered", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class QrCodeComponentKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Modifier modifier, Modifier modifier2, String qrCode, Composer composer, int i, int i2) {
        Modifier modifier3;
        int i3;
        Modifier modifier4;
        Modifier modifier5;
        Intrinsics.i(qrCode, "qrCode");
        Composer composerStartRestartGroup = composer.startRestartGroup(-784240336);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier3 = modifier;
        } else if ((i & 6) == 0) {
            modifier3 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier3) ? 4 : 2) | i;
        } else {
            modifier3 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            modifier4 = modifier2;
            i3 |= composerStartRestartGroup.changed(modifier4) ? 32 : 16;
        } else {
            modifier4 = modifier2;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(qrCode) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier modifier6 = i4 != 0 ? Modifier.INSTANCE : modifier3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-784240336, i3, -1, "app.chalo.compose.components.qr.QrCodeComponent (QrCodeComponent.kt:21)");
            }
            boolean z = (i3 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier6);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new t1(mutableState, 24);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ChaloQrCodeKt.a(qrCode, modifier4, 0.0f, (Function0) objRememberedValue2, composerStartRestartGroup, ((i3 >> 6) & 14) | (i3 & 112), 4);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(1563651340);
            } else {
                composerStartRestartGroup.startReplaceGroup(1564721584);
                BoxKt.Box(ShimmerEffectKt.b(ZIndexModifierKt.zIndex(SizeKt.m828size3ABfNKs(Modifier.INSTANCE, ChaloThemeHelper.a().w), 1.0f), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 6).p), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 6).q), 4), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier6;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier5 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v(modifier5, modifier2, qrCode, i, i2, 24));
        }
    }
}
