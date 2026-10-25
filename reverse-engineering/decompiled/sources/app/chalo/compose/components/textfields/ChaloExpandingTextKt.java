package app.chalo.compose.components.textfields;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.textfields.ChaloExpandingTextKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.text.TextUIState;
import defpackage.fj;
import defpackage.g5;
import defpackage.ia1;
import defpackage.t1;
import defpackage.v1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0005²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isExpanded", "isClickable", "Landroidx/compose/ui/text/AnnotatedString;", "finalText", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloExpandingTextKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String text, Modifier modifier, TextStyle textStyle, long j, TextStyle textStyle2, long j2, Composer composer, int i) {
        int i2;
        Composer composer2;
        TextStyle textStyle3;
        long j3;
        TextStyle textStyle4;
        long j4;
        TextStyle headlineSmall;
        long j5;
        int i3;
        long j6;
        TextStyle textStyle5;
        int i4;
        Object objMutableStateOf$default;
        int i5;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        TextLayoutResult textLayoutResult;
        TextStyle textStyle6;
        long j7;
        Composer composer3;
        Modifier modifierM299clickableoSLSa3U$default;
        Intrinsics.i(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1519690021);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                headlineSmall = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineSmall();
                long j8 = ChaloTheme.a(composerStartRestartGroup, 6).g;
                TextStyle titleLarge = ChaloTheme.e(composerStartRestartGroup, 6).getTitleLarge();
                j5 = ChaloTheme.a(composerStartRestartGroup, 6).i;
                i3 = i2 & (-4193281);
                j6 = j8;
                textStyle5 = titleLarge;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i3 = i2 & (-4193281);
                headlineSmall = textStyle;
                j6 = j;
                textStyle5 = textStyle2;
                j5 = j2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1519690021, i3, -1, "app.chalo.compose.components.textfields.ChaloExpandingText (ChaloExpandingText.kt:36)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState5 = (MutableState) objRememberedValue2;
            int i6 = i3 & 14;
            boolean z = i6 == 4;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == companion.getEmpty()) {
                i4 = 2;
                objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnnotatedStringKt.AnnotatedString$default(text, SpanStyle.m6672copyGSF8kmg$default(headlineSmall.toSpanStyle(), j6, 0L, FontWeight.INSTANCE.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65530, null), null, 4, null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
            } else {
                objMutableStateOf$default = objRememberedValue3;
                i4 = 2;
            }
            MutableState mutableState6 = (MutableState) objMutableStateOf$default;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i4, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState7 = (MutableState) objRememberedValue4;
            TextLayoutResult textLayoutResult2 = (TextLayoutResult) mutableState7.getValue();
            String strC = StringResourcesHelperKt.c(StringEnum.SHOW_MORE, new Object[0], composerStartRestartGroup, 6);
            int i7 = i3;
            String strC2 = StringResourcesHelperKt.c(StringEnum.SHOW_LESS, new Object[0], composerStartRestartGroup, 6);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(textLayoutResult2) | composerStartRestartGroup.changed(mutableState6) | composerStartRestartGroup.changed(headlineSmall) | composerStartRestartGroup.changed(j6) | (i6 == 4) | composerStartRestartGroup.changed(textStyle5) | composerStartRestartGroup.changed(j5) | composerStartRestartGroup.changed(strC2) | ((i7 & 112) == 32) | composerStartRestartGroup.changed(strC);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                i5 = 2;
                TextStyle textStyle7 = headlineSmall;
                long j9 = j5;
                mutableState = mutableState5;
                mutableState2 = mutableState6;
                mutableState3 = mutableState4;
                ChaloExpandingTextKt$ChaloExpandingText$1$1 chaloExpandingTextKt$ChaloExpandingText$1$1 = new ChaloExpandingTextKt$ChaloExpandingText$1$1(textLayoutResult2, 2, strC, text, mutableState3, textStyle7, j6, textStyle5, j9, strC2, mutableState2, mutableState, null);
                textLayoutResult = textLayoutResult2;
                textStyle6 = textStyle7;
                j7 = j9;
                composer3 = composerStartRestartGroup;
                composer3.updateRememberedValue(chaloExpandingTextKt$ChaloExpandingText$1$1);
                objRememberedValue5 = chaloExpandingTextKt$ChaloExpandingText$1$1;
            } else {
                composer3 = composerStartRestartGroup;
                textStyle6 = headlineSmall;
                j7 = j5;
                i5 = 2;
                mutableState = mutableState5;
                textLayoutResult = textLayoutResult2;
                mutableState2 = mutableState6;
                mutableState3 = mutableState4;
            }
            EffectsKt.LaunchedEffect(textLayoutResult, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer3, TextLayoutResult.$stable);
            AnnotatedString annotatedString = (AnnotatedString) mutableState2.getValue();
            int i8 = ((Boolean) mutableState3.getValue()).booleanValue() ? Integer.MAX_VALUE : i5;
            composer3.startReplaceGroup(133330202);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composer3.startReplaceGroup(915865675);
                Object objRememberedValue6 = composer3.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new t1(mutableState3, 8);
                    composer3.updateRememberedValue(objRememberedValue6);
                }
                modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifier, false, null, null, null, (Function0) objRememberedValue6, 15, null);
                composer3.endReplaceGroup();
            } else {
                composer3.startReplaceGroup(915867561);
                composer3.endReplaceGroup();
                modifierM299clickableoSLSa3U$default = modifier;
            }
            composer3.endReplaceGroup();
            Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(modifierM299clickableoSLSa3U$default, null, null, 3, null);
            Object objRememberedValue7 = composer3.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new g5(mutableState7, 9);
                composer3.updateRememberedValue(objRememberedValue7);
            }
            composer2 = composer3;
            TextKt.m2624TextZ58ophY(annotatedString, modifierAnimateContentSize$default, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, i8, 0, null, (Function1) objRememberedValue7, null, composer2, 0, 12582912, 376828);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle3 = textStyle6;
            j3 = j6;
            textStyle4 = textStyle5;
            j4 = j7;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            textStyle3 = textStyle;
            j3 = j;
            textStyle4 = textStyle2;
            j4 = j2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ia1(text, modifier, textStyle3, j3, textStyle4, j4, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x024b A[PHI: r2
      0x024b: PHI (r2v13 androidx.compose.ui.text.TextStyle) = (r2v7 androidx.compose.ui.text.TextStyle), (r2v14 androidx.compose.ui.text.TextStyle) binds: [B:134:0x0249, B:130:0x0242] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:147:0x0274  */
    /* JADX WARN: Code duplicated, block: B:150:0x027d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0283 A[PHI: r10
      0x0283: PHI (r10v36 androidx.compose.ui.text.TextStyle) = (r10v33 androidx.compose.ui.text.TextStyle), (r10v37 androidx.compose.ui.text.TextStyle) binds: [B:152:0x0281, B:148:0x027a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:154:0x0286  */
    /* JADX WARN: Code duplicated, block: B:157:0x0296  */
    /* JADX WARN: Code duplicated, block: B:159:0x029c  */
    /* JADX WARN: Code duplicated, block: B:165:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:169:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:172:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:173:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:176:0x0311  */
    /* JADX WARN: Code duplicated, block: B:178:0x031f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0327  */
    /* JADX WARN: Code duplicated, block: B:185:0x0331  */
    /* JADX WARN: Code duplicated, block: B:187:0x0350  */
    /* JADX WARN: Code duplicated, block: B:190:0x0370  */
    /* JADX WARN: Code duplicated, block: B:193:0x03b0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final String text, final int i, final Modifier modifier, final TextStyle textStyle, final long j, final String str, final TextStyle textStyle2, final long j2, final boolean z, final Function0 onClick, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        int i4;
        SnapshotMutationPolicy snapshotMutationPolicy;
        int i5;
        Composer composer3;
        long j3;
        int i6;
        Object objMutableStateOf$default;
        TextStyle textStyle3;
        boolean z2;
        TextStyle textStyle4;
        boolean z3;
        boolean z4;
        Object objRememberedValue;
        MutableState mutableState;
        TextLayoutResult textLayoutResult;
        Composer composer4;
        MutableState mutableState2;
        int i7;
        Modifier modifierM299clickableoSLSa3U$default;
        Object objRememberedValue2;
        boolean z5;
        Object objRememberedValue3;
        Intrinsics.i(text, "text");
        Intrinsics.i(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1490140423);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(textStyle2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 536870912 : 268435456;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1490140423, i3, -1, "app.chalo.compose.components.textfields.ChaloTextWithCustomShowMoreClick (ChaloExpandingText.kt:135)");
            }
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue5;
            int i8 = i3 & 14;
            boolean z6 = i8 == 4;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue6 == companion.getEmpty()) {
                i4 = 4;
                snapshotMutationPolicy = null;
                i5 = i8;
                composer3 = composerStartRestartGroup;
                j3 = j;
                i6 = 2;
                objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnnotatedStringKt.AnnotatedString$default(text, SpanStyle.m6672copyGSF8kmg$default(textStyle.toSpanStyle(), j3, 0L, FontWeight.INSTANCE.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65530, null), null, 4, null), null, 2, null);
                composer3.updateRememberedValue(objMutableStateOf$default);
            } else {
                j3 = j;
                i5 = i8;
                i4 = 4;
                snapshotMutationPolicy = null;
                i6 = 2;
                objMutableStateOf$default = objRememberedValue6;
                composer3 = composerStartRestartGroup;
            }
            MutableState mutableState5 = (MutableState) objMutableStateOf$default;
            Object objRememberedValue7 = composer3.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i6, snapshotMutationPolicy);
                composer3.updateRememberedValue(objRememberedValue7);
            }
            MutableState mutableState6 = (MutableState) objRememberedValue7;
            TextLayoutResult textLayoutResult2 = (TextLayoutResult) mutableState6.getValue();
            boolean zChangedInstance = (i5 == i4) | composer3.changedInstance(textLayoutResult2) | ((i3 & 112) == 32) | ((((458752 & i3) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && composer3.changed(str)) || (i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | composer3.changed(mutableState5);
            if (((i3 & 7168) ^ 3072) > 2048) {
                textStyle3 = textStyle;
                if (composer3.changed(textStyle3)) {
                    z2 = true;
                }
                boolean z7 = zChangedInstance | z2 | ((((57344 & i3) ^ 24576) <= 16384 && composer3.changed(j3)) || (i3 & 24576) == 16384);
                if (((3670016 & i3) ^ 1572864) > 1048576) {
                    textStyle4 = textStyle2;
                    if (!composer3.changed(textStyle4)) {
                        z3 = true;
                    }
                    z4 = z7 | z3 | ((((29360128 & i3) ^ 12582912) <= 8388608 && composer3.changed(j2)) || (i3 & 12582912) == 8388608);
                    objRememberedValue = composer3.rememberedValue();
                    if (!z4 || objRememberedValue == companion.getEmpty()) {
                        mutableState = mutableState4;
                        textLayoutResult = textLayoutResult2;
                        composer4 = composer3;
                        mutableState2 = mutableState3;
                        ChaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1 chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1 = new ChaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1(textLayoutResult, i, str, text, mutableState2, textStyle3, j3, textStyle4, j2, mutableState5, mutableState, null);
                        composer4.updateRememberedValue(chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1);
                        objRememberedValue = chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1;
                    } else {
                        mutableState = mutableState4;
                        textLayoutResult = textLayoutResult2;
                        composer4 = composer3;
                        mutableState2 = mutableState3;
                    }
                    EffectsKt.LaunchedEffect(textLayoutResult, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer4, TextLayoutResult.$stable);
                    AnnotatedString annotatedString = (AnnotatedString) mutableState5.getValue();
                    if (((Boolean) mutableState2.getValue()).booleanValue()) {
                        i7 = Integer.MAX_VALUE;
                    } else {
                        i7 = i;
                    }
                    composer4.startReplaceGroup(-1800758960);
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        composer4.startReplaceGroup(-762101343);
                        z5 = (i3 & 1879048192) == 536870912;
                        objRememberedValue3 = composer4.rememberedValue();
                        if (z5 || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new v1(onClick, mutableState2, 1);
                            composer4.updateRememberedValue(objRememberedValue3);
                        }
                        modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifier, false, null, null, null, (Function0) objRememberedValue3, 15, null);
                        composer4.endReplaceGroup();
                    } else {
                        composer4.startReplaceGroup(-762097411);
                        composer4.endReplaceGroup();
                        modifierM299clickableoSLSa3U$default = modifier;
                    }
                    composer4.endReplaceGroup();
                    Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(modifierM299clickableoSLSa3U$default, null, null, 3, null);
                    objRememberedValue2 = composer4.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new g5(mutableState6, 10);
                        composer4.updateRememberedValue(objRememberedValue2);
                    }
                    composer2 = composer4;
                    TextKt.m2624TextZ58ophY(annotatedString, modifierAnimateContentSize$default, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, i7, 0, null, (Function1) objRememberedValue2, null, composer2, 0, 12582912, 376828);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    textStyle4 = textStyle2;
                }
                if ((i3 & 1572864) == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z7 | z3 | ((((29360128 & i3) ^ 12582912) <= 8388608 && composer3.changed(j2)) || (i3 & 12582912) == 8388608);
                objRememberedValue = composer3.rememberedValue();
                if (z4) {
                    mutableState = mutableState4;
                    textLayoutResult = textLayoutResult2;
                    composer4 = composer3;
                    mutableState2 = mutableState3;
                    ChaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1 chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$2 = new ChaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1(textLayoutResult, i, str, text, mutableState2, textStyle3, j3, textStyle4, j2, mutableState5, mutableState, null);
                    composer4.updateRememberedValue(chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$2);
                    objRememberedValue = chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$2;
                } else {
                    mutableState = mutableState4;
                    textLayoutResult = textLayoutResult2;
                    composer4 = composer3;
                    mutableState2 = mutableState3;
                    ChaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1 chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$3 = new ChaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1(textLayoutResult, i, str, text, mutableState2, textStyle3, j3, textStyle4, j2, mutableState5, mutableState, null);
                    composer4.updateRememberedValue(chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$3);
                    objRememberedValue = chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$3;
                }
                EffectsKt.LaunchedEffect(textLayoutResult, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer4, TextLayoutResult.$stable);
                AnnotatedString annotatedString2 = (AnnotatedString) mutableState5.getValue();
                if (((Boolean) mutableState2.getValue()).booleanValue()) {
                    i7 = Integer.MAX_VALUE;
                } else {
                    i7 = i;
                }
                composer4.startReplaceGroup(-1800758960);
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    composer4.startReplaceGroup(-762101343);
                    if ((i3 & 1879048192) == 536870912) {
                    }
                    objRememberedValue3 = composer4.rememberedValue();
                    if (z5) {
                        objRememberedValue3 = new v1(onClick, mutableState2, 1);
                        composer4.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new v1(onClick, mutableState2, 1);
                        composer4.updateRememberedValue(objRememberedValue3);
                    }
                    modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifier, false, null, null, null, (Function0) objRememberedValue3, 15, null);
                    composer4.endReplaceGroup();
                } else {
                    composer4.startReplaceGroup(-762097411);
                    composer4.endReplaceGroup();
                    modifierM299clickableoSLSa3U$default = modifier;
                }
                composer4.endReplaceGroup();
                Modifier modifierAnimateContentSize$default2 = AnimationModifierKt.animateContentSize$default(modifierM299clickableoSLSa3U$default, null, null, 3, null);
                objRememberedValue2 = composer4.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new g5(mutableState6, 10);
                    composer4.updateRememberedValue(objRememberedValue2);
                }
                composer2 = composer4;
                TextKt.m2624TextZ58ophY(annotatedString2, modifierAnimateContentSize$default2, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, i7, 0, null, (Function1) objRememberedValue2, null, composer2, 0, 12582912, 376828);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                textStyle3 = textStyle;
            }
            if ((i3 & 3072) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z8 = zChangedInstance | z2 | ((((57344 & i3) ^ 24576) <= 16384 && composer3.changed(j3)) || (i3 & 24576) == 16384);
            if (((3670016 & i3) ^ 1572864) > 1048576) {
                textStyle4 = textStyle2;
                if (!composer3.changed(textStyle4)) {
                    z3 = true;
                }
                z4 = z8 | z3 | ((((29360128 & i3) ^ 12582912) <= 8388608 && composer3.changed(j2)) || (i3 & 12582912) == 8388608);
                objRememberedValue = composer3.rememberedValue();
                if (z4) {
                    mutableState = mutableState4;
                    textLayoutResult = textLayoutResult2;
                    composer4 = composer3;
                    mutableState2 = mutableState3;
                    ChaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1 chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$4 = new ChaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1(textLayoutResult, i, str, text, mutableState2, textStyle3, j3, textStyle4, j2, mutableState5, mutableState, null);
                    composer4.updateRememberedValue(chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$4);
                    objRememberedValue = chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$4;
                } else {
                    mutableState = mutableState4;
                    textLayoutResult = textLayoutResult2;
                    composer4 = composer3;
                    mutableState2 = mutableState3;
                    ChaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1 chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$5 = new ChaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1(textLayoutResult, i, str, text, mutableState2, textStyle3, j3, textStyle4, j2, mutableState5, mutableState, null);
                    composer4.updateRememberedValue(chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$5);
                    objRememberedValue = chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$5;
                }
                EffectsKt.LaunchedEffect(textLayoutResult, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer4, TextLayoutResult.$stable);
                AnnotatedString annotatedString3 = (AnnotatedString) mutableState5.getValue();
                if (((Boolean) mutableState2.getValue()).booleanValue()) {
                    i7 = Integer.MAX_VALUE;
                } else {
                    i7 = i;
                }
                composer4.startReplaceGroup(-1800758960);
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    composer4.startReplaceGroup(-762101343);
                    if ((i3 & 1879048192) == 536870912) {
                    }
                    objRememberedValue3 = composer4.rememberedValue();
                    if (z5) {
                        objRememberedValue3 = new v1(onClick, mutableState2, 1);
                        composer4.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new v1(onClick, mutableState2, 1);
                        composer4.updateRememberedValue(objRememberedValue3);
                    }
                    modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifier, false, null, null, null, (Function0) objRememberedValue3, 15, null);
                    composer4.endReplaceGroup();
                } else {
                    composer4.startReplaceGroup(-762097411);
                    composer4.endReplaceGroup();
                    modifierM299clickableoSLSa3U$default = modifier;
                }
                composer4.endReplaceGroup();
                Modifier modifierAnimateContentSize$default3 = AnimationModifierKt.animateContentSize$default(modifierM299clickableoSLSa3U$default, null, null, 3, null);
                objRememberedValue2 = composer4.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new g5(mutableState6, 10);
                    composer4.updateRememberedValue(objRememberedValue2);
                }
                composer2 = composer4;
                TextKt.m2624TextZ58ophY(annotatedString3, modifierAnimateContentSize$default3, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, i7, 0, null, (Function1) objRememberedValue2, null, composer2, 0, 12582912, 376828);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                textStyle4 = textStyle2;
            }
            if ((i3 & 1572864) == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z8 | z3 | ((((29360128 & i3) ^ 12582912) <= 8388608 && composer3.changed(j2)) || (i3 & 12582912) == 8388608);
            objRememberedValue = composer3.rememberedValue();
            if (z4) {
                mutableState = mutableState4;
                textLayoutResult = textLayoutResult2;
                composer4 = composer3;
                mutableState2 = mutableState3;
                ChaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1 chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$6 = new ChaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1(textLayoutResult, i, str, text, mutableState2, textStyle3, j3, textStyle4, j2, mutableState5, mutableState, null);
                composer4.updateRememberedValue(chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$6);
                objRememberedValue = chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$6;
            } else {
                mutableState = mutableState4;
                textLayoutResult = textLayoutResult2;
                composer4 = composer3;
                mutableState2 = mutableState3;
                ChaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1 chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$7 = new ChaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1(textLayoutResult, i, str, text, mutableState2, textStyle3, j3, textStyle4, j2, mutableState5, mutableState, null);
                composer4.updateRememberedValue(chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$7);
                objRememberedValue = chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$7;
            }
            EffectsKt.LaunchedEffect(textLayoutResult, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer4, TextLayoutResult.$stable);
            AnnotatedString annotatedString4 = (AnnotatedString) mutableState5.getValue();
            if (((Boolean) mutableState2.getValue()).booleanValue()) {
                i7 = Integer.MAX_VALUE;
            } else {
                i7 = i;
            }
            composer4.startReplaceGroup(-1800758960);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composer4.startReplaceGroup(-762101343);
                if ((i3 & 1879048192) == 536870912) {
                }
                objRememberedValue3 = composer4.rememberedValue();
                if (z5) {
                    objRememberedValue3 = new v1(onClick, mutableState2, 1);
                    composer4.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new v1(onClick, mutableState2, 1);
                    composer4.updateRememberedValue(objRememberedValue3);
                }
                modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifier, false, null, null, null, (Function0) objRememberedValue3, 15, null);
                composer4.endReplaceGroup();
            } else {
                composer4.startReplaceGroup(-762097411);
                composer4.endReplaceGroup();
                modifierM299clickableoSLSa3U$default = modifier;
            }
            composer4.endReplaceGroup();
            Modifier modifierAnimateContentSize$default4 = AnimationModifierKt.animateContentSize$default(modifierM299clickableoSLSa3U$default, null, null, 3, null);
            objRememberedValue2 = composer4.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new g5(mutableState6, 10);
                composer4.updateRememberedValue(objRememberedValue2);
            }
            composer2 = composer4;
            TextKt.m2624TextZ58ophY(annotatedString4, modifierAnimateContentSize$default4, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, i7, 0, null, (Function1) objRememberedValue2, null, composer2, 0, 12582912, 376828);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: wj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ChaloExpandingTextKt.b(text, i, modifier, textStyle, j, str, textStyle2, j2, z, onClick, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void c(TextUIState.ExpandingTextUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Composer composer2;
        Intrinsics.i(state, "state");
        TextUIState.ChaloTextUIState chaloTextUIState = state.d;
        TextUIState.ChaloTextUIState chaloTextUIState2 = state.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(430510678);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(state) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            modifier2 = modifier;
            i2 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(430510678, i2, -1, "app.chalo.compose.components.textfields.ExpandingText (ChaloExpandingText.kt:205)");
            }
            String str = chaloTextUIState2.b;
            int i3 = i2;
            int i4 = state.c;
            TextStyle textStyleF = ChaloThemeKt.f(chaloTextUIState2.c, composerStartRestartGroup, 0);
            ChaloColorToken chaloColorToken = chaloTextUIState2.d;
            long jC = chaloColorToken != null ? ChaloColorTokenKt.c(chaloColorToken) : Color.INSTANCE.m4641getUnspecified0d7_KjU();
            String str2 = chaloTextUIState.b;
            TextStyle textStyleF2 = ChaloThemeKt.f(chaloTextUIState.c, composerStartRestartGroup, 0);
            ChaloColorToken chaloColorToken2 = chaloTextUIState.d;
            long jC2 = chaloColorToken2 != null ? ChaloColorTokenKt.c(chaloColorToken2) : Color.INSTANCE.m4641getUnspecified0d7_KjU();
            boolean z = state.f;
            UiEventHandler uiEventHandler = state.e;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(uiEventHandler);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                ChaloExpandingTextKt$ExpandingText$1$1 chaloExpandingTextKt$ExpandingText$1$1 = new ChaloExpandingTextKt$ExpandingText$1$1(0, uiEventHandler, UiEventHandler.class, "onClick", "onClick()V", 0);
                composerStartRestartGroup.updateRememberedValue(chaloExpandingTextKt$ExpandingText$1$1);
                objRememberedValue = chaloExpandingTextKt$ExpandingText$1$1;
            }
            composer2 = composerStartRestartGroup;
            b(str, i4, modifier2, textStyleF, jC, str2, textStyleF2, jC2, z, (Function0) ((KFunction) objRememberedValue), composer2, (i3 << 3) & 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fj(state, modifier, false, i, 5));
        }
    }
}
