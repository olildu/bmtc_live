package app.chalo.compose.components;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ProfileCompletionTrackerKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProfileCompletionTrackerKt {
    public static final void a(final int i, final int i2, final float f, final ChaloColorToken chaloColorToken, final ChaloColorToken chaloColorToken2, float f2, float f3, final float f4, Modifier modifier, final Function3 content, Composer composer, final int i3, final int i4) {
        int i5;
        ChaloColorToken chaloColorToken3;
        ChaloColorToken chaloColorToken4;
        float fM7278constructorimpl;
        float fM7278constructorimpl2;
        final float f5;
        final Modifier modifier2;
        float fM7278constructorimpl3;
        final float f6;
        int i6;
        int i7;
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1339162489);
        if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            chaloColorToken3 = chaloColorToken;
            i5 |= composerStartRestartGroup.changed(chaloColorToken3) ? 2048 : 1024;
        } else {
            chaloColorToken3 = chaloColorToken;
        }
        if ((i3 & 24576) == 0) {
            chaloColorToken4 = chaloColorToken2;
            i5 |= composerStartRestartGroup.changed(chaloColorToken4) ? 16384 : 8192;
        } else {
            chaloColorToken4 = chaloColorToken2;
        }
        int i8 = i4 & 32;
        if (i8 != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            fM7278constructorimpl = f2;
        } else {
            fM7278constructorimpl = f2;
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i5 |= composerStartRestartGroup.changed(fM7278constructorimpl) ? 131072 : 65536;
            }
        }
        int i9 = i4 & 64;
        if (i9 != 0) {
            i5 |= 1572864;
            fM7278constructorimpl2 = f3;
        } else {
            fM7278constructorimpl2 = f3;
            if ((i3 & 1572864) == 0) {
                i5 |= composerStartRestartGroup.changed(fM7278constructorimpl2) ? 1048576 : 524288;
            }
        }
        if ((i3 & 12582912) == 0) {
            i5 |= composerStartRestartGroup.changed(f4) ? 8388608 : 4194304;
        }
        int i10 = i4 & 256;
        if (i10 != 0) {
            i5 |= 100663296;
        } else if ((i3 & 100663296) == 0) {
            i5 |= composerStartRestartGroup.changed(modifier) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(content) ? 536870912 : 268435456;
        }
        if (composerStartRestartGroup.shouldExecute((i5 & 306783379) != 306783378, i5 & 1)) {
            if (i8 != 0) {
                fM7278constructorimpl = Dp.m7278constructorimpl(4);
            }
            if (i9 != 0) {
                fM7278constructorimpl2 = Dp.m7278constructorimpl(4);
            }
            Modifier modifier3 = i10 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1339162489, i5, -1, "app.chalo.compose.components.ProfileCompletionTracker (ProfileCompletionTracker.kt:66)");
            }
            boolean z = i > 0;
            final int iE = RangesKt.e(i2, 0, i);
            if (z) {
                float f7 = 2;
                fM7278constructorimpl3 = Dp.m7278constructorimpl(Dp.m7278constructorimpl(f7 * f4) + Dp.m7278constructorimpl(Dp.m7278constructorimpl(fM7278constructorimpl * f7) + f));
            } else {
                fM7278constructorimpl3 = f;
            }
            Modifier modifierM828size3ABfNKs = SizeKt.m828size3ABfNKs(modifier3, fM7278constructorimpl3);
            Modifier modifier4 = modifier3;
            boolean z2 = z;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i11 = i5;
            int i12 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM828size3ABfNKs);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i12), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(1647593340);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                i7 = i11;
                boolean zChanged = ((i11 & 3670016) == 1048576) | ((i11 & 29360128) == 8388608) | ((i11 & 14) == 4) | composerStartRestartGroup.changed(iE) | ((i7 & 7168) == 2048) | ((57344 & i7) == 16384);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final ChaloColorToken chaloColorToken5 = chaloColorToken3;
                    f6 = fM7278constructorimpl2;
                    final ChaloColorToken chaloColorToken6 = chaloColorToken4;
                    i6 = 6;
                    Function1 function1 = new Function1() { // from class: wx0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            float f8;
                            DrawScope Canvas = (DrawScope) obj;
                            Intrinsics.i(Canvas, "$this$Canvas");
                            float fMo404toPx0680j_4 = Canvas.mo404toPx0680j_4(f4);
                            float f9 = fMo404toPx0680j_4 < 0.0f ? 0.0f : fMo404toPx0680j_4;
                            if (f9 > 0.0f) {
                                float fM4433getMinDimensionimpl = (Size.m4433getMinDimensionimpl(Canvas.mo5073getSizeNHjbRc()) - f9) / 2.0f;
                                if (fM4433getMinDimensionimpl > 0.0f) {
                                    float f10 = fM4433getMinDimensionimpl * 6.2831855f;
                                    if (f10 > 0.0f) {
                                        float fMo404toPx0680j_5 = Canvas.mo404toPx0680j_4(f6);
                                        if (fMo404toPx0680j_5 < 0.0f) {
                                            fMo404toPx0680j_5 = 0.0f;
                                        }
                                        f8 = (fMo404toPx0680j_5 / f10) * 360.0f;
                                    } else {
                                        f8 = 0.0f;
                                    }
                                    float f11 = f8 + (f10 > 0.0f ? (f9 / f10) * 360.0f : 0.0f);
                                    int i13 = i;
                                    float f12 = i13;
                                    float f13 = (360.0f / f12) - 0.1f;
                                    if (f13 < 0.0f) {
                                        f13 = 0.0f;
                                    }
                                    float fD = RangesKt.d(f11, 0.0f, f13);
                                    float fD2 = xs.d(f12, fD, 360.0f, f12);
                                    if (fD2 > 0.0f) {
                                        float f14 = f9 / 2.0f;
                                        long jM4357constructorimpl = Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & BodyPartID.bodyIdMax));
                                        long jM4425constructorimpl = Size.m4425constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() & BodyPartID.bodyIdMax)) - f9)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() >> 32)) - f9)) << 32));
                                        Stroke stroke = new Stroke(f9, 0.0f, StrokeCap.INSTANCE.m4957getRoundKaPHkGw(), 0, null, 26, null);
                                        int i14 = 0;
                                        while (i14 < i13) {
                                            long j = jM4425constructorimpl;
                                            long j2 = jM4357constructorimpl;
                                            Stroke stroke2 = stroke;
                                            float f15 = fD2;
                                            DrawScope.CC.x(Canvas, i14 < iE ? ChaloColorTokenKt.c(chaloColorToken5) : ChaloColorTokenKt.c(chaloColorToken6), ((fD2 + fD) * i14) - 90.0f, f15, false, j2, j, 0.0f, stroke2, null, 0, 832, null);
                                            i14++;
                                            fD2 = f15;
                                            jM4357constructorimpl = j2;
                                            jM4425constructorimpl = j;
                                            stroke = stroke2;
                                            i13 = i13;
                                            fD = fD;
                                        }
                                    }
                                }
                            }
                            return Unit.f17538a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function1);
                    objRememberedValue = function1;
                } else {
                    f6 = fM7278constructorimpl2;
                    i6 = 6;
                }
                CanvasKt.Canvas(modifierFillMaxSize$default, (Function1) objRememberedValue, composerStartRestartGroup, i6);
            } else {
                f6 = fM7278constructorimpl2;
                i6 = 6;
                i7 = i11;
                composerStartRestartGroup.startReplaceGroup(1644343393);
            }
            composerStartRestartGroup.endReplaceGroup();
            content.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(((i7 >> 24) & 112) | i6));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f5 = f6;
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            f5 = fM7278constructorimpl2;
            modifier2 = modifier;
        }
        final float f8 = fM7278constructorimpl;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: xx0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ProfileCompletionTrackerKt.a(i, i2, f, chaloColorToken, chaloColorToken2, f8, f5, f4, modifier2, content, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    return Unit.f17538a;
                }
            });
        }
    }
}
