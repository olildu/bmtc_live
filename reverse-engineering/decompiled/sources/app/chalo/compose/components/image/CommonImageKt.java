package app.chalo.compose.components.image;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUIStateKt;
import defpackage.b9;
import defpackage.fi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CommonImageKt {
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:74:0x0111  */
    /* JADX WARN: Code duplicated, block: B:77:0x0160  */
    /* JADX WARN: Code duplicated, block: B:80:0x0180  */
    /* JADX WARN: Code duplicated, block: B:82:0x0187  */
    /* JADX WARN: Code duplicated, block: B:85:0x0192  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public static final void a(ImageUIState imageUIState, Modifier modifier, boolean z, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        Modifier modifier3;
        boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        boolean z5;
        ImageUISize imageUISize;
        Modifier modifierM295clickableO2vRcR0$default;
        IndicationNodeFactory indicationNodeFactory;
        MutableInteractionSource mutableInteractionSource;
        boolean z6;
        Object objRememberedValue;
        Modifier modifierB;
        Intrinsics.i(imageUIState, "imageUIState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1820383838);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(imageUIState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 147) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    if (i6 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1820383838, i3, -1, "app.chalo.compose.components.image.CommonImage (CommonImage.kt:20)");
                    }
                    imageUISize = imageUIState.d;
                    if (imageUISize != null || (modifierB = ImageUIStateKt.b(modifier4, imageUISize)) == null) {
                        modifierM295clickableO2vRcR0$default = modifier4;
                    } else {
                        modifierM295clickableO2vRcR0$default = modifierB;
                    }
                    if (imageUIState.h != null) {
                        composerStartRestartGroup.startReplaceGroup(-1496816996);
                        if (z5) {
                            composerStartRestartGroup.startReplaceGroup(1337190512);
                            IndicationNodeFactory indicationNodeFactoryA = RippleEffectKt.a(composerStartRestartGroup);
                            composerStartRestartGroup.endReplaceGroup();
                            indicationNodeFactory = indicationNodeFactoryA;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1496743713);
                            composerStartRestartGroup.endReplaceGroup();
                            indicationNodeFactory = null;
                        }
                        if (z5) {
                            composerStartRestartGroup.startReplaceGroup(1337193182);
                            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                            composerStartRestartGroup.endReplaceGroup();
                            mutableInteractionSource = mutableInteractionSourceB;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1496647489);
                            composerStartRestartGroup.endReplaceGroup();
                            mutableInteractionSource = null;
                        }
                        z6 = (i3 & 14) == 4;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z6 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new fi(imageUIState, 19);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(modifierM295clickableO2vRcR0$default, mutableInteractionSource, indicationNodeFactory, false, null, null, (Function0) objRememberedValue, 28, null);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1337196491);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    Modifier modifierM4770graphicsLayer_6ThJ44$default = GraphicsLayerModifierKt.m4770graphicsLayer_6ThJ44$default(modifierM295clickableO2vRcR0$default, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, imageUIState.g, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524031, null);
                    Painter painterA = PainterResourceHelperKt.a(imageUIState.f10035a, composerStartRestartGroup, 0);
                    String str = imageUIState.b;
                    ContentScale contentScaleC = ImageUIStateKt.c(imageUIState.e);
                    float f = imageUIState.f;
                    ChaloColorToken chaloColorToken = imageUIState.c;
                    ImageKt.Image(painterA, str, modifierM4770graphicsLayer_6ThJ44$default, (Alignment) null, contentScaleC, f, chaloColorToken != null ? ColorFilter.Companion.m4646tintxETnrds$default(ColorFilter.INSTANCE, ChaloColorTokenKt.c(chaloColorToken), 0, 2, null) : null, composerStartRestartGroup, Painter.$stable, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z4 = z5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z4 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new b9(imageUIState, modifier3, z4, i, i2, 2));
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i6 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1820383838, i3, -1, "app.chalo.compose.components.image.CommonImage (CommonImage.kt:20)");
                }
                imageUISize = imageUIState.d;
                if (imageUISize != null) {
                    modifierM295clickableO2vRcR0$default = modifier4;
                } else {
                    modifierM295clickableO2vRcR0$default = modifier4;
                }
                if (imageUIState.h != null) {
                    composerStartRestartGroup.startReplaceGroup(-1496816996);
                    if (z5) {
                        composerStartRestartGroup.startReplaceGroup(1337190512);
                        IndicationNodeFactory indicationNodeFactoryA2 = RippleEffectKt.a(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceGroup();
                        indicationNodeFactory = indicationNodeFactoryA2;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1496743713);
                        composerStartRestartGroup.endReplaceGroup();
                        indicationNodeFactory = null;
                    }
                    if (z5) {
                        composerStartRestartGroup.startReplaceGroup(1337193182);
                        MutableInteractionSource mutableInteractionSourceB2 = RippleEffectKt.b(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceGroup();
                        mutableInteractionSource = mutableInteractionSourceB2;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1496647489);
                        composerStartRestartGroup.endReplaceGroup();
                        mutableInteractionSource = null;
                    }
                    if ((i3 & 14) == 4) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z6) {
                        objRememberedValue = new fi(imageUIState, 19);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new fi(imageUIState, 19);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(modifierM295clickableO2vRcR0$default, mutableInteractionSource, indicationNodeFactory, false, null, null, (Function0) objRememberedValue, 28, null);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1337196491);
                    composerStartRestartGroup.endReplaceGroup();
                }
                Modifier modifierM4770graphicsLayer_6ThJ44$default2 = GraphicsLayerModifierKt.m4770graphicsLayer_6ThJ44$default(modifierM295clickableO2vRcR0$default, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, imageUIState.g, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524031, null);
                Painter painterA2 = PainterResourceHelperKt.a(imageUIState.f10035a, composerStartRestartGroup, 0);
                String str2 = imageUIState.b;
                ContentScale contentScaleC2 = ImageUIStateKt.c(imageUIState.e);
                float f2 = imageUIState.f;
                ChaloColorToken chaloColorToken2 = imageUIState.c;
                ImageKt.Image(painterA2, str2, modifierM4770graphicsLayer_6ThJ44$default2, (Alignment) null, contentScaleC2, f2, chaloColorToken2 != null ? ColorFilter.Companion.m4646tintxETnrds$default(ColorFilter.INSTANCE, ChaloColorTokenKt.c(chaloColorToken2), 0, 2, null) : null, composerStartRestartGroup, Painter.$stable, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                z4 = z5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                z4 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new b9(imageUIState, modifier3, z4, i, i2, 2));
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i6 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1820383838, i3, -1, "app.chalo.compose.components.image.CommonImage (CommonImage.kt:20)");
                }
                imageUISize = imageUIState.d;
                if (imageUISize != null) {
                    modifierM295clickableO2vRcR0$default = modifier4;
                } else {
                    modifierM295clickableO2vRcR0$default = modifier4;
                }
                if (imageUIState.h != null) {
                    composerStartRestartGroup.startReplaceGroup(-1496816996);
                    if (z5) {
                        composerStartRestartGroup.startReplaceGroup(1337190512);
                        IndicationNodeFactory indicationNodeFactoryA3 = RippleEffectKt.a(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceGroup();
                        indicationNodeFactory = indicationNodeFactoryA3;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1496743713);
                        composerStartRestartGroup.endReplaceGroup();
                        indicationNodeFactory = null;
                    }
                    if (z5) {
                        composerStartRestartGroup.startReplaceGroup(1337193182);
                        MutableInteractionSource mutableInteractionSourceB3 = RippleEffectKt.b(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceGroup();
                        mutableInteractionSource = mutableInteractionSourceB3;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1496647489);
                        composerStartRestartGroup.endReplaceGroup();
                        mutableInteractionSource = null;
                    }
                    if ((i3 & 14) == 4) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z6) {
                        objRememberedValue = new fi(imageUIState, 19);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new fi(imageUIState, 19);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(modifierM295clickableO2vRcR0$default, mutableInteractionSource, indicationNodeFactory, false, null, null, (Function0) objRememberedValue, 28, null);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1337196491);
                    composerStartRestartGroup.endReplaceGroup();
                }
                Modifier modifierM4770graphicsLayer_6ThJ44$default3 = GraphicsLayerModifierKt.m4770graphicsLayer_6ThJ44$default(modifierM295clickableO2vRcR0$default, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, imageUIState.g, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524031, null);
                Painter painterA3 = PainterResourceHelperKt.a(imageUIState.f10035a, composerStartRestartGroup, 0);
                String str3 = imageUIState.b;
                ContentScale contentScaleC3 = ImageUIStateKt.c(imageUIState.e);
                float f3 = imageUIState.f;
                ChaloColorToken chaloColorToken3 = imageUIState.c;
                ImageKt.Image(painterA3, str3, modifierM4770graphicsLayer_6ThJ44$default3, (Alignment) null, contentScaleC3, f3, chaloColorToken3 != null ? ColorFilter.Companion.m4646tintxETnrds$default(ColorFilter.INSTANCE, ChaloColorTokenKt.c(chaloColorToken3), 0, 2, null) : null, composerStartRestartGroup, Painter.$stable, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                z4 = z5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                z4 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new b9(imageUIState, modifier3, z4, i, i2, 2));
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i3 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
            if (i6 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (i4 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1820383838, i3, -1, "app.chalo.compose.components.image.CommonImage (CommonImage.kt:20)");
            }
            imageUISize = imageUIState.d;
            if (imageUISize != null) {
                modifierM295clickableO2vRcR0$default = modifier4;
            } else {
                modifierM295clickableO2vRcR0$default = modifier4;
            }
            if (imageUIState.h != null) {
                composerStartRestartGroup.startReplaceGroup(-1496816996);
                if (z5) {
                    composerStartRestartGroup.startReplaceGroup(1337190512);
                    IndicationNodeFactory indicationNodeFactoryA4 = RippleEffectKt.a(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceGroup();
                    indicationNodeFactory = indicationNodeFactoryA4;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1496743713);
                    composerStartRestartGroup.endReplaceGroup();
                    indicationNodeFactory = null;
                }
                if (z5) {
                    composerStartRestartGroup.startReplaceGroup(1337193182);
                    MutableInteractionSource mutableInteractionSourceB4 = RippleEffectKt.b(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceGroup();
                    mutableInteractionSource = mutableInteractionSourceB4;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1496647489);
                    composerStartRestartGroup.endReplaceGroup();
                    mutableInteractionSource = null;
                }
                if ((i3 & 14) == 4) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z6) {
                    objRememberedValue = new fi(imageUIState, 19);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new fi(imageUIState, 19);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(modifierM295clickableO2vRcR0$default, mutableInteractionSource, indicationNodeFactory, false, null, null, (Function0) objRememberedValue, 28, null);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1337196491);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierM4770graphicsLayer_6ThJ44$default4 = GraphicsLayerModifierKt.m4770graphicsLayer_6ThJ44$default(modifierM295clickableO2vRcR0$default, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, imageUIState.g, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524031, null);
            Painter painterA4 = PainterResourceHelperKt.a(imageUIState.f10035a, composerStartRestartGroup, 0);
            String str4 = imageUIState.b;
            ContentScale contentScaleC4 = ImageUIStateKt.c(imageUIState.e);
            float f4 = imageUIState.f;
            ChaloColorToken chaloColorToken4 = imageUIState.c;
            ImageKt.Image(painterA4, str4, modifierM4770graphicsLayer_6ThJ44$default4, (Alignment) null, contentScaleC4, f4, chaloColorToken4 != null ? ColorFilter.Companion.m4646tintxETnrds$default(ColorFilter.INSTANCE, ChaloColorTokenKt.c(chaloColorToken4), 0, 2, null) : null, composerStartRestartGroup, Painter.$stable, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            z4 = z5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            z4 = z2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b9(imageUIState, modifier3, z4, i, i2, 2));
        }
    }
}
