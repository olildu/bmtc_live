package app.chalo.compose.components;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.StarKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.UserReviewRatingBarKt;
import app.chalo.compose.theme.ChaloTheme;
import defpackage.b3;
import defpackage.cf;
import defpackage.nf1;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UserReviewRatingBarKt {
    public static final void a(final int i, final int i2, final Function1 onRatingChanged, Composer composer, final int i3) {
        int i4;
        long j;
        boolean z;
        Intrinsics.i(onRatingChanged, "onRatingChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(416459667);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        int i5 = 256;
        if ((i3 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onRatingChanged) ? 256 : 128;
        }
        int i6 = i4;
        boolean z2 = false;
        boolean z3 = true;
        if (composerStartRestartGroup.shouldExecute((i6 & 147) != 146, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(416459667, i6, -1, "app.chalo.compose.components.UserReviewRatingBar (UserReviewRatingBar.kt:21)");
            }
            Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(Modifier.INSTANCE);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierSelectableGroup);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(815531591);
            if (1 <= i) {
                int i8 = 1;
                while (true) {
                    boolean z4 = i8 <= i2 ? z3 : z2;
                    ImageVector star = StarKt.getStar(z4 ? Icons.Filled.INSTANCE : Icons.INSTANCE.getDefault());
                    if (z4) {
                        composerStartRestartGroup.startReplaceGroup(815537918);
                        j = ChaloTheme.a(composerStartRestartGroup, 6).B;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(815538880);
                        j = ChaloTheme.a(composerStartRestartGroup, 6).A;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                    boolean zChanged = ((i6 & 896) == i5 ? z3 : z2) | composerStartRestartGroup.changed(i8);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new cf(i8, 6, onRatingChanged);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    boolean z5 = z3;
                    IconKt.m2071Iconww6aTOc(star, (String) null, SizeKt.m814height3ABfNKs(SizeKt.m833width3ABfNKs(SelectableKt.m1037selectableO2vRcR0$default(companion2, z4, mutableInteractionSourceB, null, false, null, (Function0) objRememberedValue, 24, null), ChaloTheme.b(composerStartRestartGroup, 6).n), ChaloTheme.b(composerStartRestartGroup, 6).n), j, composerStartRestartGroup, 48, 0);
                    if (i8 < i - 1) {
                        composerStartRestartGroup.startReplaceGroup(-487483888);
                        z = false;
                        nf1.t(companion2, ChaloTheme.b(composerStartRestartGroup, 6).e, composerStartRestartGroup, 0);
                    } else {
                        z = false;
                        composerStartRestartGroup.startReplaceGroup(-489232629);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (i8 == i) {
                        break;
                    }
                    i8++;
                    z2 = z;
                    z3 = z5;
                    i5 = 256;
                }
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: sn1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i3 | 1);
                    UserReviewRatingBarKt.a(i, i2, onRatingChanged, (Composer) obj, iUpdateChangedFlags);
                    return Unit.f17538a;
                }
            });
        }
    }
}
