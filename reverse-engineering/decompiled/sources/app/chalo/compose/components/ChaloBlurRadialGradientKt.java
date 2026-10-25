package app.chalo.compose.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ChaloBlurRadialGradientKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloBlurRadialGradientKt {
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0174  */
    /* JADX WARN: Code duplicated, block: B:88:0x0180  */
    /* JADX WARN: Code duplicated, block: B:89:0x0184  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void a(final Modifier modifier, final float f, float f2, final float f3, final float f4, ChaloColorToken chaloColorToken, Composer composer, final int i, final int i2) {
        int i3;
        float f5;
        float f6;
        int i4;
        ChaloColorToken chaloColorToken2;
        int i5;
        boolean z;
        final float f7;
        final ChaloColorToken chaloColorToken3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        ChaloColorToken chaloColorToken4;
        boolean z2;
        Object objRememberedValue;
        Function0<ComposeUiNode> constructor;
        int i6;
        int i7;
        Intrinsics.i(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(1714487478);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                f5 = f2;
                i3 |= composerStartRestartGroup.changed(f5) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if (composerStartRestartGroup.changed(f3)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                f6 = f4;
                if (composerStartRestartGroup.changed(f6)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            } else {
                f6 = f4;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    chaloColorToken2 = chaloColorToken;
                    if (composerStartRestartGroup.changed(chaloColorToken2)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                    if (i8 != 0) {
                        f5 = 0.5f;
                    }
                    float f8 = f5;
                    if (i4 != 0) {
                        chaloColorToken4 = null;
                    } else {
                        chaloColorToken4 = chaloColorToken2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1714487478, i3, -1, "app.chalo.compose.components.ChaloBlurRadialGradient (ChaloBlurRadialGradient.kt:23)");
                    }
                    if ((458752 & i3) == 131072) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        if (chaloColorToken4 == null) {
                            objRememberedValue = ChaloColorToken.Yellow.f9872a;
                        } else {
                            objRememberedValue = chaloColorToken4;
                        }
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Modifier modifierBackground$default = BackgroundKt.background$default(modifier, Brush.Companion.m4562radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.S(Color.m4595boximpl(Color.m4604copywmQWz5c$default(ChaloColorTokenKt.c((ChaloColorToken) objRememberedValue), f8, 0.0f, 0.0f, 0.0f, 14, null)), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 6).Z)), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f6)) & BodyPartID.bodyIdMax)), f, 0, 8, (Object) null), null, 0.0f, 6, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i9 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    constructor = companion.getConstructor();
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
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i9), composerM3915constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    SpacerKt.Spacer(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f7 = f8;
                    chaloColorToken3 = chaloColorToken4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    f7 = f5;
                    chaloColorToken3 = chaloColorToken2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ChaloBlurRadialGradientKt.a(modifier, f, f7, f3, f4, chaloColorToken3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            chaloColorToken2 = chaloColorToken;
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i8 != 0) {
                    f5 = 0.5f;
                }
                float f9 = f5;
                if (i4 != 0) {
                    chaloColorToken4 = null;
                } else {
                    chaloColorToken4 = chaloColorToken2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1714487478, i3, -1, "app.chalo.compose.components.ChaloBlurRadialGradient (ChaloBlurRadialGradient.kt:23)");
                }
                if ((458752 & i3) == 131072) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2) {
                    if (chaloColorToken4 == null) {
                        objRememberedValue = ChaloColorToken.Yellow.f9872a;
                    } else {
                        objRememberedValue = chaloColorToken4;
                    }
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    if (chaloColorToken4 == null) {
                        objRememberedValue = ChaloColorToken.Yellow.f9872a;
                    } else {
                        objRememberedValue = chaloColorToken4;
                    }
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierBackground$default2 = BackgroundKt.background$default(modifier, Brush.Companion.m4562radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.S(Color.m4595boximpl(Color.m4604copywmQWz5c$default(ChaloColorTokenKt.c((ChaloColorToken) objRememberedValue), f9, 0.0f, 0.0f, 0.0f, 14, null)), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 6).Z)), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f6)) & BodyPartID.bodyIdMax)), f, 0, 8, (Object) null), null, 0.0f, 6, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i10 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion2, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i10), composerM3915constructorimpl2));
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                SpacerKt.Spacer(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 6);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f7 = f9;
                chaloColorToken3 = chaloColorToken4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                f7 = f5;
                chaloColorToken3 = chaloColorToken2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ChaloBlurRadialGradientKt.a(modifier, f, f7, f3, f4, chaloColorToken3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i3 |= 384;
        f5 = f2;
        if ((i & 3072) != 0) {
            if (composerStartRestartGroup.changed(f3)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i & 24576) == 0) {
            f6 = f4;
            if (composerStartRestartGroup.changed(f6)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        } else {
            f6 = f4;
        }
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                chaloColorToken2 = chaloColorToken;
                if (composerStartRestartGroup.changed(chaloColorToken2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i8 != 0) {
                    f5 = 0.5f;
                }
                float f10 = f5;
                if (i4 != 0) {
                    chaloColorToken4 = null;
                } else {
                    chaloColorToken4 = chaloColorToken2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1714487478, i3, -1, "app.chalo.compose.components.ChaloBlurRadialGradient (ChaloBlurRadialGradient.kt:23)");
                }
                if ((458752 & i3) == 131072) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2) {
                    if (chaloColorToken4 == null) {
                        objRememberedValue = ChaloColorToken.Yellow.f9872a;
                    } else {
                        objRememberedValue = chaloColorToken4;
                    }
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    if (chaloColorToken4 == null) {
                        objRememberedValue = ChaloColorToken.Yellow.f9872a;
                    } else {
                        objRememberedValue = chaloColorToken4;
                    }
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierBackground$default3 = BackgroundKt.background$default(modifier, Brush.Companion.m4562radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.S(Color.m4595boximpl(Color.m4604copywmQWz5c$default(ChaloColorTokenKt.c((ChaloColorToken) objRememberedValue), f10, 0.0f, 0.0f, 0.0f, 14, null)), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 6).Z)), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f6)) & BodyPartID.bodyIdMax)), f, 0, 8, (Object) null), null, 0.0f, 6, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i11 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default3);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion3, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i11), composerM3915constructorimpl3));
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                SpacerKt.Spacer(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 6);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f7 = f10;
                chaloColorToken3 = chaloColorToken4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                f7 = f5;
                chaloColorToken3 = chaloColorToken2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ChaloBlurRadialGradientKt.a(modifier, f, f7, f3, f4, chaloColorToken3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        chaloColorToken2 = chaloColorToken;
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            if (i8 != 0) {
                f5 = 0.5f;
            }
            float f11 = f5;
            if (i4 != 0) {
                chaloColorToken4 = null;
            } else {
                chaloColorToken4 = chaloColorToken2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1714487478, i3, -1, "app.chalo.compose.components.ChaloBlurRadialGradient (ChaloBlurRadialGradient.kt:23)");
            }
            if ((458752 & i3) == 131072) {
                z2 = true;
            } else {
                z2 = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2) {
                if (chaloColorToken4 == null) {
                    objRememberedValue = ChaloColorToken.Yellow.f9872a;
                } else {
                    objRememberedValue = chaloColorToken4;
                }
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                if (chaloColorToken4 == null) {
                    objRememberedValue = ChaloColorToken.Yellow.f9872a;
                } else {
                    objRememberedValue = chaloColorToken4;
                }
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierBackground$default4 = BackgroundKt.background$default(modifier, Brush.Companion.m4562radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.S(Color.m4595boximpl(Color.m4604copywmQWz5c$default(ChaloColorTokenKt.c((ChaloColorToken) objRememberedValue), f11, 0.0f, 0.0f, 0.0f, 14, null)), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 6).Z)), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f6)) & BodyPartID.bodyIdMax)), f, 0, 8, (Object) null), null, 0.0f, 6, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i12 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default4);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            constructor = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl4, Integer.valueOf(i12), composerM3915constructorimpl4));
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            SpacerKt.Spacer(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f7 = f11;
            chaloColorToken3 = chaloColorToken4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            f7 = f5;
            chaloColorToken3 = chaloColorToken2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ChaloBlurRadialGradientKt.a(modifier, f, f7, f3, f4, chaloColorToken3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return Unit.f17538a;
                }
            });
        }
    }
}
