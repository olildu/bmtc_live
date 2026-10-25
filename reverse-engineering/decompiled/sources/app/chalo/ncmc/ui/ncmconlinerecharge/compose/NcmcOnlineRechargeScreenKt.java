package app.chalo.ncmc.ui.ncmconlinerecharge.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.plotline.PlotlineComposeWidgetKt;
import app.chalo.compose.components.textfields.ChaloTextFieldKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.ncmc.ui.ncmconlinerecharge.NCMCOnlineRechargeViewState;
import app.chalo.ncmc.ui.ncmconlinerecharge.NcmcOnlineRechargeSuccessBottomSheetType;
import app.chalo.ncmc.ui.ncmconlinerecharge.compose.NcmcOnlineRechargeScreenKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.textField.TextFieldEventHandler;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper$maxDigits$1;
import defpackage.g5;
import defpackage.h0;
import defpackage.nu;
import defpackage.op;
import defpackage.pk;
import defpackage.pk0;
import defpackage.r1;
import defpackage.so;
import defpackage.u50;
import defpackage.wg0;
import defpackage.wi0;
import defpackage.xc;
import defpackage.yi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "tFieldFocused", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NcmcOnlineRechargeScreenKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6419a;

        static {
            int[] iArr = new int[NcmcOnlineRechargeSuccessBottomSheetType.values().length];
            try {
                iArr[NcmcOnlineRechargeSuccessBottomSheetType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NcmcOnlineRechargeSuccessBottomSheetType.WITH_OPTION_TO_TRANSFER_TO_OFFLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NcmcOnlineRechargeSuccessBottomSheetType.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6419a = iArr;
        }
    }

    public static final void a(Modifier modifier, final StringEnum toolbarTitleEnum, final String currentlyEnteredAmountString, final String str, final String str2, final boolean z, final String continueBtnText, final FocusRequester focusRequester, final SoftwareKeyboardController softwareKeyboardController, final Function1 onAmountChange, final Function0 onContinueBtnClicked, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        FocusRequester focusRequester2;
        int i4;
        Intrinsics.i(toolbarTitleEnum, "toolbarTitleEnum");
        Intrinsics.i(currentlyEnteredAmountString, "currentlyEnteredAmountString");
        Intrinsics.i(continueBtnText, "continueBtnText");
        Intrinsics.i(focusRequester, "focusRequester");
        Intrinsics.i(onAmountChange, "onAmountChange");
        Intrinsics.i(onContinueBtnClicked, "onContinueBtnClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-406660980);
        int i5 = i | 6;
        if ((i & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(toolbarTitleEnum.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(currentlyEnteredAmountString) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i5 |= composerStartRestartGroup.changed(continueBtnText) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i5 |= composerStartRestartGroup.changed(focusRequester) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i5 |= composerStartRestartGroup.changed(softwareKeyboardController) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onAmountChange) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i3 = i2 | (composerStartRestartGroup.changedInstance(onContinueBtnClicked) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute(((i5 & 306783379) == 306783378 && (i3 & 3) == 2) ? false : true, i5 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-406660980, i5, i3, "app.chalo.ncmc.ui.ncmconlinerecharge.compose.CardRechargeEnterAmountScreen (NcmcOnlineRechargeScreen.kt:160)");
            }
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i7 = i5 >> 3;
            ChaloToolBarKt.g(ChaloToolBarKt.l(companion, composerStartRestartGroup), StringResourcesHelperKt.c(toolbarTitleEnum, new Object[0], composerStartRestartGroup, i7 & 14), 0L, null, composerStartRestartGroup, 0, 12);
            ChaloSpacersKt.g(composerStartRestartGroup, 0);
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).r0, null, 2, null), 0.0f, 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).i, 7, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM788paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i8), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default2 = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default2);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i9), composerM3915constructorimpl3));
            boolean z2 = (29360128 & i5) == 8388608;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                focusRequester2 = focusRequester;
                i4 = 1;
                objRememberedValue = new op(focusRequester2, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                focusRequester2 = focusRequester;
                i4 = 1;
            }
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (Function1) objRememberedValue), 0.0f, i4, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            int i10 = i5 << 3;
            int i11 = i5;
            b(modifierM786paddingVpY3zN4$default, currentlyEnteredAmountString, str, str2, null, false, null, null, focusRequester2, softwareKeyboardController, onAmountChange, composerStartRestartGroup, (i7 & 8176) | (i10 & 234881024) | (i10 & 1879048192), (i5 >> 27) & 14, PsExtractor.VIDEO_STREAM_MASK);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            PlotlineComposeWidgetKt.a(6, 2, composerStartRestartGroup, null, "cardRechargeAmountScreenBanner");
            composerStartRestartGroup.endNode();
            ChaloFilledButtonKt.g(boxScopeInstance.align(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), companion2.getBottomCenter()), continueBtnText, null, 0L, null, z, 0.0f, null, 0L, onContinueBtnClicked, composerStartRestartGroup, ((i11 >> 15) & 112) | (i11 & 458752) | ((i3 << 27) & 1879048192), 476);
            composerStartRestartGroup = composerStartRestartGroup;
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lm0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    NcmcOnlineRechargeScreenKt.a(modifier2, toolbarTitleEnum, currentlyEnteredAmountString, str, str2, z, continueBtnText, focusRequester, softwareKeyboardController, onAmountChange, onContinueBtnClicked, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
                    return Unit.f17538a;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(Modifier modifier, String enteredAmount, String str, String str2, String str3, boolean z, VisualTransformation visualTransformation, Integer num, FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, Function1 onAmountChange, Composer composer, int i, int i2, int i3) {
        int i4;
        boolean z2;
        VisualTransformation visualTransformation2;
        int i5;
        Composer composer2;
        boolean z3;
        VisualTransformation visualTransformation3;
        String str4;
        Integer num2;
        String strC;
        Integer num3;
        int i6;
        boolean z4;
        VisualTransformation visualTransformation4;
        int i7;
        char c;
        int i8;
        long j;
        int i9;
        Composer composer3;
        Intrinsics.i(enteredAmount, "enteredAmount");
        Intrinsics.i(focusRequester, "focusRequester");
        Intrinsics.i(onAmountChange, "onAmountChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(676138749);
        if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(enteredAmount) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= ((i3 & 16) == 0 && composerStartRestartGroup.changed(str3)) ? 16384 : 8192;
        }
        int i10 = i3 & 32;
        if (i10 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z2 = z;
        } else {
            z2 = z;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
            }
        }
        int i11 = i3 & 64;
        if (i11 != 0) {
            i4 |= 1572864;
            visualTransformation2 = visualTransformation;
        } else {
            visualTransformation2 = visualTransformation;
            if ((i & 1572864) == 0) {
                i4 |= composerStartRestartGroup.changed(visualTransformation2) ? 1048576 : 524288;
            }
        }
        int i12 = i3 & 128;
        if (i12 != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(num) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changed(focusRequester) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changed(softwareKeyboardController) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (composerStartRestartGroup.changedInstance(onAmountChange) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true, i4 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i3 & 16) != 0) {
                    strC = StringResourcesHelperKt.c(StringEnum.ENTER_AMOUNT, new Object[0], composerStartRestartGroup, 6);
                    i4 &= -57345;
                } else {
                    strC = str3;
                }
                if (i10 != 0) {
                    z2 = true;
                }
                VisualTransformation none = i11 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation2;
                if (i12 != 0) {
                    i6 = i4;
                    z4 = z2;
                    visualTransformation4 = none;
                    num3 = null;
                } else {
                    num3 = num;
                    i6 = i4;
                    z4 = z2;
                    visualTransformation4 = none;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                }
                strC = str3;
                num3 = num;
                i6 = i4;
                z4 = z2;
                visualTransformation4 = visualTransformation2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(676138749, i6, i5, "app.chalo.ncmc.ui.ncmconlinerecharge.compose.EnterAmountField (NcmcOnlineRechargeScreen.kt:239)");
            }
            boolean z5 = (i6 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                i7 = 2;
                c = 0;
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(enteredAmount, TextRangeKt.TextRange(enteredAmount.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                i7 = 2;
                c = 0;
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            boolean z6 = (i6 & 29360128) == c;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                TextFieldEventHandlerHelper$maxDigits$1 textFieldEventHandlerHelper$maxDigits$1 = new TextFieldEventHandlerHelper$maxDigits$1(num3 != null ? num3.intValue() : Integer.MAX_VALUE, new xc(onAmountChange, mutableState, 4));
                composerStartRestartGroup.updateRememberedValue(textFieldEventHandlerHelper$maxDigits$1);
                objRememberedValue2 = textFieldEventHandlerHelper$maxDigits$1;
            }
            TextFieldEventHandler textFieldEventHandler = (TextFieldEventHandler) objRememberedValue2;
            TextFieldValue textFieldValue = enteredAmount.length() == 0 ? new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null) : (TextFieldValue) mutableState.getValue();
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, i7, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue3;
            if (((Boolean) mutableState2.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-545903555);
                i8 = 0;
                j = ChaloTheme.a(composerStartRestartGroup, 0).B;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i8 = 0;
                composerStartRestartGroup.startReplaceGroup(-545857861);
                j = ChaloTheme.a(composerStartRestartGroup, 0).v0;
                composerStartRestartGroup.endReplaceGroup();
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, i8);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i8);
            int i13 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i13), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m6977getNumberPjHm6EE(), ImeAction.INSTANCE.m6921getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
            boolean z7 = (i6 & 1879048192) == 536870912;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z7 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new yi(softwareKeyboardController, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            KeyboardActions keyboardActions = new KeyboardActions((Function1) objRememberedValue4, null, null, null, null, null, 62, null);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new g5(mutableState2, 28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(BorderKt.m275borderxT4_qwU(FocusRequesterModifierKt.focusRequester(FocusChangedModifierKt.onFocusChanged(modifierFillMaxWidth$default, (Function1) objRememberedValue5), focusRequester), ChaloTheme.b(composerStartRestartGroup, 0).b, j, ChaloTheme.d(composerStartRestartGroup, 0).c), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).f);
            TextStyle textStyleF = ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0));
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            long j2 = ChaloTheme.a(composerStartRestartGroup, 0).g;
            Color.Companion companion3 = Color.INSTANCE;
            long jM4640getTransparent0d7_KjU = companion3.m4640getTransparent0d7_KjU();
            long jM4640getTransparent0d7_KjU2 = companion3.m4640getTransparent0d7_KjU();
            long jM4640getTransparent0d7_KjU3 = companion3.m4640getTransparent0d7_KjU();
            long j3 = ChaloTheme.a(composerStartRestartGroup, 0).k;
            long j4 = ChaloTheme.a(composerStartRestartGroup, 0).k;
            long j5 = ChaloTheme.a(composerStartRestartGroup, 0).k;
            TextFieldColors textFieldColorsM2603colors0hiis_0 = textFieldDefaults.m2603colors0hiis_0(j2, 0L, 0L, 0L, jM4640getTransparent0d7_KjU, jM4640getTransparent0d7_KjU2, jM4640getTransparent0d7_KjU3, 0L, ChaloTheme.a(composerStartRestartGroup, 0).f1915a, ChaloTheme.a(composerStartRestartGroup, 0).f1915a, null, ChaloTheme.a(composerStartRestartGroup, 0).Z, ChaloTheme.a(composerStartRestartGroup, 0).Z, ChaloTheme.a(composerStartRestartGroup, 0).Z, ChaloTheme.a(composerStartRestartGroup, 0).d, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j4, ChaloTheme.a(composerStartRestartGroup, 0).k, j5, j3, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794048, 0, 0, 0, 3072, 2021622926, 4095);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(textFieldEventHandler);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new wi0(textFieldEventHandler, 23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            boolean z8 = z4;
            VisualTransformation visualTransformation5 = visualTransformation4;
            ChaloTextFieldKt.a(textFieldValue, (Function1) objRememberedValue6, modifierM785paddingVpY3zN4, z8, false, textStyleF, null, ComposableLambdaKt.rememberComposableLambda(-1113882251, true, new pk(strC, 8), composerStartRestartGroup, 54), null, null, false, visualTransformation5, keyboardOptions, keyboardActions, false, 0, null, null, textFieldColorsM2603colors0hiis_0, null, composerStartRestartGroup, ((i6 >> 6) & 7168) | 12582912, ((i6 >> 15) & 112) | 384, 771920);
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(-370306570);
                composerStartRestartGroup.endReplaceGroup();
                composer3 = composerStartRestartGroup;
                i9 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(-370306569);
                ChaloSpacersKt.t(composerStartRestartGroup, 0);
                i9 = 0;
                TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composerStartRestartGroup, 0).X, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
                composer3 = composerStartRestartGroup;
                composer3.endReplaceGroup();
            }
            if (str2 == null) {
                composer3.startReplaceGroup(-370051285);
                composer3.endReplaceGroup();
                composer2 = composer3;
            } else {
                composer3.startReplaceGroup(-370051284);
                ChaloSpacersKt.m(composer3, i9);
                StringEnum stringEnum = StringEnum.NCMC_PAYMENT_CONFIRMATION_MINIMUM_RECHARGE_AMOUNT;
                Object[] objArr = new Object[1];
                objArr[i9] = str2;
                Composer composer4 = composer3;
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(stringEnum, objArr, composer3, 6), null, ChaloTheme.a(composer3, i9).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer3, i9)), composer4, 0, 0, 131066);
                composer2 = composer4;
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str4 = strC;
            z3 = z8;
            visualTransformation3 = visualTransformation5;
            num2 = num3;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            z3 = z2;
            visualTransformation3 = visualTransformation2;
            str4 = str3;
            num2 = num;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new so(modifier, enteredAmount, str, str2, str4, z3, visualTransformation3, num2, focusRequester, softwareKeyboardController, onAmountChange, i, i2, i3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v20 */
    public static final void c(NCMCOnlineRechargeViewState viewState, FocusRequester focusRequester, SheetState sheetState, SoftwareKeyboardController softwareKeyboardController, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        int i4;
        boolean z;
        Composer composer3;
        SheetState modalBottomSheetState = sheetState;
        Intrinsics.i(viewState, "viewState");
        NcmcOnlineRechargeSuccessBottomSheetType ncmcOnlineRechargeSuccessBottomSheetType = viewState.q;
        Intrinsics.i(focusRequester, "focusRequester");
        Intrinsics.i(modalBottomSheetState, "modalBottomSheetState");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(456137006);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modalBottomSheetState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(softwareKeyboardController) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(456137006, i2, -1, "app.chalo.ncmc.ui.ncmconlinerecharge.compose.NcmcOnlineRechargeScreen (NcmcOnlineRechargeScreen.kt:68)");
            }
            if (viewState.b) {
                composerStartRestartGroup.startReplaceGroup(-498692976);
                composer3 = composerStartRestartGroup;
                z = true;
                i3 = 16384;
                i4 = 0;
                ChaloLoadingDialogKt.b(null, false, null, composer3, 0, 7);
            } else {
                i3 = 16384;
                i4 = 0;
                z = true;
                composer3 = composerStartRestartGroup;
                composer3.startReplaceGroup(-502024236);
            }
            composer3.endReplaceGroup();
            if (ncmcOnlineRechargeSuccessBottomSheetType != NcmcOnlineRechargeSuccessBottomSheetType.UNDEFINED) {
                composer3.startReplaceGroup(-498502884);
                ?? r8 = (i2 & 57344) == i3 ? z : i4;
                Object objRememberedValue = composer3.rememberedValue();
                if (r8 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new wg0(sendIntent, 27);
                    composer3.updateRememberedValue(objRememberedValue);
                }
                Composer composer4 = composer3;
                ChaloRoundedBottomSheetKt.a(modalBottomSheetState, (Function0) objRememberedValue, false, false, false, ComposableLambdaKt.rememberComposableLambda(400735222, z, new u50(11, viewState, sendIntent), composer3, 54), composer4, ((i2 >> 6) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                composer3 = composer4;
            } else {
                composer3.startReplaceGroup(-502024236);
            }
            composer3.endReplaceGroup();
            String str = viewState.d;
            StringEnum stringEnum = StringEnum.ADD_MONEY;
            int i5 = i2;
            String str2 = viewState.e;
            String str3 = viewState.k;
            boolean z2 = viewState.c;
            String strC = StringResourcesHelperKt.c(stringEnum, new Object[i4], composer3, 6);
            int i6 = i5 & 57344;
            ?? r16 = i6 == i3 ? z : i4;
            Object objRememberedValue2 = composer3.rememberedValue();
            if (r16 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new nu(sendIntent, 20);
                composer3.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            boolean z3 = i6 == i3;
            Object objRememberedValue3 = composer3.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new wg0(sendIntent, 28);
                composer3.updateRememberedValue(objRememberedValue3);
            }
            Composer composer5 = composer3;
            a(null, stringEnum, str, str2, str3, z2, strC, focusRequester, softwareKeyboardController, function1, (Function0) objRememberedValue3, composer5, ((i5 << 18) & 29360128) | 48 | ((i5 << 15) & 234881024), 0);
            composer2 = composer5;
            boolean zChangedInstance = composer2.changedInstance(viewState) | ((i5 & 896) == 256);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                modalBottomSheetState = sheetState;
                objRememberedValue4 = new NcmcOnlineRechargeScreenKt$NcmcOnlineRechargeScreen$5$1(viewState, modalBottomSheetState, null);
                composer2.updateRememberedValue(objRememberedValue4);
            } else {
                modalBottomSheetState = sheetState;
            }
            EffectsKt.LaunchedEffect(ncmcOnlineRechargeSuccessBottomSheetType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h0(viewState, focusRequester, modalBottomSheetState, softwareKeyboardController, sendIntent, i, 19));
        }
    }
}
