package app.chalo.compose.components.qr;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import app.chalo.compose.components.qr.ChaloQrCodeKt;
import app.chalo.compose.theme.ChaloTheme;
import defpackage.l6;
import io.github.alexzhirkevich.qrose.QrCodePainter;
import io.github.alexzhirkevich.qrose.options.QrColors;
import io.github.alexzhirkevich.qrose.options.QrErrorCorrectionLevel;
import io.github.alexzhirkevich.qrose.options.QrLogo;
import io.github.alexzhirkevich.qrose.options.QrOptions;
import io.github.alexzhirkevich.qrose.options.QrShapes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloQrCodeKt {
    /* JADX WARN: Code duplicated, block: B:100:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:103:0x025b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0266  */
    /* JADX WARN: Code duplicated, block: B:106:0x0272  */
    /* JADX WARN: Code duplicated, block: B:107:0x0274  */
    /* JADX WARN: Code duplicated, block: B:112:0x0283  */
    /* JADX WARN: Code duplicated, block: B:116:0x0298  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:124:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:125:0x02dc A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:67:0x0127  */
    /* JADX WARN: Code duplicated, block: B:70:0x0146  */
    /* JADX WARN: Code duplicated, block: B:83:0x0176  */
    /* JADX WARN: Code duplicated, block: B:86:0x018b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0197  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a6  */
    public static final void a(final String data, final Modifier modifier, float f, Function0 function0, Composer composer, final int i, final int i2) {
        int i3;
        Function0 function1;
        boolean z;
        Modifier modifier2;
        final float f2;
        final Function0 function2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function3;
        float f3;
        int i4;
        final Function0 function4;
        int i5;
        final float f4;
        Function0 function5;
        Density density;
        int i6;
        QrShapes qrShapes;
        QrColors qrColors;
        QrLogo qrLogo;
        QrErrorCorrectionLevel qrErrorCorrectionLevel;
        boolean zChanged;
        Object objRememberedValue;
        QrOptions options;
        boolean zChanged2;
        Object objRememberedValue2;
        QrCodePainter qrCodePainter;
        int iMo398roundToPx0680j_4;
        boolean z2;
        boolean zChanged3;
        Object obj;
        Modifier modifierAspectRatio$default;
        boolean z3;
        Object objRememberedValue3;
        Modifier modifierOnGloballyPositioned;
        Intrinsics.i(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(1774115663);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(data) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                function1 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    f3 = ChaloTheme.b(composerStartRestartGroup, 6).N;
                    i4 = i3 & (-897);
                    if (i7 != 0) {
                        i5 = i4;
                        f4 = f3;
                        function4 = null;
                    } else {
                        function4 = function1;
                        i5 = i4;
                        f4 = f3;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function4 = function1;
                    i5 = i3 & (-897);
                    f4 = f;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1774115663, i5, -1, "app.chalo.compose.components.qr.ChaloQrCode (ChaloQrCode.kt:26)");
                }
                if (data.length() == 0) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        return;
                    }
                    final int i8 = 0;
                    function3 = new Function2() { // from class: el
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            switch (i8) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    ChaloQrCodeKt.a(data, modifier, f4, function4, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    ChaloQrCodeKt.a(data, modifier, f4, function4, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                } else {
                    modifier2 = modifier;
                    float f5 = f4;
                    function5 = function4;
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    i6 = i5 & 14;
                    composerStartRestartGroup.startReplaceableGroup(-1641751056);
                    qrShapes = new QrShapes();
                    qrColors = new QrColors();
                    qrLogo = new QrLogo();
                    qrErrorCorrectionLevel = QrErrorCorrectionLevel.Auto;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1641751056, i6, -1, "io.github.alexzhirkevich.qrose.rememberQrCodePainter (QrCodePainter.kt:75)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(2039258890);
                    zChanged = composerStartRestartGroup.changed(qrShapes) | composerStartRestartGroup.changed(qrColors) | composerStartRestartGroup.changed(qrLogo) | composerStartRestartGroup.changed(qrErrorCorrectionLevel) | composerStartRestartGroup.changed(false);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new QrOptions(qrShapes, qrColors, qrLogo, qrErrorCorrectionLevel);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    options = (QrOptions) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    Intrinsics.i(options, "options");
                    composerStartRestartGroup.startReplaceableGroup(1179749356);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1179749356, i6, -1, "io.github.alexzhirkevich.qrose.rememberQrCodePainter (QrCodePainter.kt:63)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(2039258483);
                    zChanged2 = (((i6 ^ 6) <= 4 && composerStartRestartGroup.changed(data)) || (i5 & 6) == 4) | composerStartRestartGroup.changed(options);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new QrCodePainter(data, options);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    qrCodePainter = (QrCodePainter) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    iMo398roundToPx0680j_4 = density.mo398roundToPx0680j_4(f5);
                    if (i6 == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zChanged3 = z2 | composerStartRestartGroup.changed(iMo398roundToPx0680j_4);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        ImageBitmap imageBitmapM4820ImageBitmapx__hDU$default = ImageBitmapKt.m4820ImageBitmapx__hDU$default(iMo398roundToPx0680j_4, iMo398roundToPx0680j_4, 0, false, null, 28, null);
                        Canvas Canvas = CanvasKt.Canvas(imageBitmapM4820ImageBitmapx__hDU$default);
                        CanvasDrawScope canvasDrawScope = new CanvasDrawScope();
                        LayoutDirection layoutDirection = LayoutDirection.Ltr;
                        float f6 = iMo398roundToPx0680j_4;
                        long jM4425constructorimpl = Size.m4425constructorimpl((((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & BodyPartID.bodyIdMax));
                        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
                        Density density2 = drawParams.getDensity();
                        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
                        Canvas canvas = drawParams.getCanvas();
                        long size = drawParams.getSize();
                        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
                        drawParams2.setDensity(density);
                        drawParams2.setLayoutDirection(layoutDirection);
                        drawParams2.setCanvas(Canvas);
                        drawParams2.m5079setSizeuvyYCjk(jM4425constructorimpl);
                        Canvas.save();
                        Painter.m5223drawx_KDEd0$default(qrCodePainter, canvasDrawScope, DrawScope.CC.c(canvasDrawScope), 0.0f, null, 6, null);
                        Canvas.restore();
                        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
                        drawParams3.setDensity(density2);
                        drawParams3.setLayoutDirection(layoutDirection2);
                        drawParams3.setCanvas(canvas);
                        drawParams3.m5079setSizeuvyYCjk(size);
                        composerStartRestartGroup.updateRememberedValue(imageBitmapM4820ImageBitmapx__hDU$default);
                        obj = imageBitmapM4820ImageBitmapx__hDU$default;
                    } else {
                        obj = objRememberedValue4;
                    }
                    ImageBitmap imageBitmap = (ImageBitmap) obj;
                    composerStartRestartGroup.startReplaceGroup(-176833308);
                    modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(SizeKt.m833width3ABfNKs(modifier2, f5), 1.0f, false, 2, null);
                    if (function5 == null) {
                        composerStartRestartGroup.startReplaceGroup(-1619368852);
                        composerStartRestartGroup.endReplaceGroup();
                        modifierOnGloballyPositioned = null;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1619368851);
                        if ((i5 & 7168) == 2048) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new l6(function5, 6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierAspectRatio$default, (Function1) objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (modifierOnGloballyPositioned != null) {
                        modifierAspectRatio$default = modifierOnGloballyPositioned;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ImageKt.m321Image5hnEew(imageBitmap, null, modifierAspectRatio$default, null, ContentScale.INSTANCE.getFillWidth(), 0.0f, null, 0, composerStartRestartGroup, 24624, 232);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function5;
                    f2 = f5;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(function3);
            }
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
            f2 = f;
            function2 = function1;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final int i9 = 1;
                final Modifier modifier3 = modifier2;
                function3 = new Function2() { // from class: el
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i9) {
                            case 0:
                                ((Integer) obj3).getClass();
                                ChaloQrCodeKt.a(data, modifier3, f2, function2, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj3).getClass();
                                ChaloQrCodeKt.a(data, modifier3, f2, function2, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                scopeUpdateScopeEndRestartGroup.updateScope(function3);
            }
        }
        i3 |= 3072;
        function1 = function0;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                f3 = ChaloTheme.b(composerStartRestartGroup, 6).N;
                i4 = i3 & (-897);
                if (i7 != 0) {
                    i5 = i4;
                    f4 = f3;
                    function4 = null;
                } else {
                    function4 = function1;
                    i5 = i4;
                    f4 = f3;
                }
            } else {
                f3 = ChaloTheme.b(composerStartRestartGroup, 6).N;
                i4 = i3 & (-897);
                if (i7 != 0) {
                    i5 = i4;
                    f4 = f3;
                    function4 = null;
                } else {
                    function4 = function1;
                    i5 = i4;
                    f4 = f3;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1774115663, i5, -1, "app.chalo.compose.components.qr.ChaloQrCode (ChaloQrCode.kt:26)");
            }
            if (data.length() == 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    return;
                }
                final int i10 = 0;
                function3 = new Function2() { // from class: el
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i10) {
                            case 0:
                                ((Integer) obj3).getClass();
                                ChaloQrCodeKt.a(data, modifier, f4, function4, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj3).getClass();
                                ChaloQrCodeKt.a(data, modifier, f4, function4, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            } else {
                modifier2 = modifier;
                float f7 = f4;
                function5 = function4;
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                i6 = i5 & 14;
                composerStartRestartGroup.startReplaceableGroup(-1641751056);
                qrShapes = new QrShapes();
                qrColors = new QrColors();
                qrLogo = new QrLogo();
                qrErrorCorrectionLevel = QrErrorCorrectionLevel.Auto;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1641751056, i6, -1, "io.github.alexzhirkevich.qrose.rememberQrCodePainter (QrCodePainter.kt:75)");
                }
                composerStartRestartGroup.startReplaceableGroup(2039258890);
                zChanged = composerStartRestartGroup.changed(qrShapes) | composerStartRestartGroup.changed(qrColors) | composerStartRestartGroup.changed(qrLogo) | composerStartRestartGroup.changed(qrErrorCorrectionLevel) | composerStartRestartGroup.changed(false);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new QrOptions(qrShapes, qrColors, qrLogo, qrErrorCorrectionLevel);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new QrOptions(qrShapes, qrColors, qrLogo, qrErrorCorrectionLevel);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                options = (QrOptions) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                Intrinsics.i(options, "options");
                composerStartRestartGroup.startReplaceableGroup(1179749356);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1179749356, i6, -1, "io.github.alexzhirkevich.qrose.rememberQrCodePainter (QrCodePainter.kt:63)");
                }
                composerStartRestartGroup.startReplaceableGroup(2039258483);
                zChanged2 = (((i6 ^ 6) <= 4 && composerStartRestartGroup.changed(data)) || (i5 & 6) == 4) | composerStartRestartGroup.changed(options);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new QrCodePainter(data, options);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new QrCodePainter(data, options);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                qrCodePainter = (QrCodePainter) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                iMo398roundToPx0680j_4 = density.mo398roundToPx0680j_4(f7);
                if (i6 == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zChanged3 = z2 | composerStartRestartGroup.changed(iMo398roundToPx0680j_4);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    ImageBitmap imageBitmapM4820ImageBitmapx__hDU$default2 = ImageBitmapKt.m4820ImageBitmapx__hDU$default(iMo398roundToPx0680j_4, iMo398roundToPx0680j_4, 0, false, null, 28, null);
                    Canvas Canvas2 = CanvasKt.Canvas(imageBitmapM4820ImageBitmapx__hDU$default2);
                    CanvasDrawScope canvasDrawScope2 = new CanvasDrawScope();
                    LayoutDirection layoutDirection3 = LayoutDirection.Ltr;
                    float f8 = iMo398roundToPx0680j_4;
                    long jM4425constructorimpl2 = Size.m4425constructorimpl((((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & BodyPartID.bodyIdMax));
                    CanvasDrawScope.DrawParams drawParams4 = canvasDrawScope2.getDrawParams();
                    Density density3 = drawParams4.getDensity();
                    LayoutDirection layoutDirection4 = drawParams4.getLayoutDirection();
                    Canvas canvas2 = drawParams4.getCanvas();
                    long size2 = drawParams4.getSize();
                    CanvasDrawScope.DrawParams drawParams5 = canvasDrawScope2.getDrawParams();
                    drawParams5.setDensity(density);
                    drawParams5.setLayoutDirection(layoutDirection3);
                    drawParams5.setCanvas(Canvas2);
                    drawParams5.m5079setSizeuvyYCjk(jM4425constructorimpl2);
                    Canvas2.save();
                    Painter.m5223drawx_KDEd0$default(qrCodePainter, canvasDrawScope2, DrawScope.CC.c(canvasDrawScope2), 0.0f, null, 6, null);
                    Canvas2.restore();
                    CanvasDrawScope.DrawParams drawParams6 = canvasDrawScope2.getDrawParams();
                    drawParams6.setDensity(density3);
                    drawParams6.setLayoutDirection(layoutDirection4);
                    drawParams6.setCanvas(canvas2);
                    drawParams6.m5079setSizeuvyYCjk(size2);
                    composerStartRestartGroup.updateRememberedValue(imageBitmapM4820ImageBitmapx__hDU$default2);
                    obj = imageBitmapM4820ImageBitmapx__hDU$default2;
                } else {
                    ImageBitmap imageBitmapM4820ImageBitmapx__hDU$default3 = ImageBitmapKt.m4820ImageBitmapx__hDU$default(iMo398roundToPx0680j_4, iMo398roundToPx0680j_4, 0, false, null, 28, null);
                    Canvas Canvas3 = CanvasKt.Canvas(imageBitmapM4820ImageBitmapx__hDU$default3);
                    CanvasDrawScope canvasDrawScope3 = new CanvasDrawScope();
                    LayoutDirection layoutDirection5 = LayoutDirection.Ltr;
                    float f9 = iMo398roundToPx0680j_4;
                    long jM4425constructorimpl3 = Size.m4425constructorimpl((((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f9)) & BodyPartID.bodyIdMax));
                    CanvasDrawScope.DrawParams drawParams7 = canvasDrawScope3.getDrawParams();
                    Density density4 = drawParams7.getDensity();
                    LayoutDirection layoutDirection6 = drawParams7.getLayoutDirection();
                    Canvas canvas3 = drawParams7.getCanvas();
                    long size3 = drawParams7.getSize();
                    CanvasDrawScope.DrawParams drawParams8 = canvasDrawScope3.getDrawParams();
                    drawParams8.setDensity(density);
                    drawParams8.setLayoutDirection(layoutDirection5);
                    drawParams8.setCanvas(Canvas3);
                    drawParams8.m5079setSizeuvyYCjk(jM4425constructorimpl3);
                    Canvas3.save();
                    Painter.m5223drawx_KDEd0$default(qrCodePainter, canvasDrawScope3, DrawScope.CC.c(canvasDrawScope3), 0.0f, null, 6, null);
                    Canvas3.restore();
                    CanvasDrawScope.DrawParams drawParams9 = canvasDrawScope3.getDrawParams();
                    drawParams9.setDensity(density4);
                    drawParams9.setLayoutDirection(layoutDirection6);
                    drawParams9.setCanvas(canvas3);
                    drawParams9.m5079setSizeuvyYCjk(size3);
                    composerStartRestartGroup.updateRememberedValue(imageBitmapM4820ImageBitmapx__hDU$default3);
                    obj = imageBitmapM4820ImageBitmapx__hDU$default3;
                }
                ImageBitmap imageBitmap2 = (ImageBitmap) obj;
                composerStartRestartGroup.startReplaceGroup(-176833308);
                modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(SizeKt.m833width3ABfNKs(modifier2, f7), 1.0f, false, 2, null);
                if (function5 == null) {
                    composerStartRestartGroup.startReplaceGroup(-1619368852);
                    composerStartRestartGroup.endReplaceGroup();
                    modifierOnGloballyPositioned = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1619368851);
                    if ((i5 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z3) {
                        objRememberedValue3 = new l6(function5, 6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new l6(function5, 6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierAspectRatio$default, (Function1) objRememberedValue3);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (modifierOnGloballyPositioned != null) {
                    modifierAspectRatio$default = modifierOnGloballyPositioned;
                }
                composerStartRestartGroup.endReplaceGroup();
                ImageKt.m321Image5hnEew(imageBitmap2, null, modifierAspectRatio$default, null, ContentScale.INSTANCE.getFillWidth(), 0.0f, null, 0, composerStartRestartGroup, 24624, 232);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function5;
                f2 = f7;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function3);
        }
        modifier2 = modifier;
        composerStartRestartGroup.skipToGroupEnd();
        f2 = f;
        function2 = function1;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i11 = 1;
            final Modifier modifier4 = modifier2;
            function3 = new Function2() { // from class: el
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    switch (i11) {
                        case 0:
                            ((Integer) obj3).getClass();
                            ChaloQrCodeKt.a(data, modifier4, f2, function2, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            ChaloQrCodeKt.a(data, modifier4, f2, function2, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function3);
        }
    }
}
