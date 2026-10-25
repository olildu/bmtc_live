package app.chalo.compose.components.textfields;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardActionsKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.textfields.ChaloTextFieldKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.textField.TextFieldEventHandler;
import app.chalo.uistate.textField.TextFieldLabelPlaceholderUIState;
import app.chalo.uistate.textField.UIImeAction;
import app.chalo.uistate.textField.UIImeActionHandler;
import app.chalo.uistate.textField.UIKeyboardCapitalization;
import app.chalo.uistate.textField.UIKeyboardOption;
import app.chalo.uistate.textField.UIKeyboardType;
import app.chalo.uistate.textField.UITextFieldColors;
import defpackage.ch;
import defpackage.cm;
import defpackage.f;
import defpackage.fm;
import defpackage.ml;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002*`\u0010\u0007\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", "name", "innerTextField", "DecorationBoxComposable", "", "focused", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloTextFieldKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1898a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[UIKeyboardCapitalization.values().length];
            try {
                iArr[UIKeyboardCapitalization.Characters.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UIKeyboardCapitalization.Words.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UIKeyboardCapitalization.Sentences.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1898a = iArr;
            int[] iArr2 = new int[UIKeyboardType.values().length];
            try {
                iArr2[UIKeyboardType.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[UIKeyboardType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[UIKeyboardType.Phone.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[UIKeyboardType.Email.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[UIKeyboardType.Password.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[UIKeyboardType.NumberPassword.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[UIKeyboardType.Decimal.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            b = iArr2;
            int[] iArr3 = new int[UIImeAction.values().length];
            try {
                iArr3[UIImeAction.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[UIImeAction.Go.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[UIImeAction.Next.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[UIImeAction.Search.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[UIImeAction.Send.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[UIImeAction.None.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            c = iArr3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0140  */
    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:103:0x014b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0155  */
    /* JADX WARN: Code duplicated, block: B:106:0x0158  */
    /* JADX WARN: Code duplicated, block: B:108:0x015d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0167  */
    /* JADX WARN: Code duplicated, block: B:113:0x016e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0172  */
    /* JADX WARN: Code duplicated, block: B:117:0x017c  */
    /* JADX WARN: Code duplicated, block: B:118:0x017f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0184  */
    /* JADX WARN: Code duplicated, block: B:123:0x018f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0196  */
    /* JADX WARN: Code duplicated, block: B:127:0x019c  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:134:0x01af  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:139:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:149:0x01db  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:156:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:157:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:159:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:161:0x0200  */
    /* JADX WARN: Code duplicated, block: B:162:0x0203  */
    /* JADX WARN: Code duplicated, block: B:166:0x020b  */
    /* JADX WARN: Code duplicated, block: B:167:0x0210  */
    /* JADX WARN: Code duplicated, block: B:169:0x0216  */
    /* JADX WARN: Code duplicated, block: B:172:0x021d  */
    /* JADX WARN: Code duplicated, block: B:176:0x0227  */
    /* JADX WARN: Code duplicated, block: B:178:0x022d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0238  */
    /* JADX WARN: Code duplicated, block: B:185:0x023e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0243  */
    /* JADX WARN: Code duplicated, block: B:189:0x0249  */
    /* JADX WARN: Code duplicated, block: B:191:0x024f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0262  */
    /* JADX WARN: Code duplicated, block: B:199:0x026e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0277  */
    /* JADX WARN: Code duplicated, block: B:204:0x0287  */
    /* JADX WARN: Code duplicated, block: B:221:0x02cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:222:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:224:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:227:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:228:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:230:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:232:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:234:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:235:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:237:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:238:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:240:0x0302  */
    /* JADX WARN: Code duplicated, block: B:241:0x0305  */
    /* JADX WARN: Code duplicated, block: B:243:0x0309  */
    /* JADX WARN: Code duplicated, block: B:244:0x0312  */
    /* JADX WARN: Code duplicated, block: B:246:0x0316  */
    /* JADX WARN: Code duplicated, block: B:247:0x031f  */
    /* JADX WARN: Code duplicated, block: B:250:0x0325  */
    /* JADX WARN: Code duplicated, block: B:251:0x034f  */
    /* JADX WARN: Code duplicated, block: B:253:0x0353  */
    /* JADX WARN: Code duplicated, block: B:254:0x0356  */
    /* JADX WARN: Code duplicated, block: B:256:0x035a  */
    /* JADX WARN: Code duplicated, block: B:257:0x035d  */
    /* JADX WARN: Code duplicated, block: B:259:0x0361  */
    /* JADX WARN: Code duplicated, block: B:261:0x036d  */
    /* JADX WARN: Code duplicated, block: B:263:0x0378  */
    /* JADX WARN: Code duplicated, block: B:266:0x0380  */
    /* JADX WARN: Code duplicated, block: B:267:0x038d  */
    /* JADX WARN: Code duplicated, block: B:270:0x0395  */
    /* JADX WARN: Code duplicated, block: B:271:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:274:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:276:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:279:0x0400  */
    /* JADX WARN: Code duplicated, block: B:280:0x040b  */
    /* JADX WARN: Code duplicated, block: B:283:0x041f  */
    /* JADX WARN: Code duplicated, block: B:285:0x0425  */
    /* JADX WARN: Code duplicated, block: B:287:0x0440  */
    /* JADX WARN: Code duplicated, block: B:288:0x044c  */
    /* JADX WARN: Code duplicated, block: B:291:0x0458  */
    /* JADX WARN: Code duplicated, block: B:292:0x045d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:293:0x045f  */
    /* JADX WARN: Code duplicated, block: B:294:0x0464  */
    /* JADX WARN: Code duplicated, block: B:296:0x0470  */
    /* JADX WARN: Code duplicated, block: B:297:0x0475  */
    /* JADX WARN: Code duplicated, block: B:300:0x0488  */
    /* JADX WARN: Code duplicated, block: B:304:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:305:0x04de  */
    /* JADX WARN: Code duplicated, block: B:308:0x0526  */
    /* JADX WARN: Code duplicated, block: B:310:0x0547  */
    /* JADX WARN: Code duplicated, block: B:313:0x0570  */
    /* JADX WARN: Code duplicated, block: B:315:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:80:0x0103  */
    /* JADX WARN: Code duplicated, block: B:82:0x0109  */
    /* JADX WARN: Code duplicated, block: B:84:0x010f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0112  */
    /* JADX WARN: Code duplicated, block: B:89:0x0120  */
    /* JADX WARN: Code duplicated, block: B:91:0x0127  */
    /* JADX WARN: Code duplicated, block: B:93:0x012b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0135  */
    /* JADX WARN: Code duplicated, block: B:96:0x0138  */
    public static final void a(final TextFieldValue value, final Function1 onValueChange, final Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function3, Function2 function4, Function2 function5, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Function3 function6, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        TextStyle textStyle2;
        int i8;
        Function2 function7;
        int i9;
        int i10;
        Function2 function8;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        boolean z7;
        final Function2 function9;
        final VisualTransformation visualTransformation2;
        final KeyboardActions keyboardActions2;
        final boolean z8;
        final int i35;
        final MutableInteractionSource mutableInteractionSource2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final Function3 function10;
        final boolean z9;
        final boolean z10;
        Composer composer2;
        final TextStyle textStyle3;
        final Function2 function11;
        final Function2 function12;
        final Function2 function13;
        final boolean z11;
        final KeyboardOptions keyboardOptions2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i36;
        final Function2 function14;
        Function2 function15;
        boolean z12;
        VisualTransformation none;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions3;
        boolean z13;
        int i37;
        MutableInteractionSource mutableInteractionSource3;
        int i38;
        int i39;
        Shape shapeM1074RoundedCornerShape0680j_4;
        Composer composer3;
        TextFieldColors textFieldColorsC;
        Shape shape3;
        int i40;
        final KeyboardActions keyboardActions4;
        final boolean z14;
        TextStyle textStyle4;
        final Function2 function16;
        final Function2 function17;
        int i41;
        final Function2 function18;
        final VisualTransformation visualTransformation3;
        final KeyboardOptions keyboardOptions4;
        final boolean z15;
        final int i42;
        final Function3 function19;
        TextFieldColors textFieldColors3;
        final MutableInteractionSource mutableInteractionSource4;
        boolean z16;
        Object objRememberedValue;
        final boolean z17;
        Composer composer4;
        long jM6770getColor0d7_KjU;
        int i43;
        State<Boolean> stateCollectIsFocusedAsState;
        long unfocusedTextColor;
        long cursorColor;
        int i44;
        Intrinsics.i(value, "value");
        Intrinsics.i(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(725156706);
        if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i45 = i4 & 8;
        int i46 = 1024;
        if (i45 == 0) {
            if ((i2 & 3072) == 0) {
                z5 = z;
                i5 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
            }
            i6 = i4 & 16;
            if (i6 != 0) {
                if ((i2 & 24576) == 0) {
                    z6 = z2;
                    if (composerStartRestartGroup.changed(z6)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i5 |= i7;
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    textStyle2 = textStyle;
                    if ((i4 & 32) == 0 || !composerStartRestartGroup.changed(textStyle2)) {
                        i44 = 65536;
                    } else {
                        i44 = 131072;
                    }
                    i5 |= i44;
                } else {
                    textStyle2 = textStyle;
                }
                i8 = i4 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                    function7 = function2;
                } else {
                    function7 = function2;
                    if ((i2 & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function7)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i5 |= i9;
                    }
                }
                i10 = i4 & 128;
                if (i10 != 0) {
                    i5 |= 12582912;
                    function8 = function3;
                } else {
                    function8 = function3;
                    if ((i2 & 12582912) == 0) {
                        if (composerStartRestartGroup.changedInstance(function8)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i5 |= i11;
                    }
                }
                i12 = i4 & 256;
                i13 = 33554432;
                if (i12 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 512;
                if (i15 != 0) {
                    if ((i2 & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i5 |= i16;
                    }
                    i17 = i4 & 1024;
                    if (i17 != 0) {
                        i18 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        if (composerStartRestartGroup.changed(z3)) {
                            i19 = 4;
                        } else {
                            i19 = 2;
                        }
                        i18 = i3 | i19;
                    } else {
                        i18 = i3;
                    }
                    i20 = i4 & 2048;
                    if (i20 != 0) {
                        i18 |= 48;
                    } else if ((i3 & 48) != 0) {
                        if (composerStartRestartGroup.changed(visualTransformation)) {
                            i21 = 32;
                        } else {
                            i21 = 16;
                        }
                        i18 |= i21;
                    }
                    i22 = i18;
                    i23 = i4 & 4096;
                    if (i23 != 0) {
                        i24 = i22;
                        if ((i3 & 384) == 0) {
                            if (composerStartRestartGroup.changed(keyboardOptions)) {
                                i25 = 256;
                            } else {
                                i25 = 128;
                            }
                            i24 |= i25;
                        }
                        if ((i3 & 3072) != 0) {
                            if ((i4 & 8192) == 0 && composerStartRestartGroup.changed(keyboardActions)) {
                                i46 = 2048;
                            }
                            i24 |= i46;
                        }
                        i26 = i24;
                        i27 = i4 & 16384;
                        if (i27 != 0) {
                            i28 = i26;
                            if ((i3 & 24576) == 0) {
                                i28 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                            }
                            i29 = i4 & 32768;
                            if (i29 != 0) {
                                i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                if (composerStartRestartGroup.changed(i)) {
                                    i30 = 131072;
                                } else {
                                    i30 = 65536;
                                }
                                i28 |= i30;
                            }
                            i31 = i4 & 65536;
                            if (i31 != 0) {
                                i28 |= 1572864;
                            } else if ((i3 & 1572864) == 0) {
                                i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                            }
                            if ((i3 & 100663296) != 0) {
                                if ((i4 & 262144) == 0 && composerStartRestartGroup.changed(textFieldColors)) {
                                    i13 = 67108864;
                                }
                                i28 |= i13;
                            }
                            i32 = i4 & 524288;
                            if (i32 != 0) {
                                i28 |= 805306368;
                            } else if ((i3 & 805306368) == 0) {
                                i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                            }
                            i33 = i28;
                            i34 = i5;
                            if ((i5 & 306783379) == 306783378 || (302589075 & i33) != 302589074) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                                composerStartRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i45 != 0) {
                                        z5 = true;
                                    }
                                    if (i6 != 0) {
                                        z6 = false;
                                    }
                                    if ((i4 & 32) != 0) {
                                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                        i36 = i34 & (-458753);
                                    } else {
                                        i36 = i34;
                                    }
                                    if (i8 != 0) {
                                        function7 = null;
                                    }
                                    if (i10 != 0) {
                                        function8 = null;
                                    }
                                    if (i12 != 0) {
                                        function14 = null;
                                    } else {
                                        function14 = function4;
                                    }
                                    if (i15 != 0) {
                                        function15 = null;
                                    } else {
                                        function15 = function5;
                                    }
                                    if (i17 != 0) {
                                        z12 = false;
                                    } else {
                                        z12 = z3;
                                    }
                                    if (i20 != 0) {
                                        none = VisualTransformation.INSTANCE.getNone();
                                    } else {
                                        none = visualTransformation;
                                    }
                                    if (i23 != 0) {
                                        keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                                    } else {
                                        keyboardOptions3 = keyboardOptions;
                                    }
                                    if ((i4 & 8192) != 0) {
                                        keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                        i33 &= -7169;
                                    } else {
                                        keyboardActions3 = keyboardActions;
                                    }
                                    if (i27 != 0) {
                                        z13 = true;
                                    } else {
                                        z13 = z4;
                                    }
                                    if (i29 != 0) {
                                        i37 = 1;
                                    } else {
                                        i37 = i;
                                    }
                                    if (i31 != 0) {
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource;
                                    }
                                    i38 = i33;
                                    if ((i4 & 131072) != 0) {
                                        shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                        i39 = i38 & (-29360129);
                                    } else {
                                        i39 = i38;
                                        shapeM1074RoundedCornerShape0680j_4 = shape;
                                    }
                                    if ((i4 & 262144) != 0) {
                                        textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                        composer3 = composerStartRestartGroup;
                                        i39 &= -234881025;
                                    } else {
                                        composer3 = composerStartRestartGroup;
                                        textFieldColorsC = textFieldColors;
                                    }
                                    shape3 = shapeM1074RoundedCornerShape0680j_4;
                                    i40 = i36;
                                    keyboardActions4 = keyboardActions3;
                                    z14 = z6;
                                    textStyle4 = textStyle2;
                                    function16 = function7;
                                    function17 = function8;
                                    i41 = i39;
                                    function18 = function15;
                                    visualTransformation3 = none;
                                    keyboardOptions4 = keyboardOptions3;
                                    z15 = z13;
                                    i42 = i37;
                                    if (i32 != 0) {
                                        function19 = null;
                                    } else {
                                        function19 = function6;
                                    }
                                    textFieldColors3 = textFieldColorsC;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    z16 = z12;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    int i47 = (i4 & 32) != 0 ? i34 & (-458753) : i34;
                                    if ((i4 & 8192) != 0) {
                                        i33 &= -7169;
                                    }
                                    if ((i4 & 131072) != 0) {
                                        i33 &= -29360129;
                                    }
                                    if ((i4 & 262144) != 0) {
                                        i33 &= -234881025;
                                    }
                                    function14 = function4;
                                    z16 = z3;
                                    visualTransformation3 = visualTransformation;
                                    keyboardOptions4 = keyboardOptions;
                                    keyboardActions4 = keyboardActions;
                                    z15 = z4;
                                    i42 = i;
                                    shape3 = shape;
                                    textFieldColors3 = textFieldColors;
                                    i40 = i47;
                                    composer3 = composerStartRestartGroup;
                                    z14 = z6;
                                    mutableInteractionSource4 = mutableInteractionSource;
                                    function19 = function6;
                                    i41 = i33;
                                    textStyle4 = textStyle2;
                                    function16 = function7;
                                    function17 = function8;
                                    function18 = function5;
                                }
                                composer3.endDefaults();
                                z17 = z16;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                                }
                                composer4 = composer3;
                                composer4.startReplaceGroup(1090927577);
                                jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                                if (jM6770getColor0d7_KjU != 16) {
                                    z5 = z5;
                                } else {
                                    i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                                    }
                                    stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                                    if (z5 == 0) {
                                        unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                                    } else if (z17) {
                                        unfocusedTextColor = textFieldColors3.getErrorTextColor();
                                    } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                                        unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                                    } else {
                                        unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                                    }
                                    State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState.getValue()).m4615unboximpl();
                                }
                                long j = jM6770getColor0d7_KjU;
                                composer4.endReplaceGroup();
                                final TextStyle textStyleMerge = textStyle4.merge(new TextStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                if (z17) {
                                    cursorColor = textFieldColors3.getErrorCursorColor();
                                } else {
                                    cursorColor = textFieldColors3.getCursorColor();
                                }
                                final State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                                ProvidedValue<TextSelectionColors> providedValueProvides = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                                TextStyle textStyle5 = textStyle4;
                                final TextFieldColors textFieldColors4 = textFieldColors3;
                                final boolean z18 = z5;
                                CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        final boolean z19;
                                        final VisualTransformation visualTransformation4;
                                        Composer composer5 = (Composer) obj;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                            }
                                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                            Modifier modifier2 = modifier;
                                            final boolean z20 = z18;
                                            final boolean z21 = z17;
                                            final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                            final TextFieldColors textFieldColors5 = textFieldColors4;
                                            Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors5, null, 0.0f, 0.0f, 112, null);
                                            SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState2.getValue()).m4615unboximpl(), null);
                                            Function3 function3RememberComposableLambda = function19;
                                            TextFieldValue textFieldValue = value;
                                            VisualTransformation visualTransformation5 = visualTransformation3;
                                            boolean z22 = z15;
                                            if (function3RememberComposableLambda == null) {
                                                composer5.startReplaceGroup(1071062574);
                                                final String text = textFieldValue.getText();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                                }
                                                final Function2 function20 = function16;
                                                final Function2 function21 = function17;
                                                final Function2 function22 = function14;
                                                final Function2 function23 = function18;
                                                z19 = z22;
                                                visualTransformation4 = visualTransformation5;
                                                function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                        Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                                        Composer composer6 = (Composer) obj4;
                                                        int iIntValue2 = ((Integer) obj5).intValue();
                                                        Intrinsics.i(innerTextField, "innerTextField");
                                                        if ((iIntValue2 & 6) == 0) {
                                                            iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                                        }
                                                        if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                            }
                                                            float f = 0;
                                                            TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z19, visualTransformation4, mutableInteractionSource5, z21, function20, function21, function22, function23, null, null, null, null, textFieldColors5, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        } else {
                                                            composer6.skipToGroupEnd();
                                                        }
                                                        return Unit.f17538a;
                                                    }
                                                }, composer5, 54);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                z19 = z22;
                                                visualTransformation4 = visualTransformation5;
                                                composer5.startReplaceGroup(1071062047);
                                            }
                                            composer5.endReplaceGroup();
                                            BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge, keyboardOptions4, keyboardActions4, z19, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer5.skipToGroupEnd();
                                        }
                                        return Unit.f17538a;
                                    }
                                }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                Function2 function20 = function14;
                                visualTransformation2 = visualTransformation3;
                                function9 = function20;
                                mutableInteractionSource2 = mutableInteractionSource4;
                                composer2 = composer4;
                                function12 = function17;
                                z8 = z15;
                                keyboardActions2 = keyboardActions4;
                                textStyle3 = textStyle5;
                                z9 = z18;
                                z11 = z17;
                                textFieldColors2 = textFieldColors4;
                                z10 = z14;
                                i35 = i42;
                                function10 = function19;
                                function11 = function16;
                                function13 = function18;
                                keyboardOptions2 = keyboardOptions4;
                                shape2 = shape3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                function9 = function4;
                                visualTransformation2 = visualTransformation;
                                keyboardActions2 = keyboardActions;
                                z8 = z4;
                                i35 = i;
                                mutableInteractionSource2 = mutableInteractionSource;
                                shape2 = shape;
                                textFieldColors2 = textFieldColors;
                                function10 = function6;
                                z9 = z5;
                                z10 = z6;
                                composer2 = composerStartRestartGroup;
                                textStyle3 = textStyle2;
                                function11 = function7;
                                function12 = function8;
                                function13 = function5;
                                z11 = z3;
                                keyboardOptions2 = keyboardOptions;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                                        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                                        ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                                        return Unit.f17538a;
                                    }
                                });
                            }
                        }
                        i28 = i26 | 24576;
                        i29 = i4 & 32768;
                        if (i29 != 0) {
                            i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            if (composerStartRestartGroup.changed(i)) {
                                i30 = 131072;
                            } else {
                                i30 = 65536;
                            }
                            i28 |= i30;
                        }
                        i31 = i4 & 65536;
                        if (i31 != 0) {
                            i28 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                        }
                        if ((i3 & 100663296) != 0) {
                            if ((i4 & 262144) == 0) {
                                i13 = 67108864;
                            }
                            i28 |= i13;
                        }
                        i32 = i4 & 524288;
                        if (i32 != 0) {
                            i28 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                        }
                        i33 = i28;
                        i34 = i5;
                        if ((i5 & 306783379) == 306783378) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0) {
                                if (i45 != 0) {
                                    z5 = true;
                                }
                                if (i6 != 0) {
                                    z6 = false;
                                }
                                if ((i4 & 32) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i36 = i34 & (-458753);
                                } else {
                                    i36 = i34;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                }
                                if (i12 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function4;
                                }
                                if (i15 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function5;
                                }
                                if (i17 != 0) {
                                    z12 = false;
                                } else {
                                    z12 = z3;
                                }
                                if (i20 != 0) {
                                    none = VisualTransformation.INSTANCE.getNone();
                                } else {
                                    none = visualTransformation;
                                }
                                if (i23 != 0) {
                                    keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                                } else {
                                    keyboardOptions3 = keyboardOptions;
                                }
                                if ((i4 & 8192) != 0) {
                                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                    i33 &= -7169;
                                } else {
                                    keyboardActions3 = keyboardActions;
                                }
                                if (i27 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z4;
                                }
                                if (i29 != 0) {
                                    i37 = 1;
                                } else {
                                    i37 = i;
                                }
                                if (i31 != 0) {
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                }
                                i38 = i33;
                                if ((i4 & 131072) != 0) {
                                    shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                    i39 = i38 & (-29360129);
                                } else {
                                    i39 = i38;
                                    shapeM1074RoundedCornerShape0680j_4 = shape;
                                }
                                if ((i4 & 262144) != 0) {
                                    textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                    composer3 = composerStartRestartGroup;
                                    i39 &= -234881025;
                                } else {
                                    composer3 = composerStartRestartGroup;
                                    textFieldColorsC = textFieldColors;
                                }
                                shape3 = shapeM1074RoundedCornerShape0680j_4;
                                i40 = i36;
                                keyboardActions4 = keyboardActions3;
                                z14 = z6;
                                textStyle4 = textStyle2;
                                function16 = function7;
                                function17 = function8;
                                i41 = i39;
                                function18 = function15;
                                visualTransformation3 = none;
                                keyboardOptions4 = keyboardOptions3;
                                z15 = z13;
                                i42 = i37;
                                if (i32 != 0) {
                                    function19 = null;
                                } else {
                                    function19 = function6;
                                }
                                textFieldColors3 = textFieldColorsC;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                z16 = z12;
                            } else {
                                if (i45 != 0) {
                                    z5 = true;
                                }
                                if (i6 != 0) {
                                    z6 = false;
                                }
                                if ((i4 & 32) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i36 = i34 & (-458753);
                                } else {
                                    i36 = i34;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                }
                                if (i12 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function4;
                                }
                                if (i15 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function5;
                                }
                                if (i17 != 0) {
                                    z12 = false;
                                } else {
                                    z12 = z3;
                                }
                                if (i20 != 0) {
                                    none = VisualTransformation.INSTANCE.getNone();
                                } else {
                                    none = visualTransformation;
                                }
                                if (i23 != 0) {
                                    keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                                } else {
                                    keyboardOptions3 = keyboardOptions;
                                }
                                if ((i4 & 8192) != 0) {
                                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                    i33 &= -7169;
                                } else {
                                    keyboardActions3 = keyboardActions;
                                }
                                if (i27 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z4;
                                }
                                if (i29 != 0) {
                                    i37 = 1;
                                } else {
                                    i37 = i;
                                }
                                if (i31 != 0) {
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                }
                                i38 = i33;
                                if ((i4 & 131072) != 0) {
                                    shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                    i39 = i38 & (-29360129);
                                } else {
                                    i39 = i38;
                                    shapeM1074RoundedCornerShape0680j_4 = shape;
                                }
                                if ((i4 & 262144) != 0) {
                                    textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                    composer3 = composerStartRestartGroup;
                                    i39 &= -234881025;
                                } else {
                                    composer3 = composerStartRestartGroup;
                                    textFieldColorsC = textFieldColors;
                                }
                                shape3 = shapeM1074RoundedCornerShape0680j_4;
                                i40 = i36;
                                keyboardActions4 = keyboardActions3;
                                z14 = z6;
                                textStyle4 = textStyle2;
                                function16 = function7;
                                function17 = function8;
                                i41 = i39;
                                function18 = function15;
                                visualTransformation3 = none;
                                keyboardOptions4 = keyboardOptions3;
                                z15 = z13;
                                i42 = i37;
                                if (i32 != 0) {
                                    function19 = null;
                                } else {
                                    function19 = function6;
                                }
                                textFieldColors3 = textFieldColorsC;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                z16 = z12;
                            }
                            composer3.endDefaults();
                            z17 = z16;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                            }
                            composer4 = composer3;
                            composer4.startReplaceGroup(1090927577);
                            jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                            if (jM6770getColor0d7_KjU != 16) {
                                z5 = z5;
                            } else {
                                i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                                }
                                stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                                if (z5 == 0) {
                                    unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                                } else if (z17) {
                                    unfocusedTextColor = textFieldColors3.getErrorTextColor();
                                } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                                    unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                                } else {
                                    unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                                }
                                State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState3.getValue()).m4615unboximpl();
                            }
                            long j2 = jM6770getColor0d7_KjU;
                            composer4.endReplaceGroup();
                            final TextStyle textStyleMerge2 = textStyle4.merge(new TextStyle(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                            if (z17) {
                                cursorColor = textFieldColors3.getErrorCursorColor();
                            } else {
                                cursorColor = textFieldColors3.getCursorColor();
                            }
                            final State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                            ProvidedValue<TextSelectionColors> providedValueProvides2 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                            TextStyle textStyle6 = textStyle4;
                            final TextFieldColors textFieldColors5 = textFieldColors3;
                            final boolean z19 = z5;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides2, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    final boolean z110;
                                    final VisualTransformation visualTransformation4;
                                    Composer composer5 = (Composer) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                        Modifier modifier2 = modifier;
                                        final boolean z20 = z19;
                                        final boolean z21 = z17;
                                        final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                        final TextFieldColors textFieldColors6 = textFieldColors5;
                                        Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors6, null, 0.0f, 0.0f, 112, null);
                                        SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState4.getValue()).m4615unboximpl(), null);
                                        Function3 function3RememberComposableLambda = function19;
                                        TextFieldValue textFieldValue = value;
                                        VisualTransformation visualTransformation5 = visualTransformation3;
                                        boolean z22 = z15;
                                        if (function3RememberComposableLambda == null) {
                                            composer5.startReplaceGroup(1071062574);
                                            final String text = textFieldValue.getText();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                            }
                                            final Function2 function21 = function16;
                                            final Function2 function22 = function17;
                                            final Function2 function23 = function14;
                                            final Function2 function24 = function18;
                                            z110 = z22;
                                            visualTransformation4 = visualTransformation5;
                                            function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                                    Composer composer6 = (Composer) obj4;
                                                    int iIntValue2 = ((Integer) obj5).intValue();
                                                    Intrinsics.i(innerTextField, "innerTextField");
                                                    if ((iIntValue2 & 6) == 0) {
                                                        iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                                    }
                                                    if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                        }
                                                        float f = 0;
                                                        TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z110, visualTransformation4, mutableInteractionSource5, z21, function21, function22, function23, function24, null, null, null, null, textFieldColors6, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer6.skipToGroupEnd();
                                                    }
                                                    return Unit.f17538a;
                                                }
                                            }, composer5, 54);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            z110 = z22;
                                            visualTransformation4 = visualTransformation5;
                                            composer5.startReplaceGroup(1071062047);
                                        }
                                        composer5.endReplaceGroup();
                                        BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge2, keyboardOptions4, keyboardActions4, z110, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer5.skipToGroupEnd();
                                    }
                                    return Unit.f17538a;
                                }
                            }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            Function2 function21 = function14;
                            visualTransformation2 = visualTransformation3;
                            function9 = function21;
                            mutableInteractionSource2 = mutableInteractionSource4;
                            composer2 = composer4;
                            function12 = function17;
                            z8 = z15;
                            keyboardActions2 = keyboardActions4;
                            textStyle3 = textStyle6;
                            z9 = z19;
                            z11 = z17;
                            textFieldColors2 = textFieldColors5;
                            z10 = z14;
                            i35 = i42;
                            function10 = function19;
                            function11 = function16;
                            function13 = function18;
                            keyboardOptions2 = keyboardOptions4;
                            shape2 = shape3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function9 = function4;
                            visualTransformation2 = visualTransformation;
                            keyboardActions2 = keyboardActions;
                            z8 = z4;
                            i35 = i;
                            mutableInteractionSource2 = mutableInteractionSource;
                            shape2 = shape;
                            textFieldColors2 = textFieldColors;
                            function10 = function6;
                            z9 = z5;
                            z10 = z6;
                            composer2 = composerStartRestartGroup;
                            textStyle3 = textStyle2;
                            function11 = function7;
                            function12 = function8;
                            function13 = function5;
                            z11 = z3;
                            keyboardOptions2 = keyboardOptions;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                                    ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                                    return Unit.f17538a;
                                }
                            });
                        }
                    }
                    i24 = i22 | 384;
                    if ((i3 & 3072) != 0) {
                        if ((i4 & 8192) == 0) {
                            i46 = 2048;
                        }
                        i24 |= i46;
                    }
                    i26 = i24;
                    i27 = i4 & 16384;
                    if (i27 != 0) {
                        i28 = i26;
                        if ((i3 & 24576) == 0) {
                            i28 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                        }
                        i29 = i4 & 32768;
                        if (i29 != 0) {
                            i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            if (composerStartRestartGroup.changed(i)) {
                                i30 = 131072;
                            } else {
                                i30 = 65536;
                            }
                            i28 |= i30;
                        }
                        i31 = i4 & 65536;
                        if (i31 != 0) {
                            i28 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                        }
                        if ((i3 & 100663296) != 0) {
                            if ((i4 & 262144) == 0) {
                                i13 = 67108864;
                            }
                            i28 |= i13;
                        }
                        i32 = i4 & 524288;
                        if (i32 != 0) {
                            i28 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                        }
                        i33 = i28;
                        i34 = i5;
                        if ((i5 & 306783379) == 306783378) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0) {
                                if (i45 != 0) {
                                    z5 = true;
                                }
                                if (i6 != 0) {
                                    z6 = false;
                                }
                                if ((i4 & 32) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i36 = i34 & (-458753);
                                } else {
                                    i36 = i34;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                }
                                if (i12 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function4;
                                }
                                if (i15 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function5;
                                }
                                if (i17 != 0) {
                                    z12 = false;
                                } else {
                                    z12 = z3;
                                }
                                if (i20 != 0) {
                                    none = VisualTransformation.INSTANCE.getNone();
                                } else {
                                    none = visualTransformation;
                                }
                                if (i23 != 0) {
                                    keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                                } else {
                                    keyboardOptions3 = keyboardOptions;
                                }
                                if ((i4 & 8192) != 0) {
                                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                    i33 &= -7169;
                                } else {
                                    keyboardActions3 = keyboardActions;
                                }
                                if (i27 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z4;
                                }
                                if (i29 != 0) {
                                    i37 = 1;
                                } else {
                                    i37 = i;
                                }
                                if (i31 != 0) {
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                }
                                i38 = i33;
                                if ((i4 & 131072) != 0) {
                                    shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                    i39 = i38 & (-29360129);
                                } else {
                                    i39 = i38;
                                    shapeM1074RoundedCornerShape0680j_4 = shape;
                                }
                                if ((i4 & 262144) != 0) {
                                    textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                    composer3 = composerStartRestartGroup;
                                    i39 &= -234881025;
                                } else {
                                    composer3 = composerStartRestartGroup;
                                    textFieldColorsC = textFieldColors;
                                }
                                shape3 = shapeM1074RoundedCornerShape0680j_4;
                                i40 = i36;
                                keyboardActions4 = keyboardActions3;
                                z14 = z6;
                                textStyle4 = textStyle2;
                                function16 = function7;
                                function17 = function8;
                                i41 = i39;
                                function18 = function15;
                                visualTransformation3 = none;
                                keyboardOptions4 = keyboardOptions3;
                                z15 = z13;
                                i42 = i37;
                                if (i32 != 0) {
                                    function19 = null;
                                } else {
                                    function19 = function6;
                                }
                                textFieldColors3 = textFieldColorsC;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                z16 = z12;
                            } else {
                                if (i45 != 0) {
                                    z5 = true;
                                }
                                if (i6 != 0) {
                                    z6 = false;
                                }
                                if ((i4 & 32) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i36 = i34 & (-458753);
                                } else {
                                    i36 = i34;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                }
                                if (i12 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function4;
                                }
                                if (i15 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function5;
                                }
                                if (i17 != 0) {
                                    z12 = false;
                                } else {
                                    z12 = z3;
                                }
                                if (i20 != 0) {
                                    none = VisualTransformation.INSTANCE.getNone();
                                } else {
                                    none = visualTransformation;
                                }
                                if (i23 != 0) {
                                    keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                                } else {
                                    keyboardOptions3 = keyboardOptions;
                                }
                                if ((i4 & 8192) != 0) {
                                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                    i33 &= -7169;
                                } else {
                                    keyboardActions3 = keyboardActions;
                                }
                                if (i27 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z4;
                                }
                                if (i29 != 0) {
                                    i37 = 1;
                                } else {
                                    i37 = i;
                                }
                                if (i31 != 0) {
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                }
                                i38 = i33;
                                if ((i4 & 131072) != 0) {
                                    shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                    i39 = i38 & (-29360129);
                                } else {
                                    i39 = i38;
                                    shapeM1074RoundedCornerShape0680j_4 = shape;
                                }
                                if ((i4 & 262144) != 0) {
                                    textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                    composer3 = composerStartRestartGroup;
                                    i39 &= -234881025;
                                } else {
                                    composer3 = composerStartRestartGroup;
                                    textFieldColorsC = textFieldColors;
                                }
                                shape3 = shapeM1074RoundedCornerShape0680j_4;
                                i40 = i36;
                                keyboardActions4 = keyboardActions3;
                                z14 = z6;
                                textStyle4 = textStyle2;
                                function16 = function7;
                                function17 = function8;
                                i41 = i39;
                                function18 = function15;
                                visualTransformation3 = none;
                                keyboardOptions4 = keyboardOptions3;
                                z15 = z13;
                                i42 = i37;
                                if (i32 != 0) {
                                    function19 = null;
                                } else {
                                    function19 = function6;
                                }
                                textFieldColors3 = textFieldColorsC;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                z16 = z12;
                            }
                            composer3.endDefaults();
                            z17 = z16;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                            }
                            composer4 = composer3;
                            composer4.startReplaceGroup(1090927577);
                            jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                            if (jM6770getColor0d7_KjU != 16) {
                                z5 = z5;
                            } else {
                                i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                                }
                                stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                                if (z5 == 0) {
                                    unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                                } else if (z17) {
                                    unfocusedTextColor = textFieldColors3.getErrorTextColor();
                                } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                                    unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                                } else {
                                    unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                                }
                                State stateRememberUpdatedState5 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState5.getValue()).m4615unboximpl();
                            }
                            long j3 = jM6770getColor0d7_KjU;
                            composer4.endReplaceGroup();
                            final TextStyle textStyleMerge3 = textStyle4.merge(new TextStyle(j3, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                            if (z17) {
                                cursorColor = textFieldColors3.getErrorCursorColor();
                            } else {
                                cursorColor = textFieldColors3.getCursorColor();
                            }
                            final State stateRememberUpdatedState6 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                            ProvidedValue<TextSelectionColors> providedValueProvides3 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                            TextStyle textStyle7 = textStyle4;
                            final TextFieldColors textFieldColors6 = textFieldColors3;
                            final boolean z110 = z5;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides3, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    final boolean z111;
                                    final VisualTransformation visualTransformation4;
                                    Composer composer5 = (Composer) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                        Modifier modifier2 = modifier;
                                        final boolean z20 = z110;
                                        final boolean z21 = z17;
                                        final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                        final TextFieldColors textFieldColors7 = textFieldColors6;
                                        Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors7, null, 0.0f, 0.0f, 112, null);
                                        SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState6.getValue()).m4615unboximpl(), null);
                                        Function3 function3RememberComposableLambda = function19;
                                        TextFieldValue textFieldValue = value;
                                        VisualTransformation visualTransformation5 = visualTransformation3;
                                        boolean z22 = z15;
                                        if (function3RememberComposableLambda == null) {
                                            composer5.startReplaceGroup(1071062574);
                                            final String text = textFieldValue.getText();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                            }
                                            final Function2 function22 = function16;
                                            final Function2 function23 = function17;
                                            final Function2 function24 = function14;
                                            final Function2 function25 = function18;
                                            z111 = z22;
                                            visualTransformation4 = visualTransformation5;
                                            function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                                    Composer composer6 = (Composer) obj4;
                                                    int iIntValue2 = ((Integer) obj5).intValue();
                                                    Intrinsics.i(innerTextField, "innerTextField");
                                                    if ((iIntValue2 & 6) == 0) {
                                                        iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                                    }
                                                    if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                        }
                                                        float f = 0;
                                                        TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z111, visualTransformation4, mutableInteractionSource5, z21, function22, function23, function24, function25, null, null, null, null, textFieldColors7, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer6.skipToGroupEnd();
                                                    }
                                                    return Unit.f17538a;
                                                }
                                            }, composer5, 54);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            z111 = z22;
                                            visualTransformation4 = visualTransformation5;
                                            composer5.startReplaceGroup(1071062047);
                                        }
                                        composer5.endReplaceGroup();
                                        BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge3, keyboardOptions4, keyboardActions4, z111, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer5.skipToGroupEnd();
                                    }
                                    return Unit.f17538a;
                                }
                            }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            Function2 function22 = function14;
                            visualTransformation2 = visualTransformation3;
                            function9 = function22;
                            mutableInteractionSource2 = mutableInteractionSource4;
                            composer2 = composer4;
                            function12 = function17;
                            z8 = z15;
                            keyboardActions2 = keyboardActions4;
                            textStyle3 = textStyle7;
                            z9 = z110;
                            z11 = z17;
                            textFieldColors2 = textFieldColors6;
                            z10 = z14;
                            i35 = i42;
                            function10 = function19;
                            function11 = function16;
                            function13 = function18;
                            keyboardOptions2 = keyboardOptions4;
                            shape2 = shape3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function9 = function4;
                            visualTransformation2 = visualTransformation;
                            keyboardActions2 = keyboardActions;
                            z8 = z4;
                            i35 = i;
                            mutableInteractionSource2 = mutableInteractionSource;
                            shape2 = shape;
                            textFieldColors2 = textFieldColors;
                            function10 = function6;
                            z9 = z5;
                            z10 = z6;
                            composer2 = composerStartRestartGroup;
                            textStyle3 = textStyle2;
                            function11 = function7;
                            function12 = function8;
                            function13 = function5;
                            z11 = z3;
                            keyboardOptions2 = keyboardOptions;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                                    ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                                    return Unit.f17538a;
                                }
                            });
                        }
                    }
                    i28 = i26 | 24576;
                    i29 = i4 & 32768;
                    if (i29 != 0) {
                        i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(i)) {
                            i30 = 131072;
                        } else {
                            i30 = 65536;
                        }
                        i28 |= i30;
                    }
                    i31 = i4 & 65536;
                    if (i31 != 0) {
                        i28 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                    }
                    if ((i3 & 100663296) != 0) {
                        if ((i4 & 262144) == 0) {
                            i13 = 67108864;
                        }
                        i28 |= i13;
                    }
                    i32 = i4 & 524288;
                    if (i32 != 0) {
                        i28 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                    }
                    i33 = i28;
                    i34 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i45 != 0) {
                                z5 = true;
                            }
                            if (i6 != 0) {
                                z6 = false;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i36 = i34 & (-458753);
                            } else {
                                i36 = i34;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            }
                            if (i12 != 0) {
                                function14 = null;
                            } else {
                                function14 = function4;
                            }
                            if (i15 != 0) {
                                function15 = null;
                            } else {
                                function15 = function5;
                            }
                            if (i17 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i20 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i23 != 0) {
                                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                            } else {
                                keyboardOptions3 = keyboardOptions;
                            }
                            if ((i4 & 8192) != 0) {
                                keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                i33 &= -7169;
                            } else {
                                keyboardActions3 = keyboardActions;
                            }
                            if (i27 != 0) {
                                z13 = true;
                            } else {
                                z13 = z4;
                            }
                            if (i29 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i;
                            }
                            if (i31 != 0) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            i38 = i33;
                            if ((i4 & 131072) != 0) {
                                shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                i39 = i38 & (-29360129);
                            } else {
                                i39 = i38;
                                shapeM1074RoundedCornerShape0680j_4 = shape;
                            }
                            if ((i4 & 262144) != 0) {
                                textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                composer3 = composerStartRestartGroup;
                                i39 &= -234881025;
                            } else {
                                composer3 = composerStartRestartGroup;
                                textFieldColorsC = textFieldColors;
                            }
                            shape3 = shapeM1074RoundedCornerShape0680j_4;
                            i40 = i36;
                            keyboardActions4 = keyboardActions3;
                            z14 = z6;
                            textStyle4 = textStyle2;
                            function16 = function7;
                            function17 = function8;
                            i41 = i39;
                            function18 = function15;
                            visualTransformation3 = none;
                            keyboardOptions4 = keyboardOptions3;
                            z15 = z13;
                            i42 = i37;
                            if (i32 != 0) {
                                function19 = null;
                            } else {
                                function19 = function6;
                            }
                            textFieldColors3 = textFieldColorsC;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z16 = z12;
                        } else {
                            if (i45 != 0) {
                                z5 = true;
                            }
                            if (i6 != 0) {
                                z6 = false;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i36 = i34 & (-458753);
                            } else {
                                i36 = i34;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            }
                            if (i12 != 0) {
                                function14 = null;
                            } else {
                                function14 = function4;
                            }
                            if (i15 != 0) {
                                function15 = null;
                            } else {
                                function15 = function5;
                            }
                            if (i17 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i20 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i23 != 0) {
                                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                            } else {
                                keyboardOptions3 = keyboardOptions;
                            }
                            if ((i4 & 8192) != 0) {
                                keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                i33 &= -7169;
                            } else {
                                keyboardActions3 = keyboardActions;
                            }
                            if (i27 != 0) {
                                z13 = true;
                            } else {
                                z13 = z4;
                            }
                            if (i29 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i;
                            }
                            if (i31 != 0) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            i38 = i33;
                            if ((i4 & 131072) != 0) {
                                shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                i39 = i38 & (-29360129);
                            } else {
                                i39 = i38;
                                shapeM1074RoundedCornerShape0680j_4 = shape;
                            }
                            if ((i4 & 262144) != 0) {
                                textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                composer3 = composerStartRestartGroup;
                                i39 &= -234881025;
                            } else {
                                composer3 = composerStartRestartGroup;
                                textFieldColorsC = textFieldColors;
                            }
                            shape3 = shapeM1074RoundedCornerShape0680j_4;
                            i40 = i36;
                            keyboardActions4 = keyboardActions3;
                            z14 = z6;
                            textStyle4 = textStyle2;
                            function16 = function7;
                            function17 = function8;
                            i41 = i39;
                            function18 = function15;
                            visualTransformation3 = none;
                            keyboardOptions4 = keyboardOptions3;
                            z15 = z13;
                            i42 = i37;
                            if (i32 != 0) {
                                function19 = null;
                            } else {
                                function19 = function6;
                            }
                            textFieldColors3 = textFieldColorsC;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z16 = z12;
                        }
                        composer3.endDefaults();
                        z17 = z16;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                        }
                        composer4 = composer3;
                        composer4.startReplaceGroup(1090927577);
                        jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                        if (jM6770getColor0d7_KjU != 16) {
                            z5 = z5;
                        } else {
                            i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                            }
                            stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                            if (z5 == 0) {
                                unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                            } else if (z17) {
                                unfocusedTextColor = textFieldColors3.getErrorTextColor();
                            } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                                unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                            } else {
                                unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                            }
                            State stateRememberUpdatedState7 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState7.getValue()).m4615unboximpl();
                        }
                        long j4 = jM6770getColor0d7_KjU;
                        composer4.endReplaceGroup();
                        final TextStyle textStyleMerge4 = textStyle4.merge(new TextStyle(j4, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                        if (z17) {
                            cursorColor = textFieldColors3.getErrorCursorColor();
                        } else {
                            cursorColor = textFieldColors3.getCursorColor();
                        }
                        final State stateRememberUpdatedState8 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                        ProvidedValue<TextSelectionColors> providedValueProvides4 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                        TextStyle textStyle8 = textStyle4;
                        final TextFieldColors textFieldColors7 = textFieldColors3;
                        final boolean z111 = z5;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides4, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                final boolean z112;
                                final VisualTransformation visualTransformation4;
                                Composer composer5 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                    Modifier modifier2 = modifier;
                                    final boolean z20 = z111;
                                    final boolean z21 = z17;
                                    final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                    final TextFieldColors textFieldColors8 = textFieldColors7;
                                    Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors8, null, 0.0f, 0.0f, 112, null);
                                    SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState8.getValue()).m4615unboximpl(), null);
                                    Function3 function3RememberComposableLambda = function19;
                                    TextFieldValue textFieldValue = value;
                                    VisualTransformation visualTransformation5 = visualTransformation3;
                                    boolean z22 = z15;
                                    if (function3RememberComposableLambda == null) {
                                        composer5.startReplaceGroup(1071062574);
                                        final String text = textFieldValue.getText();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                        }
                                        final Function2 function23 = function16;
                                        final Function2 function24 = function17;
                                        final Function2 function25 = function14;
                                        final Function2 function26 = function18;
                                        z112 = z22;
                                        visualTransformation4 = visualTransformation5;
                                        function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                                Composer composer6 = (Composer) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                Intrinsics.i(innerTextField, "innerTextField");
                                                if ((iIntValue2 & 6) == 0) {
                                                    iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                                }
                                                if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                    }
                                                    float f = 0;
                                                    TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z112, visualTransformation4, mutableInteractionSource5, z21, function23, function24, function25, function26, null, null, null, null, textFieldColors8, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer6.skipToGroupEnd();
                                                }
                                                return Unit.f17538a;
                                            }
                                        }, composer5, 54);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        z112 = z22;
                                        visualTransformation4 = visualTransformation5;
                                        composer5.startReplaceGroup(1071062047);
                                    }
                                    composer5.endReplaceGroup();
                                    BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge4, keyboardOptions4, keyboardActions4, z112, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer5.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            }
                        }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        Function2 function23 = function14;
                        visualTransformation2 = visualTransformation3;
                        function9 = function23;
                        mutableInteractionSource2 = mutableInteractionSource4;
                        composer2 = composer4;
                        function12 = function17;
                        z8 = z15;
                        keyboardActions2 = keyboardActions4;
                        textStyle3 = textStyle8;
                        z9 = z111;
                        z11 = z17;
                        textFieldColors2 = textFieldColors7;
                        z10 = z14;
                        i35 = i42;
                        function10 = function19;
                        function11 = function16;
                        function13 = function18;
                        keyboardOptions2 = keyboardOptions4;
                        shape2 = shape3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function9 = function4;
                        visualTransformation2 = visualTransformation;
                        keyboardActions2 = keyboardActions;
                        z8 = z4;
                        i35 = i;
                        mutableInteractionSource2 = mutableInteractionSource;
                        shape2 = shape;
                        textFieldColors2 = textFieldColors;
                        function10 = function6;
                        z9 = z5;
                        z10 = z6;
                        composer2 = composerStartRestartGroup;
                        textStyle3 = textStyle2;
                        function11 = function7;
                        function12 = function8;
                        function13 = function5;
                        z11 = z3;
                        keyboardOptions2 = keyboardOptions;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                                ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                                return Unit.f17538a;
                            }
                        });
                    }
                }
                i5 |= 805306368;
                i17 = i4 & 1024;
                if (i17 != 0) {
                    i18 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i18 = i3 | i19;
                } else {
                    i18 = i3;
                }
                i20 = i4 & 2048;
                if (i20 != 0) {
                    i18 |= 48;
                } else if ((i3 & 48) != 0) {
                    if (composerStartRestartGroup.changed(visualTransformation)) {
                        i21 = 32;
                    } else {
                        i21 = 16;
                    }
                    i18 |= i21;
                }
                i22 = i18;
                i23 = i4 & 4096;
                if (i23 != 0) {
                    i24 = i22;
                    if ((i3 & 384) == 0) {
                        if (composerStartRestartGroup.changed(keyboardOptions)) {
                            i25 = 256;
                        } else {
                            i25 = 128;
                        }
                        i24 |= i25;
                    }
                    if ((i3 & 3072) != 0) {
                        if ((i4 & 8192) == 0) {
                            i46 = 2048;
                        }
                        i24 |= i46;
                    }
                    i26 = i24;
                    i27 = i4 & 16384;
                    if (i27 != 0) {
                        i28 = i26;
                        if ((i3 & 24576) == 0) {
                            i28 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                        }
                        i29 = i4 & 32768;
                        if (i29 != 0) {
                            i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            if (composerStartRestartGroup.changed(i)) {
                                i30 = 131072;
                            } else {
                                i30 = 65536;
                            }
                            i28 |= i30;
                        }
                        i31 = i4 & 65536;
                        if (i31 != 0) {
                            i28 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                        }
                        if ((i3 & 100663296) != 0) {
                            if ((i4 & 262144) == 0) {
                                i13 = 67108864;
                            }
                            i28 |= i13;
                        }
                        i32 = i4 & 524288;
                        if (i32 != 0) {
                            i28 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                        }
                        i33 = i28;
                        i34 = i5;
                        if ((i5 & 306783379) == 306783378) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0) {
                                if (i45 != 0) {
                                    z5 = true;
                                }
                                if (i6 != 0) {
                                    z6 = false;
                                }
                                if ((i4 & 32) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i36 = i34 & (-458753);
                                } else {
                                    i36 = i34;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                }
                                if (i12 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function4;
                                }
                                if (i15 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function5;
                                }
                                if (i17 != 0) {
                                    z12 = false;
                                } else {
                                    z12 = z3;
                                }
                                if (i20 != 0) {
                                    none = VisualTransformation.INSTANCE.getNone();
                                } else {
                                    none = visualTransformation;
                                }
                                if (i23 != 0) {
                                    keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                                } else {
                                    keyboardOptions3 = keyboardOptions;
                                }
                                if ((i4 & 8192) != 0) {
                                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                    i33 &= -7169;
                                } else {
                                    keyboardActions3 = keyboardActions;
                                }
                                if (i27 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z4;
                                }
                                if (i29 != 0) {
                                    i37 = 1;
                                } else {
                                    i37 = i;
                                }
                                if (i31 != 0) {
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                }
                                i38 = i33;
                                if ((i4 & 131072) != 0) {
                                    shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                    i39 = i38 & (-29360129);
                                } else {
                                    i39 = i38;
                                    shapeM1074RoundedCornerShape0680j_4 = shape;
                                }
                                if ((i4 & 262144) != 0) {
                                    textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                    composer3 = composerStartRestartGroup;
                                    i39 &= -234881025;
                                } else {
                                    composer3 = composerStartRestartGroup;
                                    textFieldColorsC = textFieldColors;
                                }
                                shape3 = shapeM1074RoundedCornerShape0680j_4;
                                i40 = i36;
                                keyboardActions4 = keyboardActions3;
                                z14 = z6;
                                textStyle4 = textStyle2;
                                function16 = function7;
                                function17 = function8;
                                i41 = i39;
                                function18 = function15;
                                visualTransformation3 = none;
                                keyboardOptions4 = keyboardOptions3;
                                z15 = z13;
                                i42 = i37;
                                if (i32 != 0) {
                                    function19 = null;
                                } else {
                                    function19 = function6;
                                }
                                textFieldColors3 = textFieldColorsC;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                z16 = z12;
                            } else {
                                if (i45 != 0) {
                                    z5 = true;
                                }
                                if (i6 != 0) {
                                    z6 = false;
                                }
                                if ((i4 & 32) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i36 = i34 & (-458753);
                                } else {
                                    i36 = i34;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                }
                                if (i12 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function4;
                                }
                                if (i15 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function5;
                                }
                                if (i17 != 0) {
                                    z12 = false;
                                } else {
                                    z12 = z3;
                                }
                                if (i20 != 0) {
                                    none = VisualTransformation.INSTANCE.getNone();
                                } else {
                                    none = visualTransformation;
                                }
                                if (i23 != 0) {
                                    keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                                } else {
                                    keyboardOptions3 = keyboardOptions;
                                }
                                if ((i4 & 8192) != 0) {
                                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                    i33 &= -7169;
                                } else {
                                    keyboardActions3 = keyboardActions;
                                }
                                if (i27 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z4;
                                }
                                if (i29 != 0) {
                                    i37 = 1;
                                } else {
                                    i37 = i;
                                }
                                if (i31 != 0) {
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                }
                                i38 = i33;
                                if ((i4 & 131072) != 0) {
                                    shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                    i39 = i38 & (-29360129);
                                } else {
                                    i39 = i38;
                                    shapeM1074RoundedCornerShape0680j_4 = shape;
                                }
                                if ((i4 & 262144) != 0) {
                                    textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                    composer3 = composerStartRestartGroup;
                                    i39 &= -234881025;
                                } else {
                                    composer3 = composerStartRestartGroup;
                                    textFieldColorsC = textFieldColors;
                                }
                                shape3 = shapeM1074RoundedCornerShape0680j_4;
                                i40 = i36;
                                keyboardActions4 = keyboardActions3;
                                z14 = z6;
                                textStyle4 = textStyle2;
                                function16 = function7;
                                function17 = function8;
                                i41 = i39;
                                function18 = function15;
                                visualTransformation3 = none;
                                keyboardOptions4 = keyboardOptions3;
                                z15 = z13;
                                i42 = i37;
                                if (i32 != 0) {
                                    function19 = null;
                                } else {
                                    function19 = function6;
                                }
                                textFieldColors3 = textFieldColorsC;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                z16 = z12;
                            }
                            composer3.endDefaults();
                            z17 = z16;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                            }
                            composer4 = composer3;
                            composer4.startReplaceGroup(1090927577);
                            jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                            if (jM6770getColor0d7_KjU != 16) {
                                z5 = z5;
                            } else {
                                i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                                }
                                stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                                if (z5 == 0) {
                                    unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                                } else if (z17) {
                                    unfocusedTextColor = textFieldColors3.getErrorTextColor();
                                } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                                    unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                                } else {
                                    unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                                }
                                State stateRememberUpdatedState9 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState9.getValue()).m4615unboximpl();
                            }
                            long j5 = jM6770getColor0d7_KjU;
                            composer4.endReplaceGroup();
                            final TextStyle textStyleMerge5 = textStyle4.merge(new TextStyle(j5, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                            if (z17) {
                                cursorColor = textFieldColors3.getErrorCursorColor();
                            } else {
                                cursorColor = textFieldColors3.getCursorColor();
                            }
                            final State stateRememberUpdatedState10 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                            ProvidedValue<TextSelectionColors> providedValueProvides5 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                            TextStyle textStyle9 = textStyle4;
                            final TextFieldColors textFieldColors8 = textFieldColors3;
                            final boolean z112 = z5;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides5, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    final boolean z113;
                                    final VisualTransformation visualTransformation4;
                                    Composer composer5 = (Composer) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                        Modifier modifier2 = modifier;
                                        final boolean z20 = z112;
                                        final boolean z21 = z17;
                                        final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                        final TextFieldColors textFieldColors9 = textFieldColors8;
                                        Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors9, null, 0.0f, 0.0f, 112, null);
                                        SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState10.getValue()).m4615unboximpl(), null);
                                        Function3 function3RememberComposableLambda = function19;
                                        TextFieldValue textFieldValue = value;
                                        VisualTransformation visualTransformation5 = visualTransformation3;
                                        boolean z22 = z15;
                                        if (function3RememberComposableLambda == null) {
                                            composer5.startReplaceGroup(1071062574);
                                            final String text = textFieldValue.getText();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                            }
                                            final Function2 function24 = function16;
                                            final Function2 function25 = function17;
                                            final Function2 function26 = function14;
                                            final Function2 function27 = function18;
                                            z113 = z22;
                                            visualTransformation4 = visualTransformation5;
                                            function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                                    Composer composer6 = (Composer) obj4;
                                                    int iIntValue2 = ((Integer) obj5).intValue();
                                                    Intrinsics.i(innerTextField, "innerTextField");
                                                    if ((iIntValue2 & 6) == 0) {
                                                        iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                                    }
                                                    if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                        }
                                                        float f = 0;
                                                        TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z113, visualTransformation4, mutableInteractionSource5, z21, function24, function25, function26, function27, null, null, null, null, textFieldColors9, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer6.skipToGroupEnd();
                                                    }
                                                    return Unit.f17538a;
                                                }
                                            }, composer5, 54);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            z113 = z22;
                                            visualTransformation4 = visualTransformation5;
                                            composer5.startReplaceGroup(1071062047);
                                        }
                                        composer5.endReplaceGroup();
                                        BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge5, keyboardOptions4, keyboardActions4, z113, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer5.skipToGroupEnd();
                                    }
                                    return Unit.f17538a;
                                }
                            }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            Function2 function24 = function14;
                            visualTransformation2 = visualTransformation3;
                            function9 = function24;
                            mutableInteractionSource2 = mutableInteractionSource4;
                            composer2 = composer4;
                            function12 = function17;
                            z8 = z15;
                            keyboardActions2 = keyboardActions4;
                            textStyle3 = textStyle9;
                            z9 = z112;
                            z11 = z17;
                            textFieldColors2 = textFieldColors8;
                            z10 = z14;
                            i35 = i42;
                            function10 = function19;
                            function11 = function16;
                            function13 = function18;
                            keyboardOptions2 = keyboardOptions4;
                            shape2 = shape3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function9 = function4;
                            visualTransformation2 = visualTransformation;
                            keyboardActions2 = keyboardActions;
                            z8 = z4;
                            i35 = i;
                            mutableInteractionSource2 = mutableInteractionSource;
                            shape2 = shape;
                            textFieldColors2 = textFieldColors;
                            function10 = function6;
                            z9 = z5;
                            z10 = z6;
                            composer2 = composerStartRestartGroup;
                            textStyle3 = textStyle2;
                            function11 = function7;
                            function12 = function8;
                            function13 = function5;
                            z11 = z3;
                            keyboardOptions2 = keyboardOptions;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                                    ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                                    return Unit.f17538a;
                                }
                            });
                        }
                    }
                    i28 = i26 | 24576;
                    i29 = i4 & 32768;
                    if (i29 != 0) {
                        i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(i)) {
                            i30 = 131072;
                        } else {
                            i30 = 65536;
                        }
                        i28 |= i30;
                    }
                    i31 = i4 & 65536;
                    if (i31 != 0) {
                        i28 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                    }
                    if ((i3 & 100663296) != 0) {
                        if ((i4 & 262144) == 0) {
                            i13 = 67108864;
                        }
                        i28 |= i13;
                    }
                    i32 = i4 & 524288;
                    if (i32 != 0) {
                        i28 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                    }
                    i33 = i28;
                    i34 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i45 != 0) {
                                z5 = true;
                            }
                            if (i6 != 0) {
                                z6 = false;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i36 = i34 & (-458753);
                            } else {
                                i36 = i34;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            }
                            if (i12 != 0) {
                                function14 = null;
                            } else {
                                function14 = function4;
                            }
                            if (i15 != 0) {
                                function15 = null;
                            } else {
                                function15 = function5;
                            }
                            if (i17 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i20 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i23 != 0) {
                                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                            } else {
                                keyboardOptions3 = keyboardOptions;
                            }
                            if ((i4 & 8192) != 0) {
                                keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                i33 &= -7169;
                            } else {
                                keyboardActions3 = keyboardActions;
                            }
                            if (i27 != 0) {
                                z13 = true;
                            } else {
                                z13 = z4;
                            }
                            if (i29 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i;
                            }
                            if (i31 != 0) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            i38 = i33;
                            if ((i4 & 131072) != 0) {
                                shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                i39 = i38 & (-29360129);
                            } else {
                                i39 = i38;
                                shapeM1074RoundedCornerShape0680j_4 = shape;
                            }
                            if ((i4 & 262144) != 0) {
                                textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                composer3 = composerStartRestartGroup;
                                i39 &= -234881025;
                            } else {
                                composer3 = composerStartRestartGroup;
                                textFieldColorsC = textFieldColors;
                            }
                            shape3 = shapeM1074RoundedCornerShape0680j_4;
                            i40 = i36;
                            keyboardActions4 = keyboardActions3;
                            z14 = z6;
                            textStyle4 = textStyle2;
                            function16 = function7;
                            function17 = function8;
                            i41 = i39;
                            function18 = function15;
                            visualTransformation3 = none;
                            keyboardOptions4 = keyboardOptions3;
                            z15 = z13;
                            i42 = i37;
                            if (i32 != 0) {
                                function19 = null;
                            } else {
                                function19 = function6;
                            }
                            textFieldColors3 = textFieldColorsC;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z16 = z12;
                        } else {
                            if (i45 != 0) {
                                z5 = true;
                            }
                            if (i6 != 0) {
                                z6 = false;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i36 = i34 & (-458753);
                            } else {
                                i36 = i34;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            }
                            if (i12 != 0) {
                                function14 = null;
                            } else {
                                function14 = function4;
                            }
                            if (i15 != 0) {
                                function15 = null;
                            } else {
                                function15 = function5;
                            }
                            if (i17 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i20 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i23 != 0) {
                                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                            } else {
                                keyboardOptions3 = keyboardOptions;
                            }
                            if ((i4 & 8192) != 0) {
                                keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                i33 &= -7169;
                            } else {
                                keyboardActions3 = keyboardActions;
                            }
                            if (i27 != 0) {
                                z13 = true;
                            } else {
                                z13 = z4;
                            }
                            if (i29 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i;
                            }
                            if (i31 != 0) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            i38 = i33;
                            if ((i4 & 131072) != 0) {
                                shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                i39 = i38 & (-29360129);
                            } else {
                                i39 = i38;
                                shapeM1074RoundedCornerShape0680j_4 = shape;
                            }
                            if ((i4 & 262144) != 0) {
                                textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                composer3 = composerStartRestartGroup;
                                i39 &= -234881025;
                            } else {
                                composer3 = composerStartRestartGroup;
                                textFieldColorsC = textFieldColors;
                            }
                            shape3 = shapeM1074RoundedCornerShape0680j_4;
                            i40 = i36;
                            keyboardActions4 = keyboardActions3;
                            z14 = z6;
                            textStyle4 = textStyle2;
                            function16 = function7;
                            function17 = function8;
                            i41 = i39;
                            function18 = function15;
                            visualTransformation3 = none;
                            keyboardOptions4 = keyboardOptions3;
                            z15 = z13;
                            i42 = i37;
                            if (i32 != 0) {
                                function19 = null;
                            } else {
                                function19 = function6;
                            }
                            textFieldColors3 = textFieldColorsC;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z16 = z12;
                        }
                        composer3.endDefaults();
                        z17 = z16;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                        }
                        composer4 = composer3;
                        composer4.startReplaceGroup(1090927577);
                        jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                        if (jM6770getColor0d7_KjU != 16) {
                            z5 = z5;
                        } else {
                            i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                            }
                            stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                            if (z5 == 0) {
                                unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                            } else if (z17) {
                                unfocusedTextColor = textFieldColors3.getErrorTextColor();
                            } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                                unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                            } else {
                                unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                            }
                            State stateRememberUpdatedState11 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState11.getValue()).m4615unboximpl();
                        }
                        long j6 = jM6770getColor0d7_KjU;
                        composer4.endReplaceGroup();
                        final TextStyle textStyleMerge6 = textStyle4.merge(new TextStyle(j6, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                        if (z17) {
                            cursorColor = textFieldColors3.getErrorCursorColor();
                        } else {
                            cursorColor = textFieldColors3.getCursorColor();
                        }
                        final State stateRememberUpdatedState12 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                        ProvidedValue<TextSelectionColors> providedValueProvides6 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                        TextStyle textStyle10 = textStyle4;
                        final TextFieldColors textFieldColors9 = textFieldColors3;
                        final boolean z113 = z5;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides6, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                final boolean z114;
                                final VisualTransformation visualTransformation4;
                                Composer composer5 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                    Modifier modifier2 = modifier;
                                    final boolean z20 = z113;
                                    final boolean z21 = z17;
                                    final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                    final TextFieldColors textFieldColors10 = textFieldColors9;
                                    Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors10, null, 0.0f, 0.0f, 112, null);
                                    SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState12.getValue()).m4615unboximpl(), null);
                                    Function3 function3RememberComposableLambda = function19;
                                    TextFieldValue textFieldValue = value;
                                    VisualTransformation visualTransformation5 = visualTransformation3;
                                    boolean z22 = z15;
                                    if (function3RememberComposableLambda == null) {
                                        composer5.startReplaceGroup(1071062574);
                                        final String text = textFieldValue.getText();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                        }
                                        final Function2 function25 = function16;
                                        final Function2 function26 = function17;
                                        final Function2 function27 = function14;
                                        final Function2 function28 = function18;
                                        z114 = z22;
                                        visualTransformation4 = visualTransformation5;
                                        function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                                Composer composer6 = (Composer) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                Intrinsics.i(innerTextField, "innerTextField");
                                                if ((iIntValue2 & 6) == 0) {
                                                    iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                                }
                                                if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                    }
                                                    float f = 0;
                                                    TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z114, visualTransformation4, mutableInteractionSource5, z21, function25, function26, function27, function28, null, null, null, null, textFieldColors10, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer6.skipToGroupEnd();
                                                }
                                                return Unit.f17538a;
                                            }
                                        }, composer5, 54);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        z114 = z22;
                                        visualTransformation4 = visualTransformation5;
                                        composer5.startReplaceGroup(1071062047);
                                    }
                                    composer5.endReplaceGroup();
                                    BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge6, keyboardOptions4, keyboardActions4, z114, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer5.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            }
                        }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        Function2 function25 = function14;
                        visualTransformation2 = visualTransformation3;
                        function9 = function25;
                        mutableInteractionSource2 = mutableInteractionSource4;
                        composer2 = composer4;
                        function12 = function17;
                        z8 = z15;
                        keyboardActions2 = keyboardActions4;
                        textStyle3 = textStyle10;
                        z9 = z113;
                        z11 = z17;
                        textFieldColors2 = textFieldColors9;
                        z10 = z14;
                        i35 = i42;
                        function10 = function19;
                        function11 = function16;
                        function13 = function18;
                        keyboardOptions2 = keyboardOptions4;
                        shape2 = shape3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function9 = function4;
                        visualTransformation2 = visualTransformation;
                        keyboardActions2 = keyboardActions;
                        z8 = z4;
                        i35 = i;
                        mutableInteractionSource2 = mutableInteractionSource;
                        shape2 = shape;
                        textFieldColors2 = textFieldColors;
                        function10 = function6;
                        z9 = z5;
                        z10 = z6;
                        composer2 = composerStartRestartGroup;
                        textStyle3 = textStyle2;
                        function11 = function7;
                        function12 = function8;
                        function13 = function5;
                        z11 = z3;
                        keyboardOptions2 = keyboardOptions;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                                ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                                return Unit.f17538a;
                            }
                        });
                    }
                }
                i24 = i22 | 384;
                if ((i3 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i46 = 2048;
                    }
                    i24 |= i46;
                }
                i26 = i24;
                i27 = i4 & 16384;
                if (i27 != 0) {
                    i28 = i26;
                    if ((i3 & 24576) == 0) {
                        i28 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                    }
                    i29 = i4 & 32768;
                    if (i29 != 0) {
                        i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(i)) {
                            i30 = 131072;
                        } else {
                            i30 = 65536;
                        }
                        i28 |= i30;
                    }
                    i31 = i4 & 65536;
                    if (i31 != 0) {
                        i28 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                    }
                    if ((i3 & 100663296) != 0) {
                        if ((i4 & 262144) == 0) {
                            i13 = 67108864;
                        }
                        i28 |= i13;
                    }
                    i32 = i4 & 524288;
                    if (i32 != 0) {
                        i28 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                    }
                    i33 = i28;
                    i34 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i45 != 0) {
                                z5 = true;
                            }
                            if (i6 != 0) {
                                z6 = false;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i36 = i34 & (-458753);
                            } else {
                                i36 = i34;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            }
                            if (i12 != 0) {
                                function14 = null;
                            } else {
                                function14 = function4;
                            }
                            if (i15 != 0) {
                                function15 = null;
                            } else {
                                function15 = function5;
                            }
                            if (i17 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i20 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i23 != 0) {
                                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                            } else {
                                keyboardOptions3 = keyboardOptions;
                            }
                            if ((i4 & 8192) != 0) {
                                keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                i33 &= -7169;
                            } else {
                                keyboardActions3 = keyboardActions;
                            }
                            if (i27 != 0) {
                                z13 = true;
                            } else {
                                z13 = z4;
                            }
                            if (i29 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i;
                            }
                            if (i31 != 0) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            i38 = i33;
                            if ((i4 & 131072) != 0) {
                                shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                i39 = i38 & (-29360129);
                            } else {
                                i39 = i38;
                                shapeM1074RoundedCornerShape0680j_4 = shape;
                            }
                            if ((i4 & 262144) != 0) {
                                textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                composer3 = composerStartRestartGroup;
                                i39 &= -234881025;
                            } else {
                                composer3 = composerStartRestartGroup;
                                textFieldColorsC = textFieldColors;
                            }
                            shape3 = shapeM1074RoundedCornerShape0680j_4;
                            i40 = i36;
                            keyboardActions4 = keyboardActions3;
                            z14 = z6;
                            textStyle4 = textStyle2;
                            function16 = function7;
                            function17 = function8;
                            i41 = i39;
                            function18 = function15;
                            visualTransformation3 = none;
                            keyboardOptions4 = keyboardOptions3;
                            z15 = z13;
                            i42 = i37;
                            if (i32 != 0) {
                                function19 = null;
                            } else {
                                function19 = function6;
                            }
                            textFieldColors3 = textFieldColorsC;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z16 = z12;
                        } else {
                            if (i45 != 0) {
                                z5 = true;
                            }
                            if (i6 != 0) {
                                z6 = false;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i36 = i34 & (-458753);
                            } else {
                                i36 = i34;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            }
                            if (i12 != 0) {
                                function14 = null;
                            } else {
                                function14 = function4;
                            }
                            if (i15 != 0) {
                                function15 = null;
                            } else {
                                function15 = function5;
                            }
                            if (i17 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i20 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i23 != 0) {
                                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                            } else {
                                keyboardOptions3 = keyboardOptions;
                            }
                            if ((i4 & 8192) != 0) {
                                keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                i33 &= -7169;
                            } else {
                                keyboardActions3 = keyboardActions;
                            }
                            if (i27 != 0) {
                                z13 = true;
                            } else {
                                z13 = z4;
                            }
                            if (i29 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i;
                            }
                            if (i31 != 0) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            i38 = i33;
                            if ((i4 & 131072) != 0) {
                                shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                i39 = i38 & (-29360129);
                            } else {
                                i39 = i38;
                                shapeM1074RoundedCornerShape0680j_4 = shape;
                            }
                            if ((i4 & 262144) != 0) {
                                textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                composer3 = composerStartRestartGroup;
                                i39 &= -234881025;
                            } else {
                                composer3 = composerStartRestartGroup;
                                textFieldColorsC = textFieldColors;
                            }
                            shape3 = shapeM1074RoundedCornerShape0680j_4;
                            i40 = i36;
                            keyboardActions4 = keyboardActions3;
                            z14 = z6;
                            textStyle4 = textStyle2;
                            function16 = function7;
                            function17 = function8;
                            i41 = i39;
                            function18 = function15;
                            visualTransformation3 = none;
                            keyboardOptions4 = keyboardOptions3;
                            z15 = z13;
                            i42 = i37;
                            if (i32 != 0) {
                                function19 = null;
                            } else {
                                function19 = function6;
                            }
                            textFieldColors3 = textFieldColorsC;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z16 = z12;
                        }
                        composer3.endDefaults();
                        z17 = z16;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                        }
                        composer4 = composer3;
                        composer4.startReplaceGroup(1090927577);
                        jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                        if (jM6770getColor0d7_KjU != 16) {
                            z5 = z5;
                        } else {
                            i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                            }
                            stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                            if (z5 == 0) {
                                unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                            } else if (z17) {
                                unfocusedTextColor = textFieldColors3.getErrorTextColor();
                            } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                                unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                            } else {
                                unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                            }
                            State stateRememberUpdatedState13 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState13.getValue()).m4615unboximpl();
                        }
                        long j7 = jM6770getColor0d7_KjU;
                        composer4.endReplaceGroup();
                        final TextStyle textStyleMerge7 = textStyle4.merge(new TextStyle(j7, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                        if (z17) {
                            cursorColor = textFieldColors3.getErrorCursorColor();
                        } else {
                            cursorColor = textFieldColors3.getCursorColor();
                        }
                        final State stateRememberUpdatedState14 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                        ProvidedValue<TextSelectionColors> providedValueProvides7 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                        TextStyle textStyle11 = textStyle4;
                        final TextFieldColors textFieldColors10 = textFieldColors3;
                        final boolean z114 = z5;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides7, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                final boolean z115;
                                final VisualTransformation visualTransformation4;
                                Composer composer5 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                    Modifier modifier2 = modifier;
                                    final boolean z20 = z114;
                                    final boolean z21 = z17;
                                    final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                    final TextFieldColors textFieldColors11 = textFieldColors10;
                                    Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors11, null, 0.0f, 0.0f, 112, null);
                                    SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState14.getValue()).m4615unboximpl(), null);
                                    Function3 function3RememberComposableLambda = function19;
                                    TextFieldValue textFieldValue = value;
                                    VisualTransformation visualTransformation5 = visualTransformation3;
                                    boolean z22 = z15;
                                    if (function3RememberComposableLambda == null) {
                                        composer5.startReplaceGroup(1071062574);
                                        final String text = textFieldValue.getText();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                        }
                                        final Function2 function26 = function16;
                                        final Function2 function27 = function17;
                                        final Function2 function28 = function14;
                                        final Function2 function29 = function18;
                                        z115 = z22;
                                        visualTransformation4 = visualTransformation5;
                                        function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                                Composer composer6 = (Composer) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                Intrinsics.i(innerTextField, "innerTextField");
                                                if ((iIntValue2 & 6) == 0) {
                                                    iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                                }
                                                if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                    }
                                                    float f = 0;
                                                    TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z115, visualTransformation4, mutableInteractionSource5, z21, function26, function27, function28, function29, null, null, null, null, textFieldColors11, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer6.skipToGroupEnd();
                                                }
                                                return Unit.f17538a;
                                            }
                                        }, composer5, 54);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        z115 = z22;
                                        visualTransformation4 = visualTransformation5;
                                        composer5.startReplaceGroup(1071062047);
                                    }
                                    composer5.endReplaceGroup();
                                    BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge7, keyboardOptions4, keyboardActions4, z115, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer5.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            }
                        }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        Function2 function26 = function14;
                        visualTransformation2 = visualTransformation3;
                        function9 = function26;
                        mutableInteractionSource2 = mutableInteractionSource4;
                        composer2 = composer4;
                        function12 = function17;
                        z8 = z15;
                        keyboardActions2 = keyboardActions4;
                        textStyle3 = textStyle11;
                        z9 = z114;
                        z11 = z17;
                        textFieldColors2 = textFieldColors10;
                        z10 = z14;
                        i35 = i42;
                        function10 = function19;
                        function11 = function16;
                        function13 = function18;
                        keyboardOptions2 = keyboardOptions4;
                        shape2 = shape3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function9 = function4;
                        visualTransformation2 = visualTransformation;
                        keyboardActions2 = keyboardActions;
                        z8 = z4;
                        i35 = i;
                        mutableInteractionSource2 = mutableInteractionSource;
                        shape2 = shape;
                        textFieldColors2 = textFieldColors;
                        function10 = function6;
                        z9 = z5;
                        z10 = z6;
                        composer2 = composerStartRestartGroup;
                        textStyle3 = textStyle2;
                        function11 = function7;
                        function12 = function8;
                        function13 = function5;
                        z11 = z3;
                        keyboardOptions2 = keyboardOptions;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                                ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                                return Unit.f17538a;
                            }
                        });
                    }
                }
                i28 = i26 | 24576;
                i29 = i4 & 32768;
                if (i29 != 0) {
                    i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i30 = 131072;
                    } else {
                        i30 = 65536;
                    }
                    i28 |= i30;
                }
                i31 = i4 & 65536;
                if (i31 != 0) {
                    i28 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                if ((i3 & 100663296) != 0) {
                    if ((i4 & 262144) == 0) {
                        i13 = 67108864;
                    }
                    i28 |= i13;
                }
                i32 = i4 & 524288;
                if (i32 != 0) {
                    i28 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                }
                i33 = i28;
                i34 = i5;
                if ((i5 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i45 != 0) {
                            z5 = true;
                        }
                        if (i6 != 0) {
                            z6 = false;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i36 = i34 & (-458753);
                        } else {
                            i36 = i34;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        }
                        if (i12 != 0) {
                            function14 = null;
                        } else {
                            function14 = function4;
                        }
                        if (i15 != 0) {
                            function15 = null;
                        } else {
                            function15 = function5;
                        }
                        if (i17 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i20 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i23 != 0) {
                            keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        if ((i4 & 8192) != 0) {
                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i33 &= -7169;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i27 != 0) {
                            z13 = true;
                        } else {
                            z13 = z4;
                        }
                        if (i29 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i;
                        }
                        if (i31 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        i38 = i33;
                        if ((i4 & 131072) != 0) {
                            shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                            i39 = i38 & (-29360129);
                        } else {
                            i39 = i38;
                            shapeM1074RoundedCornerShape0680j_4 = shape;
                        }
                        if ((i4 & 262144) != 0) {
                            textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                            composer3 = composerStartRestartGroup;
                            i39 &= -234881025;
                        } else {
                            composer3 = composerStartRestartGroup;
                            textFieldColorsC = textFieldColors;
                        }
                        shape3 = shapeM1074RoundedCornerShape0680j_4;
                        i40 = i36;
                        keyboardActions4 = keyboardActions3;
                        z14 = z6;
                        textStyle4 = textStyle2;
                        function16 = function7;
                        function17 = function8;
                        i41 = i39;
                        function18 = function15;
                        visualTransformation3 = none;
                        keyboardOptions4 = keyboardOptions3;
                        z15 = z13;
                        i42 = i37;
                        if (i32 != 0) {
                            function19 = null;
                        } else {
                            function19 = function6;
                        }
                        textFieldColors3 = textFieldColorsC;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z16 = z12;
                    } else {
                        if (i45 != 0) {
                            z5 = true;
                        }
                        if (i6 != 0) {
                            z6 = false;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i36 = i34 & (-458753);
                        } else {
                            i36 = i34;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        }
                        if (i12 != 0) {
                            function14 = null;
                        } else {
                            function14 = function4;
                        }
                        if (i15 != 0) {
                            function15 = null;
                        } else {
                            function15 = function5;
                        }
                        if (i17 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i20 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i23 != 0) {
                            keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        if ((i4 & 8192) != 0) {
                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i33 &= -7169;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i27 != 0) {
                            z13 = true;
                        } else {
                            z13 = z4;
                        }
                        if (i29 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i;
                        }
                        if (i31 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        i38 = i33;
                        if ((i4 & 131072) != 0) {
                            shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                            i39 = i38 & (-29360129);
                        } else {
                            i39 = i38;
                            shapeM1074RoundedCornerShape0680j_4 = shape;
                        }
                        if ((i4 & 262144) != 0) {
                            textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                            composer3 = composerStartRestartGroup;
                            i39 &= -234881025;
                        } else {
                            composer3 = composerStartRestartGroup;
                            textFieldColorsC = textFieldColors;
                        }
                        shape3 = shapeM1074RoundedCornerShape0680j_4;
                        i40 = i36;
                        keyboardActions4 = keyboardActions3;
                        z14 = z6;
                        textStyle4 = textStyle2;
                        function16 = function7;
                        function17 = function8;
                        i41 = i39;
                        function18 = function15;
                        visualTransformation3 = none;
                        keyboardOptions4 = keyboardOptions3;
                        z15 = z13;
                        i42 = i37;
                        if (i32 != 0) {
                            function19 = null;
                        } else {
                            function19 = function6;
                        }
                        textFieldColors3 = textFieldColorsC;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z16 = z12;
                    }
                    composer3.endDefaults();
                    z17 = z16;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                    }
                    composer4 = composer3;
                    composer4.startReplaceGroup(1090927577);
                    jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                    if (jM6770getColor0d7_KjU != 16) {
                        z5 = z5;
                    } else {
                        i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                        }
                        stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                        if (z5 == 0) {
                            unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                        } else if (z17) {
                            unfocusedTextColor = textFieldColors3.getErrorTextColor();
                        } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                            unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                        } else {
                            unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                        }
                        State stateRememberUpdatedState15 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState15.getValue()).m4615unboximpl();
                    }
                    long j8 = jM6770getColor0d7_KjU;
                    composer4.endReplaceGroup();
                    final TextStyle textStyleMerge8 = textStyle4.merge(new TextStyle(j8, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                    if (z17) {
                        cursorColor = textFieldColors3.getErrorCursorColor();
                    } else {
                        cursorColor = textFieldColors3.getCursorColor();
                    }
                    final State stateRememberUpdatedState16 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                    ProvidedValue<TextSelectionColors> providedValueProvides8 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                    TextStyle textStyle12 = textStyle4;
                    final TextFieldColors textFieldColors11 = textFieldColors3;
                    final boolean z115 = z5;
                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides8, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            final boolean z116;
                            final VisualTransformation visualTransformation4;
                            Composer composer5 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                Modifier modifier2 = modifier;
                                final boolean z20 = z115;
                                final boolean z21 = z17;
                                final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                final TextFieldColors textFieldColors12 = textFieldColors11;
                                Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors12, null, 0.0f, 0.0f, 112, null);
                                SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState16.getValue()).m4615unboximpl(), null);
                                Function3 function3RememberComposableLambda = function19;
                                TextFieldValue textFieldValue = value;
                                VisualTransformation visualTransformation5 = visualTransformation3;
                                boolean z22 = z15;
                                if (function3RememberComposableLambda == null) {
                                    composer5.startReplaceGroup(1071062574);
                                    final String text = textFieldValue.getText();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                    }
                                    final Function2 function27 = function16;
                                    final Function2 function28 = function17;
                                    final Function2 function29 = function14;
                                    final Function2 function210 = function18;
                                    z116 = z22;
                                    visualTransformation4 = visualTransformation5;
                                    function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                            Composer composer6 = (Composer) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            Intrinsics.i(innerTextField, "innerTextField");
                                            if ((iIntValue2 & 6) == 0) {
                                                iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                            }
                                            if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                }
                                                float f = 0;
                                                TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z116, visualTransformation4, mutableInteractionSource5, z21, function27, function28, function29, function210, null, null, null, null, textFieldColors12, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer6.skipToGroupEnd();
                                            }
                                            return Unit.f17538a;
                                        }
                                    }, composer5, 54);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    z116 = z22;
                                    visualTransformation4 = visualTransformation5;
                                    composer5.startReplaceGroup(1071062047);
                                }
                                composer5.endReplaceGroup();
                                BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge8, keyboardOptions4, keyboardActions4, z116, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer5.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Function2 function27 = function14;
                    visualTransformation2 = visualTransformation3;
                    function9 = function27;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    composer2 = composer4;
                    function12 = function17;
                    z8 = z15;
                    keyboardActions2 = keyboardActions4;
                    textStyle3 = textStyle12;
                    z9 = z115;
                    z11 = z17;
                    textFieldColors2 = textFieldColors11;
                    z10 = z14;
                    i35 = i42;
                    function10 = function19;
                    function11 = function16;
                    function13 = function18;
                    keyboardOptions2 = keyboardOptions4;
                    shape2 = shape3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function9 = function4;
                    visualTransformation2 = visualTransformation;
                    keyboardActions2 = keyboardActions;
                    z8 = z4;
                    i35 = i;
                    mutableInteractionSource2 = mutableInteractionSource;
                    shape2 = shape;
                    textFieldColors2 = textFieldColors;
                    function10 = function6;
                    z9 = z5;
                    z10 = z6;
                    composer2 = composerStartRestartGroup;
                    textStyle3 = textStyle2;
                    function11 = function7;
                    function12 = function8;
                    function13 = function5;
                    z11 = z3;
                    keyboardOptions2 = keyboardOptions;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                            ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i5 |= 24576;
            z6 = z2;
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                textStyle2 = textStyle;
                if ((i4 & 32) == 0) {
                    i44 = 65536;
                } else {
                    i44 = 65536;
                }
                i5 |= i44;
            } else {
                textStyle2 = textStyle;
            }
            i8 = i4 & 64;
            if (i8 != 0) {
                i5 |= 1572864;
                function7 = function2;
            } else {
                function7 = function2;
                if ((i2 & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i5 |= i9;
                }
            }
            i10 = i4 & 128;
            if (i10 != 0) {
                i5 |= 12582912;
                function8 = function3;
            } else {
                function8 = function3;
                if ((i2 & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function8)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i5 |= i11;
                }
            }
            i12 = i4 & 256;
            i13 = 33554432;
            if (i12 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i5 |= i14;
            }
            i15 = i4 & 512;
            if (i15 != 0) {
                if ((i2 & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i5 |= i16;
                }
                i17 = i4 & 1024;
                if (i17 != 0) {
                    i18 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i18 = i3 | i19;
                } else {
                    i18 = i3;
                }
                i20 = i4 & 2048;
                if (i20 != 0) {
                    i18 |= 48;
                } else if ((i3 & 48) != 0) {
                    if (composerStartRestartGroup.changed(visualTransformation)) {
                        i21 = 32;
                    } else {
                        i21 = 16;
                    }
                    i18 |= i21;
                }
                i22 = i18;
                i23 = i4 & 4096;
                if (i23 != 0) {
                    i24 = i22;
                    if ((i3 & 384) == 0) {
                        if (composerStartRestartGroup.changed(keyboardOptions)) {
                            i25 = 256;
                        } else {
                            i25 = 128;
                        }
                        i24 |= i25;
                    }
                    if ((i3 & 3072) != 0) {
                        if ((i4 & 8192) == 0) {
                            i46 = 2048;
                        }
                        i24 |= i46;
                    }
                    i26 = i24;
                    i27 = i4 & 16384;
                    if (i27 != 0) {
                        i28 = i26;
                        if ((i3 & 24576) == 0) {
                            i28 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                        }
                        i29 = i4 & 32768;
                        if (i29 != 0) {
                            i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            if (composerStartRestartGroup.changed(i)) {
                                i30 = 131072;
                            } else {
                                i30 = 65536;
                            }
                            i28 |= i30;
                        }
                        i31 = i4 & 65536;
                        if (i31 != 0) {
                            i28 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                        }
                        if ((i3 & 100663296) != 0) {
                            if ((i4 & 262144) == 0) {
                                i13 = 67108864;
                            }
                            i28 |= i13;
                        }
                        i32 = i4 & 524288;
                        if (i32 != 0) {
                            i28 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                        }
                        i33 = i28;
                        i34 = i5;
                        if ((i5 & 306783379) == 306783378) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0) {
                                if (i45 != 0) {
                                    z5 = true;
                                }
                                if (i6 != 0) {
                                    z6 = false;
                                }
                                if ((i4 & 32) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i36 = i34 & (-458753);
                                } else {
                                    i36 = i34;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                }
                                if (i12 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function4;
                                }
                                if (i15 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function5;
                                }
                                if (i17 != 0) {
                                    z12 = false;
                                } else {
                                    z12 = z3;
                                }
                                if (i20 != 0) {
                                    none = VisualTransformation.INSTANCE.getNone();
                                } else {
                                    none = visualTransformation;
                                }
                                if (i23 != 0) {
                                    keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                                } else {
                                    keyboardOptions3 = keyboardOptions;
                                }
                                if ((i4 & 8192) != 0) {
                                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                    i33 &= -7169;
                                } else {
                                    keyboardActions3 = keyboardActions;
                                }
                                if (i27 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z4;
                                }
                                if (i29 != 0) {
                                    i37 = 1;
                                } else {
                                    i37 = i;
                                }
                                if (i31 != 0) {
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                }
                                i38 = i33;
                                if ((i4 & 131072) != 0) {
                                    shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                    i39 = i38 & (-29360129);
                                } else {
                                    i39 = i38;
                                    shapeM1074RoundedCornerShape0680j_4 = shape;
                                }
                                if ((i4 & 262144) != 0) {
                                    textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                    composer3 = composerStartRestartGroup;
                                    i39 &= -234881025;
                                } else {
                                    composer3 = composerStartRestartGroup;
                                    textFieldColorsC = textFieldColors;
                                }
                                shape3 = shapeM1074RoundedCornerShape0680j_4;
                                i40 = i36;
                                keyboardActions4 = keyboardActions3;
                                z14 = z6;
                                textStyle4 = textStyle2;
                                function16 = function7;
                                function17 = function8;
                                i41 = i39;
                                function18 = function15;
                                visualTransformation3 = none;
                                keyboardOptions4 = keyboardOptions3;
                                z15 = z13;
                                i42 = i37;
                                if (i32 != 0) {
                                    function19 = null;
                                } else {
                                    function19 = function6;
                                }
                                textFieldColors3 = textFieldColorsC;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                z16 = z12;
                            } else {
                                if (i45 != 0) {
                                    z5 = true;
                                }
                                if (i6 != 0) {
                                    z6 = false;
                                }
                                if ((i4 & 32) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i36 = i34 & (-458753);
                                } else {
                                    i36 = i34;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                }
                                if (i12 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function4;
                                }
                                if (i15 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function5;
                                }
                                if (i17 != 0) {
                                    z12 = false;
                                } else {
                                    z12 = z3;
                                }
                                if (i20 != 0) {
                                    none = VisualTransformation.INSTANCE.getNone();
                                } else {
                                    none = visualTransformation;
                                }
                                if (i23 != 0) {
                                    keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                                } else {
                                    keyboardOptions3 = keyboardOptions;
                                }
                                if ((i4 & 8192) != 0) {
                                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                    i33 &= -7169;
                                } else {
                                    keyboardActions3 = keyboardActions;
                                }
                                if (i27 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z4;
                                }
                                if (i29 != 0) {
                                    i37 = 1;
                                } else {
                                    i37 = i;
                                }
                                if (i31 != 0) {
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                }
                                i38 = i33;
                                if ((i4 & 131072) != 0) {
                                    shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                    i39 = i38 & (-29360129);
                                } else {
                                    i39 = i38;
                                    shapeM1074RoundedCornerShape0680j_4 = shape;
                                }
                                if ((i4 & 262144) != 0) {
                                    textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                    composer3 = composerStartRestartGroup;
                                    i39 &= -234881025;
                                } else {
                                    composer3 = composerStartRestartGroup;
                                    textFieldColorsC = textFieldColors;
                                }
                                shape3 = shapeM1074RoundedCornerShape0680j_4;
                                i40 = i36;
                                keyboardActions4 = keyboardActions3;
                                z14 = z6;
                                textStyle4 = textStyle2;
                                function16 = function7;
                                function17 = function8;
                                i41 = i39;
                                function18 = function15;
                                visualTransformation3 = none;
                                keyboardOptions4 = keyboardOptions3;
                                z15 = z13;
                                i42 = i37;
                                if (i32 != 0) {
                                    function19 = null;
                                } else {
                                    function19 = function6;
                                }
                                textFieldColors3 = textFieldColorsC;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                z16 = z12;
                            }
                            composer3.endDefaults();
                            z17 = z16;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                            }
                            composer4 = composer3;
                            composer4.startReplaceGroup(1090927577);
                            jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                            if (jM6770getColor0d7_KjU != 16) {
                                z5 = z5;
                            } else {
                                i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                                }
                                stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                                if (z5 == 0) {
                                    unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                                } else if (z17) {
                                    unfocusedTextColor = textFieldColors3.getErrorTextColor();
                                } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                                    unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                                } else {
                                    unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                                }
                                State stateRememberUpdatedState17 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState17.getValue()).m4615unboximpl();
                            }
                            long j9 = jM6770getColor0d7_KjU;
                            composer4.endReplaceGroup();
                            final TextStyle textStyleMerge9 = textStyle4.merge(new TextStyle(j9, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                            if (z17) {
                                cursorColor = textFieldColors3.getErrorCursorColor();
                            } else {
                                cursorColor = textFieldColors3.getCursorColor();
                            }
                            final State stateRememberUpdatedState18 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                            ProvidedValue<TextSelectionColors> providedValueProvides9 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                            TextStyle textStyle13 = textStyle4;
                            final TextFieldColors textFieldColors12 = textFieldColors3;
                            final boolean z116 = z5;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides9, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    final boolean z117;
                                    final VisualTransformation visualTransformation4;
                                    Composer composer5 = (Composer) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                        Modifier modifier2 = modifier;
                                        final boolean z20 = z116;
                                        final boolean z21 = z17;
                                        final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                        final TextFieldColors textFieldColors13 = textFieldColors12;
                                        Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors13, null, 0.0f, 0.0f, 112, null);
                                        SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState18.getValue()).m4615unboximpl(), null);
                                        Function3 function3RememberComposableLambda = function19;
                                        TextFieldValue textFieldValue = value;
                                        VisualTransformation visualTransformation5 = visualTransformation3;
                                        boolean z22 = z15;
                                        if (function3RememberComposableLambda == null) {
                                            composer5.startReplaceGroup(1071062574);
                                            final String text = textFieldValue.getText();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                            }
                                            final Function2 function28 = function16;
                                            final Function2 function29 = function17;
                                            final Function2 function210 = function14;
                                            final Function2 function211 = function18;
                                            z117 = z22;
                                            visualTransformation4 = visualTransformation5;
                                            function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                                    Composer composer6 = (Composer) obj4;
                                                    int iIntValue2 = ((Integer) obj5).intValue();
                                                    Intrinsics.i(innerTextField, "innerTextField");
                                                    if ((iIntValue2 & 6) == 0) {
                                                        iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                                    }
                                                    if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                        }
                                                        float f = 0;
                                                        TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z117, visualTransformation4, mutableInteractionSource5, z21, function28, function29, function210, function211, null, null, null, null, textFieldColors13, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer6.skipToGroupEnd();
                                                    }
                                                    return Unit.f17538a;
                                                }
                                            }, composer5, 54);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            z117 = z22;
                                            visualTransformation4 = visualTransformation5;
                                            composer5.startReplaceGroup(1071062047);
                                        }
                                        composer5.endReplaceGroup();
                                        BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge9, keyboardOptions4, keyboardActions4, z117, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer5.skipToGroupEnd();
                                    }
                                    return Unit.f17538a;
                                }
                            }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            Function2 function28 = function14;
                            visualTransformation2 = visualTransformation3;
                            function9 = function28;
                            mutableInteractionSource2 = mutableInteractionSource4;
                            composer2 = composer4;
                            function12 = function17;
                            z8 = z15;
                            keyboardActions2 = keyboardActions4;
                            textStyle3 = textStyle13;
                            z9 = z116;
                            z11 = z17;
                            textFieldColors2 = textFieldColors12;
                            z10 = z14;
                            i35 = i42;
                            function10 = function19;
                            function11 = function16;
                            function13 = function18;
                            keyboardOptions2 = keyboardOptions4;
                            shape2 = shape3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function9 = function4;
                            visualTransformation2 = visualTransformation;
                            keyboardActions2 = keyboardActions;
                            z8 = z4;
                            i35 = i;
                            mutableInteractionSource2 = mutableInteractionSource;
                            shape2 = shape;
                            textFieldColors2 = textFieldColors;
                            function10 = function6;
                            z9 = z5;
                            z10 = z6;
                            composer2 = composerStartRestartGroup;
                            textStyle3 = textStyle2;
                            function11 = function7;
                            function12 = function8;
                            function13 = function5;
                            z11 = z3;
                            keyboardOptions2 = keyboardOptions;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                                    ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                                    return Unit.f17538a;
                                }
                            });
                        }
                    }
                    i28 = i26 | 24576;
                    i29 = i4 & 32768;
                    if (i29 != 0) {
                        i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(i)) {
                            i30 = 131072;
                        } else {
                            i30 = 65536;
                        }
                        i28 |= i30;
                    }
                    i31 = i4 & 65536;
                    if (i31 != 0) {
                        i28 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                    }
                    if ((i3 & 100663296) != 0) {
                        if ((i4 & 262144) == 0) {
                            i13 = 67108864;
                        }
                        i28 |= i13;
                    }
                    i32 = i4 & 524288;
                    if (i32 != 0) {
                        i28 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                    }
                    i33 = i28;
                    i34 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i45 != 0) {
                                z5 = true;
                            }
                            if (i6 != 0) {
                                z6 = false;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i36 = i34 & (-458753);
                            } else {
                                i36 = i34;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            }
                            if (i12 != 0) {
                                function14 = null;
                            } else {
                                function14 = function4;
                            }
                            if (i15 != 0) {
                                function15 = null;
                            } else {
                                function15 = function5;
                            }
                            if (i17 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i20 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i23 != 0) {
                                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                            } else {
                                keyboardOptions3 = keyboardOptions;
                            }
                            if ((i4 & 8192) != 0) {
                                keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                i33 &= -7169;
                            } else {
                                keyboardActions3 = keyboardActions;
                            }
                            if (i27 != 0) {
                                z13 = true;
                            } else {
                                z13 = z4;
                            }
                            if (i29 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i;
                            }
                            if (i31 != 0) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            i38 = i33;
                            if ((i4 & 131072) != 0) {
                                shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                i39 = i38 & (-29360129);
                            } else {
                                i39 = i38;
                                shapeM1074RoundedCornerShape0680j_4 = shape;
                            }
                            if ((i4 & 262144) != 0) {
                                textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                composer3 = composerStartRestartGroup;
                                i39 &= -234881025;
                            } else {
                                composer3 = composerStartRestartGroup;
                                textFieldColorsC = textFieldColors;
                            }
                            shape3 = shapeM1074RoundedCornerShape0680j_4;
                            i40 = i36;
                            keyboardActions4 = keyboardActions3;
                            z14 = z6;
                            textStyle4 = textStyle2;
                            function16 = function7;
                            function17 = function8;
                            i41 = i39;
                            function18 = function15;
                            visualTransformation3 = none;
                            keyboardOptions4 = keyboardOptions3;
                            z15 = z13;
                            i42 = i37;
                            if (i32 != 0) {
                                function19 = null;
                            } else {
                                function19 = function6;
                            }
                            textFieldColors3 = textFieldColorsC;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z16 = z12;
                        } else {
                            if (i45 != 0) {
                                z5 = true;
                            }
                            if (i6 != 0) {
                                z6 = false;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i36 = i34 & (-458753);
                            } else {
                                i36 = i34;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            }
                            if (i12 != 0) {
                                function14 = null;
                            } else {
                                function14 = function4;
                            }
                            if (i15 != 0) {
                                function15 = null;
                            } else {
                                function15 = function5;
                            }
                            if (i17 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i20 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i23 != 0) {
                                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                            } else {
                                keyboardOptions3 = keyboardOptions;
                            }
                            if ((i4 & 8192) != 0) {
                                keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                i33 &= -7169;
                            } else {
                                keyboardActions3 = keyboardActions;
                            }
                            if (i27 != 0) {
                                z13 = true;
                            } else {
                                z13 = z4;
                            }
                            if (i29 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i;
                            }
                            if (i31 != 0) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            i38 = i33;
                            if ((i4 & 131072) != 0) {
                                shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                i39 = i38 & (-29360129);
                            } else {
                                i39 = i38;
                                shapeM1074RoundedCornerShape0680j_4 = shape;
                            }
                            if ((i4 & 262144) != 0) {
                                textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                composer3 = composerStartRestartGroup;
                                i39 &= -234881025;
                            } else {
                                composer3 = composerStartRestartGroup;
                                textFieldColorsC = textFieldColors;
                            }
                            shape3 = shapeM1074RoundedCornerShape0680j_4;
                            i40 = i36;
                            keyboardActions4 = keyboardActions3;
                            z14 = z6;
                            textStyle4 = textStyle2;
                            function16 = function7;
                            function17 = function8;
                            i41 = i39;
                            function18 = function15;
                            visualTransformation3 = none;
                            keyboardOptions4 = keyboardOptions3;
                            z15 = z13;
                            i42 = i37;
                            if (i32 != 0) {
                                function19 = null;
                            } else {
                                function19 = function6;
                            }
                            textFieldColors3 = textFieldColorsC;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z16 = z12;
                        }
                        composer3.endDefaults();
                        z17 = z16;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                        }
                        composer4 = composer3;
                        composer4.startReplaceGroup(1090927577);
                        jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                        if (jM6770getColor0d7_KjU != 16) {
                            z5 = z5;
                        } else {
                            i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                            }
                            stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                            if (z5 == 0) {
                                unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                            } else if (z17) {
                                unfocusedTextColor = textFieldColors3.getErrorTextColor();
                            } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                                unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                            } else {
                                unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                            }
                            State stateRememberUpdatedState19 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState19.getValue()).m4615unboximpl();
                        }
                        long j10 = jM6770getColor0d7_KjU;
                        composer4.endReplaceGroup();
                        final TextStyle textStyleMerge10 = textStyle4.merge(new TextStyle(j10, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                        if (z17) {
                            cursorColor = textFieldColors3.getErrorCursorColor();
                        } else {
                            cursorColor = textFieldColors3.getCursorColor();
                        }
                        final State stateRememberUpdatedState110 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                        ProvidedValue<TextSelectionColors> providedValueProvides10 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                        TextStyle textStyle14 = textStyle4;
                        final TextFieldColors textFieldColors13 = textFieldColors3;
                        final boolean z117 = z5;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides10, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                final boolean z118;
                                final VisualTransformation visualTransformation4;
                                Composer composer5 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                    Modifier modifier2 = modifier;
                                    final boolean z20 = z117;
                                    final boolean z21 = z17;
                                    final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                    final TextFieldColors textFieldColors14 = textFieldColors13;
                                    Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors14, null, 0.0f, 0.0f, 112, null);
                                    SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState110.getValue()).m4615unboximpl(), null);
                                    Function3 function3RememberComposableLambda = function19;
                                    TextFieldValue textFieldValue = value;
                                    VisualTransformation visualTransformation5 = visualTransformation3;
                                    boolean z22 = z15;
                                    if (function3RememberComposableLambda == null) {
                                        composer5.startReplaceGroup(1071062574);
                                        final String text = textFieldValue.getText();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                        }
                                        final Function2 function29 = function16;
                                        final Function2 function210 = function17;
                                        final Function2 function211 = function14;
                                        final Function2 function212 = function18;
                                        z118 = z22;
                                        visualTransformation4 = visualTransformation5;
                                        function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                                Composer composer6 = (Composer) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                Intrinsics.i(innerTextField, "innerTextField");
                                                if ((iIntValue2 & 6) == 0) {
                                                    iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                                }
                                                if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                    }
                                                    float f = 0;
                                                    TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z118, visualTransformation4, mutableInteractionSource5, z21, function29, function210, function211, function212, null, null, null, null, textFieldColors14, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer6.skipToGroupEnd();
                                                }
                                                return Unit.f17538a;
                                            }
                                        }, composer5, 54);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        z118 = z22;
                                        visualTransformation4 = visualTransformation5;
                                        composer5.startReplaceGroup(1071062047);
                                    }
                                    composer5.endReplaceGroup();
                                    BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge10, keyboardOptions4, keyboardActions4, z118, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer5.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            }
                        }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        Function2 function29 = function14;
                        visualTransformation2 = visualTransformation3;
                        function9 = function29;
                        mutableInteractionSource2 = mutableInteractionSource4;
                        composer2 = composer4;
                        function12 = function17;
                        z8 = z15;
                        keyboardActions2 = keyboardActions4;
                        textStyle3 = textStyle14;
                        z9 = z117;
                        z11 = z17;
                        textFieldColors2 = textFieldColors13;
                        z10 = z14;
                        i35 = i42;
                        function10 = function19;
                        function11 = function16;
                        function13 = function18;
                        keyboardOptions2 = keyboardOptions4;
                        shape2 = shape3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function9 = function4;
                        visualTransformation2 = visualTransformation;
                        keyboardActions2 = keyboardActions;
                        z8 = z4;
                        i35 = i;
                        mutableInteractionSource2 = mutableInteractionSource;
                        shape2 = shape;
                        textFieldColors2 = textFieldColors;
                        function10 = function6;
                        z9 = z5;
                        z10 = z6;
                        composer2 = composerStartRestartGroup;
                        textStyle3 = textStyle2;
                        function11 = function7;
                        function12 = function8;
                        function13 = function5;
                        z11 = z3;
                        keyboardOptions2 = keyboardOptions;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                                ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                                return Unit.f17538a;
                            }
                        });
                    }
                }
                i24 = i22 | 384;
                if ((i3 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i46 = 2048;
                    }
                    i24 |= i46;
                }
                i26 = i24;
                i27 = i4 & 16384;
                if (i27 != 0) {
                    i28 = i26;
                    if ((i3 & 24576) == 0) {
                        i28 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                    }
                    i29 = i4 & 32768;
                    if (i29 != 0) {
                        i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(i)) {
                            i30 = 131072;
                        } else {
                            i30 = 65536;
                        }
                        i28 |= i30;
                    }
                    i31 = i4 & 65536;
                    if (i31 != 0) {
                        i28 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                    }
                    if ((i3 & 100663296) != 0) {
                        if ((i4 & 262144) == 0) {
                            i13 = 67108864;
                        }
                        i28 |= i13;
                    }
                    i32 = i4 & 524288;
                    if (i32 != 0) {
                        i28 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                    }
                    i33 = i28;
                    i34 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i45 != 0) {
                                z5 = true;
                            }
                            if (i6 != 0) {
                                z6 = false;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i36 = i34 & (-458753);
                            } else {
                                i36 = i34;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            }
                            if (i12 != 0) {
                                function14 = null;
                            } else {
                                function14 = function4;
                            }
                            if (i15 != 0) {
                                function15 = null;
                            } else {
                                function15 = function5;
                            }
                            if (i17 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i20 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i23 != 0) {
                                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                            } else {
                                keyboardOptions3 = keyboardOptions;
                            }
                            if ((i4 & 8192) != 0) {
                                keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                i33 &= -7169;
                            } else {
                                keyboardActions3 = keyboardActions;
                            }
                            if (i27 != 0) {
                                z13 = true;
                            } else {
                                z13 = z4;
                            }
                            if (i29 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i;
                            }
                            if (i31 != 0) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            i38 = i33;
                            if ((i4 & 131072) != 0) {
                                shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                i39 = i38 & (-29360129);
                            } else {
                                i39 = i38;
                                shapeM1074RoundedCornerShape0680j_4 = shape;
                            }
                            if ((i4 & 262144) != 0) {
                                textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                composer3 = composerStartRestartGroup;
                                i39 &= -234881025;
                            } else {
                                composer3 = composerStartRestartGroup;
                                textFieldColorsC = textFieldColors;
                            }
                            shape3 = shapeM1074RoundedCornerShape0680j_4;
                            i40 = i36;
                            keyboardActions4 = keyboardActions3;
                            z14 = z6;
                            textStyle4 = textStyle2;
                            function16 = function7;
                            function17 = function8;
                            i41 = i39;
                            function18 = function15;
                            visualTransformation3 = none;
                            keyboardOptions4 = keyboardOptions3;
                            z15 = z13;
                            i42 = i37;
                            if (i32 != 0) {
                                function19 = null;
                            } else {
                                function19 = function6;
                            }
                            textFieldColors3 = textFieldColorsC;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z16 = z12;
                        } else {
                            if (i45 != 0) {
                                z5 = true;
                            }
                            if (i6 != 0) {
                                z6 = false;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i36 = i34 & (-458753);
                            } else {
                                i36 = i34;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            }
                            if (i12 != 0) {
                                function14 = null;
                            } else {
                                function14 = function4;
                            }
                            if (i15 != 0) {
                                function15 = null;
                            } else {
                                function15 = function5;
                            }
                            if (i17 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i20 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i23 != 0) {
                                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                            } else {
                                keyboardOptions3 = keyboardOptions;
                            }
                            if ((i4 & 8192) != 0) {
                                keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                i33 &= -7169;
                            } else {
                                keyboardActions3 = keyboardActions;
                            }
                            if (i27 != 0) {
                                z13 = true;
                            } else {
                                z13 = z4;
                            }
                            if (i29 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i;
                            }
                            if (i31 != 0) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            i38 = i33;
                            if ((i4 & 131072) != 0) {
                                shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                i39 = i38 & (-29360129);
                            } else {
                                i39 = i38;
                                shapeM1074RoundedCornerShape0680j_4 = shape;
                            }
                            if ((i4 & 262144) != 0) {
                                textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                composer3 = composerStartRestartGroup;
                                i39 &= -234881025;
                            } else {
                                composer3 = composerStartRestartGroup;
                                textFieldColorsC = textFieldColors;
                            }
                            shape3 = shapeM1074RoundedCornerShape0680j_4;
                            i40 = i36;
                            keyboardActions4 = keyboardActions3;
                            z14 = z6;
                            textStyle4 = textStyle2;
                            function16 = function7;
                            function17 = function8;
                            i41 = i39;
                            function18 = function15;
                            visualTransformation3 = none;
                            keyboardOptions4 = keyboardOptions3;
                            z15 = z13;
                            i42 = i37;
                            if (i32 != 0) {
                                function19 = null;
                            } else {
                                function19 = function6;
                            }
                            textFieldColors3 = textFieldColorsC;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z16 = z12;
                        }
                        composer3.endDefaults();
                        z17 = z16;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                        }
                        composer4 = composer3;
                        composer4.startReplaceGroup(1090927577);
                        jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                        if (jM6770getColor0d7_KjU != 16) {
                            z5 = z5;
                        } else {
                            i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                            }
                            stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                            if (z5 == 0) {
                                unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                            } else if (z17) {
                                unfocusedTextColor = textFieldColors3.getErrorTextColor();
                            } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                                unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                            } else {
                                unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                            }
                            State stateRememberUpdatedState111 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState111.getValue()).m4615unboximpl();
                        }
                        long j11 = jM6770getColor0d7_KjU;
                        composer4.endReplaceGroup();
                        final TextStyle textStyleMerge11 = textStyle4.merge(new TextStyle(j11, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                        if (z17) {
                            cursorColor = textFieldColors3.getErrorCursorColor();
                        } else {
                            cursorColor = textFieldColors3.getCursorColor();
                        }
                        final State stateRememberUpdatedState112 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                        ProvidedValue<TextSelectionColors> providedValueProvides11 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                        TextStyle textStyle15 = textStyle4;
                        final TextFieldColors textFieldColors14 = textFieldColors3;
                        final boolean z118 = z5;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides11, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                final boolean z119;
                                final VisualTransformation visualTransformation4;
                                Composer composer5 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                    Modifier modifier2 = modifier;
                                    final boolean z20 = z118;
                                    final boolean z21 = z17;
                                    final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                    final TextFieldColors textFieldColors15 = textFieldColors14;
                                    Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors15, null, 0.0f, 0.0f, 112, null);
                                    SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState112.getValue()).m4615unboximpl(), null);
                                    Function3 function3RememberComposableLambda = function19;
                                    TextFieldValue textFieldValue = value;
                                    VisualTransformation visualTransformation5 = visualTransformation3;
                                    boolean z22 = z15;
                                    if (function3RememberComposableLambda == null) {
                                        composer5.startReplaceGroup(1071062574);
                                        final String text = textFieldValue.getText();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                        }
                                        final Function2 function210 = function16;
                                        final Function2 function211 = function17;
                                        final Function2 function212 = function14;
                                        final Function2 function213 = function18;
                                        z119 = z22;
                                        visualTransformation4 = visualTransformation5;
                                        function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                                Composer composer6 = (Composer) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                Intrinsics.i(innerTextField, "innerTextField");
                                                if ((iIntValue2 & 6) == 0) {
                                                    iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                                }
                                                if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                    }
                                                    float f = 0;
                                                    TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z119, visualTransformation4, mutableInteractionSource5, z21, function210, function211, function212, function213, null, null, null, null, textFieldColors15, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer6.skipToGroupEnd();
                                                }
                                                return Unit.f17538a;
                                            }
                                        }, composer5, 54);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        z119 = z22;
                                        visualTransformation4 = visualTransformation5;
                                        composer5.startReplaceGroup(1071062047);
                                    }
                                    composer5.endReplaceGroup();
                                    BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge11, keyboardOptions4, keyboardActions4, z119, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer5.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            }
                        }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        Function2 function210 = function14;
                        visualTransformation2 = visualTransformation3;
                        function9 = function210;
                        mutableInteractionSource2 = mutableInteractionSource4;
                        composer2 = composer4;
                        function12 = function17;
                        z8 = z15;
                        keyboardActions2 = keyboardActions4;
                        textStyle3 = textStyle15;
                        z9 = z118;
                        z11 = z17;
                        textFieldColors2 = textFieldColors14;
                        z10 = z14;
                        i35 = i42;
                        function10 = function19;
                        function11 = function16;
                        function13 = function18;
                        keyboardOptions2 = keyboardOptions4;
                        shape2 = shape3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function9 = function4;
                        visualTransformation2 = visualTransformation;
                        keyboardActions2 = keyboardActions;
                        z8 = z4;
                        i35 = i;
                        mutableInteractionSource2 = mutableInteractionSource;
                        shape2 = shape;
                        textFieldColors2 = textFieldColors;
                        function10 = function6;
                        z9 = z5;
                        z10 = z6;
                        composer2 = composerStartRestartGroup;
                        textStyle3 = textStyle2;
                        function11 = function7;
                        function12 = function8;
                        function13 = function5;
                        z11 = z3;
                        keyboardOptions2 = keyboardOptions;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                                ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                                return Unit.f17538a;
                            }
                        });
                    }
                }
                i28 = i26 | 24576;
                i29 = i4 & 32768;
                if (i29 != 0) {
                    i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i30 = 131072;
                    } else {
                        i30 = 65536;
                    }
                    i28 |= i30;
                }
                i31 = i4 & 65536;
                if (i31 != 0) {
                    i28 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                if ((i3 & 100663296) != 0) {
                    if ((i4 & 262144) == 0) {
                        i13 = 67108864;
                    }
                    i28 |= i13;
                }
                i32 = i4 & 524288;
                if (i32 != 0) {
                    i28 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                }
                i33 = i28;
                i34 = i5;
                if ((i5 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i45 != 0) {
                            z5 = true;
                        }
                        if (i6 != 0) {
                            z6 = false;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i36 = i34 & (-458753);
                        } else {
                            i36 = i34;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        }
                        if (i12 != 0) {
                            function14 = null;
                        } else {
                            function14 = function4;
                        }
                        if (i15 != 0) {
                            function15 = null;
                        } else {
                            function15 = function5;
                        }
                        if (i17 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i20 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i23 != 0) {
                            keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        if ((i4 & 8192) != 0) {
                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i33 &= -7169;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i27 != 0) {
                            z13 = true;
                        } else {
                            z13 = z4;
                        }
                        if (i29 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i;
                        }
                        if (i31 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        i38 = i33;
                        if ((i4 & 131072) != 0) {
                            shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                            i39 = i38 & (-29360129);
                        } else {
                            i39 = i38;
                            shapeM1074RoundedCornerShape0680j_4 = shape;
                        }
                        if ((i4 & 262144) != 0) {
                            textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                            composer3 = composerStartRestartGroup;
                            i39 &= -234881025;
                        } else {
                            composer3 = composerStartRestartGroup;
                            textFieldColorsC = textFieldColors;
                        }
                        shape3 = shapeM1074RoundedCornerShape0680j_4;
                        i40 = i36;
                        keyboardActions4 = keyboardActions3;
                        z14 = z6;
                        textStyle4 = textStyle2;
                        function16 = function7;
                        function17 = function8;
                        i41 = i39;
                        function18 = function15;
                        visualTransformation3 = none;
                        keyboardOptions4 = keyboardOptions3;
                        z15 = z13;
                        i42 = i37;
                        if (i32 != 0) {
                            function19 = null;
                        } else {
                            function19 = function6;
                        }
                        textFieldColors3 = textFieldColorsC;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z16 = z12;
                    } else {
                        if (i45 != 0) {
                            z5 = true;
                        }
                        if (i6 != 0) {
                            z6 = false;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i36 = i34 & (-458753);
                        } else {
                            i36 = i34;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        }
                        if (i12 != 0) {
                            function14 = null;
                        } else {
                            function14 = function4;
                        }
                        if (i15 != 0) {
                            function15 = null;
                        } else {
                            function15 = function5;
                        }
                        if (i17 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i20 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i23 != 0) {
                            keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        if ((i4 & 8192) != 0) {
                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i33 &= -7169;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i27 != 0) {
                            z13 = true;
                        } else {
                            z13 = z4;
                        }
                        if (i29 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i;
                        }
                        if (i31 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        i38 = i33;
                        if ((i4 & 131072) != 0) {
                            shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                            i39 = i38 & (-29360129);
                        } else {
                            i39 = i38;
                            shapeM1074RoundedCornerShape0680j_4 = shape;
                        }
                        if ((i4 & 262144) != 0) {
                            textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                            composer3 = composerStartRestartGroup;
                            i39 &= -234881025;
                        } else {
                            composer3 = composerStartRestartGroup;
                            textFieldColorsC = textFieldColors;
                        }
                        shape3 = shapeM1074RoundedCornerShape0680j_4;
                        i40 = i36;
                        keyboardActions4 = keyboardActions3;
                        z14 = z6;
                        textStyle4 = textStyle2;
                        function16 = function7;
                        function17 = function8;
                        i41 = i39;
                        function18 = function15;
                        visualTransformation3 = none;
                        keyboardOptions4 = keyboardOptions3;
                        z15 = z13;
                        i42 = i37;
                        if (i32 != 0) {
                            function19 = null;
                        } else {
                            function19 = function6;
                        }
                        textFieldColors3 = textFieldColorsC;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z16 = z12;
                    }
                    composer3.endDefaults();
                    z17 = z16;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                    }
                    composer4 = composer3;
                    composer4.startReplaceGroup(1090927577);
                    jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                    if (jM6770getColor0d7_KjU != 16) {
                        z5 = z5;
                    } else {
                        i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                        }
                        stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                        if (z5 == 0) {
                            unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                        } else if (z17) {
                            unfocusedTextColor = textFieldColors3.getErrorTextColor();
                        } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                            unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                        } else {
                            unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                        }
                        State stateRememberUpdatedState113 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState113.getValue()).m4615unboximpl();
                    }
                    long j12 = jM6770getColor0d7_KjU;
                    composer4.endReplaceGroup();
                    final TextStyle textStyleMerge12 = textStyle4.merge(new TextStyle(j12, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                    if (z17) {
                        cursorColor = textFieldColors3.getErrorCursorColor();
                    } else {
                        cursorColor = textFieldColors3.getCursorColor();
                    }
                    final State stateRememberUpdatedState114 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                    ProvidedValue<TextSelectionColors> providedValueProvides12 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                    TextStyle textStyle16 = textStyle4;
                    final TextFieldColors textFieldColors15 = textFieldColors3;
                    final boolean z119 = z5;
                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides12, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            final boolean z1110;
                            final VisualTransformation visualTransformation4;
                            Composer composer5 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                Modifier modifier2 = modifier;
                                final boolean z20 = z119;
                                final boolean z21 = z17;
                                final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                final TextFieldColors textFieldColors16 = textFieldColors15;
                                Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors16, null, 0.0f, 0.0f, 112, null);
                                SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState114.getValue()).m4615unboximpl(), null);
                                Function3 function3RememberComposableLambda = function19;
                                TextFieldValue textFieldValue = value;
                                VisualTransformation visualTransformation5 = visualTransformation3;
                                boolean z22 = z15;
                                if (function3RememberComposableLambda == null) {
                                    composer5.startReplaceGroup(1071062574);
                                    final String text = textFieldValue.getText();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                    }
                                    final Function2 function211 = function16;
                                    final Function2 function212 = function17;
                                    final Function2 function213 = function14;
                                    final Function2 function214 = function18;
                                    z1110 = z22;
                                    visualTransformation4 = visualTransformation5;
                                    function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                            Composer composer6 = (Composer) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            Intrinsics.i(innerTextField, "innerTextField");
                                            if ((iIntValue2 & 6) == 0) {
                                                iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                            }
                                            if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                }
                                                float f = 0;
                                                TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z1110, visualTransformation4, mutableInteractionSource5, z21, function211, function212, function213, function214, null, null, null, null, textFieldColors16, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer6.skipToGroupEnd();
                                            }
                                            return Unit.f17538a;
                                        }
                                    }, composer5, 54);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    z1110 = z22;
                                    visualTransformation4 = visualTransformation5;
                                    composer5.startReplaceGroup(1071062047);
                                }
                                composer5.endReplaceGroup();
                                BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge12, keyboardOptions4, keyboardActions4, z1110, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer5.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Function2 function211 = function14;
                    visualTransformation2 = visualTransformation3;
                    function9 = function211;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    composer2 = composer4;
                    function12 = function17;
                    z8 = z15;
                    keyboardActions2 = keyboardActions4;
                    textStyle3 = textStyle16;
                    z9 = z119;
                    z11 = z17;
                    textFieldColors2 = textFieldColors15;
                    z10 = z14;
                    i35 = i42;
                    function10 = function19;
                    function11 = function16;
                    function13 = function18;
                    keyboardOptions2 = keyboardOptions4;
                    shape2 = shape3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function9 = function4;
                    visualTransformation2 = visualTransformation;
                    keyboardActions2 = keyboardActions;
                    z8 = z4;
                    i35 = i;
                    mutableInteractionSource2 = mutableInteractionSource;
                    shape2 = shape;
                    textFieldColors2 = textFieldColors;
                    function10 = function6;
                    z9 = z5;
                    z10 = z6;
                    composer2 = composerStartRestartGroup;
                    textStyle3 = textStyle2;
                    function11 = function7;
                    function12 = function8;
                    function13 = function5;
                    z11 = z3;
                    keyboardOptions2 = keyboardOptions;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                            ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i5 |= 805306368;
            i17 = i4 & 1024;
            if (i17 != 0) {
                i18 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (composerStartRestartGroup.changed(z3)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i3 | i19;
            } else {
                i18 = i3;
            }
            i20 = i4 & 2048;
            if (i20 != 0) {
                i18 |= 48;
            } else if ((i3 & 48) != 0) {
                if (composerStartRestartGroup.changed(visualTransformation)) {
                    i21 = 32;
                } else {
                    i21 = 16;
                }
                i18 |= i21;
            }
            i22 = i18;
            i23 = i4 & 4096;
            if (i23 != 0) {
                i24 = i22;
                if ((i3 & 384) == 0) {
                    if (composerStartRestartGroup.changed(keyboardOptions)) {
                        i25 = 256;
                    } else {
                        i25 = 128;
                    }
                    i24 |= i25;
                }
                if ((i3 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i46 = 2048;
                    }
                    i24 |= i46;
                }
                i26 = i24;
                i27 = i4 & 16384;
                if (i27 != 0) {
                    i28 = i26;
                    if ((i3 & 24576) == 0) {
                        i28 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                    }
                    i29 = i4 & 32768;
                    if (i29 != 0) {
                        i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(i)) {
                            i30 = 131072;
                        } else {
                            i30 = 65536;
                        }
                        i28 |= i30;
                    }
                    i31 = i4 & 65536;
                    if (i31 != 0) {
                        i28 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                    }
                    if ((i3 & 100663296) != 0) {
                        if ((i4 & 262144) == 0) {
                            i13 = 67108864;
                        }
                        i28 |= i13;
                    }
                    i32 = i4 & 524288;
                    if (i32 != 0) {
                        i28 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                    }
                    i33 = i28;
                    i34 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i45 != 0) {
                                z5 = true;
                            }
                            if (i6 != 0) {
                                z6 = false;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i36 = i34 & (-458753);
                            } else {
                                i36 = i34;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            }
                            if (i12 != 0) {
                                function14 = null;
                            } else {
                                function14 = function4;
                            }
                            if (i15 != 0) {
                                function15 = null;
                            } else {
                                function15 = function5;
                            }
                            if (i17 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i20 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i23 != 0) {
                                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                            } else {
                                keyboardOptions3 = keyboardOptions;
                            }
                            if ((i4 & 8192) != 0) {
                                keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                i33 &= -7169;
                            } else {
                                keyboardActions3 = keyboardActions;
                            }
                            if (i27 != 0) {
                                z13 = true;
                            } else {
                                z13 = z4;
                            }
                            if (i29 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i;
                            }
                            if (i31 != 0) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            i38 = i33;
                            if ((i4 & 131072) != 0) {
                                shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                i39 = i38 & (-29360129);
                            } else {
                                i39 = i38;
                                shapeM1074RoundedCornerShape0680j_4 = shape;
                            }
                            if ((i4 & 262144) != 0) {
                                textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                composer3 = composerStartRestartGroup;
                                i39 &= -234881025;
                            } else {
                                composer3 = composerStartRestartGroup;
                                textFieldColorsC = textFieldColors;
                            }
                            shape3 = shapeM1074RoundedCornerShape0680j_4;
                            i40 = i36;
                            keyboardActions4 = keyboardActions3;
                            z14 = z6;
                            textStyle4 = textStyle2;
                            function16 = function7;
                            function17 = function8;
                            i41 = i39;
                            function18 = function15;
                            visualTransformation3 = none;
                            keyboardOptions4 = keyboardOptions3;
                            z15 = z13;
                            i42 = i37;
                            if (i32 != 0) {
                                function19 = null;
                            } else {
                                function19 = function6;
                            }
                            textFieldColors3 = textFieldColorsC;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z16 = z12;
                        } else {
                            if (i45 != 0) {
                                z5 = true;
                            }
                            if (i6 != 0) {
                                z6 = false;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i36 = i34 & (-458753);
                            } else {
                                i36 = i34;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            }
                            if (i12 != 0) {
                                function14 = null;
                            } else {
                                function14 = function4;
                            }
                            if (i15 != 0) {
                                function15 = null;
                            } else {
                                function15 = function5;
                            }
                            if (i17 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i20 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i23 != 0) {
                                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                            } else {
                                keyboardOptions3 = keyboardOptions;
                            }
                            if ((i4 & 8192) != 0) {
                                keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                i33 &= -7169;
                            } else {
                                keyboardActions3 = keyboardActions;
                            }
                            if (i27 != 0) {
                                z13 = true;
                            } else {
                                z13 = z4;
                            }
                            if (i29 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i;
                            }
                            if (i31 != 0) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            i38 = i33;
                            if ((i4 & 131072) != 0) {
                                shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                i39 = i38 & (-29360129);
                            } else {
                                i39 = i38;
                                shapeM1074RoundedCornerShape0680j_4 = shape;
                            }
                            if ((i4 & 262144) != 0) {
                                textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                composer3 = composerStartRestartGroup;
                                i39 &= -234881025;
                            } else {
                                composer3 = composerStartRestartGroup;
                                textFieldColorsC = textFieldColors;
                            }
                            shape3 = shapeM1074RoundedCornerShape0680j_4;
                            i40 = i36;
                            keyboardActions4 = keyboardActions3;
                            z14 = z6;
                            textStyle4 = textStyle2;
                            function16 = function7;
                            function17 = function8;
                            i41 = i39;
                            function18 = function15;
                            visualTransformation3 = none;
                            keyboardOptions4 = keyboardOptions3;
                            z15 = z13;
                            i42 = i37;
                            if (i32 != 0) {
                                function19 = null;
                            } else {
                                function19 = function6;
                            }
                            textFieldColors3 = textFieldColorsC;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z16 = z12;
                        }
                        composer3.endDefaults();
                        z17 = z16;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                        }
                        composer4 = composer3;
                        composer4.startReplaceGroup(1090927577);
                        jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                        if (jM6770getColor0d7_KjU != 16) {
                            z5 = z5;
                        } else {
                            i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                            }
                            stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                            if (z5 == 0) {
                                unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                            } else if (z17) {
                                unfocusedTextColor = textFieldColors3.getErrorTextColor();
                            } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                                unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                            } else {
                                unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                            }
                            State stateRememberUpdatedState115 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState115.getValue()).m4615unboximpl();
                        }
                        long j13 = jM6770getColor0d7_KjU;
                        composer4.endReplaceGroup();
                        final TextStyle textStyleMerge13 = textStyle4.merge(new TextStyle(j13, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                        if (z17) {
                            cursorColor = textFieldColors3.getErrorCursorColor();
                        } else {
                            cursorColor = textFieldColors3.getCursorColor();
                        }
                        final State stateRememberUpdatedState116 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                        ProvidedValue<TextSelectionColors> providedValueProvides13 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                        TextStyle textStyle17 = textStyle4;
                        final TextFieldColors textFieldColors16 = textFieldColors3;
                        final boolean z1110 = z5;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides13, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                final boolean z1111;
                                final VisualTransformation visualTransformation4;
                                Composer composer5 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                    Modifier modifier2 = modifier;
                                    final boolean z20 = z1110;
                                    final boolean z21 = z17;
                                    final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                    final TextFieldColors textFieldColors17 = textFieldColors16;
                                    Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors17, null, 0.0f, 0.0f, 112, null);
                                    SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState116.getValue()).m4615unboximpl(), null);
                                    Function3 function3RememberComposableLambda = function19;
                                    TextFieldValue textFieldValue = value;
                                    VisualTransformation visualTransformation5 = visualTransformation3;
                                    boolean z22 = z15;
                                    if (function3RememberComposableLambda == null) {
                                        composer5.startReplaceGroup(1071062574);
                                        final String text = textFieldValue.getText();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                        }
                                        final Function2 function212 = function16;
                                        final Function2 function213 = function17;
                                        final Function2 function214 = function14;
                                        final Function2 function215 = function18;
                                        z1111 = z22;
                                        visualTransformation4 = visualTransformation5;
                                        function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                                Composer composer6 = (Composer) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                Intrinsics.i(innerTextField, "innerTextField");
                                                if ((iIntValue2 & 6) == 0) {
                                                    iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                                }
                                                if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                    }
                                                    float f = 0;
                                                    TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z1111, visualTransformation4, mutableInteractionSource5, z21, function212, function213, function214, function215, null, null, null, null, textFieldColors17, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer6.skipToGroupEnd();
                                                }
                                                return Unit.f17538a;
                                            }
                                        }, composer5, 54);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        z1111 = z22;
                                        visualTransformation4 = visualTransformation5;
                                        composer5.startReplaceGroup(1071062047);
                                    }
                                    composer5.endReplaceGroup();
                                    BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge13, keyboardOptions4, keyboardActions4, z1111, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer5.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            }
                        }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        Function2 function212 = function14;
                        visualTransformation2 = visualTransformation3;
                        function9 = function212;
                        mutableInteractionSource2 = mutableInteractionSource4;
                        composer2 = composer4;
                        function12 = function17;
                        z8 = z15;
                        keyboardActions2 = keyboardActions4;
                        textStyle3 = textStyle17;
                        z9 = z1110;
                        z11 = z17;
                        textFieldColors2 = textFieldColors16;
                        z10 = z14;
                        i35 = i42;
                        function10 = function19;
                        function11 = function16;
                        function13 = function18;
                        keyboardOptions2 = keyboardOptions4;
                        shape2 = shape3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function9 = function4;
                        visualTransformation2 = visualTransformation;
                        keyboardActions2 = keyboardActions;
                        z8 = z4;
                        i35 = i;
                        mutableInteractionSource2 = mutableInteractionSource;
                        shape2 = shape;
                        textFieldColors2 = textFieldColors;
                        function10 = function6;
                        z9 = z5;
                        z10 = z6;
                        composer2 = composerStartRestartGroup;
                        textStyle3 = textStyle2;
                        function11 = function7;
                        function12 = function8;
                        function13 = function5;
                        z11 = z3;
                        keyboardOptions2 = keyboardOptions;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                                ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                                return Unit.f17538a;
                            }
                        });
                    }
                }
                i28 = i26 | 24576;
                i29 = i4 & 32768;
                if (i29 != 0) {
                    i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i30 = 131072;
                    } else {
                        i30 = 65536;
                    }
                    i28 |= i30;
                }
                i31 = i4 & 65536;
                if (i31 != 0) {
                    i28 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                if ((i3 & 100663296) != 0) {
                    if ((i4 & 262144) == 0) {
                        i13 = 67108864;
                    }
                    i28 |= i13;
                }
                i32 = i4 & 524288;
                if (i32 != 0) {
                    i28 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                }
                i33 = i28;
                i34 = i5;
                if ((i5 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i45 != 0) {
                            z5 = true;
                        }
                        if (i6 != 0) {
                            z6 = false;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i36 = i34 & (-458753);
                        } else {
                            i36 = i34;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        }
                        if (i12 != 0) {
                            function14 = null;
                        } else {
                            function14 = function4;
                        }
                        if (i15 != 0) {
                            function15 = null;
                        } else {
                            function15 = function5;
                        }
                        if (i17 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i20 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i23 != 0) {
                            keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        if ((i4 & 8192) != 0) {
                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i33 &= -7169;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i27 != 0) {
                            z13 = true;
                        } else {
                            z13 = z4;
                        }
                        if (i29 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i;
                        }
                        if (i31 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        i38 = i33;
                        if ((i4 & 131072) != 0) {
                            shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                            i39 = i38 & (-29360129);
                        } else {
                            i39 = i38;
                            shapeM1074RoundedCornerShape0680j_4 = shape;
                        }
                        if ((i4 & 262144) != 0) {
                            textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                            composer3 = composerStartRestartGroup;
                            i39 &= -234881025;
                        } else {
                            composer3 = composerStartRestartGroup;
                            textFieldColorsC = textFieldColors;
                        }
                        shape3 = shapeM1074RoundedCornerShape0680j_4;
                        i40 = i36;
                        keyboardActions4 = keyboardActions3;
                        z14 = z6;
                        textStyle4 = textStyle2;
                        function16 = function7;
                        function17 = function8;
                        i41 = i39;
                        function18 = function15;
                        visualTransformation3 = none;
                        keyboardOptions4 = keyboardOptions3;
                        z15 = z13;
                        i42 = i37;
                        if (i32 != 0) {
                            function19 = null;
                        } else {
                            function19 = function6;
                        }
                        textFieldColors3 = textFieldColorsC;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z16 = z12;
                    } else {
                        if (i45 != 0) {
                            z5 = true;
                        }
                        if (i6 != 0) {
                            z6 = false;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i36 = i34 & (-458753);
                        } else {
                            i36 = i34;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        }
                        if (i12 != 0) {
                            function14 = null;
                        } else {
                            function14 = function4;
                        }
                        if (i15 != 0) {
                            function15 = null;
                        } else {
                            function15 = function5;
                        }
                        if (i17 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i20 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i23 != 0) {
                            keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        if ((i4 & 8192) != 0) {
                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i33 &= -7169;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i27 != 0) {
                            z13 = true;
                        } else {
                            z13 = z4;
                        }
                        if (i29 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i;
                        }
                        if (i31 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        i38 = i33;
                        if ((i4 & 131072) != 0) {
                            shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                            i39 = i38 & (-29360129);
                        } else {
                            i39 = i38;
                            shapeM1074RoundedCornerShape0680j_4 = shape;
                        }
                        if ((i4 & 262144) != 0) {
                            textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                            composer3 = composerStartRestartGroup;
                            i39 &= -234881025;
                        } else {
                            composer3 = composerStartRestartGroup;
                            textFieldColorsC = textFieldColors;
                        }
                        shape3 = shapeM1074RoundedCornerShape0680j_4;
                        i40 = i36;
                        keyboardActions4 = keyboardActions3;
                        z14 = z6;
                        textStyle4 = textStyle2;
                        function16 = function7;
                        function17 = function8;
                        i41 = i39;
                        function18 = function15;
                        visualTransformation3 = none;
                        keyboardOptions4 = keyboardOptions3;
                        z15 = z13;
                        i42 = i37;
                        if (i32 != 0) {
                            function19 = null;
                        } else {
                            function19 = function6;
                        }
                        textFieldColors3 = textFieldColorsC;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z16 = z12;
                    }
                    composer3.endDefaults();
                    z17 = z16;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                    }
                    composer4 = composer3;
                    composer4.startReplaceGroup(1090927577);
                    jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                    if (jM6770getColor0d7_KjU != 16) {
                        z5 = z5;
                    } else {
                        i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                        }
                        stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                        if (z5 == 0) {
                            unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                        } else if (z17) {
                            unfocusedTextColor = textFieldColors3.getErrorTextColor();
                        } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                            unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                        } else {
                            unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                        }
                        State stateRememberUpdatedState117 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState117.getValue()).m4615unboximpl();
                    }
                    long j14 = jM6770getColor0d7_KjU;
                    composer4.endReplaceGroup();
                    final TextStyle textStyleMerge14 = textStyle4.merge(new TextStyle(j14, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                    if (z17) {
                        cursorColor = textFieldColors3.getErrorCursorColor();
                    } else {
                        cursorColor = textFieldColors3.getCursorColor();
                    }
                    final State stateRememberUpdatedState118 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                    ProvidedValue<TextSelectionColors> providedValueProvides14 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                    TextStyle textStyle18 = textStyle4;
                    final TextFieldColors textFieldColors17 = textFieldColors3;
                    final boolean z1111 = z5;
                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides14, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            final boolean z1112;
                            final VisualTransformation visualTransformation4;
                            Composer composer5 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                Modifier modifier2 = modifier;
                                final boolean z20 = z1111;
                                final boolean z21 = z17;
                                final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                final TextFieldColors textFieldColors18 = textFieldColors17;
                                Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors18, null, 0.0f, 0.0f, 112, null);
                                SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState118.getValue()).m4615unboximpl(), null);
                                Function3 function3RememberComposableLambda = function19;
                                TextFieldValue textFieldValue = value;
                                VisualTransformation visualTransformation5 = visualTransformation3;
                                boolean z22 = z15;
                                if (function3RememberComposableLambda == null) {
                                    composer5.startReplaceGroup(1071062574);
                                    final String text = textFieldValue.getText();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                    }
                                    final Function2 function213 = function16;
                                    final Function2 function214 = function17;
                                    final Function2 function215 = function14;
                                    final Function2 function216 = function18;
                                    z1112 = z22;
                                    visualTransformation4 = visualTransformation5;
                                    function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                            Composer composer6 = (Composer) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            Intrinsics.i(innerTextField, "innerTextField");
                                            if ((iIntValue2 & 6) == 0) {
                                                iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                            }
                                            if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                }
                                                float f = 0;
                                                TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z1112, visualTransformation4, mutableInteractionSource5, z21, function213, function214, function215, function216, null, null, null, null, textFieldColors18, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer6.skipToGroupEnd();
                                            }
                                            return Unit.f17538a;
                                        }
                                    }, composer5, 54);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    z1112 = z22;
                                    visualTransformation4 = visualTransformation5;
                                    composer5.startReplaceGroup(1071062047);
                                }
                                composer5.endReplaceGroup();
                                BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge14, keyboardOptions4, keyboardActions4, z1112, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer5.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Function2 function213 = function14;
                    visualTransformation2 = visualTransformation3;
                    function9 = function213;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    composer2 = composer4;
                    function12 = function17;
                    z8 = z15;
                    keyboardActions2 = keyboardActions4;
                    textStyle3 = textStyle18;
                    z9 = z1111;
                    z11 = z17;
                    textFieldColors2 = textFieldColors17;
                    z10 = z14;
                    i35 = i42;
                    function10 = function19;
                    function11 = function16;
                    function13 = function18;
                    keyboardOptions2 = keyboardOptions4;
                    shape2 = shape3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function9 = function4;
                    visualTransformation2 = visualTransformation;
                    keyboardActions2 = keyboardActions;
                    z8 = z4;
                    i35 = i;
                    mutableInteractionSource2 = mutableInteractionSource;
                    shape2 = shape;
                    textFieldColors2 = textFieldColors;
                    function10 = function6;
                    z9 = z5;
                    z10 = z6;
                    composer2 = composerStartRestartGroup;
                    textStyle3 = textStyle2;
                    function11 = function7;
                    function12 = function8;
                    function13 = function5;
                    z11 = z3;
                    keyboardOptions2 = keyboardOptions;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                            ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i24 = i22 | 384;
            if ((i3 & 3072) != 0) {
                if ((i4 & 8192) == 0) {
                    i46 = 2048;
                }
                i24 |= i46;
            }
            i26 = i24;
            i27 = i4 & 16384;
            if (i27 != 0) {
                i28 = i26;
                if ((i3 & 24576) == 0) {
                    i28 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                }
                i29 = i4 & 32768;
                if (i29 != 0) {
                    i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i30 = 131072;
                    } else {
                        i30 = 65536;
                    }
                    i28 |= i30;
                }
                i31 = i4 & 65536;
                if (i31 != 0) {
                    i28 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                if ((i3 & 100663296) != 0) {
                    if ((i4 & 262144) == 0) {
                        i13 = 67108864;
                    }
                    i28 |= i13;
                }
                i32 = i4 & 524288;
                if (i32 != 0) {
                    i28 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                }
                i33 = i28;
                i34 = i5;
                if ((i5 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i45 != 0) {
                            z5 = true;
                        }
                        if (i6 != 0) {
                            z6 = false;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i36 = i34 & (-458753);
                        } else {
                            i36 = i34;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        }
                        if (i12 != 0) {
                            function14 = null;
                        } else {
                            function14 = function4;
                        }
                        if (i15 != 0) {
                            function15 = null;
                        } else {
                            function15 = function5;
                        }
                        if (i17 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i20 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i23 != 0) {
                            keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        if ((i4 & 8192) != 0) {
                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i33 &= -7169;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i27 != 0) {
                            z13 = true;
                        } else {
                            z13 = z4;
                        }
                        if (i29 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i;
                        }
                        if (i31 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        i38 = i33;
                        if ((i4 & 131072) != 0) {
                            shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                            i39 = i38 & (-29360129);
                        } else {
                            i39 = i38;
                            shapeM1074RoundedCornerShape0680j_4 = shape;
                        }
                        if ((i4 & 262144) != 0) {
                            textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                            composer3 = composerStartRestartGroup;
                            i39 &= -234881025;
                        } else {
                            composer3 = composerStartRestartGroup;
                            textFieldColorsC = textFieldColors;
                        }
                        shape3 = shapeM1074RoundedCornerShape0680j_4;
                        i40 = i36;
                        keyboardActions4 = keyboardActions3;
                        z14 = z6;
                        textStyle4 = textStyle2;
                        function16 = function7;
                        function17 = function8;
                        i41 = i39;
                        function18 = function15;
                        visualTransformation3 = none;
                        keyboardOptions4 = keyboardOptions3;
                        z15 = z13;
                        i42 = i37;
                        if (i32 != 0) {
                            function19 = null;
                        } else {
                            function19 = function6;
                        }
                        textFieldColors3 = textFieldColorsC;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z16 = z12;
                    } else {
                        if (i45 != 0) {
                            z5 = true;
                        }
                        if (i6 != 0) {
                            z6 = false;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i36 = i34 & (-458753);
                        } else {
                            i36 = i34;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        }
                        if (i12 != 0) {
                            function14 = null;
                        } else {
                            function14 = function4;
                        }
                        if (i15 != 0) {
                            function15 = null;
                        } else {
                            function15 = function5;
                        }
                        if (i17 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i20 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i23 != 0) {
                            keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        if ((i4 & 8192) != 0) {
                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i33 &= -7169;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i27 != 0) {
                            z13 = true;
                        } else {
                            z13 = z4;
                        }
                        if (i29 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i;
                        }
                        if (i31 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        i38 = i33;
                        if ((i4 & 131072) != 0) {
                            shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                            i39 = i38 & (-29360129);
                        } else {
                            i39 = i38;
                            shapeM1074RoundedCornerShape0680j_4 = shape;
                        }
                        if ((i4 & 262144) != 0) {
                            textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                            composer3 = composerStartRestartGroup;
                            i39 &= -234881025;
                        } else {
                            composer3 = composerStartRestartGroup;
                            textFieldColorsC = textFieldColors;
                        }
                        shape3 = shapeM1074RoundedCornerShape0680j_4;
                        i40 = i36;
                        keyboardActions4 = keyboardActions3;
                        z14 = z6;
                        textStyle4 = textStyle2;
                        function16 = function7;
                        function17 = function8;
                        i41 = i39;
                        function18 = function15;
                        visualTransformation3 = none;
                        keyboardOptions4 = keyboardOptions3;
                        z15 = z13;
                        i42 = i37;
                        if (i32 != 0) {
                            function19 = null;
                        } else {
                            function19 = function6;
                        }
                        textFieldColors3 = textFieldColorsC;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z16 = z12;
                    }
                    composer3.endDefaults();
                    z17 = z16;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                    }
                    composer4 = composer3;
                    composer4.startReplaceGroup(1090927577);
                    jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                    if (jM6770getColor0d7_KjU != 16) {
                        z5 = z5;
                    } else {
                        i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                        }
                        stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                        if (z5 == 0) {
                            unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                        } else if (z17) {
                            unfocusedTextColor = textFieldColors3.getErrorTextColor();
                        } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                            unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                        } else {
                            unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                        }
                        State stateRememberUpdatedState119 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState119.getValue()).m4615unboximpl();
                    }
                    long j15 = jM6770getColor0d7_KjU;
                    composer4.endReplaceGroup();
                    final TextStyle textStyleMerge15 = textStyle4.merge(new TextStyle(j15, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                    if (z17) {
                        cursorColor = textFieldColors3.getErrorCursorColor();
                    } else {
                        cursorColor = textFieldColors3.getCursorColor();
                    }
                    final State stateRememberUpdatedState1110 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                    ProvidedValue<TextSelectionColors> providedValueProvides15 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                    TextStyle textStyle19 = textStyle4;
                    final TextFieldColors textFieldColors18 = textFieldColors3;
                    final boolean z1112 = z5;
                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides15, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            final boolean z1113;
                            final VisualTransformation visualTransformation4;
                            Composer composer5 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                Modifier modifier2 = modifier;
                                final boolean z20 = z1112;
                                final boolean z21 = z17;
                                final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                final TextFieldColors textFieldColors19 = textFieldColors18;
                                Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors19, null, 0.0f, 0.0f, 112, null);
                                SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState1110.getValue()).m4615unboximpl(), null);
                                Function3 function3RememberComposableLambda = function19;
                                TextFieldValue textFieldValue = value;
                                VisualTransformation visualTransformation5 = visualTransformation3;
                                boolean z22 = z15;
                                if (function3RememberComposableLambda == null) {
                                    composer5.startReplaceGroup(1071062574);
                                    final String text = textFieldValue.getText();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                    }
                                    final Function2 function214 = function16;
                                    final Function2 function215 = function17;
                                    final Function2 function216 = function14;
                                    final Function2 function217 = function18;
                                    z1113 = z22;
                                    visualTransformation4 = visualTransformation5;
                                    function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                            Composer composer6 = (Composer) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            Intrinsics.i(innerTextField, "innerTextField");
                                            if ((iIntValue2 & 6) == 0) {
                                                iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                            }
                                            if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                }
                                                float f = 0;
                                                TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z1113, visualTransformation4, mutableInteractionSource5, z21, function214, function215, function216, function217, null, null, null, null, textFieldColors19, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer6.skipToGroupEnd();
                                            }
                                            return Unit.f17538a;
                                        }
                                    }, composer5, 54);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    z1113 = z22;
                                    visualTransformation4 = visualTransformation5;
                                    composer5.startReplaceGroup(1071062047);
                                }
                                composer5.endReplaceGroup();
                                BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge15, keyboardOptions4, keyboardActions4, z1113, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer5.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Function2 function214 = function14;
                    visualTransformation2 = visualTransformation3;
                    function9 = function214;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    composer2 = composer4;
                    function12 = function17;
                    z8 = z15;
                    keyboardActions2 = keyboardActions4;
                    textStyle3 = textStyle19;
                    z9 = z1112;
                    z11 = z17;
                    textFieldColors2 = textFieldColors18;
                    z10 = z14;
                    i35 = i42;
                    function10 = function19;
                    function11 = function16;
                    function13 = function18;
                    keyboardOptions2 = keyboardOptions4;
                    shape2 = shape3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function9 = function4;
                    visualTransformation2 = visualTransformation;
                    keyboardActions2 = keyboardActions;
                    z8 = z4;
                    i35 = i;
                    mutableInteractionSource2 = mutableInteractionSource;
                    shape2 = shape;
                    textFieldColors2 = textFieldColors;
                    function10 = function6;
                    z9 = z5;
                    z10 = z6;
                    composer2 = composerStartRestartGroup;
                    textStyle3 = textStyle2;
                    function11 = function7;
                    function12 = function8;
                    function13 = function5;
                    z11 = z3;
                    keyboardOptions2 = keyboardOptions;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                            ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i28 = i26 | 24576;
            i29 = i4 & 32768;
            if (i29 != 0) {
                i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i30 = 131072;
                } else {
                    i30 = 65536;
                }
                i28 |= i30;
            }
            i31 = i4 & 65536;
            if (i31 != 0) {
                i28 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
            }
            if ((i3 & 100663296) != 0) {
                if ((i4 & 262144) == 0) {
                    i13 = 67108864;
                }
                i28 |= i13;
            }
            i32 = i4 & 524288;
            if (i32 != 0) {
                i28 |= 805306368;
            } else if ((i3 & 805306368) == 0) {
                i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
            }
            i33 = i28;
            i34 = i5;
            if ((i5 & 306783379) == 306783378) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i45 != 0) {
                        z5 = true;
                    }
                    if (i6 != 0) {
                        z6 = false;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i36 = i34 & (-458753);
                    } else {
                        i36 = i34;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    }
                    if (i12 != 0) {
                        function14 = null;
                    } else {
                        function14 = function4;
                    }
                    if (i15 != 0) {
                        function15 = null;
                    } else {
                        function15 = function5;
                    }
                    if (i17 != 0) {
                        z12 = false;
                    } else {
                        z12 = z3;
                    }
                    if (i20 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i23 != 0) {
                        keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                    } else {
                        keyboardOptions3 = keyboardOptions;
                    }
                    if ((i4 & 8192) != 0) {
                        keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                        i33 &= -7169;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i27 != 0) {
                        z13 = true;
                    } else {
                        z13 = z4;
                    }
                    if (i29 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i;
                    }
                    if (i31 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    i38 = i33;
                    if ((i4 & 131072) != 0) {
                        shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                        i39 = i38 & (-29360129);
                    } else {
                        i39 = i38;
                        shapeM1074RoundedCornerShape0680j_4 = shape;
                    }
                    if ((i4 & 262144) != 0) {
                        textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                        composer3 = composerStartRestartGroup;
                        i39 &= -234881025;
                    } else {
                        composer3 = composerStartRestartGroup;
                        textFieldColorsC = textFieldColors;
                    }
                    shape3 = shapeM1074RoundedCornerShape0680j_4;
                    i40 = i36;
                    keyboardActions4 = keyboardActions3;
                    z14 = z6;
                    textStyle4 = textStyle2;
                    function16 = function7;
                    function17 = function8;
                    i41 = i39;
                    function18 = function15;
                    visualTransformation3 = none;
                    keyboardOptions4 = keyboardOptions3;
                    z15 = z13;
                    i42 = i37;
                    if (i32 != 0) {
                        function19 = null;
                    } else {
                        function19 = function6;
                    }
                    textFieldColors3 = textFieldColorsC;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    z16 = z12;
                } else {
                    if (i45 != 0) {
                        z5 = true;
                    }
                    if (i6 != 0) {
                        z6 = false;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i36 = i34 & (-458753);
                    } else {
                        i36 = i34;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    }
                    if (i12 != 0) {
                        function14 = null;
                    } else {
                        function14 = function4;
                    }
                    if (i15 != 0) {
                        function15 = null;
                    } else {
                        function15 = function5;
                    }
                    if (i17 != 0) {
                        z12 = false;
                    } else {
                        z12 = z3;
                    }
                    if (i20 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i23 != 0) {
                        keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                    } else {
                        keyboardOptions3 = keyboardOptions;
                    }
                    if ((i4 & 8192) != 0) {
                        keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                        i33 &= -7169;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i27 != 0) {
                        z13 = true;
                    } else {
                        z13 = z4;
                    }
                    if (i29 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i;
                    }
                    if (i31 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    i38 = i33;
                    if ((i4 & 131072) != 0) {
                        shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                        i39 = i38 & (-29360129);
                    } else {
                        i39 = i38;
                        shapeM1074RoundedCornerShape0680j_4 = shape;
                    }
                    if ((i4 & 262144) != 0) {
                        textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                        composer3 = composerStartRestartGroup;
                        i39 &= -234881025;
                    } else {
                        composer3 = composerStartRestartGroup;
                        textFieldColorsC = textFieldColors;
                    }
                    shape3 = shapeM1074RoundedCornerShape0680j_4;
                    i40 = i36;
                    keyboardActions4 = keyboardActions3;
                    z14 = z6;
                    textStyle4 = textStyle2;
                    function16 = function7;
                    function17 = function8;
                    i41 = i39;
                    function18 = function15;
                    visualTransformation3 = none;
                    keyboardOptions4 = keyboardOptions3;
                    z15 = z13;
                    i42 = i37;
                    if (i32 != 0) {
                        function19 = null;
                    } else {
                        function19 = function6;
                    }
                    textFieldColors3 = textFieldColorsC;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    z16 = z12;
                }
                composer3.endDefaults();
                z17 = z16;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                }
                composer4 = composer3;
                composer4.startReplaceGroup(1090927577);
                jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                if (jM6770getColor0d7_KjU != 16) {
                    z5 = z5;
                } else {
                    i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                    }
                    stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                    if (z5 == 0) {
                        unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                    } else if (z17) {
                        unfocusedTextColor = textFieldColors3.getErrorTextColor();
                    } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                        unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                    } else {
                        unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                    }
                    State stateRememberUpdatedState1111 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState1111.getValue()).m4615unboximpl();
                }
                long j16 = jM6770getColor0d7_KjU;
                composer4.endReplaceGroup();
                final TextStyle textStyleMerge16 = textStyle4.merge(new TextStyle(j16, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                if (z17) {
                    cursorColor = textFieldColors3.getErrorCursorColor();
                } else {
                    cursorColor = textFieldColors3.getCursorColor();
                }
                final State stateRememberUpdatedState1112 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                ProvidedValue<TextSelectionColors> providedValueProvides16 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                TextStyle textStyle110 = textStyle4;
                final TextFieldColors textFieldColors19 = textFieldColors3;
                final boolean z1113 = z5;
                CompositionLocalKt.CompositionLocalProvider(providedValueProvides16, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        final boolean z1114;
                        final VisualTransformation visualTransformation4;
                        Composer composer5 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                            }
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                            Modifier modifier2 = modifier;
                            final boolean z20 = z1113;
                            final boolean z21 = z17;
                            final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                            final TextFieldColors textFieldColors110 = textFieldColors19;
                            Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors110, null, 0.0f, 0.0f, 112, null);
                            SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState1112.getValue()).m4615unboximpl(), null);
                            Function3 function3RememberComposableLambda = function19;
                            TextFieldValue textFieldValue = value;
                            VisualTransformation visualTransformation5 = visualTransformation3;
                            boolean z22 = z15;
                            if (function3RememberComposableLambda == null) {
                                composer5.startReplaceGroup(1071062574);
                                final String text = textFieldValue.getText();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                }
                                final Function2 function215 = function16;
                                final Function2 function216 = function17;
                                final Function2 function217 = function14;
                                final Function2 function218 = function18;
                                z1114 = z22;
                                visualTransformation4 = visualTransformation5;
                                function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                        Composer composer6 = (Composer) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        Intrinsics.i(innerTextField, "innerTextField");
                                        if ((iIntValue2 & 6) == 0) {
                                            iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                        }
                                        if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                            }
                                            float f = 0;
                                            TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z1114, visualTransformation4, mutableInteractionSource5, z21, function215, function216, function217, function218, null, null, null, null, textFieldColors110, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer6.skipToGroupEnd();
                                        }
                                        return Unit.f17538a;
                                    }
                                }, composer5, 54);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                z1114 = z22;
                                visualTransformation4 = visualTransformation5;
                                composer5.startReplaceGroup(1071062047);
                            }
                            composer5.endReplaceGroup();
                            BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge16, keyboardOptions4, keyboardActions4, z1114, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer5.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                Function2 function215 = function14;
                visualTransformation2 = visualTransformation3;
                function9 = function215;
                mutableInteractionSource2 = mutableInteractionSource4;
                composer2 = composer4;
                function12 = function17;
                z8 = z15;
                keyboardActions2 = keyboardActions4;
                textStyle3 = textStyle110;
                z9 = z1113;
                z11 = z17;
                textFieldColors2 = textFieldColors19;
                z10 = z14;
                i35 = i42;
                function10 = function19;
                function11 = function16;
                function13 = function18;
                keyboardOptions2 = keyboardOptions4;
                shape2 = shape3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function9 = function4;
                visualTransformation2 = visualTransformation;
                keyboardActions2 = keyboardActions;
                z8 = z4;
                i35 = i;
                mutableInteractionSource2 = mutableInteractionSource;
                shape2 = shape;
                textFieldColors2 = textFieldColors;
                function10 = function6;
                z9 = z5;
                z10 = z6;
                composer2 = composerStartRestartGroup;
                textStyle3 = textStyle2;
                function11 = function7;
                function12 = function8;
                function13 = function5;
                z11 = z3;
                keyboardOptions2 = keyboardOptions;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                        ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i5 |= 3072;
        z5 = z;
        i6 = i4 & 16;
        if (i6 != 0) {
            if ((i2 & 24576) == 0) {
                z6 = z2;
                if (composerStartRestartGroup.changed(z6)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i5 |= i7;
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                textStyle2 = textStyle;
                if ((i4 & 32) == 0) {
                    i44 = 65536;
                } else {
                    i44 = 65536;
                }
                i5 |= i44;
            } else {
                textStyle2 = textStyle;
            }
            i8 = i4 & 64;
            if (i8 != 0) {
                i5 |= 1572864;
                function7 = function2;
            } else {
                function7 = function2;
                if ((i2 & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i5 |= i9;
                }
            }
            i10 = i4 & 128;
            if (i10 != 0) {
                i5 |= 12582912;
                function8 = function3;
            } else {
                function8 = function3;
                if ((i2 & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function8)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i5 |= i11;
                }
            }
            i12 = i4 & 256;
            i13 = 33554432;
            if (i12 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i5 |= i14;
            }
            i15 = i4 & 512;
            if (i15 != 0) {
                if ((i2 & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i5 |= i16;
                }
                i17 = i4 & 1024;
                if (i17 != 0) {
                    i18 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i18 = i3 | i19;
                } else {
                    i18 = i3;
                }
                i20 = i4 & 2048;
                if (i20 != 0) {
                    i18 |= 48;
                } else if ((i3 & 48) != 0) {
                    if (composerStartRestartGroup.changed(visualTransformation)) {
                        i21 = 32;
                    } else {
                        i21 = 16;
                    }
                    i18 |= i21;
                }
                i22 = i18;
                i23 = i4 & 4096;
                if (i23 != 0) {
                    i24 = i22;
                    if ((i3 & 384) == 0) {
                        if (composerStartRestartGroup.changed(keyboardOptions)) {
                            i25 = 256;
                        } else {
                            i25 = 128;
                        }
                        i24 |= i25;
                    }
                    if ((i3 & 3072) != 0) {
                        if ((i4 & 8192) == 0) {
                            i46 = 2048;
                        }
                        i24 |= i46;
                    }
                    i26 = i24;
                    i27 = i4 & 16384;
                    if (i27 != 0) {
                        i28 = i26;
                        if ((i3 & 24576) == 0) {
                            i28 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                        }
                        i29 = i4 & 32768;
                        if (i29 != 0) {
                            i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            if (composerStartRestartGroup.changed(i)) {
                                i30 = 131072;
                            } else {
                                i30 = 65536;
                            }
                            i28 |= i30;
                        }
                        i31 = i4 & 65536;
                        if (i31 != 0) {
                            i28 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                        }
                        if ((i3 & 100663296) != 0) {
                            if ((i4 & 262144) == 0) {
                                i13 = 67108864;
                            }
                            i28 |= i13;
                        }
                        i32 = i4 & 524288;
                        if (i32 != 0) {
                            i28 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                        }
                        i33 = i28;
                        i34 = i5;
                        if ((i5 & 306783379) == 306783378) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0) {
                                if (i45 != 0) {
                                    z5 = true;
                                }
                                if (i6 != 0) {
                                    z6 = false;
                                }
                                if ((i4 & 32) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i36 = i34 & (-458753);
                                } else {
                                    i36 = i34;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                }
                                if (i12 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function4;
                                }
                                if (i15 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function5;
                                }
                                if (i17 != 0) {
                                    z12 = false;
                                } else {
                                    z12 = z3;
                                }
                                if (i20 != 0) {
                                    none = VisualTransformation.INSTANCE.getNone();
                                } else {
                                    none = visualTransformation;
                                }
                                if (i23 != 0) {
                                    keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                                } else {
                                    keyboardOptions3 = keyboardOptions;
                                }
                                if ((i4 & 8192) != 0) {
                                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                    i33 &= -7169;
                                } else {
                                    keyboardActions3 = keyboardActions;
                                }
                                if (i27 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z4;
                                }
                                if (i29 != 0) {
                                    i37 = 1;
                                } else {
                                    i37 = i;
                                }
                                if (i31 != 0) {
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                }
                                i38 = i33;
                                if ((i4 & 131072) != 0) {
                                    shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                    i39 = i38 & (-29360129);
                                } else {
                                    i39 = i38;
                                    shapeM1074RoundedCornerShape0680j_4 = shape;
                                }
                                if ((i4 & 262144) != 0) {
                                    textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                    composer3 = composerStartRestartGroup;
                                    i39 &= -234881025;
                                } else {
                                    composer3 = composerStartRestartGroup;
                                    textFieldColorsC = textFieldColors;
                                }
                                shape3 = shapeM1074RoundedCornerShape0680j_4;
                                i40 = i36;
                                keyboardActions4 = keyboardActions3;
                                z14 = z6;
                                textStyle4 = textStyle2;
                                function16 = function7;
                                function17 = function8;
                                i41 = i39;
                                function18 = function15;
                                visualTransformation3 = none;
                                keyboardOptions4 = keyboardOptions3;
                                z15 = z13;
                                i42 = i37;
                                if (i32 != 0) {
                                    function19 = null;
                                } else {
                                    function19 = function6;
                                }
                                textFieldColors3 = textFieldColorsC;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                z16 = z12;
                            } else {
                                if (i45 != 0) {
                                    z5 = true;
                                }
                                if (i6 != 0) {
                                    z6 = false;
                                }
                                if ((i4 & 32) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i36 = i34 & (-458753);
                                } else {
                                    i36 = i34;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                }
                                if (i12 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function4;
                                }
                                if (i15 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function5;
                                }
                                if (i17 != 0) {
                                    z12 = false;
                                } else {
                                    z12 = z3;
                                }
                                if (i20 != 0) {
                                    none = VisualTransformation.INSTANCE.getNone();
                                } else {
                                    none = visualTransformation;
                                }
                                if (i23 != 0) {
                                    keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                                } else {
                                    keyboardOptions3 = keyboardOptions;
                                }
                                if ((i4 & 8192) != 0) {
                                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                    i33 &= -7169;
                                } else {
                                    keyboardActions3 = keyboardActions;
                                }
                                if (i27 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z4;
                                }
                                if (i29 != 0) {
                                    i37 = 1;
                                } else {
                                    i37 = i;
                                }
                                if (i31 != 0) {
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                }
                                i38 = i33;
                                if ((i4 & 131072) != 0) {
                                    shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                    i39 = i38 & (-29360129);
                                } else {
                                    i39 = i38;
                                    shapeM1074RoundedCornerShape0680j_4 = shape;
                                }
                                if ((i4 & 262144) != 0) {
                                    textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                    composer3 = composerStartRestartGroup;
                                    i39 &= -234881025;
                                } else {
                                    composer3 = composerStartRestartGroup;
                                    textFieldColorsC = textFieldColors;
                                }
                                shape3 = shapeM1074RoundedCornerShape0680j_4;
                                i40 = i36;
                                keyboardActions4 = keyboardActions3;
                                z14 = z6;
                                textStyle4 = textStyle2;
                                function16 = function7;
                                function17 = function8;
                                i41 = i39;
                                function18 = function15;
                                visualTransformation3 = none;
                                keyboardOptions4 = keyboardOptions3;
                                z15 = z13;
                                i42 = i37;
                                if (i32 != 0) {
                                    function19 = null;
                                } else {
                                    function19 = function6;
                                }
                                textFieldColors3 = textFieldColorsC;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                z16 = z12;
                            }
                            composer3.endDefaults();
                            z17 = z16;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                            }
                            composer4 = composer3;
                            composer4.startReplaceGroup(1090927577);
                            jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                            if (jM6770getColor0d7_KjU != 16) {
                                z5 = z5;
                            } else {
                                i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                                }
                                stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                                if (z5 == 0) {
                                    unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                                } else if (z17) {
                                    unfocusedTextColor = textFieldColors3.getErrorTextColor();
                                } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                                    unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                                } else {
                                    unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                                }
                                State stateRememberUpdatedState1113 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState1113.getValue()).m4615unboximpl();
                            }
                            long j17 = jM6770getColor0d7_KjU;
                            composer4.endReplaceGroup();
                            final TextStyle textStyleMerge17 = textStyle4.merge(new TextStyle(j17, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                            if (z17) {
                                cursorColor = textFieldColors3.getErrorCursorColor();
                            } else {
                                cursorColor = textFieldColors3.getCursorColor();
                            }
                            final State stateRememberUpdatedState1114 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                            ProvidedValue<TextSelectionColors> providedValueProvides17 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                            TextStyle textStyle111 = textStyle4;
                            final TextFieldColors textFieldColors110 = textFieldColors3;
                            final boolean z1114 = z5;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides17, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    final boolean z1115;
                                    final VisualTransformation visualTransformation4;
                                    Composer composer5 = (Composer) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                        Modifier modifier2 = modifier;
                                        final boolean z20 = z1114;
                                        final boolean z21 = z17;
                                        final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                        final TextFieldColors textFieldColors111 = textFieldColors110;
                                        Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors111, null, 0.0f, 0.0f, 112, null);
                                        SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState1114.getValue()).m4615unboximpl(), null);
                                        Function3 function3RememberComposableLambda = function19;
                                        TextFieldValue textFieldValue = value;
                                        VisualTransformation visualTransformation5 = visualTransformation3;
                                        boolean z22 = z15;
                                        if (function3RememberComposableLambda == null) {
                                            composer5.startReplaceGroup(1071062574);
                                            final String text = textFieldValue.getText();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                            }
                                            final Function2 function216 = function16;
                                            final Function2 function217 = function17;
                                            final Function2 function218 = function14;
                                            final Function2 function219 = function18;
                                            z1115 = z22;
                                            visualTransformation4 = visualTransformation5;
                                            function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                                    Composer composer6 = (Composer) obj4;
                                                    int iIntValue2 = ((Integer) obj5).intValue();
                                                    Intrinsics.i(innerTextField, "innerTextField");
                                                    if ((iIntValue2 & 6) == 0) {
                                                        iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                                    }
                                                    if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                        }
                                                        float f = 0;
                                                        TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z1115, visualTransformation4, mutableInteractionSource5, z21, function216, function217, function218, function219, null, null, null, null, textFieldColors111, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer6.skipToGroupEnd();
                                                    }
                                                    return Unit.f17538a;
                                                }
                                            }, composer5, 54);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            z1115 = z22;
                                            visualTransformation4 = visualTransformation5;
                                            composer5.startReplaceGroup(1071062047);
                                        }
                                        composer5.endReplaceGroup();
                                        BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge17, keyboardOptions4, keyboardActions4, z1115, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer5.skipToGroupEnd();
                                    }
                                    return Unit.f17538a;
                                }
                            }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            Function2 function216 = function14;
                            visualTransformation2 = visualTransformation3;
                            function9 = function216;
                            mutableInteractionSource2 = mutableInteractionSource4;
                            composer2 = composer4;
                            function12 = function17;
                            z8 = z15;
                            keyboardActions2 = keyboardActions4;
                            textStyle3 = textStyle111;
                            z9 = z1114;
                            z11 = z17;
                            textFieldColors2 = textFieldColors110;
                            z10 = z14;
                            i35 = i42;
                            function10 = function19;
                            function11 = function16;
                            function13 = function18;
                            keyboardOptions2 = keyboardOptions4;
                            shape2 = shape3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function9 = function4;
                            visualTransformation2 = visualTransformation;
                            keyboardActions2 = keyboardActions;
                            z8 = z4;
                            i35 = i;
                            mutableInteractionSource2 = mutableInteractionSource;
                            shape2 = shape;
                            textFieldColors2 = textFieldColors;
                            function10 = function6;
                            z9 = z5;
                            z10 = z6;
                            composer2 = composerStartRestartGroup;
                            textStyle3 = textStyle2;
                            function11 = function7;
                            function12 = function8;
                            function13 = function5;
                            z11 = z3;
                            keyboardOptions2 = keyboardOptions;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                                    ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                                    return Unit.f17538a;
                                }
                            });
                        }
                    }
                    i28 = i26 | 24576;
                    i29 = i4 & 32768;
                    if (i29 != 0) {
                        i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(i)) {
                            i30 = 131072;
                        } else {
                            i30 = 65536;
                        }
                        i28 |= i30;
                    }
                    i31 = i4 & 65536;
                    if (i31 != 0) {
                        i28 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                    }
                    if ((i3 & 100663296) != 0) {
                        if ((i4 & 262144) == 0) {
                            i13 = 67108864;
                        }
                        i28 |= i13;
                    }
                    i32 = i4 & 524288;
                    if (i32 != 0) {
                        i28 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                    }
                    i33 = i28;
                    i34 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i45 != 0) {
                                z5 = true;
                            }
                            if (i6 != 0) {
                                z6 = false;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i36 = i34 & (-458753);
                            } else {
                                i36 = i34;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            }
                            if (i12 != 0) {
                                function14 = null;
                            } else {
                                function14 = function4;
                            }
                            if (i15 != 0) {
                                function15 = null;
                            } else {
                                function15 = function5;
                            }
                            if (i17 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i20 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i23 != 0) {
                                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                            } else {
                                keyboardOptions3 = keyboardOptions;
                            }
                            if ((i4 & 8192) != 0) {
                                keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                i33 &= -7169;
                            } else {
                                keyboardActions3 = keyboardActions;
                            }
                            if (i27 != 0) {
                                z13 = true;
                            } else {
                                z13 = z4;
                            }
                            if (i29 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i;
                            }
                            if (i31 != 0) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            i38 = i33;
                            if ((i4 & 131072) != 0) {
                                shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                i39 = i38 & (-29360129);
                            } else {
                                i39 = i38;
                                shapeM1074RoundedCornerShape0680j_4 = shape;
                            }
                            if ((i4 & 262144) != 0) {
                                textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                composer3 = composerStartRestartGroup;
                                i39 &= -234881025;
                            } else {
                                composer3 = composerStartRestartGroup;
                                textFieldColorsC = textFieldColors;
                            }
                            shape3 = shapeM1074RoundedCornerShape0680j_4;
                            i40 = i36;
                            keyboardActions4 = keyboardActions3;
                            z14 = z6;
                            textStyle4 = textStyle2;
                            function16 = function7;
                            function17 = function8;
                            i41 = i39;
                            function18 = function15;
                            visualTransformation3 = none;
                            keyboardOptions4 = keyboardOptions3;
                            z15 = z13;
                            i42 = i37;
                            if (i32 != 0) {
                                function19 = null;
                            } else {
                                function19 = function6;
                            }
                            textFieldColors3 = textFieldColorsC;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z16 = z12;
                        } else {
                            if (i45 != 0) {
                                z5 = true;
                            }
                            if (i6 != 0) {
                                z6 = false;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i36 = i34 & (-458753);
                            } else {
                                i36 = i34;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            }
                            if (i12 != 0) {
                                function14 = null;
                            } else {
                                function14 = function4;
                            }
                            if (i15 != 0) {
                                function15 = null;
                            } else {
                                function15 = function5;
                            }
                            if (i17 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i20 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i23 != 0) {
                                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                            } else {
                                keyboardOptions3 = keyboardOptions;
                            }
                            if ((i4 & 8192) != 0) {
                                keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                i33 &= -7169;
                            } else {
                                keyboardActions3 = keyboardActions;
                            }
                            if (i27 != 0) {
                                z13 = true;
                            } else {
                                z13 = z4;
                            }
                            if (i29 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i;
                            }
                            if (i31 != 0) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            i38 = i33;
                            if ((i4 & 131072) != 0) {
                                shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                i39 = i38 & (-29360129);
                            } else {
                                i39 = i38;
                                shapeM1074RoundedCornerShape0680j_4 = shape;
                            }
                            if ((i4 & 262144) != 0) {
                                textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                composer3 = composerStartRestartGroup;
                                i39 &= -234881025;
                            } else {
                                composer3 = composerStartRestartGroup;
                                textFieldColorsC = textFieldColors;
                            }
                            shape3 = shapeM1074RoundedCornerShape0680j_4;
                            i40 = i36;
                            keyboardActions4 = keyboardActions3;
                            z14 = z6;
                            textStyle4 = textStyle2;
                            function16 = function7;
                            function17 = function8;
                            i41 = i39;
                            function18 = function15;
                            visualTransformation3 = none;
                            keyboardOptions4 = keyboardOptions3;
                            z15 = z13;
                            i42 = i37;
                            if (i32 != 0) {
                                function19 = null;
                            } else {
                                function19 = function6;
                            }
                            textFieldColors3 = textFieldColorsC;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z16 = z12;
                        }
                        composer3.endDefaults();
                        z17 = z16;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                        }
                        composer4 = composer3;
                        composer4.startReplaceGroup(1090927577);
                        jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                        if (jM6770getColor0d7_KjU != 16) {
                            z5 = z5;
                        } else {
                            i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                            }
                            stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                            if (z5 == 0) {
                                unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                            } else if (z17) {
                                unfocusedTextColor = textFieldColors3.getErrorTextColor();
                            } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                                unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                            } else {
                                unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                            }
                            State stateRememberUpdatedState1115 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState1115.getValue()).m4615unboximpl();
                        }
                        long j18 = jM6770getColor0d7_KjU;
                        composer4.endReplaceGroup();
                        final TextStyle textStyleMerge18 = textStyle4.merge(new TextStyle(j18, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                        if (z17) {
                            cursorColor = textFieldColors3.getErrorCursorColor();
                        } else {
                            cursorColor = textFieldColors3.getCursorColor();
                        }
                        final State stateRememberUpdatedState1116 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                        ProvidedValue<TextSelectionColors> providedValueProvides18 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                        TextStyle textStyle112 = textStyle4;
                        final TextFieldColors textFieldColors111 = textFieldColors3;
                        final boolean z1115 = z5;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides18, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                final boolean z1116;
                                final VisualTransformation visualTransformation4;
                                Composer composer5 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                    Modifier modifier2 = modifier;
                                    final boolean z20 = z1115;
                                    final boolean z21 = z17;
                                    final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                    final TextFieldColors textFieldColors112 = textFieldColors111;
                                    Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors112, null, 0.0f, 0.0f, 112, null);
                                    SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState1116.getValue()).m4615unboximpl(), null);
                                    Function3 function3RememberComposableLambda = function19;
                                    TextFieldValue textFieldValue = value;
                                    VisualTransformation visualTransformation5 = visualTransformation3;
                                    boolean z22 = z15;
                                    if (function3RememberComposableLambda == null) {
                                        composer5.startReplaceGroup(1071062574);
                                        final String text = textFieldValue.getText();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                        }
                                        final Function2 function217 = function16;
                                        final Function2 function218 = function17;
                                        final Function2 function219 = function14;
                                        final Function2 function2110 = function18;
                                        z1116 = z22;
                                        visualTransformation4 = visualTransformation5;
                                        function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                                Composer composer6 = (Composer) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                Intrinsics.i(innerTextField, "innerTextField");
                                                if ((iIntValue2 & 6) == 0) {
                                                    iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                                }
                                                if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                    }
                                                    float f = 0;
                                                    TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z1116, visualTransformation4, mutableInteractionSource5, z21, function217, function218, function219, function2110, null, null, null, null, textFieldColors112, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer6.skipToGroupEnd();
                                                }
                                                return Unit.f17538a;
                                            }
                                        }, composer5, 54);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        z1116 = z22;
                                        visualTransformation4 = visualTransformation5;
                                        composer5.startReplaceGroup(1071062047);
                                    }
                                    composer5.endReplaceGroup();
                                    BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge18, keyboardOptions4, keyboardActions4, z1116, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer5.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            }
                        }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        Function2 function217 = function14;
                        visualTransformation2 = visualTransformation3;
                        function9 = function217;
                        mutableInteractionSource2 = mutableInteractionSource4;
                        composer2 = composer4;
                        function12 = function17;
                        z8 = z15;
                        keyboardActions2 = keyboardActions4;
                        textStyle3 = textStyle112;
                        z9 = z1115;
                        z11 = z17;
                        textFieldColors2 = textFieldColors111;
                        z10 = z14;
                        i35 = i42;
                        function10 = function19;
                        function11 = function16;
                        function13 = function18;
                        keyboardOptions2 = keyboardOptions4;
                        shape2 = shape3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function9 = function4;
                        visualTransformation2 = visualTransformation;
                        keyboardActions2 = keyboardActions;
                        z8 = z4;
                        i35 = i;
                        mutableInteractionSource2 = mutableInteractionSource;
                        shape2 = shape;
                        textFieldColors2 = textFieldColors;
                        function10 = function6;
                        z9 = z5;
                        z10 = z6;
                        composer2 = composerStartRestartGroup;
                        textStyle3 = textStyle2;
                        function11 = function7;
                        function12 = function8;
                        function13 = function5;
                        z11 = z3;
                        keyboardOptions2 = keyboardOptions;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                                ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                                return Unit.f17538a;
                            }
                        });
                    }
                }
                i24 = i22 | 384;
                if ((i3 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i46 = 2048;
                    }
                    i24 |= i46;
                }
                i26 = i24;
                i27 = i4 & 16384;
                if (i27 != 0) {
                    i28 = i26;
                    if ((i3 & 24576) == 0) {
                        i28 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                    }
                    i29 = i4 & 32768;
                    if (i29 != 0) {
                        i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(i)) {
                            i30 = 131072;
                        } else {
                            i30 = 65536;
                        }
                        i28 |= i30;
                    }
                    i31 = i4 & 65536;
                    if (i31 != 0) {
                        i28 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                    }
                    if ((i3 & 100663296) != 0) {
                        if ((i4 & 262144) == 0) {
                            i13 = 67108864;
                        }
                        i28 |= i13;
                    }
                    i32 = i4 & 524288;
                    if (i32 != 0) {
                        i28 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                    }
                    i33 = i28;
                    i34 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i45 != 0) {
                                z5 = true;
                            }
                            if (i6 != 0) {
                                z6 = false;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i36 = i34 & (-458753);
                            } else {
                                i36 = i34;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            }
                            if (i12 != 0) {
                                function14 = null;
                            } else {
                                function14 = function4;
                            }
                            if (i15 != 0) {
                                function15 = null;
                            } else {
                                function15 = function5;
                            }
                            if (i17 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i20 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i23 != 0) {
                                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                            } else {
                                keyboardOptions3 = keyboardOptions;
                            }
                            if ((i4 & 8192) != 0) {
                                keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                i33 &= -7169;
                            } else {
                                keyboardActions3 = keyboardActions;
                            }
                            if (i27 != 0) {
                                z13 = true;
                            } else {
                                z13 = z4;
                            }
                            if (i29 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i;
                            }
                            if (i31 != 0) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            i38 = i33;
                            if ((i4 & 131072) != 0) {
                                shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                i39 = i38 & (-29360129);
                            } else {
                                i39 = i38;
                                shapeM1074RoundedCornerShape0680j_4 = shape;
                            }
                            if ((i4 & 262144) != 0) {
                                textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                composer3 = composerStartRestartGroup;
                                i39 &= -234881025;
                            } else {
                                composer3 = composerStartRestartGroup;
                                textFieldColorsC = textFieldColors;
                            }
                            shape3 = shapeM1074RoundedCornerShape0680j_4;
                            i40 = i36;
                            keyboardActions4 = keyboardActions3;
                            z14 = z6;
                            textStyle4 = textStyle2;
                            function16 = function7;
                            function17 = function8;
                            i41 = i39;
                            function18 = function15;
                            visualTransformation3 = none;
                            keyboardOptions4 = keyboardOptions3;
                            z15 = z13;
                            i42 = i37;
                            if (i32 != 0) {
                                function19 = null;
                            } else {
                                function19 = function6;
                            }
                            textFieldColors3 = textFieldColorsC;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z16 = z12;
                        } else {
                            if (i45 != 0) {
                                z5 = true;
                            }
                            if (i6 != 0) {
                                z6 = false;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i36 = i34 & (-458753);
                            } else {
                                i36 = i34;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            }
                            if (i12 != 0) {
                                function14 = null;
                            } else {
                                function14 = function4;
                            }
                            if (i15 != 0) {
                                function15 = null;
                            } else {
                                function15 = function5;
                            }
                            if (i17 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i20 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i23 != 0) {
                                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                            } else {
                                keyboardOptions3 = keyboardOptions;
                            }
                            if ((i4 & 8192) != 0) {
                                keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                i33 &= -7169;
                            } else {
                                keyboardActions3 = keyboardActions;
                            }
                            if (i27 != 0) {
                                z13 = true;
                            } else {
                                z13 = z4;
                            }
                            if (i29 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i;
                            }
                            if (i31 != 0) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            i38 = i33;
                            if ((i4 & 131072) != 0) {
                                shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                i39 = i38 & (-29360129);
                            } else {
                                i39 = i38;
                                shapeM1074RoundedCornerShape0680j_4 = shape;
                            }
                            if ((i4 & 262144) != 0) {
                                textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                composer3 = composerStartRestartGroup;
                                i39 &= -234881025;
                            } else {
                                composer3 = composerStartRestartGroup;
                                textFieldColorsC = textFieldColors;
                            }
                            shape3 = shapeM1074RoundedCornerShape0680j_4;
                            i40 = i36;
                            keyboardActions4 = keyboardActions3;
                            z14 = z6;
                            textStyle4 = textStyle2;
                            function16 = function7;
                            function17 = function8;
                            i41 = i39;
                            function18 = function15;
                            visualTransformation3 = none;
                            keyboardOptions4 = keyboardOptions3;
                            z15 = z13;
                            i42 = i37;
                            if (i32 != 0) {
                                function19 = null;
                            } else {
                                function19 = function6;
                            }
                            textFieldColors3 = textFieldColorsC;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z16 = z12;
                        }
                        composer3.endDefaults();
                        z17 = z16;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                        }
                        composer4 = composer3;
                        composer4.startReplaceGroup(1090927577);
                        jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                        if (jM6770getColor0d7_KjU != 16) {
                            z5 = z5;
                        } else {
                            i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                            }
                            stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                            if (z5 == 0) {
                                unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                            } else if (z17) {
                                unfocusedTextColor = textFieldColors3.getErrorTextColor();
                            } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                                unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                            } else {
                                unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                            }
                            State stateRememberUpdatedState1117 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState1117.getValue()).m4615unboximpl();
                        }
                        long j19 = jM6770getColor0d7_KjU;
                        composer4.endReplaceGroup();
                        final TextStyle textStyleMerge19 = textStyle4.merge(new TextStyle(j19, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                        if (z17) {
                            cursorColor = textFieldColors3.getErrorCursorColor();
                        } else {
                            cursorColor = textFieldColors3.getCursorColor();
                        }
                        final State stateRememberUpdatedState1118 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                        ProvidedValue<TextSelectionColors> providedValueProvides19 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                        TextStyle textStyle113 = textStyle4;
                        final TextFieldColors textFieldColors112 = textFieldColors3;
                        final boolean z1116 = z5;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides19, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                final boolean z1117;
                                final VisualTransformation visualTransformation4;
                                Composer composer5 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                    Modifier modifier2 = modifier;
                                    final boolean z20 = z1116;
                                    final boolean z21 = z17;
                                    final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                    final TextFieldColors textFieldColors113 = textFieldColors112;
                                    Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors113, null, 0.0f, 0.0f, 112, null);
                                    SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState1118.getValue()).m4615unboximpl(), null);
                                    Function3 function3RememberComposableLambda = function19;
                                    TextFieldValue textFieldValue = value;
                                    VisualTransformation visualTransformation5 = visualTransformation3;
                                    boolean z22 = z15;
                                    if (function3RememberComposableLambda == null) {
                                        composer5.startReplaceGroup(1071062574);
                                        final String text = textFieldValue.getText();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                        }
                                        final Function2 function218 = function16;
                                        final Function2 function219 = function17;
                                        final Function2 function2110 = function14;
                                        final Function2 function2111 = function18;
                                        z1117 = z22;
                                        visualTransformation4 = visualTransformation5;
                                        function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                                Composer composer6 = (Composer) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                Intrinsics.i(innerTextField, "innerTextField");
                                                if ((iIntValue2 & 6) == 0) {
                                                    iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                                }
                                                if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                    }
                                                    float f = 0;
                                                    TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z1117, visualTransformation4, mutableInteractionSource5, z21, function218, function219, function2110, function2111, null, null, null, null, textFieldColors113, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer6.skipToGroupEnd();
                                                }
                                                return Unit.f17538a;
                                            }
                                        }, composer5, 54);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        z1117 = z22;
                                        visualTransformation4 = visualTransformation5;
                                        composer5.startReplaceGroup(1071062047);
                                    }
                                    composer5.endReplaceGroup();
                                    BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge19, keyboardOptions4, keyboardActions4, z1117, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer5.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            }
                        }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        Function2 function218 = function14;
                        visualTransformation2 = visualTransformation3;
                        function9 = function218;
                        mutableInteractionSource2 = mutableInteractionSource4;
                        composer2 = composer4;
                        function12 = function17;
                        z8 = z15;
                        keyboardActions2 = keyboardActions4;
                        textStyle3 = textStyle113;
                        z9 = z1116;
                        z11 = z17;
                        textFieldColors2 = textFieldColors112;
                        z10 = z14;
                        i35 = i42;
                        function10 = function19;
                        function11 = function16;
                        function13 = function18;
                        keyboardOptions2 = keyboardOptions4;
                        shape2 = shape3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function9 = function4;
                        visualTransformation2 = visualTransformation;
                        keyboardActions2 = keyboardActions;
                        z8 = z4;
                        i35 = i;
                        mutableInteractionSource2 = mutableInteractionSource;
                        shape2 = shape;
                        textFieldColors2 = textFieldColors;
                        function10 = function6;
                        z9 = z5;
                        z10 = z6;
                        composer2 = composerStartRestartGroup;
                        textStyle3 = textStyle2;
                        function11 = function7;
                        function12 = function8;
                        function13 = function5;
                        z11 = z3;
                        keyboardOptions2 = keyboardOptions;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                                ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                                return Unit.f17538a;
                            }
                        });
                    }
                }
                i28 = i26 | 24576;
                i29 = i4 & 32768;
                if (i29 != 0) {
                    i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i30 = 131072;
                    } else {
                        i30 = 65536;
                    }
                    i28 |= i30;
                }
                i31 = i4 & 65536;
                if (i31 != 0) {
                    i28 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                if ((i3 & 100663296) != 0) {
                    if ((i4 & 262144) == 0) {
                        i13 = 67108864;
                    }
                    i28 |= i13;
                }
                i32 = i4 & 524288;
                if (i32 != 0) {
                    i28 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                }
                i33 = i28;
                i34 = i5;
                if ((i5 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i45 != 0) {
                            z5 = true;
                        }
                        if (i6 != 0) {
                            z6 = false;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i36 = i34 & (-458753);
                        } else {
                            i36 = i34;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        }
                        if (i12 != 0) {
                            function14 = null;
                        } else {
                            function14 = function4;
                        }
                        if (i15 != 0) {
                            function15 = null;
                        } else {
                            function15 = function5;
                        }
                        if (i17 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i20 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i23 != 0) {
                            keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        if ((i4 & 8192) != 0) {
                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i33 &= -7169;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i27 != 0) {
                            z13 = true;
                        } else {
                            z13 = z4;
                        }
                        if (i29 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i;
                        }
                        if (i31 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        i38 = i33;
                        if ((i4 & 131072) != 0) {
                            shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                            i39 = i38 & (-29360129);
                        } else {
                            i39 = i38;
                            shapeM1074RoundedCornerShape0680j_4 = shape;
                        }
                        if ((i4 & 262144) != 0) {
                            textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                            composer3 = composerStartRestartGroup;
                            i39 &= -234881025;
                        } else {
                            composer3 = composerStartRestartGroup;
                            textFieldColorsC = textFieldColors;
                        }
                        shape3 = shapeM1074RoundedCornerShape0680j_4;
                        i40 = i36;
                        keyboardActions4 = keyboardActions3;
                        z14 = z6;
                        textStyle4 = textStyle2;
                        function16 = function7;
                        function17 = function8;
                        i41 = i39;
                        function18 = function15;
                        visualTransformation3 = none;
                        keyboardOptions4 = keyboardOptions3;
                        z15 = z13;
                        i42 = i37;
                        if (i32 != 0) {
                            function19 = null;
                        } else {
                            function19 = function6;
                        }
                        textFieldColors3 = textFieldColorsC;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z16 = z12;
                    } else {
                        if (i45 != 0) {
                            z5 = true;
                        }
                        if (i6 != 0) {
                            z6 = false;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i36 = i34 & (-458753);
                        } else {
                            i36 = i34;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        }
                        if (i12 != 0) {
                            function14 = null;
                        } else {
                            function14 = function4;
                        }
                        if (i15 != 0) {
                            function15 = null;
                        } else {
                            function15 = function5;
                        }
                        if (i17 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i20 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i23 != 0) {
                            keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        if ((i4 & 8192) != 0) {
                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i33 &= -7169;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i27 != 0) {
                            z13 = true;
                        } else {
                            z13 = z4;
                        }
                        if (i29 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i;
                        }
                        if (i31 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        i38 = i33;
                        if ((i4 & 131072) != 0) {
                            shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                            i39 = i38 & (-29360129);
                        } else {
                            i39 = i38;
                            shapeM1074RoundedCornerShape0680j_4 = shape;
                        }
                        if ((i4 & 262144) != 0) {
                            textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                            composer3 = composerStartRestartGroup;
                            i39 &= -234881025;
                        } else {
                            composer3 = composerStartRestartGroup;
                            textFieldColorsC = textFieldColors;
                        }
                        shape3 = shapeM1074RoundedCornerShape0680j_4;
                        i40 = i36;
                        keyboardActions4 = keyboardActions3;
                        z14 = z6;
                        textStyle4 = textStyle2;
                        function16 = function7;
                        function17 = function8;
                        i41 = i39;
                        function18 = function15;
                        visualTransformation3 = none;
                        keyboardOptions4 = keyboardOptions3;
                        z15 = z13;
                        i42 = i37;
                        if (i32 != 0) {
                            function19 = null;
                        } else {
                            function19 = function6;
                        }
                        textFieldColors3 = textFieldColorsC;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z16 = z12;
                    }
                    composer3.endDefaults();
                    z17 = z16;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                    }
                    composer4 = composer3;
                    composer4.startReplaceGroup(1090927577);
                    jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                    if (jM6770getColor0d7_KjU != 16) {
                        z5 = z5;
                    } else {
                        i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                        }
                        stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                        if (z5 == 0) {
                            unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                        } else if (z17) {
                            unfocusedTextColor = textFieldColors3.getErrorTextColor();
                        } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                            unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                        } else {
                            unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                        }
                        State stateRememberUpdatedState1119 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState1119.getValue()).m4615unboximpl();
                    }
                    long j110 = jM6770getColor0d7_KjU;
                    composer4.endReplaceGroup();
                    final TextStyle textStyleMerge110 = textStyle4.merge(new TextStyle(j110, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                    if (z17) {
                        cursorColor = textFieldColors3.getErrorCursorColor();
                    } else {
                        cursorColor = textFieldColors3.getCursorColor();
                    }
                    final State stateRememberUpdatedState11110 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                    ProvidedValue<TextSelectionColors> providedValueProvides110 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                    TextStyle textStyle114 = textStyle4;
                    final TextFieldColors textFieldColors113 = textFieldColors3;
                    final boolean z1117 = z5;
                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides110, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            final boolean z1118;
                            final VisualTransformation visualTransformation4;
                            Composer composer5 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                Modifier modifier2 = modifier;
                                final boolean z20 = z1117;
                                final boolean z21 = z17;
                                final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                final TextFieldColors textFieldColors114 = textFieldColors113;
                                Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors114, null, 0.0f, 0.0f, 112, null);
                                SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState11110.getValue()).m4615unboximpl(), null);
                                Function3 function3RememberComposableLambda = function19;
                                TextFieldValue textFieldValue = value;
                                VisualTransformation visualTransformation5 = visualTransformation3;
                                boolean z22 = z15;
                                if (function3RememberComposableLambda == null) {
                                    composer5.startReplaceGroup(1071062574);
                                    final String text = textFieldValue.getText();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                    }
                                    final Function2 function219 = function16;
                                    final Function2 function2110 = function17;
                                    final Function2 function2111 = function14;
                                    final Function2 function2112 = function18;
                                    z1118 = z22;
                                    visualTransformation4 = visualTransformation5;
                                    function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                            Composer composer6 = (Composer) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            Intrinsics.i(innerTextField, "innerTextField");
                                            if ((iIntValue2 & 6) == 0) {
                                                iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                            }
                                            if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                }
                                                float f = 0;
                                                TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z1118, visualTransformation4, mutableInteractionSource5, z21, function219, function2110, function2111, function2112, null, null, null, null, textFieldColors114, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer6.skipToGroupEnd();
                                            }
                                            return Unit.f17538a;
                                        }
                                    }, composer5, 54);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    z1118 = z22;
                                    visualTransformation4 = visualTransformation5;
                                    composer5.startReplaceGroup(1071062047);
                                }
                                composer5.endReplaceGroup();
                                BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge110, keyboardOptions4, keyboardActions4, z1118, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer5.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Function2 function219 = function14;
                    visualTransformation2 = visualTransformation3;
                    function9 = function219;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    composer2 = composer4;
                    function12 = function17;
                    z8 = z15;
                    keyboardActions2 = keyboardActions4;
                    textStyle3 = textStyle114;
                    z9 = z1117;
                    z11 = z17;
                    textFieldColors2 = textFieldColors113;
                    z10 = z14;
                    i35 = i42;
                    function10 = function19;
                    function11 = function16;
                    function13 = function18;
                    keyboardOptions2 = keyboardOptions4;
                    shape2 = shape3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function9 = function4;
                    visualTransformation2 = visualTransformation;
                    keyboardActions2 = keyboardActions;
                    z8 = z4;
                    i35 = i;
                    mutableInteractionSource2 = mutableInteractionSource;
                    shape2 = shape;
                    textFieldColors2 = textFieldColors;
                    function10 = function6;
                    z9 = z5;
                    z10 = z6;
                    composer2 = composerStartRestartGroup;
                    textStyle3 = textStyle2;
                    function11 = function7;
                    function12 = function8;
                    function13 = function5;
                    z11 = z3;
                    keyboardOptions2 = keyboardOptions;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                            ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i5 |= 805306368;
            i17 = i4 & 1024;
            if (i17 != 0) {
                i18 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (composerStartRestartGroup.changed(z3)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i3 | i19;
            } else {
                i18 = i3;
            }
            i20 = i4 & 2048;
            if (i20 != 0) {
                i18 |= 48;
            } else if ((i3 & 48) != 0) {
                if (composerStartRestartGroup.changed(visualTransformation)) {
                    i21 = 32;
                } else {
                    i21 = 16;
                }
                i18 |= i21;
            }
            i22 = i18;
            i23 = i4 & 4096;
            if (i23 != 0) {
                i24 = i22;
                if ((i3 & 384) == 0) {
                    if (composerStartRestartGroup.changed(keyboardOptions)) {
                        i25 = 256;
                    } else {
                        i25 = 128;
                    }
                    i24 |= i25;
                }
                if ((i3 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i46 = 2048;
                    }
                    i24 |= i46;
                }
                i26 = i24;
                i27 = i4 & 16384;
                if (i27 != 0) {
                    i28 = i26;
                    if ((i3 & 24576) == 0) {
                        i28 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                    }
                    i29 = i4 & 32768;
                    if (i29 != 0) {
                        i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(i)) {
                            i30 = 131072;
                        } else {
                            i30 = 65536;
                        }
                        i28 |= i30;
                    }
                    i31 = i4 & 65536;
                    if (i31 != 0) {
                        i28 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                    }
                    if ((i3 & 100663296) != 0) {
                        if ((i4 & 262144) == 0) {
                            i13 = 67108864;
                        }
                        i28 |= i13;
                    }
                    i32 = i4 & 524288;
                    if (i32 != 0) {
                        i28 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                    }
                    i33 = i28;
                    i34 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i45 != 0) {
                                z5 = true;
                            }
                            if (i6 != 0) {
                                z6 = false;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i36 = i34 & (-458753);
                            } else {
                                i36 = i34;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            }
                            if (i12 != 0) {
                                function14 = null;
                            } else {
                                function14 = function4;
                            }
                            if (i15 != 0) {
                                function15 = null;
                            } else {
                                function15 = function5;
                            }
                            if (i17 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i20 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i23 != 0) {
                                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                            } else {
                                keyboardOptions3 = keyboardOptions;
                            }
                            if ((i4 & 8192) != 0) {
                                keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                i33 &= -7169;
                            } else {
                                keyboardActions3 = keyboardActions;
                            }
                            if (i27 != 0) {
                                z13 = true;
                            } else {
                                z13 = z4;
                            }
                            if (i29 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i;
                            }
                            if (i31 != 0) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            i38 = i33;
                            if ((i4 & 131072) != 0) {
                                shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                i39 = i38 & (-29360129);
                            } else {
                                i39 = i38;
                                shapeM1074RoundedCornerShape0680j_4 = shape;
                            }
                            if ((i4 & 262144) != 0) {
                                textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                composer3 = composerStartRestartGroup;
                                i39 &= -234881025;
                            } else {
                                composer3 = composerStartRestartGroup;
                                textFieldColorsC = textFieldColors;
                            }
                            shape3 = shapeM1074RoundedCornerShape0680j_4;
                            i40 = i36;
                            keyboardActions4 = keyboardActions3;
                            z14 = z6;
                            textStyle4 = textStyle2;
                            function16 = function7;
                            function17 = function8;
                            i41 = i39;
                            function18 = function15;
                            visualTransformation3 = none;
                            keyboardOptions4 = keyboardOptions3;
                            z15 = z13;
                            i42 = i37;
                            if (i32 != 0) {
                                function19 = null;
                            } else {
                                function19 = function6;
                            }
                            textFieldColors3 = textFieldColorsC;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z16 = z12;
                        } else {
                            if (i45 != 0) {
                                z5 = true;
                            }
                            if (i6 != 0) {
                                z6 = false;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i36 = i34 & (-458753);
                            } else {
                                i36 = i34;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            }
                            if (i12 != 0) {
                                function14 = null;
                            } else {
                                function14 = function4;
                            }
                            if (i15 != 0) {
                                function15 = null;
                            } else {
                                function15 = function5;
                            }
                            if (i17 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i20 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i23 != 0) {
                                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                            } else {
                                keyboardOptions3 = keyboardOptions;
                            }
                            if ((i4 & 8192) != 0) {
                                keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                i33 &= -7169;
                            } else {
                                keyboardActions3 = keyboardActions;
                            }
                            if (i27 != 0) {
                                z13 = true;
                            } else {
                                z13 = z4;
                            }
                            if (i29 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i;
                            }
                            if (i31 != 0) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            i38 = i33;
                            if ((i4 & 131072) != 0) {
                                shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                i39 = i38 & (-29360129);
                            } else {
                                i39 = i38;
                                shapeM1074RoundedCornerShape0680j_4 = shape;
                            }
                            if ((i4 & 262144) != 0) {
                                textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                composer3 = composerStartRestartGroup;
                                i39 &= -234881025;
                            } else {
                                composer3 = composerStartRestartGroup;
                                textFieldColorsC = textFieldColors;
                            }
                            shape3 = shapeM1074RoundedCornerShape0680j_4;
                            i40 = i36;
                            keyboardActions4 = keyboardActions3;
                            z14 = z6;
                            textStyle4 = textStyle2;
                            function16 = function7;
                            function17 = function8;
                            i41 = i39;
                            function18 = function15;
                            visualTransformation3 = none;
                            keyboardOptions4 = keyboardOptions3;
                            z15 = z13;
                            i42 = i37;
                            if (i32 != 0) {
                                function19 = null;
                            } else {
                                function19 = function6;
                            }
                            textFieldColors3 = textFieldColorsC;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z16 = z12;
                        }
                        composer3.endDefaults();
                        z17 = z16;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                        }
                        composer4 = composer3;
                        composer4.startReplaceGroup(1090927577);
                        jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                        if (jM6770getColor0d7_KjU != 16) {
                            z5 = z5;
                        } else {
                            i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                            }
                            stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                            if (z5 == 0) {
                                unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                            } else if (z17) {
                                unfocusedTextColor = textFieldColors3.getErrorTextColor();
                            } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                                unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                            } else {
                                unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                            }
                            State stateRememberUpdatedState11111 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState11111.getValue()).m4615unboximpl();
                        }
                        long j111 = jM6770getColor0d7_KjU;
                        composer4.endReplaceGroup();
                        final TextStyle textStyleMerge111 = textStyle4.merge(new TextStyle(j111, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                        if (z17) {
                            cursorColor = textFieldColors3.getErrorCursorColor();
                        } else {
                            cursorColor = textFieldColors3.getCursorColor();
                        }
                        final State stateRememberUpdatedState11112 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                        ProvidedValue<TextSelectionColors> providedValueProvides111 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                        TextStyle textStyle115 = textStyle4;
                        final TextFieldColors textFieldColors114 = textFieldColors3;
                        final boolean z1118 = z5;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides111, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                final boolean z1119;
                                final VisualTransformation visualTransformation4;
                                Composer composer5 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                    Modifier modifier2 = modifier;
                                    final boolean z20 = z1118;
                                    final boolean z21 = z17;
                                    final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                    final TextFieldColors textFieldColors115 = textFieldColors114;
                                    Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors115, null, 0.0f, 0.0f, 112, null);
                                    SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState11112.getValue()).m4615unboximpl(), null);
                                    Function3 function3RememberComposableLambda = function19;
                                    TextFieldValue textFieldValue = value;
                                    VisualTransformation visualTransformation5 = visualTransformation3;
                                    boolean z22 = z15;
                                    if (function3RememberComposableLambda == null) {
                                        composer5.startReplaceGroup(1071062574);
                                        final String text = textFieldValue.getText();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                        }
                                        final Function2 function2110 = function16;
                                        final Function2 function2111 = function17;
                                        final Function2 function2112 = function14;
                                        final Function2 function2113 = function18;
                                        z1119 = z22;
                                        visualTransformation4 = visualTransformation5;
                                        function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                                Composer composer6 = (Composer) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                Intrinsics.i(innerTextField, "innerTextField");
                                                if ((iIntValue2 & 6) == 0) {
                                                    iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                                }
                                                if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                    }
                                                    float f = 0;
                                                    TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z1119, visualTransformation4, mutableInteractionSource5, z21, function2110, function2111, function2112, function2113, null, null, null, null, textFieldColors115, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer6.skipToGroupEnd();
                                                }
                                                return Unit.f17538a;
                                            }
                                        }, composer5, 54);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        z1119 = z22;
                                        visualTransformation4 = visualTransformation5;
                                        composer5.startReplaceGroup(1071062047);
                                    }
                                    composer5.endReplaceGroup();
                                    BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge111, keyboardOptions4, keyboardActions4, z1119, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer5.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            }
                        }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        Function2 function2110 = function14;
                        visualTransformation2 = visualTransformation3;
                        function9 = function2110;
                        mutableInteractionSource2 = mutableInteractionSource4;
                        composer2 = composer4;
                        function12 = function17;
                        z8 = z15;
                        keyboardActions2 = keyboardActions4;
                        textStyle3 = textStyle115;
                        z9 = z1118;
                        z11 = z17;
                        textFieldColors2 = textFieldColors114;
                        z10 = z14;
                        i35 = i42;
                        function10 = function19;
                        function11 = function16;
                        function13 = function18;
                        keyboardOptions2 = keyboardOptions4;
                        shape2 = shape3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function9 = function4;
                        visualTransformation2 = visualTransformation;
                        keyboardActions2 = keyboardActions;
                        z8 = z4;
                        i35 = i;
                        mutableInteractionSource2 = mutableInteractionSource;
                        shape2 = shape;
                        textFieldColors2 = textFieldColors;
                        function10 = function6;
                        z9 = z5;
                        z10 = z6;
                        composer2 = composerStartRestartGroup;
                        textStyle3 = textStyle2;
                        function11 = function7;
                        function12 = function8;
                        function13 = function5;
                        z11 = z3;
                        keyboardOptions2 = keyboardOptions;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                                ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                                return Unit.f17538a;
                            }
                        });
                    }
                }
                i28 = i26 | 24576;
                i29 = i4 & 32768;
                if (i29 != 0) {
                    i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i30 = 131072;
                    } else {
                        i30 = 65536;
                    }
                    i28 |= i30;
                }
                i31 = i4 & 65536;
                if (i31 != 0) {
                    i28 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                if ((i3 & 100663296) != 0) {
                    if ((i4 & 262144) == 0) {
                        i13 = 67108864;
                    }
                    i28 |= i13;
                }
                i32 = i4 & 524288;
                if (i32 != 0) {
                    i28 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                }
                i33 = i28;
                i34 = i5;
                if ((i5 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i45 != 0) {
                            z5 = true;
                        }
                        if (i6 != 0) {
                            z6 = false;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i36 = i34 & (-458753);
                        } else {
                            i36 = i34;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        }
                        if (i12 != 0) {
                            function14 = null;
                        } else {
                            function14 = function4;
                        }
                        if (i15 != 0) {
                            function15 = null;
                        } else {
                            function15 = function5;
                        }
                        if (i17 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i20 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i23 != 0) {
                            keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        if ((i4 & 8192) != 0) {
                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i33 &= -7169;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i27 != 0) {
                            z13 = true;
                        } else {
                            z13 = z4;
                        }
                        if (i29 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i;
                        }
                        if (i31 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        i38 = i33;
                        if ((i4 & 131072) != 0) {
                            shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                            i39 = i38 & (-29360129);
                        } else {
                            i39 = i38;
                            shapeM1074RoundedCornerShape0680j_4 = shape;
                        }
                        if ((i4 & 262144) != 0) {
                            textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                            composer3 = composerStartRestartGroup;
                            i39 &= -234881025;
                        } else {
                            composer3 = composerStartRestartGroup;
                            textFieldColorsC = textFieldColors;
                        }
                        shape3 = shapeM1074RoundedCornerShape0680j_4;
                        i40 = i36;
                        keyboardActions4 = keyboardActions3;
                        z14 = z6;
                        textStyle4 = textStyle2;
                        function16 = function7;
                        function17 = function8;
                        i41 = i39;
                        function18 = function15;
                        visualTransformation3 = none;
                        keyboardOptions4 = keyboardOptions3;
                        z15 = z13;
                        i42 = i37;
                        if (i32 != 0) {
                            function19 = null;
                        } else {
                            function19 = function6;
                        }
                        textFieldColors3 = textFieldColorsC;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z16 = z12;
                    } else {
                        if (i45 != 0) {
                            z5 = true;
                        }
                        if (i6 != 0) {
                            z6 = false;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i36 = i34 & (-458753);
                        } else {
                            i36 = i34;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        }
                        if (i12 != 0) {
                            function14 = null;
                        } else {
                            function14 = function4;
                        }
                        if (i15 != 0) {
                            function15 = null;
                        } else {
                            function15 = function5;
                        }
                        if (i17 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i20 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i23 != 0) {
                            keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        if ((i4 & 8192) != 0) {
                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i33 &= -7169;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i27 != 0) {
                            z13 = true;
                        } else {
                            z13 = z4;
                        }
                        if (i29 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i;
                        }
                        if (i31 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        i38 = i33;
                        if ((i4 & 131072) != 0) {
                            shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                            i39 = i38 & (-29360129);
                        } else {
                            i39 = i38;
                            shapeM1074RoundedCornerShape0680j_4 = shape;
                        }
                        if ((i4 & 262144) != 0) {
                            textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                            composer3 = composerStartRestartGroup;
                            i39 &= -234881025;
                        } else {
                            composer3 = composerStartRestartGroup;
                            textFieldColorsC = textFieldColors;
                        }
                        shape3 = shapeM1074RoundedCornerShape0680j_4;
                        i40 = i36;
                        keyboardActions4 = keyboardActions3;
                        z14 = z6;
                        textStyle4 = textStyle2;
                        function16 = function7;
                        function17 = function8;
                        i41 = i39;
                        function18 = function15;
                        visualTransformation3 = none;
                        keyboardOptions4 = keyboardOptions3;
                        z15 = z13;
                        i42 = i37;
                        if (i32 != 0) {
                            function19 = null;
                        } else {
                            function19 = function6;
                        }
                        textFieldColors3 = textFieldColorsC;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z16 = z12;
                    }
                    composer3.endDefaults();
                    z17 = z16;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                    }
                    composer4 = composer3;
                    composer4.startReplaceGroup(1090927577);
                    jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                    if (jM6770getColor0d7_KjU != 16) {
                        z5 = z5;
                    } else {
                        i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                        }
                        stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                        if (z5 == 0) {
                            unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                        } else if (z17) {
                            unfocusedTextColor = textFieldColors3.getErrorTextColor();
                        } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                            unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                        } else {
                            unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                        }
                        State stateRememberUpdatedState11113 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState11113.getValue()).m4615unboximpl();
                    }
                    long j112 = jM6770getColor0d7_KjU;
                    composer4.endReplaceGroup();
                    final TextStyle textStyleMerge112 = textStyle4.merge(new TextStyle(j112, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                    if (z17) {
                        cursorColor = textFieldColors3.getErrorCursorColor();
                    } else {
                        cursorColor = textFieldColors3.getCursorColor();
                    }
                    final State stateRememberUpdatedState11114 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                    ProvidedValue<TextSelectionColors> providedValueProvides112 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                    TextStyle textStyle116 = textStyle4;
                    final TextFieldColors textFieldColors115 = textFieldColors3;
                    final boolean z1119 = z5;
                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides112, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            final boolean z11110;
                            final VisualTransformation visualTransformation4;
                            Composer composer5 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                Modifier modifier2 = modifier;
                                final boolean z20 = z1119;
                                final boolean z21 = z17;
                                final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                final TextFieldColors textFieldColors116 = textFieldColors115;
                                Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors116, null, 0.0f, 0.0f, 112, null);
                                SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState11114.getValue()).m4615unboximpl(), null);
                                Function3 function3RememberComposableLambda = function19;
                                TextFieldValue textFieldValue = value;
                                VisualTransformation visualTransformation5 = visualTransformation3;
                                boolean z22 = z15;
                                if (function3RememberComposableLambda == null) {
                                    composer5.startReplaceGroup(1071062574);
                                    final String text = textFieldValue.getText();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                    }
                                    final Function2 function2111 = function16;
                                    final Function2 function2112 = function17;
                                    final Function2 function2113 = function14;
                                    final Function2 function2114 = function18;
                                    z11110 = z22;
                                    visualTransformation4 = visualTransformation5;
                                    function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                            Composer composer6 = (Composer) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            Intrinsics.i(innerTextField, "innerTextField");
                                            if ((iIntValue2 & 6) == 0) {
                                                iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                            }
                                            if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                }
                                                float f = 0;
                                                TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z11110, visualTransformation4, mutableInteractionSource5, z21, function2111, function2112, function2113, function2114, null, null, null, null, textFieldColors116, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer6.skipToGroupEnd();
                                            }
                                            return Unit.f17538a;
                                        }
                                    }, composer5, 54);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    z11110 = z22;
                                    visualTransformation4 = visualTransformation5;
                                    composer5.startReplaceGroup(1071062047);
                                }
                                composer5.endReplaceGroup();
                                BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge112, keyboardOptions4, keyboardActions4, z11110, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer5.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Function2 function2111 = function14;
                    visualTransformation2 = visualTransformation3;
                    function9 = function2111;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    composer2 = composer4;
                    function12 = function17;
                    z8 = z15;
                    keyboardActions2 = keyboardActions4;
                    textStyle3 = textStyle116;
                    z9 = z1119;
                    z11 = z17;
                    textFieldColors2 = textFieldColors115;
                    z10 = z14;
                    i35 = i42;
                    function10 = function19;
                    function11 = function16;
                    function13 = function18;
                    keyboardOptions2 = keyboardOptions4;
                    shape2 = shape3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function9 = function4;
                    visualTransformation2 = visualTransformation;
                    keyboardActions2 = keyboardActions;
                    z8 = z4;
                    i35 = i;
                    mutableInteractionSource2 = mutableInteractionSource;
                    shape2 = shape;
                    textFieldColors2 = textFieldColors;
                    function10 = function6;
                    z9 = z5;
                    z10 = z6;
                    composer2 = composerStartRestartGroup;
                    textStyle3 = textStyle2;
                    function11 = function7;
                    function12 = function8;
                    function13 = function5;
                    z11 = z3;
                    keyboardOptions2 = keyboardOptions;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                            ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i24 = i22 | 384;
            if ((i3 & 3072) != 0) {
                if ((i4 & 8192) == 0) {
                    i46 = 2048;
                }
                i24 |= i46;
            }
            i26 = i24;
            i27 = i4 & 16384;
            if (i27 != 0) {
                i28 = i26;
                if ((i3 & 24576) == 0) {
                    i28 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                }
                i29 = i4 & 32768;
                if (i29 != 0) {
                    i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i30 = 131072;
                    } else {
                        i30 = 65536;
                    }
                    i28 |= i30;
                }
                i31 = i4 & 65536;
                if (i31 != 0) {
                    i28 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                if ((i3 & 100663296) != 0) {
                    if ((i4 & 262144) == 0) {
                        i13 = 67108864;
                    }
                    i28 |= i13;
                }
                i32 = i4 & 524288;
                if (i32 != 0) {
                    i28 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                }
                i33 = i28;
                i34 = i5;
                if ((i5 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i45 != 0) {
                            z5 = true;
                        }
                        if (i6 != 0) {
                            z6 = false;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i36 = i34 & (-458753);
                        } else {
                            i36 = i34;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        }
                        if (i12 != 0) {
                            function14 = null;
                        } else {
                            function14 = function4;
                        }
                        if (i15 != 0) {
                            function15 = null;
                        } else {
                            function15 = function5;
                        }
                        if (i17 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i20 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i23 != 0) {
                            keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        if ((i4 & 8192) != 0) {
                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i33 &= -7169;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i27 != 0) {
                            z13 = true;
                        } else {
                            z13 = z4;
                        }
                        if (i29 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i;
                        }
                        if (i31 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        i38 = i33;
                        if ((i4 & 131072) != 0) {
                            shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                            i39 = i38 & (-29360129);
                        } else {
                            i39 = i38;
                            shapeM1074RoundedCornerShape0680j_4 = shape;
                        }
                        if ((i4 & 262144) != 0) {
                            textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                            composer3 = composerStartRestartGroup;
                            i39 &= -234881025;
                        } else {
                            composer3 = composerStartRestartGroup;
                            textFieldColorsC = textFieldColors;
                        }
                        shape3 = shapeM1074RoundedCornerShape0680j_4;
                        i40 = i36;
                        keyboardActions4 = keyboardActions3;
                        z14 = z6;
                        textStyle4 = textStyle2;
                        function16 = function7;
                        function17 = function8;
                        i41 = i39;
                        function18 = function15;
                        visualTransformation3 = none;
                        keyboardOptions4 = keyboardOptions3;
                        z15 = z13;
                        i42 = i37;
                        if (i32 != 0) {
                            function19 = null;
                        } else {
                            function19 = function6;
                        }
                        textFieldColors3 = textFieldColorsC;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z16 = z12;
                    } else {
                        if (i45 != 0) {
                            z5 = true;
                        }
                        if (i6 != 0) {
                            z6 = false;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i36 = i34 & (-458753);
                        } else {
                            i36 = i34;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        }
                        if (i12 != 0) {
                            function14 = null;
                        } else {
                            function14 = function4;
                        }
                        if (i15 != 0) {
                            function15 = null;
                        } else {
                            function15 = function5;
                        }
                        if (i17 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i20 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i23 != 0) {
                            keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        if ((i4 & 8192) != 0) {
                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i33 &= -7169;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i27 != 0) {
                            z13 = true;
                        } else {
                            z13 = z4;
                        }
                        if (i29 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i;
                        }
                        if (i31 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        i38 = i33;
                        if ((i4 & 131072) != 0) {
                            shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                            i39 = i38 & (-29360129);
                        } else {
                            i39 = i38;
                            shapeM1074RoundedCornerShape0680j_4 = shape;
                        }
                        if ((i4 & 262144) != 0) {
                            textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                            composer3 = composerStartRestartGroup;
                            i39 &= -234881025;
                        } else {
                            composer3 = composerStartRestartGroup;
                            textFieldColorsC = textFieldColors;
                        }
                        shape3 = shapeM1074RoundedCornerShape0680j_4;
                        i40 = i36;
                        keyboardActions4 = keyboardActions3;
                        z14 = z6;
                        textStyle4 = textStyle2;
                        function16 = function7;
                        function17 = function8;
                        i41 = i39;
                        function18 = function15;
                        visualTransformation3 = none;
                        keyboardOptions4 = keyboardOptions3;
                        z15 = z13;
                        i42 = i37;
                        if (i32 != 0) {
                            function19 = null;
                        } else {
                            function19 = function6;
                        }
                        textFieldColors3 = textFieldColorsC;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z16 = z12;
                    }
                    composer3.endDefaults();
                    z17 = z16;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                    }
                    composer4 = composer3;
                    composer4.startReplaceGroup(1090927577);
                    jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                    if (jM6770getColor0d7_KjU != 16) {
                        z5 = z5;
                    } else {
                        i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                        }
                        stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                        if (z5 == 0) {
                            unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                        } else if (z17) {
                            unfocusedTextColor = textFieldColors3.getErrorTextColor();
                        } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                            unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                        } else {
                            unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                        }
                        State stateRememberUpdatedState11115 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState11115.getValue()).m4615unboximpl();
                    }
                    long j113 = jM6770getColor0d7_KjU;
                    composer4.endReplaceGroup();
                    final TextStyle textStyleMerge113 = textStyle4.merge(new TextStyle(j113, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                    if (z17) {
                        cursorColor = textFieldColors3.getErrorCursorColor();
                    } else {
                        cursorColor = textFieldColors3.getCursorColor();
                    }
                    final State stateRememberUpdatedState11116 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                    ProvidedValue<TextSelectionColors> providedValueProvides113 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                    TextStyle textStyle117 = textStyle4;
                    final TextFieldColors textFieldColors116 = textFieldColors3;
                    final boolean z11110 = z5;
                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides113, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            final boolean z11111;
                            final VisualTransformation visualTransformation4;
                            Composer composer5 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                Modifier modifier2 = modifier;
                                final boolean z20 = z11110;
                                final boolean z21 = z17;
                                final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                final TextFieldColors textFieldColors117 = textFieldColors116;
                                Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors117, null, 0.0f, 0.0f, 112, null);
                                SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState11116.getValue()).m4615unboximpl(), null);
                                Function3 function3RememberComposableLambda = function19;
                                TextFieldValue textFieldValue = value;
                                VisualTransformation visualTransformation5 = visualTransformation3;
                                boolean z22 = z15;
                                if (function3RememberComposableLambda == null) {
                                    composer5.startReplaceGroup(1071062574);
                                    final String text = textFieldValue.getText();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                    }
                                    final Function2 function2112 = function16;
                                    final Function2 function2113 = function17;
                                    final Function2 function2114 = function14;
                                    final Function2 function2115 = function18;
                                    z11111 = z22;
                                    visualTransformation4 = visualTransformation5;
                                    function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                            Composer composer6 = (Composer) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            Intrinsics.i(innerTextField, "innerTextField");
                                            if ((iIntValue2 & 6) == 0) {
                                                iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                            }
                                            if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                }
                                                float f = 0;
                                                TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z11111, visualTransformation4, mutableInteractionSource5, z21, function2112, function2113, function2114, function2115, null, null, null, null, textFieldColors117, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer6.skipToGroupEnd();
                                            }
                                            return Unit.f17538a;
                                        }
                                    }, composer5, 54);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    z11111 = z22;
                                    visualTransformation4 = visualTransformation5;
                                    composer5.startReplaceGroup(1071062047);
                                }
                                composer5.endReplaceGroup();
                                BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge113, keyboardOptions4, keyboardActions4, z11111, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer5.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Function2 function2112 = function14;
                    visualTransformation2 = visualTransformation3;
                    function9 = function2112;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    composer2 = composer4;
                    function12 = function17;
                    z8 = z15;
                    keyboardActions2 = keyboardActions4;
                    textStyle3 = textStyle117;
                    z9 = z11110;
                    z11 = z17;
                    textFieldColors2 = textFieldColors116;
                    z10 = z14;
                    i35 = i42;
                    function10 = function19;
                    function11 = function16;
                    function13 = function18;
                    keyboardOptions2 = keyboardOptions4;
                    shape2 = shape3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function9 = function4;
                    visualTransformation2 = visualTransformation;
                    keyboardActions2 = keyboardActions;
                    z8 = z4;
                    i35 = i;
                    mutableInteractionSource2 = mutableInteractionSource;
                    shape2 = shape;
                    textFieldColors2 = textFieldColors;
                    function10 = function6;
                    z9 = z5;
                    z10 = z6;
                    composer2 = composerStartRestartGroup;
                    textStyle3 = textStyle2;
                    function11 = function7;
                    function12 = function8;
                    function13 = function5;
                    z11 = z3;
                    keyboardOptions2 = keyboardOptions;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                            ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i28 = i26 | 24576;
            i29 = i4 & 32768;
            if (i29 != 0) {
                i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i30 = 131072;
                } else {
                    i30 = 65536;
                }
                i28 |= i30;
            }
            i31 = i4 & 65536;
            if (i31 != 0) {
                i28 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
            }
            if ((i3 & 100663296) != 0) {
                if ((i4 & 262144) == 0) {
                    i13 = 67108864;
                }
                i28 |= i13;
            }
            i32 = i4 & 524288;
            if (i32 != 0) {
                i28 |= 805306368;
            } else if ((i3 & 805306368) == 0) {
                i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
            }
            i33 = i28;
            i34 = i5;
            if ((i5 & 306783379) == 306783378) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i45 != 0) {
                        z5 = true;
                    }
                    if (i6 != 0) {
                        z6 = false;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i36 = i34 & (-458753);
                    } else {
                        i36 = i34;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    }
                    if (i12 != 0) {
                        function14 = null;
                    } else {
                        function14 = function4;
                    }
                    if (i15 != 0) {
                        function15 = null;
                    } else {
                        function15 = function5;
                    }
                    if (i17 != 0) {
                        z12 = false;
                    } else {
                        z12 = z3;
                    }
                    if (i20 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i23 != 0) {
                        keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                    } else {
                        keyboardOptions3 = keyboardOptions;
                    }
                    if ((i4 & 8192) != 0) {
                        keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                        i33 &= -7169;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i27 != 0) {
                        z13 = true;
                    } else {
                        z13 = z4;
                    }
                    if (i29 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i;
                    }
                    if (i31 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    i38 = i33;
                    if ((i4 & 131072) != 0) {
                        shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                        i39 = i38 & (-29360129);
                    } else {
                        i39 = i38;
                        shapeM1074RoundedCornerShape0680j_4 = shape;
                    }
                    if ((i4 & 262144) != 0) {
                        textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                        composer3 = composerStartRestartGroup;
                        i39 &= -234881025;
                    } else {
                        composer3 = composerStartRestartGroup;
                        textFieldColorsC = textFieldColors;
                    }
                    shape3 = shapeM1074RoundedCornerShape0680j_4;
                    i40 = i36;
                    keyboardActions4 = keyboardActions3;
                    z14 = z6;
                    textStyle4 = textStyle2;
                    function16 = function7;
                    function17 = function8;
                    i41 = i39;
                    function18 = function15;
                    visualTransformation3 = none;
                    keyboardOptions4 = keyboardOptions3;
                    z15 = z13;
                    i42 = i37;
                    if (i32 != 0) {
                        function19 = null;
                    } else {
                        function19 = function6;
                    }
                    textFieldColors3 = textFieldColorsC;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    z16 = z12;
                } else {
                    if (i45 != 0) {
                        z5 = true;
                    }
                    if (i6 != 0) {
                        z6 = false;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i36 = i34 & (-458753);
                    } else {
                        i36 = i34;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    }
                    if (i12 != 0) {
                        function14 = null;
                    } else {
                        function14 = function4;
                    }
                    if (i15 != 0) {
                        function15 = null;
                    } else {
                        function15 = function5;
                    }
                    if (i17 != 0) {
                        z12 = false;
                    } else {
                        z12 = z3;
                    }
                    if (i20 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i23 != 0) {
                        keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                    } else {
                        keyboardOptions3 = keyboardOptions;
                    }
                    if ((i4 & 8192) != 0) {
                        keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                        i33 &= -7169;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i27 != 0) {
                        z13 = true;
                    } else {
                        z13 = z4;
                    }
                    if (i29 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i;
                    }
                    if (i31 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    i38 = i33;
                    if ((i4 & 131072) != 0) {
                        shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                        i39 = i38 & (-29360129);
                    } else {
                        i39 = i38;
                        shapeM1074RoundedCornerShape0680j_4 = shape;
                    }
                    if ((i4 & 262144) != 0) {
                        textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                        composer3 = composerStartRestartGroup;
                        i39 &= -234881025;
                    } else {
                        composer3 = composerStartRestartGroup;
                        textFieldColorsC = textFieldColors;
                    }
                    shape3 = shapeM1074RoundedCornerShape0680j_4;
                    i40 = i36;
                    keyboardActions4 = keyboardActions3;
                    z14 = z6;
                    textStyle4 = textStyle2;
                    function16 = function7;
                    function17 = function8;
                    i41 = i39;
                    function18 = function15;
                    visualTransformation3 = none;
                    keyboardOptions4 = keyboardOptions3;
                    z15 = z13;
                    i42 = i37;
                    if (i32 != 0) {
                        function19 = null;
                    } else {
                        function19 = function6;
                    }
                    textFieldColors3 = textFieldColorsC;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    z16 = z12;
                }
                composer3.endDefaults();
                z17 = z16;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                }
                composer4 = composer3;
                composer4.startReplaceGroup(1090927577);
                jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                if (jM6770getColor0d7_KjU != 16) {
                    z5 = z5;
                } else {
                    i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                    }
                    stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                    if (z5 == 0) {
                        unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                    } else if (z17) {
                        unfocusedTextColor = textFieldColors3.getErrorTextColor();
                    } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                        unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                    } else {
                        unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                    }
                    State stateRememberUpdatedState11117 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState11117.getValue()).m4615unboximpl();
                }
                long j114 = jM6770getColor0d7_KjU;
                composer4.endReplaceGroup();
                final TextStyle textStyleMerge114 = textStyle4.merge(new TextStyle(j114, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                if (z17) {
                    cursorColor = textFieldColors3.getErrorCursorColor();
                } else {
                    cursorColor = textFieldColors3.getCursorColor();
                }
                final State stateRememberUpdatedState11118 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                ProvidedValue<TextSelectionColors> providedValueProvides114 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                TextStyle textStyle118 = textStyle4;
                final TextFieldColors textFieldColors117 = textFieldColors3;
                final boolean z11111 = z5;
                CompositionLocalKt.CompositionLocalProvider(providedValueProvides114, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        final boolean z11112;
                        final VisualTransformation visualTransformation4;
                        Composer composer5 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                            }
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                            Modifier modifier2 = modifier;
                            final boolean z20 = z11111;
                            final boolean z21 = z17;
                            final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                            final TextFieldColors textFieldColors118 = textFieldColors117;
                            Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors118, null, 0.0f, 0.0f, 112, null);
                            SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState11118.getValue()).m4615unboximpl(), null);
                            Function3 function3RememberComposableLambda = function19;
                            TextFieldValue textFieldValue = value;
                            VisualTransformation visualTransformation5 = visualTransformation3;
                            boolean z22 = z15;
                            if (function3RememberComposableLambda == null) {
                                composer5.startReplaceGroup(1071062574);
                                final String text = textFieldValue.getText();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                }
                                final Function2 function2113 = function16;
                                final Function2 function2114 = function17;
                                final Function2 function2115 = function14;
                                final Function2 function2116 = function18;
                                z11112 = z22;
                                visualTransformation4 = visualTransformation5;
                                function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                        Composer composer6 = (Composer) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        Intrinsics.i(innerTextField, "innerTextField");
                                        if ((iIntValue2 & 6) == 0) {
                                            iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                        }
                                        if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                            }
                                            float f = 0;
                                            TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z11112, visualTransformation4, mutableInteractionSource5, z21, function2113, function2114, function2115, function2116, null, null, null, null, textFieldColors118, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer6.skipToGroupEnd();
                                        }
                                        return Unit.f17538a;
                                    }
                                }, composer5, 54);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                z11112 = z22;
                                visualTransformation4 = visualTransformation5;
                                composer5.startReplaceGroup(1071062047);
                            }
                            composer5.endReplaceGroup();
                            BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge114, keyboardOptions4, keyboardActions4, z11112, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer5.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                Function2 function2113 = function14;
                visualTransformation2 = visualTransformation3;
                function9 = function2113;
                mutableInteractionSource2 = mutableInteractionSource4;
                composer2 = composer4;
                function12 = function17;
                z8 = z15;
                keyboardActions2 = keyboardActions4;
                textStyle3 = textStyle118;
                z9 = z11111;
                z11 = z17;
                textFieldColors2 = textFieldColors117;
                z10 = z14;
                i35 = i42;
                function10 = function19;
                function11 = function16;
                function13 = function18;
                keyboardOptions2 = keyboardOptions4;
                shape2 = shape3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function9 = function4;
                visualTransformation2 = visualTransformation;
                keyboardActions2 = keyboardActions;
                z8 = z4;
                i35 = i;
                mutableInteractionSource2 = mutableInteractionSource;
                shape2 = shape;
                textFieldColors2 = textFieldColors;
                function10 = function6;
                z9 = z5;
                z10 = z6;
                composer2 = composerStartRestartGroup;
                textStyle3 = textStyle2;
                function11 = function7;
                function12 = function8;
                function13 = function5;
                z11 = z3;
                keyboardOptions2 = keyboardOptions;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                        ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i5 |= 24576;
        z6 = z2;
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            textStyle2 = textStyle;
            if ((i4 & 32) == 0) {
                i44 = 65536;
            } else {
                i44 = 65536;
            }
            i5 |= i44;
        } else {
            textStyle2 = textStyle;
        }
        i8 = i4 & 64;
        if (i8 != 0) {
            i5 |= 1572864;
            function7 = function2;
        } else {
            function7 = function2;
            if ((i2 & 1572864) == 0) {
                if (composerStartRestartGroup.changedInstance(function7)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i5 |= i9;
            }
        }
        i10 = i4 & 128;
        if (i10 != 0) {
            i5 |= 12582912;
            function8 = function3;
        } else {
            function8 = function3;
            if ((i2 & 12582912) == 0) {
                if (composerStartRestartGroup.changedInstance(function8)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i5 |= i11;
            }
        }
        i12 = i4 & 256;
        i13 = 33554432;
        if (i12 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (composerStartRestartGroup.changedInstance(function4)) {
                i14 = 67108864;
            } else {
                i14 = 33554432;
            }
            i5 |= i14;
        }
        i15 = i4 & 512;
        if (i15 != 0) {
            if ((i2 & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i5 |= i16;
            }
            i17 = i4 & 1024;
            if (i17 != 0) {
                i18 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (composerStartRestartGroup.changed(z3)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i3 | i19;
            } else {
                i18 = i3;
            }
            i20 = i4 & 2048;
            if (i20 != 0) {
                i18 |= 48;
            } else if ((i3 & 48) != 0) {
                if (composerStartRestartGroup.changed(visualTransformation)) {
                    i21 = 32;
                } else {
                    i21 = 16;
                }
                i18 |= i21;
            }
            i22 = i18;
            i23 = i4 & 4096;
            if (i23 != 0) {
                i24 = i22;
                if ((i3 & 384) == 0) {
                    if (composerStartRestartGroup.changed(keyboardOptions)) {
                        i25 = 256;
                    } else {
                        i25 = 128;
                    }
                    i24 |= i25;
                }
                if ((i3 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i46 = 2048;
                    }
                    i24 |= i46;
                }
                i26 = i24;
                i27 = i4 & 16384;
                if (i27 != 0) {
                    i28 = i26;
                    if ((i3 & 24576) == 0) {
                        i28 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                    }
                    i29 = i4 & 32768;
                    if (i29 != 0) {
                        i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(i)) {
                            i30 = 131072;
                        } else {
                            i30 = 65536;
                        }
                        i28 |= i30;
                    }
                    i31 = i4 & 65536;
                    if (i31 != 0) {
                        i28 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                    }
                    if ((i3 & 100663296) != 0) {
                        if ((i4 & 262144) == 0) {
                            i13 = 67108864;
                        }
                        i28 |= i13;
                    }
                    i32 = i4 & 524288;
                    if (i32 != 0) {
                        i28 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                    }
                    i33 = i28;
                    i34 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i45 != 0) {
                                z5 = true;
                            }
                            if (i6 != 0) {
                                z6 = false;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i36 = i34 & (-458753);
                            } else {
                                i36 = i34;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            }
                            if (i12 != 0) {
                                function14 = null;
                            } else {
                                function14 = function4;
                            }
                            if (i15 != 0) {
                                function15 = null;
                            } else {
                                function15 = function5;
                            }
                            if (i17 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i20 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i23 != 0) {
                                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                            } else {
                                keyboardOptions3 = keyboardOptions;
                            }
                            if ((i4 & 8192) != 0) {
                                keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                i33 &= -7169;
                            } else {
                                keyboardActions3 = keyboardActions;
                            }
                            if (i27 != 0) {
                                z13 = true;
                            } else {
                                z13 = z4;
                            }
                            if (i29 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i;
                            }
                            if (i31 != 0) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            i38 = i33;
                            if ((i4 & 131072) != 0) {
                                shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                i39 = i38 & (-29360129);
                            } else {
                                i39 = i38;
                                shapeM1074RoundedCornerShape0680j_4 = shape;
                            }
                            if ((i4 & 262144) != 0) {
                                textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                composer3 = composerStartRestartGroup;
                                i39 &= -234881025;
                            } else {
                                composer3 = composerStartRestartGroup;
                                textFieldColorsC = textFieldColors;
                            }
                            shape3 = shapeM1074RoundedCornerShape0680j_4;
                            i40 = i36;
                            keyboardActions4 = keyboardActions3;
                            z14 = z6;
                            textStyle4 = textStyle2;
                            function16 = function7;
                            function17 = function8;
                            i41 = i39;
                            function18 = function15;
                            visualTransformation3 = none;
                            keyboardOptions4 = keyboardOptions3;
                            z15 = z13;
                            i42 = i37;
                            if (i32 != 0) {
                                function19 = null;
                            } else {
                                function19 = function6;
                            }
                            textFieldColors3 = textFieldColorsC;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z16 = z12;
                        } else {
                            if (i45 != 0) {
                                z5 = true;
                            }
                            if (i6 != 0) {
                                z6 = false;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i36 = i34 & (-458753);
                            } else {
                                i36 = i34;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            }
                            if (i12 != 0) {
                                function14 = null;
                            } else {
                                function14 = function4;
                            }
                            if (i15 != 0) {
                                function15 = null;
                            } else {
                                function15 = function5;
                            }
                            if (i17 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i20 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i23 != 0) {
                                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                            } else {
                                keyboardOptions3 = keyboardOptions;
                            }
                            if ((i4 & 8192) != 0) {
                                keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                i33 &= -7169;
                            } else {
                                keyboardActions3 = keyboardActions;
                            }
                            if (i27 != 0) {
                                z13 = true;
                            } else {
                                z13 = z4;
                            }
                            if (i29 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i;
                            }
                            if (i31 != 0) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            i38 = i33;
                            if ((i4 & 131072) != 0) {
                                shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                                i39 = i38 & (-29360129);
                            } else {
                                i39 = i38;
                                shapeM1074RoundedCornerShape0680j_4 = shape;
                            }
                            if ((i4 & 262144) != 0) {
                                textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                                composer3 = composerStartRestartGroup;
                                i39 &= -234881025;
                            } else {
                                composer3 = composerStartRestartGroup;
                                textFieldColorsC = textFieldColors;
                            }
                            shape3 = shapeM1074RoundedCornerShape0680j_4;
                            i40 = i36;
                            keyboardActions4 = keyboardActions3;
                            z14 = z6;
                            textStyle4 = textStyle2;
                            function16 = function7;
                            function17 = function8;
                            i41 = i39;
                            function18 = function15;
                            visualTransformation3 = none;
                            keyboardOptions4 = keyboardOptions3;
                            z15 = z13;
                            i42 = i37;
                            if (i32 != 0) {
                                function19 = null;
                            } else {
                                function19 = function6;
                            }
                            textFieldColors3 = textFieldColorsC;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z16 = z12;
                        }
                        composer3.endDefaults();
                        z17 = z16;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                        }
                        composer4 = composer3;
                        composer4.startReplaceGroup(1090927577);
                        jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                        if (jM6770getColor0d7_KjU != 16) {
                            z5 = z5;
                        } else {
                            i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                            }
                            stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                            if (z5 == 0) {
                                unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                            } else if (z17) {
                                unfocusedTextColor = textFieldColors3.getErrorTextColor();
                            } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                                unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                            } else {
                                unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                            }
                            State stateRememberUpdatedState11119 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState11119.getValue()).m4615unboximpl();
                        }
                        long j115 = jM6770getColor0d7_KjU;
                        composer4.endReplaceGroup();
                        final TextStyle textStyleMerge115 = textStyle4.merge(new TextStyle(j115, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                        if (z17) {
                            cursorColor = textFieldColors3.getErrorCursorColor();
                        } else {
                            cursorColor = textFieldColors3.getCursorColor();
                        }
                        final State stateRememberUpdatedState111110 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                        ProvidedValue<TextSelectionColors> providedValueProvides115 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                        TextStyle textStyle119 = textStyle4;
                        final TextFieldColors textFieldColors118 = textFieldColors3;
                        final boolean z11112 = z5;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides115, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                final boolean z11113;
                                final VisualTransformation visualTransformation4;
                                Composer composer5 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                    Modifier modifier2 = modifier;
                                    final boolean z20 = z11112;
                                    final boolean z21 = z17;
                                    final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                    final TextFieldColors textFieldColors119 = textFieldColors118;
                                    Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors119, null, 0.0f, 0.0f, 112, null);
                                    SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState111110.getValue()).m4615unboximpl(), null);
                                    Function3 function3RememberComposableLambda = function19;
                                    TextFieldValue textFieldValue = value;
                                    VisualTransformation visualTransformation5 = visualTransformation3;
                                    boolean z22 = z15;
                                    if (function3RememberComposableLambda == null) {
                                        composer5.startReplaceGroup(1071062574);
                                        final String text = textFieldValue.getText();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                        }
                                        final Function2 function2114 = function16;
                                        final Function2 function2115 = function17;
                                        final Function2 function2116 = function14;
                                        final Function2 function2117 = function18;
                                        z11113 = z22;
                                        visualTransformation4 = visualTransformation5;
                                        function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                                Composer composer6 = (Composer) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                Intrinsics.i(innerTextField, "innerTextField");
                                                if ((iIntValue2 & 6) == 0) {
                                                    iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                                }
                                                if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                    }
                                                    float f = 0;
                                                    TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z11113, visualTransformation4, mutableInteractionSource5, z21, function2114, function2115, function2116, function2117, null, null, null, null, textFieldColors119, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer6.skipToGroupEnd();
                                                }
                                                return Unit.f17538a;
                                            }
                                        }, composer5, 54);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        z11113 = z22;
                                        visualTransformation4 = visualTransformation5;
                                        composer5.startReplaceGroup(1071062047);
                                    }
                                    composer5.endReplaceGroup();
                                    BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge115, keyboardOptions4, keyboardActions4, z11113, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer5.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            }
                        }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        Function2 function2114 = function14;
                        visualTransformation2 = visualTransformation3;
                        function9 = function2114;
                        mutableInteractionSource2 = mutableInteractionSource4;
                        composer2 = composer4;
                        function12 = function17;
                        z8 = z15;
                        keyboardActions2 = keyboardActions4;
                        textStyle3 = textStyle119;
                        z9 = z11112;
                        z11 = z17;
                        textFieldColors2 = textFieldColors118;
                        z10 = z14;
                        i35 = i42;
                        function10 = function19;
                        function11 = function16;
                        function13 = function18;
                        keyboardOptions2 = keyboardOptions4;
                        shape2 = shape3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function9 = function4;
                        visualTransformation2 = visualTransformation;
                        keyboardActions2 = keyboardActions;
                        z8 = z4;
                        i35 = i;
                        mutableInteractionSource2 = mutableInteractionSource;
                        shape2 = shape;
                        textFieldColors2 = textFieldColors;
                        function10 = function6;
                        z9 = z5;
                        z10 = z6;
                        composer2 = composerStartRestartGroup;
                        textStyle3 = textStyle2;
                        function11 = function7;
                        function12 = function8;
                        function13 = function5;
                        z11 = z3;
                        keyboardOptions2 = keyboardOptions;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                                ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                                return Unit.f17538a;
                            }
                        });
                    }
                }
                i28 = i26 | 24576;
                i29 = i4 & 32768;
                if (i29 != 0) {
                    i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i30 = 131072;
                    } else {
                        i30 = 65536;
                    }
                    i28 |= i30;
                }
                i31 = i4 & 65536;
                if (i31 != 0) {
                    i28 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                if ((i3 & 100663296) != 0) {
                    if ((i4 & 262144) == 0) {
                        i13 = 67108864;
                    }
                    i28 |= i13;
                }
                i32 = i4 & 524288;
                if (i32 != 0) {
                    i28 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                }
                i33 = i28;
                i34 = i5;
                if ((i5 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i45 != 0) {
                            z5 = true;
                        }
                        if (i6 != 0) {
                            z6 = false;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i36 = i34 & (-458753);
                        } else {
                            i36 = i34;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        }
                        if (i12 != 0) {
                            function14 = null;
                        } else {
                            function14 = function4;
                        }
                        if (i15 != 0) {
                            function15 = null;
                        } else {
                            function15 = function5;
                        }
                        if (i17 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i20 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i23 != 0) {
                            keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        if ((i4 & 8192) != 0) {
                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i33 &= -7169;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i27 != 0) {
                            z13 = true;
                        } else {
                            z13 = z4;
                        }
                        if (i29 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i;
                        }
                        if (i31 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        i38 = i33;
                        if ((i4 & 131072) != 0) {
                            shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                            i39 = i38 & (-29360129);
                        } else {
                            i39 = i38;
                            shapeM1074RoundedCornerShape0680j_4 = shape;
                        }
                        if ((i4 & 262144) != 0) {
                            textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                            composer3 = composerStartRestartGroup;
                            i39 &= -234881025;
                        } else {
                            composer3 = composerStartRestartGroup;
                            textFieldColorsC = textFieldColors;
                        }
                        shape3 = shapeM1074RoundedCornerShape0680j_4;
                        i40 = i36;
                        keyboardActions4 = keyboardActions3;
                        z14 = z6;
                        textStyle4 = textStyle2;
                        function16 = function7;
                        function17 = function8;
                        i41 = i39;
                        function18 = function15;
                        visualTransformation3 = none;
                        keyboardOptions4 = keyboardOptions3;
                        z15 = z13;
                        i42 = i37;
                        if (i32 != 0) {
                            function19 = null;
                        } else {
                            function19 = function6;
                        }
                        textFieldColors3 = textFieldColorsC;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z16 = z12;
                    } else {
                        if (i45 != 0) {
                            z5 = true;
                        }
                        if (i6 != 0) {
                            z6 = false;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i36 = i34 & (-458753);
                        } else {
                            i36 = i34;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        }
                        if (i12 != 0) {
                            function14 = null;
                        } else {
                            function14 = function4;
                        }
                        if (i15 != 0) {
                            function15 = null;
                        } else {
                            function15 = function5;
                        }
                        if (i17 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i20 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i23 != 0) {
                            keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        if ((i4 & 8192) != 0) {
                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i33 &= -7169;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i27 != 0) {
                            z13 = true;
                        } else {
                            z13 = z4;
                        }
                        if (i29 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i;
                        }
                        if (i31 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        i38 = i33;
                        if ((i4 & 131072) != 0) {
                            shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                            i39 = i38 & (-29360129);
                        } else {
                            i39 = i38;
                            shapeM1074RoundedCornerShape0680j_4 = shape;
                        }
                        if ((i4 & 262144) != 0) {
                            textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                            composer3 = composerStartRestartGroup;
                            i39 &= -234881025;
                        } else {
                            composer3 = composerStartRestartGroup;
                            textFieldColorsC = textFieldColors;
                        }
                        shape3 = shapeM1074RoundedCornerShape0680j_4;
                        i40 = i36;
                        keyboardActions4 = keyboardActions3;
                        z14 = z6;
                        textStyle4 = textStyle2;
                        function16 = function7;
                        function17 = function8;
                        i41 = i39;
                        function18 = function15;
                        visualTransformation3 = none;
                        keyboardOptions4 = keyboardOptions3;
                        z15 = z13;
                        i42 = i37;
                        if (i32 != 0) {
                            function19 = null;
                        } else {
                            function19 = function6;
                        }
                        textFieldColors3 = textFieldColorsC;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z16 = z12;
                    }
                    composer3.endDefaults();
                    z17 = z16;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                    }
                    composer4 = composer3;
                    composer4.startReplaceGroup(1090927577);
                    jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                    if (jM6770getColor0d7_KjU != 16) {
                        z5 = z5;
                    } else {
                        i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                        }
                        stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                        if (z5 == 0) {
                            unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                        } else if (z17) {
                            unfocusedTextColor = textFieldColors3.getErrorTextColor();
                        } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                            unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                        } else {
                            unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                        }
                        State stateRememberUpdatedState111111 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState111111.getValue()).m4615unboximpl();
                    }
                    long j116 = jM6770getColor0d7_KjU;
                    composer4.endReplaceGroup();
                    final TextStyle textStyleMerge116 = textStyle4.merge(new TextStyle(j116, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                    if (z17) {
                        cursorColor = textFieldColors3.getErrorCursorColor();
                    } else {
                        cursorColor = textFieldColors3.getCursorColor();
                    }
                    final State stateRememberUpdatedState111112 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                    ProvidedValue<TextSelectionColors> providedValueProvides116 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                    TextStyle textStyle1110 = textStyle4;
                    final TextFieldColors textFieldColors119 = textFieldColors3;
                    final boolean z11113 = z5;
                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides116, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            final boolean z11114;
                            final VisualTransformation visualTransformation4;
                            Composer composer5 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                Modifier modifier2 = modifier;
                                final boolean z20 = z11113;
                                final boolean z21 = z17;
                                final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                final TextFieldColors textFieldColors1110 = textFieldColors119;
                                Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors1110, null, 0.0f, 0.0f, 112, null);
                                SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState111112.getValue()).m4615unboximpl(), null);
                                Function3 function3RememberComposableLambda = function19;
                                TextFieldValue textFieldValue = value;
                                VisualTransformation visualTransformation5 = visualTransformation3;
                                boolean z22 = z15;
                                if (function3RememberComposableLambda == null) {
                                    composer5.startReplaceGroup(1071062574);
                                    final String text = textFieldValue.getText();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                    }
                                    final Function2 function2115 = function16;
                                    final Function2 function2116 = function17;
                                    final Function2 function2117 = function14;
                                    final Function2 function2118 = function18;
                                    z11114 = z22;
                                    visualTransformation4 = visualTransformation5;
                                    function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                            Composer composer6 = (Composer) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            Intrinsics.i(innerTextField, "innerTextField");
                                            if ((iIntValue2 & 6) == 0) {
                                                iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                            }
                                            if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                }
                                                float f = 0;
                                                TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z11114, visualTransformation4, mutableInteractionSource5, z21, function2115, function2116, function2117, function2118, null, null, null, null, textFieldColors1110, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer6.skipToGroupEnd();
                                            }
                                            return Unit.f17538a;
                                        }
                                    }, composer5, 54);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    z11114 = z22;
                                    visualTransformation4 = visualTransformation5;
                                    composer5.startReplaceGroup(1071062047);
                                }
                                composer5.endReplaceGroup();
                                BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge116, keyboardOptions4, keyboardActions4, z11114, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer5.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Function2 function2115 = function14;
                    visualTransformation2 = visualTransformation3;
                    function9 = function2115;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    composer2 = composer4;
                    function12 = function17;
                    z8 = z15;
                    keyboardActions2 = keyboardActions4;
                    textStyle3 = textStyle1110;
                    z9 = z11113;
                    z11 = z17;
                    textFieldColors2 = textFieldColors119;
                    z10 = z14;
                    i35 = i42;
                    function10 = function19;
                    function11 = function16;
                    function13 = function18;
                    keyboardOptions2 = keyboardOptions4;
                    shape2 = shape3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function9 = function4;
                    visualTransformation2 = visualTransformation;
                    keyboardActions2 = keyboardActions;
                    z8 = z4;
                    i35 = i;
                    mutableInteractionSource2 = mutableInteractionSource;
                    shape2 = shape;
                    textFieldColors2 = textFieldColors;
                    function10 = function6;
                    z9 = z5;
                    z10 = z6;
                    composer2 = composerStartRestartGroup;
                    textStyle3 = textStyle2;
                    function11 = function7;
                    function12 = function8;
                    function13 = function5;
                    z11 = z3;
                    keyboardOptions2 = keyboardOptions;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                            ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i24 = i22 | 384;
            if ((i3 & 3072) != 0) {
                if ((i4 & 8192) == 0) {
                    i46 = 2048;
                }
                i24 |= i46;
            }
            i26 = i24;
            i27 = i4 & 16384;
            if (i27 != 0) {
                i28 = i26;
                if ((i3 & 24576) == 0) {
                    i28 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                }
                i29 = i4 & 32768;
                if (i29 != 0) {
                    i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i30 = 131072;
                    } else {
                        i30 = 65536;
                    }
                    i28 |= i30;
                }
                i31 = i4 & 65536;
                if (i31 != 0) {
                    i28 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                if ((i3 & 100663296) != 0) {
                    if ((i4 & 262144) == 0) {
                        i13 = 67108864;
                    }
                    i28 |= i13;
                }
                i32 = i4 & 524288;
                if (i32 != 0) {
                    i28 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                }
                i33 = i28;
                i34 = i5;
                if ((i5 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i45 != 0) {
                            z5 = true;
                        }
                        if (i6 != 0) {
                            z6 = false;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i36 = i34 & (-458753);
                        } else {
                            i36 = i34;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        }
                        if (i12 != 0) {
                            function14 = null;
                        } else {
                            function14 = function4;
                        }
                        if (i15 != 0) {
                            function15 = null;
                        } else {
                            function15 = function5;
                        }
                        if (i17 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i20 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i23 != 0) {
                            keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        if ((i4 & 8192) != 0) {
                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i33 &= -7169;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i27 != 0) {
                            z13 = true;
                        } else {
                            z13 = z4;
                        }
                        if (i29 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i;
                        }
                        if (i31 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        i38 = i33;
                        if ((i4 & 131072) != 0) {
                            shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                            i39 = i38 & (-29360129);
                        } else {
                            i39 = i38;
                            shapeM1074RoundedCornerShape0680j_4 = shape;
                        }
                        if ((i4 & 262144) != 0) {
                            textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                            composer3 = composerStartRestartGroup;
                            i39 &= -234881025;
                        } else {
                            composer3 = composerStartRestartGroup;
                            textFieldColorsC = textFieldColors;
                        }
                        shape3 = shapeM1074RoundedCornerShape0680j_4;
                        i40 = i36;
                        keyboardActions4 = keyboardActions3;
                        z14 = z6;
                        textStyle4 = textStyle2;
                        function16 = function7;
                        function17 = function8;
                        i41 = i39;
                        function18 = function15;
                        visualTransformation3 = none;
                        keyboardOptions4 = keyboardOptions3;
                        z15 = z13;
                        i42 = i37;
                        if (i32 != 0) {
                            function19 = null;
                        } else {
                            function19 = function6;
                        }
                        textFieldColors3 = textFieldColorsC;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z16 = z12;
                    } else {
                        if (i45 != 0) {
                            z5 = true;
                        }
                        if (i6 != 0) {
                            z6 = false;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i36 = i34 & (-458753);
                        } else {
                            i36 = i34;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        }
                        if (i12 != 0) {
                            function14 = null;
                        } else {
                            function14 = function4;
                        }
                        if (i15 != 0) {
                            function15 = null;
                        } else {
                            function15 = function5;
                        }
                        if (i17 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i20 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i23 != 0) {
                            keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        if ((i4 & 8192) != 0) {
                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i33 &= -7169;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i27 != 0) {
                            z13 = true;
                        } else {
                            z13 = z4;
                        }
                        if (i29 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i;
                        }
                        if (i31 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        i38 = i33;
                        if ((i4 & 131072) != 0) {
                            shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                            i39 = i38 & (-29360129);
                        } else {
                            i39 = i38;
                            shapeM1074RoundedCornerShape0680j_4 = shape;
                        }
                        if ((i4 & 262144) != 0) {
                            textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                            composer3 = composerStartRestartGroup;
                            i39 &= -234881025;
                        } else {
                            composer3 = composerStartRestartGroup;
                            textFieldColorsC = textFieldColors;
                        }
                        shape3 = shapeM1074RoundedCornerShape0680j_4;
                        i40 = i36;
                        keyboardActions4 = keyboardActions3;
                        z14 = z6;
                        textStyle4 = textStyle2;
                        function16 = function7;
                        function17 = function8;
                        i41 = i39;
                        function18 = function15;
                        visualTransformation3 = none;
                        keyboardOptions4 = keyboardOptions3;
                        z15 = z13;
                        i42 = i37;
                        if (i32 != 0) {
                            function19 = null;
                        } else {
                            function19 = function6;
                        }
                        textFieldColors3 = textFieldColorsC;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z16 = z12;
                    }
                    composer3.endDefaults();
                    z17 = z16;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                    }
                    composer4 = composer3;
                    composer4.startReplaceGroup(1090927577);
                    jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                    if (jM6770getColor0d7_KjU != 16) {
                        z5 = z5;
                    } else {
                        i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                        }
                        stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                        if (z5 == 0) {
                            unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                        } else if (z17) {
                            unfocusedTextColor = textFieldColors3.getErrorTextColor();
                        } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                            unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                        } else {
                            unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                        }
                        State stateRememberUpdatedState111113 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState111113.getValue()).m4615unboximpl();
                    }
                    long j117 = jM6770getColor0d7_KjU;
                    composer4.endReplaceGroup();
                    final TextStyle textStyleMerge117 = textStyle4.merge(new TextStyle(j117, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                    if (z17) {
                        cursorColor = textFieldColors3.getErrorCursorColor();
                    } else {
                        cursorColor = textFieldColors3.getCursorColor();
                    }
                    final State stateRememberUpdatedState111114 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                    ProvidedValue<TextSelectionColors> providedValueProvides117 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                    TextStyle textStyle1111 = textStyle4;
                    final TextFieldColors textFieldColors1110 = textFieldColors3;
                    final boolean z11114 = z5;
                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides117, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            final boolean z11115;
                            final VisualTransformation visualTransformation4;
                            Composer composer5 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                Modifier modifier2 = modifier;
                                final boolean z20 = z11114;
                                final boolean z21 = z17;
                                final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                final TextFieldColors textFieldColors1111 = textFieldColors1110;
                                Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors1111, null, 0.0f, 0.0f, 112, null);
                                SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState111114.getValue()).m4615unboximpl(), null);
                                Function3 function3RememberComposableLambda = function19;
                                TextFieldValue textFieldValue = value;
                                VisualTransformation visualTransformation5 = visualTransformation3;
                                boolean z22 = z15;
                                if (function3RememberComposableLambda == null) {
                                    composer5.startReplaceGroup(1071062574);
                                    final String text = textFieldValue.getText();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                    }
                                    final Function2 function2116 = function16;
                                    final Function2 function2117 = function17;
                                    final Function2 function2118 = function14;
                                    final Function2 function2119 = function18;
                                    z11115 = z22;
                                    visualTransformation4 = visualTransformation5;
                                    function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                            Composer composer6 = (Composer) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            Intrinsics.i(innerTextField, "innerTextField");
                                            if ((iIntValue2 & 6) == 0) {
                                                iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                            }
                                            if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                }
                                                float f = 0;
                                                TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z11115, visualTransformation4, mutableInteractionSource5, z21, function2116, function2117, function2118, function2119, null, null, null, null, textFieldColors1111, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer6.skipToGroupEnd();
                                            }
                                            return Unit.f17538a;
                                        }
                                    }, composer5, 54);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    z11115 = z22;
                                    visualTransformation4 = visualTransformation5;
                                    composer5.startReplaceGroup(1071062047);
                                }
                                composer5.endReplaceGroup();
                                BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge117, keyboardOptions4, keyboardActions4, z11115, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer5.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Function2 function2116 = function14;
                    visualTransformation2 = visualTransformation3;
                    function9 = function2116;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    composer2 = composer4;
                    function12 = function17;
                    z8 = z15;
                    keyboardActions2 = keyboardActions4;
                    textStyle3 = textStyle1111;
                    z9 = z11114;
                    z11 = z17;
                    textFieldColors2 = textFieldColors1110;
                    z10 = z14;
                    i35 = i42;
                    function10 = function19;
                    function11 = function16;
                    function13 = function18;
                    keyboardOptions2 = keyboardOptions4;
                    shape2 = shape3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function9 = function4;
                    visualTransformation2 = visualTransformation;
                    keyboardActions2 = keyboardActions;
                    z8 = z4;
                    i35 = i;
                    mutableInteractionSource2 = mutableInteractionSource;
                    shape2 = shape;
                    textFieldColors2 = textFieldColors;
                    function10 = function6;
                    z9 = z5;
                    z10 = z6;
                    composer2 = composerStartRestartGroup;
                    textStyle3 = textStyle2;
                    function11 = function7;
                    function12 = function8;
                    function13 = function5;
                    z11 = z3;
                    keyboardOptions2 = keyboardOptions;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                            ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i28 = i26 | 24576;
            i29 = i4 & 32768;
            if (i29 != 0) {
                i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i30 = 131072;
                } else {
                    i30 = 65536;
                }
                i28 |= i30;
            }
            i31 = i4 & 65536;
            if (i31 != 0) {
                i28 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
            }
            if ((i3 & 100663296) != 0) {
                if ((i4 & 262144) == 0) {
                    i13 = 67108864;
                }
                i28 |= i13;
            }
            i32 = i4 & 524288;
            if (i32 != 0) {
                i28 |= 805306368;
            } else if ((i3 & 805306368) == 0) {
                i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
            }
            i33 = i28;
            i34 = i5;
            if ((i5 & 306783379) == 306783378) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i45 != 0) {
                        z5 = true;
                    }
                    if (i6 != 0) {
                        z6 = false;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i36 = i34 & (-458753);
                    } else {
                        i36 = i34;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    }
                    if (i12 != 0) {
                        function14 = null;
                    } else {
                        function14 = function4;
                    }
                    if (i15 != 0) {
                        function15 = null;
                    } else {
                        function15 = function5;
                    }
                    if (i17 != 0) {
                        z12 = false;
                    } else {
                        z12 = z3;
                    }
                    if (i20 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i23 != 0) {
                        keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                    } else {
                        keyboardOptions3 = keyboardOptions;
                    }
                    if ((i4 & 8192) != 0) {
                        keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                        i33 &= -7169;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i27 != 0) {
                        z13 = true;
                    } else {
                        z13 = z4;
                    }
                    if (i29 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i;
                    }
                    if (i31 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    i38 = i33;
                    if ((i4 & 131072) != 0) {
                        shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                        i39 = i38 & (-29360129);
                    } else {
                        i39 = i38;
                        shapeM1074RoundedCornerShape0680j_4 = shape;
                    }
                    if ((i4 & 262144) != 0) {
                        textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                        composer3 = composerStartRestartGroup;
                        i39 &= -234881025;
                    } else {
                        composer3 = composerStartRestartGroup;
                        textFieldColorsC = textFieldColors;
                    }
                    shape3 = shapeM1074RoundedCornerShape0680j_4;
                    i40 = i36;
                    keyboardActions4 = keyboardActions3;
                    z14 = z6;
                    textStyle4 = textStyle2;
                    function16 = function7;
                    function17 = function8;
                    i41 = i39;
                    function18 = function15;
                    visualTransformation3 = none;
                    keyboardOptions4 = keyboardOptions3;
                    z15 = z13;
                    i42 = i37;
                    if (i32 != 0) {
                        function19 = null;
                    } else {
                        function19 = function6;
                    }
                    textFieldColors3 = textFieldColorsC;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    z16 = z12;
                } else {
                    if (i45 != 0) {
                        z5 = true;
                    }
                    if (i6 != 0) {
                        z6 = false;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i36 = i34 & (-458753);
                    } else {
                        i36 = i34;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    }
                    if (i12 != 0) {
                        function14 = null;
                    } else {
                        function14 = function4;
                    }
                    if (i15 != 0) {
                        function15 = null;
                    } else {
                        function15 = function5;
                    }
                    if (i17 != 0) {
                        z12 = false;
                    } else {
                        z12 = z3;
                    }
                    if (i20 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i23 != 0) {
                        keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                    } else {
                        keyboardOptions3 = keyboardOptions;
                    }
                    if ((i4 & 8192) != 0) {
                        keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                        i33 &= -7169;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i27 != 0) {
                        z13 = true;
                    } else {
                        z13 = z4;
                    }
                    if (i29 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i;
                    }
                    if (i31 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    i38 = i33;
                    if ((i4 & 131072) != 0) {
                        shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                        i39 = i38 & (-29360129);
                    } else {
                        i39 = i38;
                        shapeM1074RoundedCornerShape0680j_4 = shape;
                    }
                    if ((i4 & 262144) != 0) {
                        textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                        composer3 = composerStartRestartGroup;
                        i39 &= -234881025;
                    } else {
                        composer3 = composerStartRestartGroup;
                        textFieldColorsC = textFieldColors;
                    }
                    shape3 = shapeM1074RoundedCornerShape0680j_4;
                    i40 = i36;
                    keyboardActions4 = keyboardActions3;
                    z14 = z6;
                    textStyle4 = textStyle2;
                    function16 = function7;
                    function17 = function8;
                    i41 = i39;
                    function18 = function15;
                    visualTransformation3 = none;
                    keyboardOptions4 = keyboardOptions3;
                    z15 = z13;
                    i42 = i37;
                    if (i32 != 0) {
                        function19 = null;
                    } else {
                        function19 = function6;
                    }
                    textFieldColors3 = textFieldColorsC;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    z16 = z12;
                }
                composer3.endDefaults();
                z17 = z16;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                }
                composer4 = composer3;
                composer4.startReplaceGroup(1090927577);
                jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                if (jM6770getColor0d7_KjU != 16) {
                    z5 = z5;
                } else {
                    i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                    }
                    stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                    if (z5 == 0) {
                        unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                    } else if (z17) {
                        unfocusedTextColor = textFieldColors3.getErrorTextColor();
                    } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                        unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                    } else {
                        unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                    }
                    State stateRememberUpdatedState111115 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState111115.getValue()).m4615unboximpl();
                }
                long j118 = jM6770getColor0d7_KjU;
                composer4.endReplaceGroup();
                final TextStyle textStyleMerge118 = textStyle4.merge(new TextStyle(j118, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                if (z17) {
                    cursorColor = textFieldColors3.getErrorCursorColor();
                } else {
                    cursorColor = textFieldColors3.getCursorColor();
                }
                final State stateRememberUpdatedState111116 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                ProvidedValue<TextSelectionColors> providedValueProvides118 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                TextStyle textStyle1112 = textStyle4;
                final TextFieldColors textFieldColors1111 = textFieldColors3;
                final boolean z11115 = z5;
                CompositionLocalKt.CompositionLocalProvider(providedValueProvides118, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        final boolean z11116;
                        final VisualTransformation visualTransformation4;
                        Composer composer5 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                            }
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                            Modifier modifier2 = modifier;
                            final boolean z20 = z11115;
                            final boolean z21 = z17;
                            final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                            final TextFieldColors textFieldColors1112 = textFieldColors1111;
                            Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors1112, null, 0.0f, 0.0f, 112, null);
                            SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState111116.getValue()).m4615unboximpl(), null);
                            Function3 function3RememberComposableLambda = function19;
                            TextFieldValue textFieldValue = value;
                            VisualTransformation visualTransformation5 = visualTransformation3;
                            boolean z22 = z15;
                            if (function3RememberComposableLambda == null) {
                                composer5.startReplaceGroup(1071062574);
                                final String text = textFieldValue.getText();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                }
                                final Function2 function2117 = function16;
                                final Function2 function2118 = function17;
                                final Function2 function2119 = function14;
                                final Function2 function21110 = function18;
                                z11116 = z22;
                                visualTransformation4 = visualTransformation5;
                                function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                        Composer composer6 = (Composer) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        Intrinsics.i(innerTextField, "innerTextField");
                                        if ((iIntValue2 & 6) == 0) {
                                            iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                        }
                                        if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                            }
                                            float f = 0;
                                            TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z11116, visualTransformation4, mutableInteractionSource5, z21, function2117, function2118, function2119, function21110, null, null, null, null, textFieldColors1112, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer6.skipToGroupEnd();
                                        }
                                        return Unit.f17538a;
                                    }
                                }, composer5, 54);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                z11116 = z22;
                                visualTransformation4 = visualTransformation5;
                                composer5.startReplaceGroup(1071062047);
                            }
                            composer5.endReplaceGroup();
                            BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge118, keyboardOptions4, keyboardActions4, z11116, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer5.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                Function2 function2117 = function14;
                visualTransformation2 = visualTransformation3;
                function9 = function2117;
                mutableInteractionSource2 = mutableInteractionSource4;
                composer2 = composer4;
                function12 = function17;
                z8 = z15;
                keyboardActions2 = keyboardActions4;
                textStyle3 = textStyle1112;
                z9 = z11115;
                z11 = z17;
                textFieldColors2 = textFieldColors1111;
                z10 = z14;
                i35 = i42;
                function10 = function19;
                function11 = function16;
                function13 = function18;
                keyboardOptions2 = keyboardOptions4;
                shape2 = shape3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function9 = function4;
                visualTransformation2 = visualTransformation;
                keyboardActions2 = keyboardActions;
                z8 = z4;
                i35 = i;
                mutableInteractionSource2 = mutableInteractionSource;
                shape2 = shape;
                textFieldColors2 = textFieldColors;
                function10 = function6;
                z9 = z5;
                z10 = z6;
                composer2 = composerStartRestartGroup;
                textStyle3 = textStyle2;
                function11 = function7;
                function12 = function8;
                function13 = function5;
                z11 = z3;
                keyboardOptions2 = keyboardOptions;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                        ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i5 |= 805306368;
        i17 = i4 & 1024;
        if (i17 != 0) {
            i18 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (composerStartRestartGroup.changed(z3)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i18 = i3 | i19;
        } else {
            i18 = i3;
        }
        i20 = i4 & 2048;
        if (i20 != 0) {
            i18 |= 48;
        } else if ((i3 & 48) != 0) {
            if (composerStartRestartGroup.changed(visualTransformation)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i18 |= i21;
        }
        i22 = i18;
        i23 = i4 & 4096;
        if (i23 != 0) {
            i24 = i22;
            if ((i3 & 384) == 0) {
                if (composerStartRestartGroup.changed(keyboardOptions)) {
                    i25 = 256;
                } else {
                    i25 = 128;
                }
                i24 |= i25;
            }
            if ((i3 & 3072) != 0) {
                if ((i4 & 8192) == 0) {
                    i46 = 2048;
                }
                i24 |= i46;
            }
            i26 = i24;
            i27 = i4 & 16384;
            if (i27 != 0) {
                i28 = i26;
                if ((i3 & 24576) == 0) {
                    i28 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                }
                i29 = i4 & 32768;
                if (i29 != 0) {
                    i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i30 = 131072;
                    } else {
                        i30 = 65536;
                    }
                    i28 |= i30;
                }
                i31 = i4 & 65536;
                if (i31 != 0) {
                    i28 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                if ((i3 & 100663296) != 0) {
                    if ((i4 & 262144) == 0) {
                        i13 = 67108864;
                    }
                    i28 |= i13;
                }
                i32 = i4 & 524288;
                if (i32 != 0) {
                    i28 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
                }
                i33 = i28;
                i34 = i5;
                if ((i5 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i45 != 0) {
                            z5 = true;
                        }
                        if (i6 != 0) {
                            z6 = false;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i36 = i34 & (-458753);
                        } else {
                            i36 = i34;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        }
                        if (i12 != 0) {
                            function14 = null;
                        } else {
                            function14 = function4;
                        }
                        if (i15 != 0) {
                            function15 = null;
                        } else {
                            function15 = function5;
                        }
                        if (i17 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i20 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i23 != 0) {
                            keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        if ((i4 & 8192) != 0) {
                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i33 &= -7169;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i27 != 0) {
                            z13 = true;
                        } else {
                            z13 = z4;
                        }
                        if (i29 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i;
                        }
                        if (i31 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        i38 = i33;
                        if ((i4 & 131072) != 0) {
                            shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                            i39 = i38 & (-29360129);
                        } else {
                            i39 = i38;
                            shapeM1074RoundedCornerShape0680j_4 = shape;
                        }
                        if ((i4 & 262144) != 0) {
                            textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                            composer3 = composerStartRestartGroup;
                            i39 &= -234881025;
                        } else {
                            composer3 = composerStartRestartGroup;
                            textFieldColorsC = textFieldColors;
                        }
                        shape3 = shapeM1074RoundedCornerShape0680j_4;
                        i40 = i36;
                        keyboardActions4 = keyboardActions3;
                        z14 = z6;
                        textStyle4 = textStyle2;
                        function16 = function7;
                        function17 = function8;
                        i41 = i39;
                        function18 = function15;
                        visualTransformation3 = none;
                        keyboardOptions4 = keyboardOptions3;
                        z15 = z13;
                        i42 = i37;
                        if (i32 != 0) {
                            function19 = null;
                        } else {
                            function19 = function6;
                        }
                        textFieldColors3 = textFieldColorsC;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z16 = z12;
                    } else {
                        if (i45 != 0) {
                            z5 = true;
                        }
                        if (i6 != 0) {
                            z6 = false;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i36 = i34 & (-458753);
                        } else {
                            i36 = i34;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        }
                        if (i12 != 0) {
                            function14 = null;
                        } else {
                            function14 = function4;
                        }
                        if (i15 != 0) {
                            function15 = null;
                        } else {
                            function15 = function5;
                        }
                        if (i17 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i20 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i23 != 0) {
                            keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        if ((i4 & 8192) != 0) {
                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i33 &= -7169;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i27 != 0) {
                            z13 = true;
                        } else {
                            z13 = z4;
                        }
                        if (i29 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i;
                        }
                        if (i31 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        i38 = i33;
                        if ((i4 & 131072) != 0) {
                            shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                            i39 = i38 & (-29360129);
                        } else {
                            i39 = i38;
                            shapeM1074RoundedCornerShape0680j_4 = shape;
                        }
                        if ((i4 & 262144) != 0) {
                            textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                            composer3 = composerStartRestartGroup;
                            i39 &= -234881025;
                        } else {
                            composer3 = composerStartRestartGroup;
                            textFieldColorsC = textFieldColors;
                        }
                        shape3 = shapeM1074RoundedCornerShape0680j_4;
                        i40 = i36;
                        keyboardActions4 = keyboardActions3;
                        z14 = z6;
                        textStyle4 = textStyle2;
                        function16 = function7;
                        function17 = function8;
                        i41 = i39;
                        function18 = function15;
                        visualTransformation3 = none;
                        keyboardOptions4 = keyboardOptions3;
                        z15 = z13;
                        i42 = i37;
                        if (i32 != 0) {
                            function19 = null;
                        } else {
                            function19 = function6;
                        }
                        textFieldColors3 = textFieldColorsC;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z16 = z12;
                    }
                    composer3.endDefaults();
                    z17 = z16;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                    }
                    composer4 = composer3;
                    composer4.startReplaceGroup(1090927577);
                    jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                    if (jM6770getColor0d7_KjU != 16) {
                        z5 = z5;
                    } else {
                        i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                        }
                        stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                        if (z5 == 0) {
                            unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                        } else if (z17) {
                            unfocusedTextColor = textFieldColors3.getErrorTextColor();
                        } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                            unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                        } else {
                            unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                        }
                        State stateRememberUpdatedState111117 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState111117.getValue()).m4615unboximpl();
                    }
                    long j119 = jM6770getColor0d7_KjU;
                    composer4.endReplaceGroup();
                    final TextStyle textStyleMerge119 = textStyle4.merge(new TextStyle(j119, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                    if (z17) {
                        cursorColor = textFieldColors3.getErrorCursorColor();
                    } else {
                        cursorColor = textFieldColors3.getCursorColor();
                    }
                    final State stateRememberUpdatedState111118 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                    ProvidedValue<TextSelectionColors> providedValueProvides119 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                    TextStyle textStyle1113 = textStyle4;
                    final TextFieldColors textFieldColors1112 = textFieldColors3;
                    final boolean z11116 = z5;
                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides119, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            final boolean z11117;
                            final VisualTransformation visualTransformation4;
                            Composer composer5 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                Modifier modifier2 = modifier;
                                final boolean z20 = z11116;
                                final boolean z21 = z17;
                                final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                final TextFieldColors textFieldColors1113 = textFieldColors1112;
                                Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors1113, null, 0.0f, 0.0f, 112, null);
                                SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState111118.getValue()).m4615unboximpl(), null);
                                Function3 function3RememberComposableLambda = function19;
                                TextFieldValue textFieldValue = value;
                                VisualTransformation visualTransformation5 = visualTransformation3;
                                boolean z22 = z15;
                                if (function3RememberComposableLambda == null) {
                                    composer5.startReplaceGroup(1071062574);
                                    final String text = textFieldValue.getText();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                    }
                                    final Function2 function2118 = function16;
                                    final Function2 function2119 = function17;
                                    final Function2 function21110 = function14;
                                    final Function2 function21111 = function18;
                                    z11117 = z22;
                                    visualTransformation4 = visualTransformation5;
                                    function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                            Composer composer6 = (Composer) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            Intrinsics.i(innerTextField, "innerTextField");
                                            if ((iIntValue2 & 6) == 0) {
                                                iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                            }
                                            if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                                }
                                                float f = 0;
                                                TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z11117, visualTransformation4, mutableInteractionSource5, z21, function2118, function2119, function21110, function21111, null, null, null, null, textFieldColors1113, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer6.skipToGroupEnd();
                                            }
                                            return Unit.f17538a;
                                        }
                                    }, composer5, 54);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    z11117 = z22;
                                    visualTransformation4 = visualTransformation5;
                                    composer5.startReplaceGroup(1071062047);
                                }
                                composer5.endReplaceGroup();
                                BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge119, keyboardOptions4, keyboardActions4, z11117, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer5.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Function2 function2118 = function14;
                    visualTransformation2 = visualTransformation3;
                    function9 = function2118;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    composer2 = composer4;
                    function12 = function17;
                    z8 = z15;
                    keyboardActions2 = keyboardActions4;
                    textStyle3 = textStyle1113;
                    z9 = z11116;
                    z11 = z17;
                    textFieldColors2 = textFieldColors1112;
                    z10 = z14;
                    i35 = i42;
                    function10 = function19;
                    function11 = function16;
                    function13 = function18;
                    keyboardOptions2 = keyboardOptions4;
                    shape2 = shape3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function9 = function4;
                    visualTransformation2 = visualTransformation;
                    keyboardActions2 = keyboardActions;
                    z8 = z4;
                    i35 = i;
                    mutableInteractionSource2 = mutableInteractionSource;
                    shape2 = shape;
                    textFieldColors2 = textFieldColors;
                    function10 = function6;
                    z9 = z5;
                    z10 = z6;
                    composer2 = composerStartRestartGroup;
                    textStyle3 = textStyle2;
                    function11 = function7;
                    function12 = function8;
                    function13 = function5;
                    z11 = z3;
                    keyboardOptions2 = keyboardOptions;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                            ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i28 = i26 | 24576;
            i29 = i4 & 32768;
            if (i29 != 0) {
                i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i30 = 131072;
                } else {
                    i30 = 65536;
                }
                i28 |= i30;
            }
            i31 = i4 & 65536;
            if (i31 != 0) {
                i28 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
            }
            if ((i3 & 100663296) != 0) {
                if ((i4 & 262144) == 0) {
                    i13 = 67108864;
                }
                i28 |= i13;
            }
            i32 = i4 & 524288;
            if (i32 != 0) {
                i28 |= 805306368;
            } else if ((i3 & 805306368) == 0) {
                i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
            }
            i33 = i28;
            i34 = i5;
            if ((i5 & 306783379) == 306783378) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i45 != 0) {
                        z5 = true;
                    }
                    if (i6 != 0) {
                        z6 = false;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i36 = i34 & (-458753);
                    } else {
                        i36 = i34;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    }
                    if (i12 != 0) {
                        function14 = null;
                    } else {
                        function14 = function4;
                    }
                    if (i15 != 0) {
                        function15 = null;
                    } else {
                        function15 = function5;
                    }
                    if (i17 != 0) {
                        z12 = false;
                    } else {
                        z12 = z3;
                    }
                    if (i20 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i23 != 0) {
                        keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                    } else {
                        keyboardOptions3 = keyboardOptions;
                    }
                    if ((i4 & 8192) != 0) {
                        keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                        i33 &= -7169;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i27 != 0) {
                        z13 = true;
                    } else {
                        z13 = z4;
                    }
                    if (i29 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i;
                    }
                    if (i31 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    i38 = i33;
                    if ((i4 & 131072) != 0) {
                        shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                        i39 = i38 & (-29360129);
                    } else {
                        i39 = i38;
                        shapeM1074RoundedCornerShape0680j_4 = shape;
                    }
                    if ((i4 & 262144) != 0) {
                        textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                        composer3 = composerStartRestartGroup;
                        i39 &= -234881025;
                    } else {
                        composer3 = composerStartRestartGroup;
                        textFieldColorsC = textFieldColors;
                    }
                    shape3 = shapeM1074RoundedCornerShape0680j_4;
                    i40 = i36;
                    keyboardActions4 = keyboardActions3;
                    z14 = z6;
                    textStyle4 = textStyle2;
                    function16 = function7;
                    function17 = function8;
                    i41 = i39;
                    function18 = function15;
                    visualTransformation3 = none;
                    keyboardOptions4 = keyboardOptions3;
                    z15 = z13;
                    i42 = i37;
                    if (i32 != 0) {
                        function19 = null;
                    } else {
                        function19 = function6;
                    }
                    textFieldColors3 = textFieldColorsC;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    z16 = z12;
                } else {
                    if (i45 != 0) {
                        z5 = true;
                    }
                    if (i6 != 0) {
                        z6 = false;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i36 = i34 & (-458753);
                    } else {
                        i36 = i34;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    }
                    if (i12 != 0) {
                        function14 = null;
                    } else {
                        function14 = function4;
                    }
                    if (i15 != 0) {
                        function15 = null;
                    } else {
                        function15 = function5;
                    }
                    if (i17 != 0) {
                        z12 = false;
                    } else {
                        z12 = z3;
                    }
                    if (i20 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i23 != 0) {
                        keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                    } else {
                        keyboardOptions3 = keyboardOptions;
                    }
                    if ((i4 & 8192) != 0) {
                        keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                        i33 &= -7169;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i27 != 0) {
                        z13 = true;
                    } else {
                        z13 = z4;
                    }
                    if (i29 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i;
                    }
                    if (i31 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    i38 = i33;
                    if ((i4 & 131072) != 0) {
                        shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                        i39 = i38 & (-29360129);
                    } else {
                        i39 = i38;
                        shapeM1074RoundedCornerShape0680j_4 = shape;
                    }
                    if ((i4 & 262144) != 0) {
                        textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                        composer3 = composerStartRestartGroup;
                        i39 &= -234881025;
                    } else {
                        composer3 = composerStartRestartGroup;
                        textFieldColorsC = textFieldColors;
                    }
                    shape3 = shapeM1074RoundedCornerShape0680j_4;
                    i40 = i36;
                    keyboardActions4 = keyboardActions3;
                    z14 = z6;
                    textStyle4 = textStyle2;
                    function16 = function7;
                    function17 = function8;
                    i41 = i39;
                    function18 = function15;
                    visualTransformation3 = none;
                    keyboardOptions4 = keyboardOptions3;
                    z15 = z13;
                    i42 = i37;
                    if (i32 != 0) {
                        function19 = null;
                    } else {
                        function19 = function6;
                    }
                    textFieldColors3 = textFieldColorsC;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    z16 = z12;
                }
                composer3.endDefaults();
                z17 = z16;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                }
                composer4 = composer3;
                composer4.startReplaceGroup(1090927577);
                jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                if (jM6770getColor0d7_KjU != 16) {
                    z5 = z5;
                } else {
                    i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                    }
                    stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                    if (z5 == 0) {
                        unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                    } else if (z17) {
                        unfocusedTextColor = textFieldColors3.getErrorTextColor();
                    } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                        unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                    } else {
                        unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                    }
                    State stateRememberUpdatedState111119 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState111119.getValue()).m4615unboximpl();
                }
                long j1110 = jM6770getColor0d7_KjU;
                composer4.endReplaceGroup();
                final TextStyle textStyleMerge1110 = textStyle4.merge(new TextStyle(j1110, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                if (z17) {
                    cursorColor = textFieldColors3.getErrorCursorColor();
                } else {
                    cursorColor = textFieldColors3.getCursorColor();
                }
                final State stateRememberUpdatedState1111110 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                ProvidedValue<TextSelectionColors> providedValueProvides1110 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                TextStyle textStyle1114 = textStyle4;
                final TextFieldColors textFieldColors1113 = textFieldColors3;
                final boolean z11117 = z5;
                CompositionLocalKt.CompositionLocalProvider(providedValueProvides1110, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        final boolean z11118;
                        final VisualTransformation visualTransformation4;
                        Composer composer5 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                            }
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                            Modifier modifier2 = modifier;
                            final boolean z20 = z11117;
                            final boolean z21 = z17;
                            final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                            final TextFieldColors textFieldColors1114 = textFieldColors1113;
                            Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors1114, null, 0.0f, 0.0f, 112, null);
                            SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState1111110.getValue()).m4615unboximpl(), null);
                            Function3 function3RememberComposableLambda = function19;
                            TextFieldValue textFieldValue = value;
                            VisualTransformation visualTransformation5 = visualTransformation3;
                            boolean z22 = z15;
                            if (function3RememberComposableLambda == null) {
                                composer5.startReplaceGroup(1071062574);
                                final String text = textFieldValue.getText();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                }
                                final Function2 function2119 = function16;
                                final Function2 function21110 = function17;
                                final Function2 function21111 = function14;
                                final Function2 function21112 = function18;
                                z11118 = z22;
                                visualTransformation4 = visualTransformation5;
                                function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                        Composer composer6 = (Composer) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        Intrinsics.i(innerTextField, "innerTextField");
                                        if ((iIntValue2 & 6) == 0) {
                                            iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                        }
                                        if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                            }
                                            float f = 0;
                                            TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z11118, visualTransformation4, mutableInteractionSource5, z21, function2119, function21110, function21111, function21112, null, null, null, null, textFieldColors1114, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer6.skipToGroupEnd();
                                        }
                                        return Unit.f17538a;
                                    }
                                }, composer5, 54);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                z11118 = z22;
                                visualTransformation4 = visualTransformation5;
                                composer5.startReplaceGroup(1071062047);
                            }
                            composer5.endReplaceGroup();
                            BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge1110, keyboardOptions4, keyboardActions4, z11118, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer5.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                Function2 function2119 = function14;
                visualTransformation2 = visualTransformation3;
                function9 = function2119;
                mutableInteractionSource2 = mutableInteractionSource4;
                composer2 = composer4;
                function12 = function17;
                z8 = z15;
                keyboardActions2 = keyboardActions4;
                textStyle3 = textStyle1114;
                z9 = z11117;
                z11 = z17;
                textFieldColors2 = textFieldColors1113;
                z10 = z14;
                i35 = i42;
                function10 = function19;
                function11 = function16;
                function13 = function18;
                keyboardOptions2 = keyboardOptions4;
                shape2 = shape3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function9 = function4;
                visualTransformation2 = visualTransformation;
                keyboardActions2 = keyboardActions;
                z8 = z4;
                i35 = i;
                mutableInteractionSource2 = mutableInteractionSource;
                shape2 = shape;
                textFieldColors2 = textFieldColors;
                function10 = function6;
                z9 = z5;
                z10 = z6;
                composer2 = composerStartRestartGroup;
                textStyle3 = textStyle2;
                function11 = function7;
                function12 = function8;
                function13 = function5;
                z11 = z3;
                keyboardOptions2 = keyboardOptions;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                        ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i24 = i22 | 384;
        if ((i3 & 3072) != 0) {
            if ((i4 & 8192) == 0) {
                i46 = 2048;
            }
            i24 |= i46;
        }
        i26 = i24;
        i27 = i4 & 16384;
        if (i27 != 0) {
            i28 = i26;
            if ((i3 & 24576) == 0) {
                i28 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
            }
            i29 = i4 & 32768;
            if (i29 != 0) {
                i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i30 = 131072;
                } else {
                    i30 = 65536;
                }
                i28 |= i30;
            }
            i31 = i4 & 65536;
            if (i31 != 0) {
                i28 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
            }
            if ((i3 & 100663296) != 0) {
                if ((i4 & 262144) == 0) {
                    i13 = 67108864;
                }
                i28 |= i13;
            }
            i32 = i4 & 524288;
            if (i32 != 0) {
                i28 |= 805306368;
            } else if ((i3 & 805306368) == 0) {
                i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
            }
            i33 = i28;
            i34 = i5;
            if ((i5 & 306783379) == 306783378) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i45 != 0) {
                        z5 = true;
                    }
                    if (i6 != 0) {
                        z6 = false;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i36 = i34 & (-458753);
                    } else {
                        i36 = i34;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    }
                    if (i12 != 0) {
                        function14 = null;
                    } else {
                        function14 = function4;
                    }
                    if (i15 != 0) {
                        function15 = null;
                    } else {
                        function15 = function5;
                    }
                    if (i17 != 0) {
                        z12 = false;
                    } else {
                        z12 = z3;
                    }
                    if (i20 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i23 != 0) {
                        keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                    } else {
                        keyboardOptions3 = keyboardOptions;
                    }
                    if ((i4 & 8192) != 0) {
                        keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                        i33 &= -7169;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i27 != 0) {
                        z13 = true;
                    } else {
                        z13 = z4;
                    }
                    if (i29 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i;
                    }
                    if (i31 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    i38 = i33;
                    if ((i4 & 131072) != 0) {
                        shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                        i39 = i38 & (-29360129);
                    } else {
                        i39 = i38;
                        shapeM1074RoundedCornerShape0680j_4 = shape;
                    }
                    if ((i4 & 262144) != 0) {
                        textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                        composer3 = composerStartRestartGroup;
                        i39 &= -234881025;
                    } else {
                        composer3 = composerStartRestartGroup;
                        textFieldColorsC = textFieldColors;
                    }
                    shape3 = shapeM1074RoundedCornerShape0680j_4;
                    i40 = i36;
                    keyboardActions4 = keyboardActions3;
                    z14 = z6;
                    textStyle4 = textStyle2;
                    function16 = function7;
                    function17 = function8;
                    i41 = i39;
                    function18 = function15;
                    visualTransformation3 = none;
                    keyboardOptions4 = keyboardOptions3;
                    z15 = z13;
                    i42 = i37;
                    if (i32 != 0) {
                        function19 = null;
                    } else {
                        function19 = function6;
                    }
                    textFieldColors3 = textFieldColorsC;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    z16 = z12;
                } else {
                    if (i45 != 0) {
                        z5 = true;
                    }
                    if (i6 != 0) {
                        z6 = false;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i36 = i34 & (-458753);
                    } else {
                        i36 = i34;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    }
                    if (i12 != 0) {
                        function14 = null;
                    } else {
                        function14 = function4;
                    }
                    if (i15 != 0) {
                        function15 = null;
                    } else {
                        function15 = function5;
                    }
                    if (i17 != 0) {
                        z12 = false;
                    } else {
                        z12 = z3;
                    }
                    if (i20 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i23 != 0) {
                        keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                    } else {
                        keyboardOptions3 = keyboardOptions;
                    }
                    if ((i4 & 8192) != 0) {
                        keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                        i33 &= -7169;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i27 != 0) {
                        z13 = true;
                    } else {
                        z13 = z4;
                    }
                    if (i29 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i;
                    }
                    if (i31 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    i38 = i33;
                    if ((i4 & 131072) != 0) {
                        shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                        i39 = i38 & (-29360129);
                    } else {
                        i39 = i38;
                        shapeM1074RoundedCornerShape0680j_4 = shape;
                    }
                    if ((i4 & 262144) != 0) {
                        textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                        composer3 = composerStartRestartGroup;
                        i39 &= -234881025;
                    } else {
                        composer3 = composerStartRestartGroup;
                        textFieldColorsC = textFieldColors;
                    }
                    shape3 = shapeM1074RoundedCornerShape0680j_4;
                    i40 = i36;
                    keyboardActions4 = keyboardActions3;
                    z14 = z6;
                    textStyle4 = textStyle2;
                    function16 = function7;
                    function17 = function8;
                    i41 = i39;
                    function18 = function15;
                    visualTransformation3 = none;
                    keyboardOptions4 = keyboardOptions3;
                    z15 = z13;
                    i42 = i37;
                    if (i32 != 0) {
                        function19 = null;
                    } else {
                        function19 = function6;
                    }
                    textFieldColors3 = textFieldColorsC;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    z16 = z12;
                }
                composer3.endDefaults();
                z17 = z16;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
                }
                composer4 = composer3;
                composer4.startReplaceGroup(1090927577);
                jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
                if (jM6770getColor0d7_KjU != 16) {
                    z5 = z5;
                } else {
                    i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                    }
                    stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                    if (z5 == 0) {
                        unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                    } else if (z17) {
                        unfocusedTextColor = textFieldColors3.getErrorTextColor();
                    } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                        unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                    } else {
                        unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                    }
                    State stateRememberUpdatedState1111111 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState1111111.getValue()).m4615unboximpl();
                }
                long j1111 = jM6770getColor0d7_KjU;
                composer4.endReplaceGroup();
                final TextStyle textStyleMerge1111 = textStyle4.merge(new TextStyle(j1111, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                if (z17) {
                    cursorColor = textFieldColors3.getErrorCursorColor();
                } else {
                    cursorColor = textFieldColors3.getCursorColor();
                }
                final State stateRememberUpdatedState1111112 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
                ProvidedValue<TextSelectionColors> providedValueProvides1111 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
                TextStyle textStyle1115 = textStyle4;
                final TextFieldColors textFieldColors1114 = textFieldColors3;
                final boolean z11118 = z5;
                CompositionLocalKt.CompositionLocalProvider(providedValueProvides1111, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        final boolean z11119;
                        final VisualTransformation visualTransformation4;
                        Composer composer5 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                            }
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                            Modifier modifier2 = modifier;
                            final boolean z20 = z11118;
                            final boolean z21 = z17;
                            final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                            final TextFieldColors textFieldColors1115 = textFieldColors1114;
                            Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors1115, null, 0.0f, 0.0f, 112, null);
                            SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState1111112.getValue()).m4615unboximpl(), null);
                            Function3 function3RememberComposableLambda = function19;
                            TextFieldValue textFieldValue = value;
                            VisualTransformation visualTransformation5 = visualTransformation3;
                            boolean z22 = z15;
                            if (function3RememberComposableLambda == null) {
                                composer5.startReplaceGroup(1071062574);
                                final String text = textFieldValue.getText();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                                }
                                final Function2 function21110 = function16;
                                final Function2 function21111 = function17;
                                final Function2 function21112 = function14;
                                final Function2 function21113 = function18;
                                z11119 = z22;
                                visualTransformation4 = visualTransformation5;
                                function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                        Composer composer6 = (Composer) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        Intrinsics.i(innerTextField, "innerTextField");
                                        if ((iIntValue2 & 6) == 0) {
                                            iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                        }
                                        if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                            }
                                            float f = 0;
                                            TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z11119, visualTransformation4, mutableInteractionSource5, z21, function21110, function21111, function21112, function21113, null, null, null, null, textFieldColors1115, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer6.skipToGroupEnd();
                                        }
                                        return Unit.f17538a;
                                    }
                                }, composer5, 54);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                z11119 = z22;
                                visualTransformation4 = visualTransformation5;
                                composer5.startReplaceGroup(1071062047);
                            }
                            composer5.endReplaceGroup();
                            BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge1111, keyboardOptions4, keyboardActions4, z11119, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer5.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                Function2 function21110 = function14;
                visualTransformation2 = visualTransformation3;
                function9 = function21110;
                mutableInteractionSource2 = mutableInteractionSource4;
                composer2 = composer4;
                function12 = function17;
                z8 = z15;
                keyboardActions2 = keyboardActions4;
                textStyle3 = textStyle1115;
                z9 = z11118;
                z11 = z17;
                textFieldColors2 = textFieldColors1114;
                z10 = z14;
                i35 = i42;
                function10 = function19;
                function11 = function16;
                function13 = function18;
                keyboardOptions2 = keyboardOptions4;
                shape2 = shape3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function9 = function4;
                visualTransformation2 = visualTransformation;
                keyboardActions2 = keyboardActions;
                z8 = z4;
                i35 = i;
                mutableInteractionSource2 = mutableInteractionSource;
                shape2 = shape;
                textFieldColors2 = textFieldColors;
                function10 = function6;
                z9 = z5;
                z10 = z6;
                composer2 = composerStartRestartGroup;
                textStyle3 = textStyle2;
                function11 = function7;
                function12 = function8;
                function13 = function5;
                z11 = z3;
                keyboardOptions2 = keyboardOptions;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                        ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i28 = i26 | 24576;
        i29 = i4 & 32768;
        if (i29 != 0) {
            i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if (composerStartRestartGroup.changed(i)) {
                i30 = 131072;
            } else {
                i30 = 65536;
            }
            i28 |= i30;
        }
        i31 = i4 & 65536;
        if (i31 != 0) {
            i28 |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
        }
        if ((i3 & 100663296) != 0) {
            if ((i4 & 262144) == 0) {
                i13 = 67108864;
            }
            i28 |= i13;
        }
        i32 = i4 & 524288;
        if (i32 != 0) {
            i28 |= 805306368;
        } else if ((i3 & 805306368) == 0) {
            i28 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
        }
        i33 = i28;
        i34 = i5;
        if ((i5 & 306783379) == 306783378) {
            z7 = true;
        } else {
            z7 = true;
        }
        if (composerStartRestartGroup.shouldExecute(z7, i34 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i45 != 0) {
                    z5 = true;
                }
                if (i6 != 0) {
                    z6 = false;
                }
                if ((i4 & 32) != 0) {
                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                    i36 = i34 & (-458753);
                } else {
                    i36 = i34;
                }
                if (i8 != 0) {
                    function7 = null;
                }
                if (i10 != 0) {
                    function8 = null;
                }
                if (i12 != 0) {
                    function14 = null;
                } else {
                    function14 = function4;
                }
                if (i15 != 0) {
                    function15 = null;
                } else {
                    function15 = function5;
                }
                if (i17 != 0) {
                    z12 = false;
                } else {
                    z12 = z3;
                }
                if (i20 != 0) {
                    none = VisualTransformation.INSTANCE.getNone();
                } else {
                    none = visualTransformation;
                }
                if (i23 != 0) {
                    keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                } else {
                    keyboardOptions3 = keyboardOptions;
                }
                if ((i4 & 8192) != 0) {
                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                    i33 &= -7169;
                } else {
                    keyboardActions3 = keyboardActions;
                }
                if (i27 != 0) {
                    z13 = true;
                } else {
                    z13 = z4;
                }
                if (i29 != 0) {
                    i37 = 1;
                } else {
                    i37 = i;
                }
                if (i31 != 0) {
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                i38 = i33;
                if ((i4 & 131072) != 0) {
                    shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                    i39 = i38 & (-29360129);
                } else {
                    i39 = i38;
                    shapeM1074RoundedCornerShape0680j_4 = shape;
                }
                if ((i4 & 262144) != 0) {
                    textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                    composer3 = composerStartRestartGroup;
                    i39 &= -234881025;
                } else {
                    composer3 = composerStartRestartGroup;
                    textFieldColorsC = textFieldColors;
                }
                shape3 = shapeM1074RoundedCornerShape0680j_4;
                i40 = i36;
                keyboardActions4 = keyboardActions3;
                z14 = z6;
                textStyle4 = textStyle2;
                function16 = function7;
                function17 = function8;
                i41 = i39;
                function18 = function15;
                visualTransformation3 = none;
                keyboardOptions4 = keyboardOptions3;
                z15 = z13;
                i42 = i37;
                if (i32 != 0) {
                    function19 = null;
                } else {
                    function19 = function6;
                }
                textFieldColors3 = textFieldColorsC;
                mutableInteractionSource4 = mutableInteractionSource3;
                z16 = z12;
            } else {
                if (i45 != 0) {
                    z5 = true;
                }
                if (i6 != 0) {
                    z6 = false;
                }
                if ((i4 & 32) != 0) {
                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                    i36 = i34 & (-458753);
                } else {
                    i36 = i34;
                }
                if (i8 != 0) {
                    function7 = null;
                }
                if (i10 != 0) {
                    function8 = null;
                }
                if (i12 != 0) {
                    function14 = null;
                } else {
                    function14 = function4;
                }
                if (i15 != 0) {
                    function15 = null;
                } else {
                    function15 = function5;
                }
                if (i17 != 0) {
                    z12 = false;
                } else {
                    z12 = z3;
                }
                if (i20 != 0) {
                    none = VisualTransformation.INSTANCE.getNone();
                } else {
                    none = visualTransformation;
                }
                if (i23 != 0) {
                    keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                } else {
                    keyboardOptions3 = keyboardOptions;
                }
                if ((i4 & 8192) != 0) {
                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                    i33 &= -7169;
                } else {
                    keyboardActions3 = keyboardActions;
                }
                if (i27 != 0) {
                    z13 = true;
                } else {
                    z13 = z4;
                }
                if (i29 != 0) {
                    i37 = 1;
                } else {
                    i37 = i;
                }
                if (i31 != 0) {
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                i38 = i33;
                if ((i4 & 131072) != 0) {
                    shapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6));
                    i39 = i38 & (-29360129);
                } else {
                    i39 = i38;
                    shapeM1074RoundedCornerShape0680j_4 = shape;
                }
                if ((i4 & 262144) != 0) {
                    textFieldColorsC = c(TextFieldDefaults.INSTANCE, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 6, 2097151);
                    composer3 = composerStartRestartGroup;
                    i39 &= -234881025;
                } else {
                    composer3 = composerStartRestartGroup;
                    textFieldColorsC = textFieldColors;
                }
                shape3 = shapeM1074RoundedCornerShape0680j_4;
                i40 = i36;
                keyboardActions4 = keyboardActions3;
                z14 = z6;
                textStyle4 = textStyle2;
                function16 = function7;
                function17 = function8;
                i41 = i39;
                function18 = function15;
                visualTransformation3 = none;
                keyboardOptions4 = keyboardOptions3;
                z15 = z13;
                i42 = i37;
                if (i32 != 0) {
                    function19 = null;
                } else {
                    function19 = function6;
                }
                textFieldColors3 = textFieldColorsC;
                mutableInteractionSource4 = mutableInteractionSource3;
                z16 = z12;
            }
            composer3.endDefaults();
            z17 = z16;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(725156706, i40, i41, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:80)");
            }
            composer4 = composer3;
            composer4.startReplaceGroup(1090927577);
            jM6770getColor0d7_KjU = textStyle4.m6770getColor0d7_KjU();
            if (jM6770getColor0d7_KjU != 16) {
                z5 = z5;
            } else {
                i43 = ((i41 >> 9) & 7168) | ((i40 >> 6) & 112) | ((i41 >> 24) & 14) | ((i41 << 6) & 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(297128019, i43, -1, "app.chalo.compose.components.textfields.textColor (ChaloTextField.kt:206)");
                }
                stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer4, (i43 >> 9) & 14);
                if (z5 == 0) {
                    unfocusedTextColor = textFieldColors3.getDisabledTextColor();
                } else if (z17) {
                    unfocusedTextColor = textFieldColors3.getErrorTextColor();
                } else if (stateCollectIsFocusedAsState.getValue().booleanValue()) {
                    unfocusedTextColor = textFieldColors3.getFocusedTextColor();
                } else {
                    unfocusedTextColor = textFieldColors3.getUnfocusedTextColor();
                }
                State stateRememberUpdatedState1111113 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(unfocusedTextColor), composer4, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                jM6770getColor0d7_KjU = ((Color) stateRememberUpdatedState1111113.getValue()).m4615unboximpl();
            }
            long j1112 = jM6770getColor0d7_KjU;
            composer4.endReplaceGroup();
            final TextStyle textStyleMerge1112 = textStyle4.merge(new TextStyle(j1112, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            if (z17) {
                cursorColor = textFieldColors3.getErrorCursorColor();
            } else {
                cursorColor = textFieldColors3.getCursorColor();
            }
            final State stateRememberUpdatedState1111114 = SnapshotStateKt.rememberUpdatedState(Color.m4595boximpl(cursorColor), composer4, 0);
            ProvidedValue<TextSelectionColors> providedValueProvides1112 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors());
            TextStyle textStyle1116 = textStyle4;
            final TextFieldColors textFieldColors1115 = textFieldColors3;
            final boolean z11119 = z5;
            CompositionLocalKt.CompositionLocalProvider(providedValueProvides1112, ComposableLambdaKt.rememberComposableLambda(-709499230, true, new Function2() { // from class: dm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    final boolean z111110;
                    final VisualTransformation visualTransformation4;
                    Composer composer5 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer5.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-709499230, iIntValue, -1, "app.chalo.compose.components.textfields.ChaloTextField.<anonymous> (ChaloTextField.kt:89)");
                        }
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                        Modifier modifier2 = modifier;
                        final boolean z20 = z11119;
                        final boolean z21 = z17;
                        final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                        final TextFieldColors textFieldColors1116 = textFieldColors1115;
                        Modifier modifierM2596indicatorLineAWlRVLg$default = TextFieldDefaults.m2596indicatorLineAWlRVLg$default(textFieldDefaults, modifier2, z20, z21, mutableInteractionSource5, textFieldColors1116, null, 0.0f, 0.0f, 112, null);
                        SolidColor solidColor = new SolidColor(((Color) stateRememberUpdatedState1111114.getValue()).m4615unboximpl(), null);
                        Function3 function3RememberComposableLambda = function19;
                        TextFieldValue textFieldValue = value;
                        VisualTransformation visualTransformation5 = visualTransformation3;
                        boolean z22 = z15;
                        if (function3RememberComposableLambda == null) {
                            composer5.startReplaceGroup(1071062574);
                            final String text = textFieldValue.getText();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1247641054, 0, 0, "app.chalo.compose.components.textfields.defaultDecorationBox (ChaloTextField.kt:137)");
                            }
                            final Function2 function21111 = function16;
                            final Function2 function21112 = function17;
                            final Function2 function21113 = function14;
                            final Function2 function21114 = function18;
                            z111110 = z22;
                            visualTransformation4 = visualTransformation5;
                            function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1965544496, true, new Function3() { // from class: gm
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    Function2<? super Composer, ? super Integer, Unit> innerTextField = (Function2) obj3;
                                    Composer composer6 = (Composer) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    Intrinsics.i(innerTextField, "innerTextField");
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= composer6.changedInstance(innerTextField) ? 4 : 2;
                                    }
                                    if (composer6.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1965544496, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultDecorationBox.<anonymous> (ChaloTextField.kt:140)");
                                        }
                                        float f = 0;
                                        TextFieldDefaults.INSTANCE.DecorationBox(text, innerTextField, z20, z111110, visualTransformation4, mutableInteractionSource5, z21, function21111, function21112, function21113, function21114, null, null, null, null, textFieldColors1116, PaddingKt.m780PaddingValuesa9UjIt4(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(8)), null, composer6, (iIntValue2 << 3) & 112, 102236160, 161792);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer6.skipToGroupEnd();
                                    }
                                    return Unit.f17538a;
                                }
                            }, composer5, 54);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            z111110 = z22;
                            visualTransformation4 = visualTransformation5;
                            composer5.startReplaceGroup(1071062047);
                        }
                        composer5.endReplaceGroup();
                        BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) onValueChange, modifierM2596indicatorLineAWlRVLg$default, z20, z14, textStyleMerge1112, keyboardOptions4, keyboardActions4, z111110, i42, 0, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3RememberComposableLambda, composer5, 0, 0, 5120);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer5.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composer4, 54), composer4, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Function2 function21111 = function14;
            visualTransformation2 = visualTransformation3;
            function9 = function21111;
            mutableInteractionSource2 = mutableInteractionSource4;
            composer2 = composer4;
            function12 = function17;
            z8 = z15;
            keyboardActions2 = keyboardActions4;
            textStyle3 = textStyle1116;
            z9 = z11119;
            z11 = z17;
            textFieldColors2 = textFieldColors1115;
            z10 = z14;
            i35 = i42;
            function10 = function19;
            function11 = function16;
            function13 = function18;
            keyboardOptions2 = keyboardOptions4;
            shape2 = shape3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function9 = function4;
            visualTransformation2 = visualTransformation;
            keyboardActions2 = keyboardActions;
            z8 = z4;
            i35 = i;
            mutableInteractionSource2 = mutableInteractionSource;
            shape2 = shape;
            textFieldColors2 = textFieldColors;
            function10 = function6;
            z9 = z5;
            z10 = z6;
            composer2 = composerStartRestartGroup;
            textStyle3 = textStyle2;
            function11 = function7;
            function12 = function8;
            function13 = function5;
            z11 = z3;
            keyboardOptions2 = keyboardOptions;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                    ChaloTextFieldKt.a(value, onValueChange, modifier, z9, z10, textStyle3, function11, function12, function9, function13, z11, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i35, mutableInteractionSource2, shape2, textFieldColors2, function10, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i4);
                    return Unit.f17538a;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x013d A[PHI: r8 r9 r10 r12 r13 r15
      0x013d: PHI (r8v26 int) = (r8v18 int), (r8v27 int), (r8v28 int) binds: [B:118:0x016e, B:102:0x0139, B:103:0x013b] A[DONT_GENERATE, DONT_INLINE]
      0x013d: PHI (r9v12 androidx.compose.ui.text.input.VisualTransformation) = 
      (r9v4 androidx.compose.ui.text.input.VisualTransformation)
      (r9v1 androidx.compose.ui.text.input.VisualTransformation)
      (r9v1 androidx.compose.ui.text.input.VisualTransformation)
     binds: [B:118:0x016e, B:102:0x0139, B:103:0x013b] A[DONT_GENERATE, DONT_INLINE]
      0x013d: PHI (r10v7 kotlin.jvm.functions.Function2) = (r10v3 kotlin.jvm.functions.Function2), (r10v1 kotlin.jvm.functions.Function2), (r10v1 kotlin.jvm.functions.Function2) binds: [B:118:0x016e, B:102:0x0139, B:103:0x013b] A[DONT_GENERATE, DONT_INLINE]
      0x013d: PHI (r12v11 androidx.compose.foundation.interaction.MutableInteractionSource) = 
      (r12v3 androidx.compose.foundation.interaction.MutableInteractionSource)
      (r12v1 androidx.compose.foundation.interaction.MutableInteractionSource)
      (r12v1 androidx.compose.foundation.interaction.MutableInteractionSource)
     binds: [B:118:0x016e, B:102:0x0139, B:103:0x013b] A[DONT_GENERATE, DONT_INLINE]
      0x013d: PHI (r13v7 kotlin.jvm.functions.Function1) = (r13v3 kotlin.jvm.functions.Function1), (r13v2 kotlin.jvm.functions.Function1), (r13v2 kotlin.jvm.functions.Function1) binds: [B:118:0x016e, B:102:0x0139, B:103:0x013b] A[DONT_GENERATE, DONT_INLINE]
      0x013d: PHI (r15v9 kotlin.jvm.functions.Function2) = (r15v3 kotlin.jvm.functions.Function2), (r15v2 kotlin.jvm.functions.Function2), (r15v2 kotlin.jvm.functions.Function2) binds: [B:118:0x016e, B:102:0x0139, B:103:0x013b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:106:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0149  */
    /* JADX WARN: Code duplicated, block: B:109:0x014c  */
    /* JADX WARN: Code duplicated, block: B:111:0x014f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0154  */
    /* JADX WARN: Code duplicated, block: B:117:0x015f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0170  */
    /* JADX WARN: Code duplicated, block: B:122:0x017c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0199  */
    /* JADX WARN: Code duplicated, block: B:126:0x019e  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:136:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:148:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:151:0x0208  */
    /* JADX WARN: Code duplicated, block: B:153:0x0210  */
    /* JADX WARN: Code duplicated, block: B:156:0x0262  */
    /* JADX WARN: Code duplicated, block: B:158:0x026e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0280  */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x010d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0110  */
    /* JADX WARN: Code duplicated, block: B:93:0x0119  */
    /* JADX WARN: Code duplicated, block: B:95:0x0127  */
    public static final void b(BaseTextFieldUIState.TextFieldUIState state, TextFieldValue value, Modifier modifier, Function1 function1, Function2 function2, Function2 function3, MutableInteractionSource mutableInteractionSource, VisualTransformation visualTransformation, Function3 function4, Composer composer, int i, int i2) {
        int i3;
        Function1 function5;
        int i4;
        Function2 function6;
        int i5;
        int i6;
        Function2 function7;
        int i7;
        MutableInteractionSource mutableInteractionSourceB;
        VisualTransformation cmVar;
        int i8;
        int i9;
        boolean z;
        Composer composer2;
        VisualTransformation visualTransformation2;
        Function2 function8;
        MutableInteractionSource mutableInteractionSource2;
        Function1 function9;
        Function2 function10;
        Function3 function11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function3 function12;
        Function1 function13;
        KeyboardOptions keyboardOptionsF;
        KeyboardActions KeyboardActions;
        TextFieldLabelPlaceholderUIState textFieldLabelPlaceholderUIState;
        ComposableLambda composableLambdaD;
        TextFieldLabelPlaceholderUIState textFieldLabelPlaceholderUIState2;
        ComposableLambda composableLambdaE;
        boolean z2;
        boolean z3;
        Object objRememberedValue;
        UIImeActionHandler uIImeActionHandler;
        int i10;
        Intrinsics.i(state, "state");
        UIKeyboardOption uIKeyboardOption = state.i;
        Intrinsics.i(value, "value");
        Composer composerStartRestartGroup = composer.startRestartGroup(-465761952);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(value) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i11 = i2 & 8;
        if (i11 == 0) {
            if ((i & 3072) == 0) {
                function5 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function5) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    function6 = function2;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function7 = function3;
                } else {
                    function7 = function3;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changedInstance(function7)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                }
                if ((i & 1572864) == 0) {
                    mutableInteractionSourceB = mutableInteractionSource;
                    if ((i2 & 64) == 0 || !composerStartRestartGroup.changed(mutableInteractionSourceB)) {
                        i10 = 524288;
                    } else {
                        i10 = 1048576;
                    }
                    i3 |= i10;
                } else {
                    mutableInteractionSourceB = mutableInteractionSource;
                }
                if ((i & 12582912) == 0) {
                    if ((i2 & 128) == 0) {
                        cmVar = visualTransformation;
                        int i12 = composerStartRestartGroup.changed(cmVar) ? 8388608 : 4194304;
                        i3 |= i12;
                    } else {
                        cmVar = visualTransformation;
                    }
                    i3 |= i12;
                } else {
                    cmVar = visualTransformation;
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i9 = 33554432;
                    }
                    i3 |= i9;
                }
                if ((i3 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i11 != 0) {
                            function5 = null;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                        }
                        if ((i2 & 128) != 0) {
                            TextFieldEventHandler textFieldEventHandler = state.b;
                            Intrinsics.i(textFieldEventHandler, "<this>");
                            cmVar = new cm(textFieldEventHandler);
                            i3 &= -29360129;
                        }
                        if (i8 != 0) {
                            function12 = null;
                        }
                        Function2 function14 = function7;
                        MutableInteractionSource mutableInteractionSource3 = mutableInteractionSourceB;
                        function13 = function5;
                        Function2 function15 = function6;
                        VisualTransformation visualTransformation3 = cmVar;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-465761952, i3, -1, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:171)");
                        }
                        Modifier modifierM816heightInVpY3zN4$default = SizeKt.m816heightInVpY3zN4$default(modifier, state.o, 0.0f, 2, null);
                        boolean z4 = state.c;
                        TextStyle textStyleF = ChaloThemeKt.f(state.d, composerStartRestartGroup, 0);
                        boolean z5 = state.h;
                        if (uIKeyboardOption != null) {
                            keyboardOptionsF = f(uIKeyboardOption);
                        } else {
                            keyboardOptionsF = KeyboardOptions.INSTANCE.getDefault();
                        }
                        if (uIKeyboardOption != null || (uIImeActionHandler = uIKeyboardOption.c) == null || (KeyboardActions = KeyboardActionsKt.KeyboardActions(new ch(uIImeActionHandler, 16))) == null) {
                            KeyboardActions = KeyboardActions.INSTANCE.getDefault();
                        }
                        boolean z6 = state.j;
                        int i13 = state.k;
                        RoundedCornerShape roundedCornerShapeD = ChaloThemeKt.d(state.m);
                        TextFieldColors textFieldColorsG = g(state.n, composerStartRestartGroup);
                        textFieldLabelPlaceholderUIState = state.e;
                        if (textFieldLabelPlaceholderUIState != null) {
                            composableLambdaD = d(textFieldLabelPlaceholderUIState);
                        } else {
                            composableLambdaD = null;
                        }
                        textFieldLabelPlaceholderUIState2 = state.f;
                        if (textFieldLabelPlaceholderUIState2 != null) {
                            composableLambdaE = e(textFieldLabelPlaceholderUIState2);
                        } else {
                            composableLambdaE = null;
                        }
                        ComposableLambda composableLambda = composableLambdaE;
                        KeyboardActions keyboardActions = KeyboardActions;
                        if ((i3 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = z2 | ((i3 & 14) == 4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new f(29, function13, state);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        int i14 = i3 << 12;
                        composer2 = composerStartRestartGroup;
                        a(value, (Function1) objRememberedValue, modifierM816heightInVpY3zN4$default, z4, false, textStyleF, composableLambdaD, composableLambda, function15, function14, z5, visualTransformation3, keyboardOptionsF, keyboardActions, z6, i13, mutableInteractionSource3, roundedCornerShapeD, textFieldColorsG, function12, composer2, ((i3 >> 3) & 14) | (i14 & 234881024) | (i14 & 1879048192), ((i3 >> 18) & 112) | (i3 & 3670016) | ((i3 << 3) & 1879048192), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function9 = function13;
                        function10 = function15;
                        function8 = function14;
                        visualTransformation2 = visualTransformation3;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        function11 = function12;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            i3 &= -29360129;
                        }
                    }
                    function12 = function4;
                    Function2 function16 = function7;
                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSourceB;
                    function13 = function5;
                    Function2 function17 = function6;
                    VisualTransformation visualTransformation4 = cmVar;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-465761952, i3, -1, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:171)");
                    }
                    Modifier modifierM816heightInVpY3zN4$default2 = SizeKt.m816heightInVpY3zN4$default(modifier, state.o, 0.0f, 2, null);
                    boolean z7 = state.c;
                    TextStyle textStyleF2 = ChaloThemeKt.f(state.d, composerStartRestartGroup, 0);
                    boolean z8 = state.h;
                    if (uIKeyboardOption != null) {
                        keyboardOptionsF = f(uIKeyboardOption);
                    } else {
                        keyboardOptionsF = KeyboardOptions.INSTANCE.getDefault();
                    }
                    if (uIKeyboardOption != null) {
                        KeyboardActions = KeyboardActions.INSTANCE.getDefault();
                    } else {
                        KeyboardActions = KeyboardActions.INSTANCE.getDefault();
                    }
                    boolean z9 = state.j;
                    int i15 = state.k;
                    RoundedCornerShape roundedCornerShapeD2 = ChaloThemeKt.d(state.m);
                    TextFieldColors textFieldColorsG2 = g(state.n, composerStartRestartGroup);
                    textFieldLabelPlaceholderUIState = state.e;
                    if (textFieldLabelPlaceholderUIState != null) {
                        composableLambdaD = d(textFieldLabelPlaceholderUIState);
                    } else {
                        composableLambdaD = null;
                    }
                    textFieldLabelPlaceholderUIState2 = state.f;
                    if (textFieldLabelPlaceholderUIState2 != null) {
                        composableLambdaE = e(textFieldLabelPlaceholderUIState2);
                    } else {
                        composableLambdaE = null;
                    }
                    ComposableLambda composableLambda2 = composableLambdaE;
                    KeyboardActions keyboardActions2 = KeyboardActions;
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | ((i3 & 14) == 4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z3) {
                        objRememberedValue = new f(29, function13, state);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new f(29, function13, state);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    int i16 = i3 << 12;
                    composer2 = composerStartRestartGroup;
                    a(value, (Function1) objRememberedValue, modifierM816heightInVpY3zN4$default2, z7, false, textStyleF2, composableLambdaD, composableLambda2, function17, function16, z8, visualTransformation4, keyboardOptionsF, keyboardActions2, z9, i15, mutableInteractionSource4, roundedCornerShapeD2, textFieldColorsG2, function12, composer2, ((i3 >> 3) & 14) | (i16 & 234881024) | (i16 & 1879048192), ((i3 >> 18) & 112) | (i3 & 3670016) | ((i3 << 3) & 1879048192), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function9 = function13;
                    function10 = function17;
                    function8 = function16;
                    visualTransformation2 = visualTransformation4;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    function11 = function12;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    visualTransformation2 = cmVar;
                    function8 = function7;
                    mutableInteractionSource2 = mutableInteractionSourceB;
                    function9 = function5;
                    function10 = function6;
                    function11 = function4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new ml(state, value, modifier, function9, function10, function8, mutableInteractionSource2, visualTransformation2, function11, i, i2));
                }
            }
            i3 |= 24576;
            function6 = function2;
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function7 = function3;
            } else {
                function7 = function3;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
            }
            if ((i & 1572864) == 0) {
                mutableInteractionSourceB = mutableInteractionSource;
                if ((i2 & 64) == 0) {
                    i10 = 524288;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            } else {
                mutableInteractionSourceB = mutableInteractionSource;
            }
            if ((i & 12582912) == 0) {
                if ((i2 & 128) == 0) {
                    cmVar = visualTransformation;
                    if (composerStartRestartGroup.changed(cmVar)) {
                    }
                    i3 |= i12;
                } else {
                    cmVar = visualTransformation;
                }
                i3 |= i12;
            } else {
                cmVar = visualTransformation;
            }
            i8 = i2 & 256;
            if (i8 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i9 = 33554432;
                }
                i3 |= i9;
            }
            if ((i3 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        function5 = null;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                    }
                    if ((i2 & 128) != 0) {
                        TextFieldEventHandler textFieldEventHandler2 = state.b;
                        Intrinsics.i(textFieldEventHandler2, "<this>");
                        cmVar = new cm(textFieldEventHandler2);
                        i3 &= -29360129;
                    }
                    if (i8 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                } else {
                    if (i11 != 0) {
                        function5 = null;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                    }
                    if ((i2 & 128) != 0) {
                        TextFieldEventHandler textFieldEventHandler3 = state.b;
                        Intrinsics.i(textFieldEventHandler3, "<this>");
                        cmVar = new cm(textFieldEventHandler3);
                        i3 &= -29360129;
                    }
                    if (i8 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                }
                Function2 function18 = function7;
                MutableInteractionSource mutableInteractionSource5 = mutableInteractionSourceB;
                function13 = function5;
                Function2 function19 = function6;
                VisualTransformation visualTransformation5 = cmVar;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-465761952, i3, -1, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:171)");
                }
                Modifier modifierM816heightInVpY3zN4$default3 = SizeKt.m816heightInVpY3zN4$default(modifier, state.o, 0.0f, 2, null);
                boolean z10 = state.c;
                TextStyle textStyleF3 = ChaloThemeKt.f(state.d, composerStartRestartGroup, 0);
                boolean z11 = state.h;
                if (uIKeyboardOption != null) {
                    keyboardOptionsF = f(uIKeyboardOption);
                } else {
                    keyboardOptionsF = KeyboardOptions.INSTANCE.getDefault();
                }
                if (uIKeyboardOption != null) {
                    KeyboardActions = KeyboardActions.INSTANCE.getDefault();
                } else {
                    KeyboardActions = KeyboardActions.INSTANCE.getDefault();
                }
                boolean z12 = state.j;
                int i17 = state.k;
                RoundedCornerShape roundedCornerShapeD3 = ChaloThemeKt.d(state.m);
                TextFieldColors textFieldColorsG3 = g(state.n, composerStartRestartGroup);
                textFieldLabelPlaceholderUIState = state.e;
                if (textFieldLabelPlaceholderUIState != null) {
                    composableLambdaD = d(textFieldLabelPlaceholderUIState);
                } else {
                    composableLambdaD = null;
                }
                textFieldLabelPlaceholderUIState2 = state.f;
                if (textFieldLabelPlaceholderUIState2 != null) {
                    composableLambdaE = e(textFieldLabelPlaceholderUIState2);
                } else {
                    composableLambdaE = null;
                }
                ComposableLambda composableLambda3 = composableLambdaE;
                KeyboardActions keyboardActions3 = KeyboardActions;
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | ((i3 & 14) == 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3) {
                    objRememberedValue = new f(29, function13, state);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new f(29, function13, state);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                int i18 = i3 << 12;
                composer2 = composerStartRestartGroup;
                a(value, (Function1) objRememberedValue, modifierM816heightInVpY3zN4$default3, z10, false, textStyleF3, composableLambdaD, composableLambda3, function19, function18, z11, visualTransformation5, keyboardOptionsF, keyboardActions3, z12, i17, mutableInteractionSource5, roundedCornerShapeD3, textFieldColorsG3, function12, composer2, ((i3 >> 3) & 14) | (i18 & 234881024) | (i18 & 1879048192), ((i3 >> 18) & 112) | (i3 & 3670016) | ((i3 << 3) & 1879048192), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function9 = function13;
                function10 = function19;
                function8 = function18;
                visualTransformation2 = visualTransformation5;
                mutableInteractionSource2 = mutableInteractionSource5;
                function11 = function12;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                visualTransformation2 = cmVar;
                function8 = function7;
                mutableInteractionSource2 = mutableInteractionSourceB;
                function9 = function5;
                function10 = function6;
                function11 = function4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new ml(state, value, modifier, function9, function10, function8, mutableInteractionSource2, visualTransformation2, function11, i, i2));
            }
        }
        i3 |= 3072;
        function5 = function1;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                function6 = function2;
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function7 = function3;
            } else {
                function7 = function3;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
            }
            if ((i & 1572864) == 0) {
                mutableInteractionSourceB = mutableInteractionSource;
                if ((i2 & 64) == 0) {
                    i10 = 524288;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            } else {
                mutableInteractionSourceB = mutableInteractionSource;
            }
            if ((i & 12582912) == 0) {
                if ((i2 & 128) == 0) {
                    cmVar = visualTransformation;
                    if (composerStartRestartGroup.changed(cmVar)) {
                    }
                    i3 |= i12;
                } else {
                    cmVar = visualTransformation;
                }
                i3 |= i12;
            } else {
                cmVar = visualTransformation;
            }
            i8 = i2 & 256;
            if (i8 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i9 = 33554432;
                }
                i3 |= i9;
            }
            if ((i3 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        function5 = null;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                    }
                    if ((i2 & 128) != 0) {
                        TextFieldEventHandler textFieldEventHandler4 = state.b;
                        Intrinsics.i(textFieldEventHandler4, "<this>");
                        cmVar = new cm(textFieldEventHandler4);
                        i3 &= -29360129;
                    }
                    if (i8 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                } else {
                    if (i11 != 0) {
                        function5 = null;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                    }
                    if ((i2 & 128) != 0) {
                        TextFieldEventHandler textFieldEventHandler5 = state.b;
                        Intrinsics.i(textFieldEventHandler5, "<this>");
                        cmVar = new cm(textFieldEventHandler5);
                        i3 &= -29360129;
                    }
                    if (i8 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                }
                Function2 function110 = function7;
                MutableInteractionSource mutableInteractionSource6 = mutableInteractionSourceB;
                function13 = function5;
                Function2 function111 = function6;
                VisualTransformation visualTransformation6 = cmVar;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-465761952, i3, -1, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:171)");
                }
                Modifier modifierM816heightInVpY3zN4$default4 = SizeKt.m816heightInVpY3zN4$default(modifier, state.o, 0.0f, 2, null);
                boolean z13 = state.c;
                TextStyle textStyleF4 = ChaloThemeKt.f(state.d, composerStartRestartGroup, 0);
                boolean z14 = state.h;
                if (uIKeyboardOption != null) {
                    keyboardOptionsF = f(uIKeyboardOption);
                } else {
                    keyboardOptionsF = KeyboardOptions.INSTANCE.getDefault();
                }
                if (uIKeyboardOption != null) {
                    KeyboardActions = KeyboardActions.INSTANCE.getDefault();
                } else {
                    KeyboardActions = KeyboardActions.INSTANCE.getDefault();
                }
                boolean z15 = state.j;
                int i19 = state.k;
                RoundedCornerShape roundedCornerShapeD4 = ChaloThemeKt.d(state.m);
                TextFieldColors textFieldColorsG4 = g(state.n, composerStartRestartGroup);
                textFieldLabelPlaceholderUIState = state.e;
                if (textFieldLabelPlaceholderUIState != null) {
                    composableLambdaD = d(textFieldLabelPlaceholderUIState);
                } else {
                    composableLambdaD = null;
                }
                textFieldLabelPlaceholderUIState2 = state.f;
                if (textFieldLabelPlaceholderUIState2 != null) {
                    composableLambdaE = e(textFieldLabelPlaceholderUIState2);
                } else {
                    composableLambdaE = null;
                }
                ComposableLambda composableLambda4 = composableLambdaE;
                KeyboardActions keyboardActions4 = KeyboardActions;
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | ((i3 & 14) == 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3) {
                    objRememberedValue = new f(29, function13, state);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new f(29, function13, state);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                int i110 = i3 << 12;
                composer2 = composerStartRestartGroup;
                a(value, (Function1) objRememberedValue, modifierM816heightInVpY3zN4$default4, z13, false, textStyleF4, composableLambdaD, composableLambda4, function111, function110, z14, visualTransformation6, keyboardOptionsF, keyboardActions4, z15, i19, mutableInteractionSource6, roundedCornerShapeD4, textFieldColorsG4, function12, composer2, ((i3 >> 3) & 14) | (i110 & 234881024) | (i110 & 1879048192), ((i3 >> 18) & 112) | (i3 & 3670016) | ((i3 << 3) & 1879048192), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function9 = function13;
                function10 = function111;
                function8 = function110;
                visualTransformation2 = visualTransformation6;
                mutableInteractionSource2 = mutableInteractionSource6;
                function11 = function12;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                visualTransformation2 = cmVar;
                function8 = function7;
                mutableInteractionSource2 = mutableInteractionSourceB;
                function9 = function5;
                function10 = function6;
                function11 = function4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new ml(state, value, modifier, function9, function10, function8, mutableInteractionSource2, visualTransformation2, function11, i, i2));
            }
        }
        i3 |= 24576;
        function6 = function2;
        i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function7 = function3;
        } else {
            function7 = function3;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changedInstance(function7)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
        }
        if ((i & 1572864) == 0) {
            mutableInteractionSourceB = mutableInteractionSource;
            if ((i2 & 64) == 0) {
                i10 = 524288;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        } else {
            mutableInteractionSourceB = mutableInteractionSource;
        }
        if ((i & 12582912) == 0) {
            if ((i2 & 128) == 0) {
                cmVar = visualTransformation;
                if (composerStartRestartGroup.changed(cmVar)) {
                }
                i3 |= i12;
            } else {
                cmVar = visualTransformation;
            }
            i3 |= i12;
        } else {
            cmVar = visualTransformation;
        }
        i8 = i2 & 256;
        if (i8 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (composerStartRestartGroup.changedInstance(function4)) {
                i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i9 = 33554432;
            }
            i3 |= i9;
        }
        if ((i3 & 38347923) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    function5 = null;
                }
                if (i4 != 0) {
                    function6 = null;
                }
                if (i6 != 0) {
                    function7 = null;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                }
                if ((i2 & 128) != 0) {
                    TextFieldEventHandler textFieldEventHandler6 = state.b;
                    Intrinsics.i(textFieldEventHandler6, "<this>");
                    cmVar = new cm(textFieldEventHandler6);
                    i3 &= -29360129;
                }
                if (i8 != 0) {
                    function12 = null;
                } else {
                    function12 = function4;
                }
            } else {
                if (i11 != 0) {
                    function5 = null;
                }
                if (i4 != 0) {
                    function6 = null;
                }
                if (i6 != 0) {
                    function7 = null;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                }
                if ((i2 & 128) != 0) {
                    TextFieldEventHandler textFieldEventHandler7 = state.b;
                    Intrinsics.i(textFieldEventHandler7, "<this>");
                    cmVar = new cm(textFieldEventHandler7);
                    i3 &= -29360129;
                }
                if (i8 != 0) {
                    function12 = null;
                } else {
                    function12 = function4;
                }
            }
            Function2 function112 = function7;
            MutableInteractionSource mutableInteractionSource7 = mutableInteractionSourceB;
            function13 = function5;
            Function2 function113 = function6;
            VisualTransformation visualTransformation7 = cmVar;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-465761952, i3, -1, "app.chalo.compose.components.textfields.ChaloTextField (ChaloTextField.kt:171)");
            }
            Modifier modifierM816heightInVpY3zN4$default5 = SizeKt.m816heightInVpY3zN4$default(modifier, state.o, 0.0f, 2, null);
            boolean z16 = state.c;
            TextStyle textStyleF5 = ChaloThemeKt.f(state.d, composerStartRestartGroup, 0);
            boolean z17 = state.h;
            if (uIKeyboardOption != null) {
                keyboardOptionsF = f(uIKeyboardOption);
            } else {
                keyboardOptionsF = KeyboardOptions.INSTANCE.getDefault();
            }
            if (uIKeyboardOption != null) {
                KeyboardActions = KeyboardActions.INSTANCE.getDefault();
            } else {
                KeyboardActions = KeyboardActions.INSTANCE.getDefault();
            }
            boolean z18 = state.j;
            int i111 = state.k;
            RoundedCornerShape roundedCornerShapeD5 = ChaloThemeKt.d(state.m);
            TextFieldColors textFieldColorsG5 = g(state.n, composerStartRestartGroup);
            textFieldLabelPlaceholderUIState = state.e;
            if (textFieldLabelPlaceholderUIState != null) {
                composableLambdaD = d(textFieldLabelPlaceholderUIState);
            } else {
                composableLambdaD = null;
            }
            textFieldLabelPlaceholderUIState2 = state.f;
            if (textFieldLabelPlaceholderUIState2 != null) {
                composableLambdaE = e(textFieldLabelPlaceholderUIState2);
            } else {
                composableLambdaE = null;
            }
            ComposableLambda composableLambda5 = composableLambdaE;
            KeyboardActions keyboardActions5 = KeyboardActions;
            if ((i3 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z2 | ((i3 & 14) == 4);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3) {
                objRememberedValue = new f(29, function13, state);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new f(29, function13, state);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i112 = i3 << 12;
            composer2 = composerStartRestartGroup;
            a(value, (Function1) objRememberedValue, modifierM816heightInVpY3zN4$default5, z16, false, textStyleF5, composableLambdaD, composableLambda5, function113, function112, z17, visualTransformation7, keyboardOptionsF, keyboardActions5, z18, i111, mutableInteractionSource7, roundedCornerShapeD5, textFieldColorsG5, function12, composer2, ((i3 >> 3) & 14) | (i112 & 234881024) | (i112 & 1879048192), ((i3 >> 18) & 112) | (i3 & 3670016) | ((i3 << 3) & 1879048192), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function9 = function13;
            function10 = function113;
            function8 = function112;
            visualTransformation2 = visualTransformation7;
            mutableInteractionSource2 = mutableInteractionSource7;
            function11 = function12;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            visualTransformation2 = cmVar;
            function8 = function7;
            mutableInteractionSource2 = mutableInteractionSourceB;
            function9 = function5;
            function10 = function6;
            function11 = function4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ml(state, value, modifier, function9, function10, function8, mutableInteractionSource2, visualTransformation2, function11, i, i2));
        }
    }

    public static final TextFieldColors c(TextFieldDefaults chaloColors, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, TextSelectionColors textSelectionColors, Composer composer, int i, int i2) {
        int i3;
        long j21;
        Intrinsics.i(chaloColors, "$this$chaloColors");
        long j22 = (i2 & 1) != 0 ? ChaloTheme.a(composer, 6).g : j;
        long j23 = (i2 & 2) != 0 ? ChaloTheme.a(composer, 6).g : j2;
        long jM4604copywmQWz5c$default = (i2 & 4) != 0 ? Color.m4604copywmQWz5c$default(ChaloTheme.a(composer, 6).g, 0.4f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM4640getTransparent0d7_KjU = (i2 & 8) != 0 ? Color.INSTANCE.m4640getTransparent0d7_KjU() : j4;
        long jM4640getTransparent0d7_KjU2 = (i2 & 16) != 0 ? Color.INSTANCE.m4640getTransparent0d7_KjU() : j5;
        long jM4640getTransparent0d7_KjU3 = (i2 & 32) != 0 ? Color.INSTANCE.m4640getTransparent0d7_KjU() : j6;
        long j24 = (i2 & 64) != 0 ? ChaloTheme.a(composer, 6).k : j7;
        if ((i2 & 128) != 0) {
            i3 = 6;
            j21 = ChaloTheme.a(composer, 6).k;
        } else {
            i3 = 6;
            j21 = j8;
        }
        long j25 = (i2 & 256) != 0 ? ChaloTheme.a(composer, i3).k : j9;
        long j26 = (i2 & 512) != 0 ? ChaloTheme.a(composer, i3).k : j10;
        long j27 = (i2 & 1024) != 0 ? ChaloTheme.a(composer, i3).d : j11;
        long j28 = (i2 & 2048) != 0 ? ChaloTheme.a(composer, i3).f1915a : j12;
        long j29 = (i2 & 4096) != 0 ? ChaloTheme.a(composer, i3).d : j13;
        long j30 = (i2 & 8192) != 0 ? ChaloTheme.a(composer, i3).Z : j14;
        long j31 = (i2 & 16384) != 0 ? ChaloTheme.a(composer, i3).f1915a : j15;
        long j32 = (32768 & i2) != 0 ? ChaloTheme.a(composer, i3).f1915a : j16;
        long j33 = (65536 & i2) != 0 ? ChaloTheme.a(composer, i3).Z : j17;
        long j34 = (131072 & i2) != 0 ? ChaloTheme.a(composer, i3).k : j18;
        long j35 = (262144 & i2) != 0 ? ChaloTheme.a(composer, 6).k : j19;
        long j36 = (524288 & i2) != 0 ? ChaloTheme.a(composer, 6).k : j20;
        TextSelectionColors textSelectionColors2 = (i2 & 1048576) != 0 ? null : textSelectionColors;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1350581160, i, 0, "app.chalo.compose.components.textfields.chaloColors (ChaloTextField.kt:241)");
        }
        long j37 = j23;
        long j38 = j22;
        TextFieldColors textFieldColorsM2603colors0hiis_0 = chaloColors.m2603colors0hiis_0(j38, j37, jM4604copywmQWz5c$default, 0L, jM4640getTransparent0d7_KjU, jM4640getTransparent0d7_KjU2, jM4640getTransparent0d7_KjU3, j33, j31, j32, textSelectionColors2, j28, j27, j29, j30, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j21, j26, j25, j24, j34, j36, j35, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, i & 516096, 0, 0, 0, 3072, 1082097672, 4095);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM2603colors0hiis_0;
    }

    public static final ComposableLambda d(TextFieldLabelPlaceholderUIState label) {
        Intrinsics.i(label, "label");
        return ComposableLambdaKt.composableLambdaInstance(1202457646, true, new fm(label, 1));
    }

    public static final ComposableLambda e(TextFieldLabelPlaceholderUIState placeholder) {
        Intrinsics.i(placeholder, "placeholder");
        return ComposableLambdaKt.composableLambdaInstance(-819110419, true, new fm(placeholder, 0));
    }

    public static final KeyboardOptions f(UIKeyboardOption uIKeyboardOption) {
        int iM6953getNoneIUNYP9k;
        int iM6981getTextPjHm6EE;
        int iM6920getDefaulteUduSuo;
        Intrinsics.i(uIKeyboardOption, "<this>");
        UIKeyboardCapitalization uIKeyboardCapitalization = uIKeyboardOption.f10111a;
        if (uIKeyboardCapitalization != null) {
            int i = WhenMappings.f1898a[uIKeyboardCapitalization.ordinal()];
            if (i == 1) {
                iM6953getNoneIUNYP9k = KeyboardCapitalization.INSTANCE.m6952getCharactersIUNYP9k();
            } else if (i == 2) {
                iM6953getNoneIUNYP9k = KeyboardCapitalization.INSTANCE.m6956getWordsIUNYP9k();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                iM6953getNoneIUNYP9k = KeyboardCapitalization.INSTANCE.m6954getSentencesIUNYP9k();
            }
        } else {
            iM6953getNoneIUNYP9k = KeyboardCapitalization.INSTANCE.m6953getNoneIUNYP9k();
        }
        UIKeyboardType uIKeyboardType = uIKeyboardOption.b;
        Intrinsics.i(uIKeyboardType, "<this>");
        switch (WhenMappings.b[uIKeyboardType.ordinal()]) {
            case 1:
                iM6981getTextPjHm6EE = KeyboardType.INSTANCE.m6981getTextPjHm6EE();
                break;
            case 2:
                iM6981getTextPjHm6EE = KeyboardType.INSTANCE.m6977getNumberPjHm6EE();
                break;
            case 3:
                iM6981getTextPjHm6EE = KeyboardType.INSTANCE.m6980getPhonePjHm6EE();
                break;
            case 4:
                iM6981getTextPjHm6EE = KeyboardType.INSTANCE.m6976getEmailPjHm6EE();
                break;
            case 5:
                iM6981getTextPjHm6EE = KeyboardType.INSTANCE.m6979getPasswordPjHm6EE();
                break;
            case 6:
                iM6981getTextPjHm6EE = KeyboardType.INSTANCE.m6978getNumberPasswordPjHm6EE();
                break;
            case 7:
                iM6981getTextPjHm6EE = KeyboardType.INSTANCE.m6975getDecimalPjHm6EE();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        int i2 = iM6981getTextPjHm6EE;
        UIImeActionHandler uIImeActionHandler = uIKeyboardOption.c;
        if (uIImeActionHandler != null) {
            switch (WhenMappings.c[uIImeActionHandler.f10110a.ordinal()]) {
                case 1:
                    iM6920getDefaulteUduSuo = ImeAction.INSTANCE.m6921getDoneeUduSuo();
                    break;
                case 2:
                    iM6920getDefaulteUduSuo = ImeAction.INSTANCE.m6922getGoeUduSuo();
                    break;
                case 3:
                    iM6920getDefaulteUduSuo = ImeAction.INSTANCE.m6923getNexteUduSuo();
                    break;
                case 4:
                    iM6920getDefaulteUduSuo = ImeAction.INSTANCE.m6926getSearcheUduSuo();
                    break;
                case 5:
                    iM6920getDefaulteUduSuo = ImeAction.INSTANCE.m6927getSendeUduSuo();
                    break;
                case 6:
                    iM6920getDefaulteUduSuo = ImeAction.INSTANCE.m6924getNoneeUduSuo();
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            iM6920getDefaulteUduSuo = ImeAction.INSTANCE.m6920getDefaulteUduSuo();
        }
        return new KeyboardOptions(iM6953getNoneIUNYP9k, true, i2, iM6920getDefaulteUduSuo, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 112, (DefaultConstructorMarker) null);
    }

    public static final TextFieldColors g(UITextFieldColors uITextFieldColors, Composer composer) {
        Intrinsics.i(uITextFieldColors, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(875871332, 0, -1, "app.chalo.compose.components.textfields.toTextFieldColors (ChaloTextField.kt:310)");
        }
        TextSelectionColors textSelectionColors = (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
        long jC = ChaloColorTokenKt.c(uITextFieldColors.f10112a);
        long jC2 = ChaloColorTokenKt.c(uITextFieldColors.b);
        long jC3 = ChaloColorTokenKt.c(uITextFieldColors.c);
        long jC4 = ChaloColorTokenKt.c(uITextFieldColors.d);
        long jC5 = ChaloColorTokenKt.c(uITextFieldColors.e);
        long jC6 = ChaloColorTokenKt.c(uITextFieldColors.f);
        long jC7 = ChaloColorTokenKt.c(uITextFieldColors.g);
        long jC8 = ChaloColorTokenKt.c(uITextFieldColors.h);
        long jC9 = ChaloColorTokenKt.c(uITextFieldColors.i);
        long jC10 = ChaloColorTokenKt.c(uITextFieldColors.j);
        long jC11 = ChaloColorTokenKt.c(uITextFieldColors.k);
        long jC12 = ChaloColorTokenKt.c(uITextFieldColors.l);
        long jC13 = ChaloColorTokenKt.c(uITextFieldColors.m);
        long jC14 = ChaloColorTokenKt.c(uITextFieldColors.n);
        long jC15 = ChaloColorTokenKt.c(uITextFieldColors.o);
        long jC16 = ChaloColorTokenKt.c(uITextFieldColors.p);
        long jC17 = ChaloColorTokenKt.c(uITextFieldColors.q);
        long jC18 = ChaloColorTokenKt.c(uITextFieldColors.r);
        long jC19 = ChaloColorTokenKt.c(uITextFieldColors.t);
        long jC20 = ChaloColorTokenKt.c(uITextFieldColors.s);
        ChaloColorToken chaloColorToken = uITextFieldColors.u;
        TextFieldColors textFieldColorsC = c(textFieldDefaults, jC, jC2, jC3, jC4, jC5, jC6, jC7, jC8, jC9, jC10, jC11, jC12, jC13, jC14, jC15, jC16, jC17, jC18, jC20, jC19, new TextSelectionColors(chaloColorToken != null ? ChaloColorTokenKt.c(chaloColorToken) : textSelectionColors.getHandleColor(), textSelectionColors.getBackgroundColor(), null), composer, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsC;
    }
}
