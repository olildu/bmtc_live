package app.chalo.compose.components.textfields;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.textField.TextFieldEventHandler;
import defpackage.cm;
import defpackage.g5;
import defpackage.pk0;
import defpackage.w8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BaseChaloTextFieldKt {
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:74:0x0111  */
    /* JADX WARN: Code duplicated, block: B:77:0x014b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0180  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:91:0x01da  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void a(BaseTextFieldUIState state, Modifier modifier, MutableInteractionSource mutableInteractionSource, Function2 function2, Function3 function3, VisualTransformation visualTransformation, Composer composer, int i, int i2) {
        int i3;
        Function2 function4;
        int i4;
        Function3 function5;
        int i5;
        boolean z;
        VisualTransformation visualTransformation2;
        Function2 function6;
        Function3 function7;
        MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        MutableInteractionSource mutableInteractionSourceB;
        int i6;
        VisualTransformation cmVar;
        Function2 function8;
        Function3 function9;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        String str;
        Object objRememberedValue2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-449190931);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        int i7 = i3 | 3072;
        int i8 = i2 & 16;
        if (i8 == 0) {
            if ((i & 24576) == 0) {
                function4 = function2;
                i7 |= composerStartRestartGroup.changedInstance(function4) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i7 |= i5;
                }
                if ((1572864 & i) == 0) {
                    i7 |= 524288;
                }
                if ((599187 & i7) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i7 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                        if (i8 != 0) {
                            function4 = null;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        TextFieldEventHandler b = state.getB();
                        Intrinsics.i(b, "<this>");
                        i6 = i7 & (-3670913);
                        cmVar = new cm(b);
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        i6 = i7 & (-3670913);
                        mutableInteractionSourceB = mutableInteractionSource;
                        cmVar = visualTransformation;
                    }
                    function8 = function4;
                    function9 = function5;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-449190931, i6, -1, "app.chalo.compose.components.textfields.ChaloTextField (BaseChaloTextField.kt:24)");
                    }
                    if (state instanceof BaseTextFieldUIState.ClickableTextFieldUIState) {
                        composerStartRestartGroup.startReplaceGroup(1271577689);
                        BaseTextFieldUIState.ClickableTextFieldUIState clickableTextFieldUIState = (BaseTextFieldUIState.ClickableTextFieldUIState) state;
                        ClickableChaloTextFieldKt.a(clickableTextFieldUIState, SizeKt.m816heightInVpY3zN4$default(modifier, clickableTextFieldUIState.n, 0.0f, 2, null), mutableInteractionSourceB, function8, function9, composerStartRestartGroup, i6 & 524174);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (state instanceof BaseTextFieldUIState.TextFieldUIState) {
                            throw pk0.p(composerStartRestartGroup, 2119227380);
                        }
                        composerStartRestartGroup.startReplaceGroup(1271996592);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            String str2 = ((BaseTextFieldUIState.TextFieldUIState) state).f10099a;
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str2, TextRangeKt.TextRange(str2.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableState = (MutableState) objRememberedValue;
                        BaseTextFieldUIState.TextFieldUIState textFieldUIState = (BaseTextFieldUIState.TextFieldUIState) state;
                        str = textFieldUIState.f10099a;
                        if (!Intrinsics.d(str, ((TextFieldValue) mutableState.getValue()).getText())) {
                            mutableState.setValue(TextFieldValue.m6985copy3r_uNRQ$default((TextFieldValue) mutableState.getValue(), str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (Object) null));
                        }
                        TextFieldValue textFieldValue = (TextFieldValue) mutableState.getValue();
                        Modifier modifierM816heightInVpY3zN4$default = SizeKt.m816heightInVpY3zN4$default(modifier, textFieldUIState.o, 0.0f, 2, null);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new g5(mutableState, 1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        int i9 = i6 << 3;
                        MutableInteractionSource mutableInteractionSource3 = mutableInteractionSourceB;
                        ChaloTextFieldKt.b(textFieldUIState, textFieldValue, modifierM816heightInVpY3zN4$default, (Function1) objRememberedValue2, null, function8, mutableInteractionSource3, cmVar, function9, composerStartRestartGroup, (i6 & 14) | 3072 | (57344 & i9) | (i9 & 458752) | ((i6 << 9) & 234881024), 0);
                        function8 = function8;
                        mutableInteractionSourceB = mutableInteractionSource3;
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource2 = mutableInteractionSourceB;
                    function6 = function8;
                    visualTransformation2 = cmVar;
                    function7 = function9;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    visualTransformation2 = visualTransformation;
                    function6 = function4;
                    function7 = function5;
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new w8(state, modifier, mutableInteractionSource2, function6, function7, visualTransformation2, i, i2));
                }
            }
            i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function5 = function3;
            if ((1572864 & i) == 0) {
                i7 |= 524288;
            }
            if ((599187 & i7) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i7 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                    if (i8 != 0) {
                        function4 = null;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    TextFieldEventHandler b2 = state.getB();
                    Intrinsics.i(b2, "<this>");
                    i6 = i7 & (-3670913);
                    cmVar = new cm(b2);
                } else {
                    mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                    if (i8 != 0) {
                        function4 = null;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    TextFieldEventHandler b3 = state.getB();
                    Intrinsics.i(b3, "<this>");
                    i6 = i7 & (-3670913);
                    cmVar = new cm(b3);
                }
                function8 = function4;
                function9 = function5;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-449190931, i6, -1, "app.chalo.compose.components.textfields.ChaloTextField (BaseChaloTextField.kt:24)");
                }
                if (state instanceof BaseTextFieldUIState.ClickableTextFieldUIState) {
                    composerStartRestartGroup.startReplaceGroup(1271577689);
                    BaseTextFieldUIState.ClickableTextFieldUIState clickableTextFieldUIState2 = (BaseTextFieldUIState.ClickableTextFieldUIState) state;
                    ClickableChaloTextFieldKt.a(clickableTextFieldUIState2, SizeKt.m816heightInVpY3zN4$default(modifier, clickableTextFieldUIState2.n, 0.0f, 2, null), mutableInteractionSourceB, function8, function9, composerStartRestartGroup, i6 & 524174);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (state instanceof BaseTextFieldUIState.TextFieldUIState) {
                        throw pk0.p(composerStartRestartGroup, 2119227380);
                    }
                    composerStartRestartGroup.startReplaceGroup(1271996592);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        String str3 = ((BaseTextFieldUIState.TextFieldUIState) state).f10099a;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str3, TextRangeKt.TextRange(str3.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableState = (MutableState) objRememberedValue;
                    BaseTextFieldUIState.TextFieldUIState textFieldUIState2 = (BaseTextFieldUIState.TextFieldUIState) state;
                    str = textFieldUIState2.f10099a;
                    if (!Intrinsics.d(str, ((TextFieldValue) mutableState.getValue()).getText())) {
                        mutableState.setValue(TextFieldValue.m6985copy3r_uNRQ$default((TextFieldValue) mutableState.getValue(), str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (Object) null));
                    }
                    TextFieldValue textFieldValue2 = (TextFieldValue) mutableState.getValue();
                    Modifier modifierM816heightInVpY3zN4$default2 = SizeKt.m816heightInVpY3zN4$default(modifier, textFieldUIState2.o, 0.0f, 2, null);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new g5(mutableState, 1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    int i10 = i6 << 3;
                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSourceB;
                    ChaloTextFieldKt.b(textFieldUIState2, textFieldValue2, modifierM816heightInVpY3zN4$default2, (Function1) objRememberedValue2, null, function8, mutableInteractionSource4, cmVar, function9, composerStartRestartGroup, (i6 & 14) | 3072 | (57344 & i10) | (i10 & 458752) | ((i6 << 9) & 234881024), 0);
                    function8 = function8;
                    mutableInteractionSourceB = mutableInteractionSource4;
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource2 = mutableInteractionSourceB;
                function6 = function8;
                visualTransformation2 = cmVar;
                function7 = function9;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                visualTransformation2 = visualTransformation;
                function6 = function4;
                function7 = function5;
                mutableInteractionSource2 = mutableInteractionSource;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new w8(state, modifier, mutableInteractionSource2, function6, function7, visualTransformation2, i, i2));
            }
        }
        i7 = i3 | 27648;
        function4 = function2;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                function5 = function3;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i7 |= i5;
            }
            if ((1572864 & i) == 0) {
                i7 |= 524288;
            }
            if ((599187 & i7) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i7 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                    if (i8 != 0) {
                        function4 = null;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    TextFieldEventHandler b4 = state.getB();
                    Intrinsics.i(b4, "<this>");
                    i6 = i7 & (-3670913);
                    cmVar = new cm(b4);
                } else {
                    mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                    if (i8 != 0) {
                        function4 = null;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    TextFieldEventHandler b5 = state.getB();
                    Intrinsics.i(b5, "<this>");
                    i6 = i7 & (-3670913);
                    cmVar = new cm(b5);
                }
                function8 = function4;
                function9 = function5;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-449190931, i6, -1, "app.chalo.compose.components.textfields.ChaloTextField (BaseChaloTextField.kt:24)");
                }
                if (state instanceof BaseTextFieldUIState.ClickableTextFieldUIState) {
                    composerStartRestartGroup.startReplaceGroup(1271577689);
                    BaseTextFieldUIState.ClickableTextFieldUIState clickableTextFieldUIState3 = (BaseTextFieldUIState.ClickableTextFieldUIState) state;
                    ClickableChaloTextFieldKt.a(clickableTextFieldUIState3, SizeKt.m816heightInVpY3zN4$default(modifier, clickableTextFieldUIState3.n, 0.0f, 2, null), mutableInteractionSourceB, function8, function9, composerStartRestartGroup, i6 & 524174);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (state instanceof BaseTextFieldUIState.TextFieldUIState) {
                        throw pk0.p(composerStartRestartGroup, 2119227380);
                    }
                    composerStartRestartGroup.startReplaceGroup(1271996592);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        String str4 = ((BaseTextFieldUIState.TextFieldUIState) state).f10099a;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str4, TextRangeKt.TextRange(str4.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableState = (MutableState) objRememberedValue;
                    BaseTextFieldUIState.TextFieldUIState textFieldUIState3 = (BaseTextFieldUIState.TextFieldUIState) state;
                    str = textFieldUIState3.f10099a;
                    if (!Intrinsics.d(str, ((TextFieldValue) mutableState.getValue()).getText())) {
                        mutableState.setValue(TextFieldValue.m6985copy3r_uNRQ$default((TextFieldValue) mutableState.getValue(), str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (Object) null));
                    }
                    TextFieldValue textFieldValue3 = (TextFieldValue) mutableState.getValue();
                    Modifier modifierM816heightInVpY3zN4$default3 = SizeKt.m816heightInVpY3zN4$default(modifier, textFieldUIState3.o, 0.0f, 2, null);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new g5(mutableState, 1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    int i11 = i6 << 3;
                    MutableInteractionSource mutableInteractionSource5 = mutableInteractionSourceB;
                    ChaloTextFieldKt.b(textFieldUIState3, textFieldValue3, modifierM816heightInVpY3zN4$default3, (Function1) objRememberedValue2, null, function8, mutableInteractionSource5, cmVar, function9, composerStartRestartGroup, (i6 & 14) | 3072 | (57344 & i11) | (i11 & 458752) | ((i6 << 9) & 234881024), 0);
                    function8 = function8;
                    mutableInteractionSourceB = mutableInteractionSource5;
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource2 = mutableInteractionSourceB;
                function6 = function8;
                visualTransformation2 = cmVar;
                function7 = function9;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                visualTransformation2 = visualTransformation;
                function6 = function4;
                function7 = function5;
                mutableInteractionSource2 = mutableInteractionSource;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new w8(state, modifier, mutableInteractionSource2, function6, function7, visualTransformation2, i, i2));
            }
        }
        i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        function5 = function3;
        if ((1572864 & i) == 0) {
            i7 |= 524288;
        }
        if ((599187 & i7) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i7 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                if (i8 != 0) {
                    function4 = null;
                }
                if (i4 != 0) {
                    function5 = null;
                }
                TextFieldEventHandler b6 = state.getB();
                Intrinsics.i(b6, "<this>");
                i6 = i7 & (-3670913);
                cmVar = new cm(b6);
            } else {
                mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                if (i8 != 0) {
                    function4 = null;
                }
                if (i4 != 0) {
                    function5 = null;
                }
                TextFieldEventHandler b7 = state.getB();
                Intrinsics.i(b7, "<this>");
                i6 = i7 & (-3670913);
                cmVar = new cm(b7);
            }
            function8 = function4;
            function9 = function5;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-449190931, i6, -1, "app.chalo.compose.components.textfields.ChaloTextField (BaseChaloTextField.kt:24)");
            }
            if (state instanceof BaseTextFieldUIState.ClickableTextFieldUIState) {
                composerStartRestartGroup.startReplaceGroup(1271577689);
                BaseTextFieldUIState.ClickableTextFieldUIState clickableTextFieldUIState4 = (BaseTextFieldUIState.ClickableTextFieldUIState) state;
                ClickableChaloTextFieldKt.a(clickableTextFieldUIState4, SizeKt.m816heightInVpY3zN4$default(modifier, clickableTextFieldUIState4.n, 0.0f, 2, null), mutableInteractionSourceB, function8, function9, composerStartRestartGroup, i6 & 524174);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (state instanceof BaseTextFieldUIState.TextFieldUIState) {
                    throw pk0.p(composerStartRestartGroup, 2119227380);
                }
                composerStartRestartGroup.startReplaceGroup(1271996592);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    String str5 = ((BaseTextFieldUIState.TextFieldUIState) state).f10099a;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str5, TextRangeKt.TextRange(str5.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                BaseTextFieldUIState.TextFieldUIState textFieldUIState4 = (BaseTextFieldUIState.TextFieldUIState) state;
                str = textFieldUIState4.f10099a;
                if (!Intrinsics.d(str, ((TextFieldValue) mutableState.getValue()).getText())) {
                    mutableState.setValue(TextFieldValue.m6985copy3r_uNRQ$default((TextFieldValue) mutableState.getValue(), str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (Object) null));
                }
                TextFieldValue textFieldValue4 = (TextFieldValue) mutableState.getValue();
                Modifier modifierM816heightInVpY3zN4$default4 = SizeKt.m816heightInVpY3zN4$default(modifier, textFieldUIState4.o, 0.0f, 2, null);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new g5(mutableState, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                int i12 = i6 << 3;
                MutableInteractionSource mutableInteractionSource6 = mutableInteractionSourceB;
                ChaloTextFieldKt.b(textFieldUIState4, textFieldValue4, modifierM816heightInVpY3zN4$default4, (Function1) objRememberedValue2, null, function8, mutableInteractionSource6, cmVar, function9, composerStartRestartGroup, (i6 & 14) | 3072 | (57344 & i12) | (i12 & 458752) | ((i6 << 9) & 234881024), 0);
                function8 = function8;
                mutableInteractionSourceB = mutableInteractionSource6;
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource2 = mutableInteractionSourceB;
            function6 = function8;
            visualTransformation2 = cmVar;
            function7 = function9;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            visualTransformation2 = visualTransformation;
            function6 = function4;
            function7 = function5;
            mutableInteractionSource2 = mutableInteractionSource;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w8(state, modifier, mutableInteractionSource2, function6, function7, visualTransformation2, i, i2));
        }
    }
}
