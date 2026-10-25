package app.chalo.compose;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.VerticalGridLinesWithGradiantBackgroundKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.color.ColorGradiantUiState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class VerticalGridLinesWithGradiantBackgroundKt {
    /* JADX WARN: Code duplicated, block: B:102:0x0140  */
    /* JADX WARN: Code duplicated, block: B:104:0x0146  */
    /* JADX WARN: Code duplicated, block: B:107:0x0150  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x0103  */
    /* JADX WARN: Code duplicated, block: B:92:0x0110  */
    /* JADX WARN: Code duplicated, block: B:99:0x0125  */
    public static final void a(final Modifier modifier, final ChaloColorToken chaloColorToken, final ColorGradiantUiState.Linear linear, final float f, float f2, float f3, Composer composer, final int i, final int i2) {
        int i3;
        float f4;
        int i4;
        final float fM7278constructorimpl;
        int i5;
        boolean z;
        final float f5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        float fM7278constructorimpl2;
        final float f6;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean zChangedInstance;
        Object objRememberedValue;
        final float f7;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1071081172);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(chaloColorToken) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(linear) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(10) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 == 0) {
            if ((196608 & i) == 0) {
                f4 = f2;
                i3 |= composerStartRestartGroup.changed(f4) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                i3 |= 1572864;
                fM7278constructorimpl = f3;
            } else {
                fM7278constructorimpl = f3;
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(fM7278constructorimpl)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i3 |= i5;
                }
            }
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i6 != 0) {
                    fM7278constructorimpl2 = Dp.m7278constructorimpl(0);
                } else {
                    fM7278constructorimpl2 = f4;
                }
                if (i4 != 0) {
                    fM7278constructorimpl = Dp.m7278constructorimpl(0);
                }
                f6 = fM7278constructorimpl;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1071081172, i3, -1, "app.chalo.compose.VerticalGridLinesWithGradiantBackground (VerticalGridLinesWithGradiantBackground.kt:22)");
                }
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((57344 & i3) == 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z6 = z2 | z3;
                if ((458752 & i3) == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z7 = z6 | z4;
                if ((3670016 & i3) == 1048576) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zChangedInstance = z7 | z5 | composerStartRestartGroup.changedInstance(linear) | ((i3 & 112) == 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    f7 = fM7278constructorimpl2;
                    Function1 function1 = new Function1() { // from class: ho1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ChaloColorToken chaloColorToken2;
                            DrawScope Canvas = (DrawScope) obj;
                            Intrinsics.i(Canvas, "$this$Canvas");
                            float fMo404toPx0680j_4 = Canvas.mo404toPx0680j_4(f);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() >> 32)) / 10;
                            if (fIntBitsToFloat > 0.0f) {
                                float fMo404toPx0680j_5 = ((Canvas.mo404toPx0680j_4(f7) % fIntBitsToFloat) + fIntBitsToFloat) % fIntBitsToFloat;
                                float fMo404toPx0680j_6 = ((Canvas.mo404toPx0680j_4(f6) % fIntBitsToFloat) + fIntBitsToFloat) % fIntBitsToFloat;
                                Brush.Companion companion = Brush.INSTANCE;
                                List list = linear.f9929a;
                                ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(Color.m4595boximpl(ChaloColorTokenKt.c((ChaloColorToken) it.next())));
                                }
                                DrawScope.CC.L(Canvas, Brush.Companion.m4566verticalGradient8A3gB4$default(companion, arrayList, 0.0f, 0.0f, 0, 14, (Object) null), 0L, Canvas.mo5073getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
                                float f8 = fMo404toPx0680j_5;
                                while (true) {
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() >> 32));
                                    chaloColorToken2 = chaloColorToken;
                                    if (f8 > fIntBitsToFloat2) {
                                        break;
                                    }
                                    float f9 = fMo404toPx0680j_4;
                                    DrawScope.CC.E(Canvas, ChaloColorTokenKt.c(chaloColorToken2), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax)), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax)), f9, 0, null, 0.0f, null, 0, 496, null);
                                    f8 += fIntBitsToFloat;
                                    fMo404toPx0680j_4 = f9;
                                }
                                float f10 = fMo404toPx0680j_4;
                                while (fMo404toPx0680j_6 <= Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() & BodyPartID.bodyIdMax))) {
                                    ChaloColorToken chaloColorToken3 = chaloColorToken2;
                                    DrawScope.CC.E(Canvas, ChaloColorTokenKt.c(chaloColorToken3), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fMo404toPx0680j_6)) & BodyPartID.bodyIdMax)), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fMo404toPx0680j_6)) & BodyPartID.bodyIdMax)), f10, 0, null, 0.0f, null, 0, 496, null);
                                    fMo404toPx0680j_6 += fIntBitsToFloat;
                                    chaloColorToken2 = chaloColorToken3;
                                }
                            }
                            return Unit.f17538a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function1);
                    objRememberedValue = function1;
                } else {
                    f7 = fM7278constructorimpl2;
                }
                CanvasKt.Canvas(modifier, (Function1) objRememberedValue, composerStartRestartGroup, i3 & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fM7278constructorimpl = f6;
                f5 = f7;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                f5 = f4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: io1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        VerticalGridLinesWithGradiantBackgroundKt.a(modifier, chaloColorToken, linear, f, f5, fM7278constructorimpl, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        f4 = f2;
        i4 = i2 & 64;
        if (i4 != 0) {
            i3 |= 1572864;
            fM7278constructorimpl = f3;
        } else {
            fM7278constructorimpl = f3;
            if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changed(fM7278constructorimpl)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
        }
        if ((i3 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            if (i6 != 0) {
                fM7278constructorimpl2 = Dp.m7278constructorimpl(0);
            } else {
                fM7278constructorimpl2 = f4;
            }
            if (i4 != 0) {
                fM7278constructorimpl = Dp.m7278constructorimpl(0);
            }
            f6 = fM7278constructorimpl;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1071081172, i3, -1, "app.chalo.compose.VerticalGridLinesWithGradiantBackground (VerticalGridLinesWithGradiantBackground.kt:22)");
            }
            if ((i3 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((57344 & i3) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z8 = z2 | z3;
            if ((458752 & i3) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z9 = z8 | z4;
            if ((3670016 & i3) == 1048576) {
                z5 = true;
            } else {
                z5 = false;
            }
            zChangedInstance = z9 | z5 | composerStartRestartGroup.changedInstance(linear) | ((i3 & 112) == 32);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                f7 = fM7278constructorimpl2;
                Function1 function2 = new Function1() { // from class: ho1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ChaloColorToken chaloColorToken2;
                        DrawScope Canvas = (DrawScope) obj;
                        Intrinsics.i(Canvas, "$this$Canvas");
                        float fMo404toPx0680j_4 = Canvas.mo404toPx0680j_4(f);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() >> 32)) / 10;
                        if (fIntBitsToFloat > 0.0f) {
                            float fMo404toPx0680j_5 = ((Canvas.mo404toPx0680j_4(f7) % fIntBitsToFloat) + fIntBitsToFloat) % fIntBitsToFloat;
                            float fMo404toPx0680j_6 = ((Canvas.mo404toPx0680j_4(f6) % fIntBitsToFloat) + fIntBitsToFloat) % fIntBitsToFloat;
                            Brush.Companion companion = Brush.INSTANCE;
                            List list = linear.f9929a;
                            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(Color.m4595boximpl(ChaloColorTokenKt.c((ChaloColorToken) it.next())));
                            }
                            DrawScope.CC.L(Canvas, Brush.Companion.m4566verticalGradient8A3gB4$default(companion, arrayList, 0.0f, 0.0f, 0, 14, (Object) null), 0L, Canvas.mo5073getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
                            float f8 = fMo404toPx0680j_5;
                            while (true) {
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() >> 32));
                                chaloColorToken2 = chaloColorToken;
                                if (f8 > fIntBitsToFloat2) {
                                    break;
                                }
                                float f9 = fMo404toPx0680j_4;
                                DrawScope.CC.E(Canvas, ChaloColorTokenKt.c(chaloColorToken2), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax)), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax)), f9, 0, null, 0.0f, null, 0, 496, null);
                                f8 += fIntBitsToFloat;
                                fMo404toPx0680j_4 = f9;
                            }
                            float f10 = fMo404toPx0680j_4;
                            while (fMo404toPx0680j_6 <= Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() & BodyPartID.bodyIdMax))) {
                                ChaloColorToken chaloColorToken3 = chaloColorToken2;
                                DrawScope.CC.E(Canvas, ChaloColorTokenKt.c(chaloColorToken3), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fMo404toPx0680j_6)) & BodyPartID.bodyIdMax)), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fMo404toPx0680j_6)) & BodyPartID.bodyIdMax)), f10, 0, null, 0.0f, null, 0, 496, null);
                                fMo404toPx0680j_6 += fIntBitsToFloat;
                                chaloColorToken2 = chaloColorToken3;
                            }
                        }
                        return Unit.f17538a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function2);
                objRememberedValue = function2;
            } else {
                f7 = fM7278constructorimpl2;
                Function1 function3 = new Function1() { // from class: ho1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ChaloColorToken chaloColorToken2;
                        DrawScope Canvas = (DrawScope) obj;
                        Intrinsics.i(Canvas, "$this$Canvas");
                        float fMo404toPx0680j_4 = Canvas.mo404toPx0680j_4(f);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() >> 32)) / 10;
                        if (fIntBitsToFloat > 0.0f) {
                            float fMo404toPx0680j_5 = ((Canvas.mo404toPx0680j_4(f7) % fIntBitsToFloat) + fIntBitsToFloat) % fIntBitsToFloat;
                            float fMo404toPx0680j_6 = ((Canvas.mo404toPx0680j_4(f6) % fIntBitsToFloat) + fIntBitsToFloat) % fIntBitsToFloat;
                            Brush.Companion companion = Brush.INSTANCE;
                            List list = linear.f9929a;
                            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(Color.m4595boximpl(ChaloColorTokenKt.c((ChaloColorToken) it.next())));
                            }
                            DrawScope.CC.L(Canvas, Brush.Companion.m4566verticalGradient8A3gB4$default(companion, arrayList, 0.0f, 0.0f, 0, 14, (Object) null), 0L, Canvas.mo5073getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
                            float f8 = fMo404toPx0680j_5;
                            while (true) {
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() >> 32));
                                chaloColorToken2 = chaloColorToken;
                                if (f8 > fIntBitsToFloat2) {
                                    break;
                                }
                                float f9 = fMo404toPx0680j_4;
                                DrawScope.CC.E(Canvas, ChaloColorTokenKt.c(chaloColorToken2), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax)), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax)), f9, 0, null, 0.0f, null, 0, 496, null);
                                f8 += fIntBitsToFloat;
                                fMo404toPx0680j_4 = f9;
                            }
                            float f10 = fMo404toPx0680j_4;
                            while (fMo404toPx0680j_6 <= Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() & BodyPartID.bodyIdMax))) {
                                ChaloColorToken chaloColorToken3 = chaloColorToken2;
                                DrawScope.CC.E(Canvas, ChaloColorTokenKt.c(chaloColorToken3), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fMo404toPx0680j_6)) & BodyPartID.bodyIdMax)), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fMo404toPx0680j_6)) & BodyPartID.bodyIdMax)), f10, 0, null, 0.0f, null, 0, 496, null);
                                fMo404toPx0680j_6 += fIntBitsToFloat;
                                chaloColorToken2 = chaloColorToken3;
                            }
                        }
                        return Unit.f17538a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function3);
                objRememberedValue = function3;
            }
            CanvasKt.Canvas(modifier, (Function1) objRememberedValue, composerStartRestartGroup, i3 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            fM7278constructorimpl = f6;
            f5 = f7;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            f5 = f4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: io1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    VerticalGridLinesWithGradiantBackgroundKt.a(modifier, chaloColorToken, linear, f, f5, fM7278constructorimpl, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return Unit.f17538a;
                }
            });
        }
    }
}
