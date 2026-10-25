package app.chalo.home.ui.profile;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.ProfileCompletionTrackerKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.home.ui.profile.ProfileDrawerCardAvatarKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import defpackage.ay0;
import defpackage.fn0;
import defpackage.wv0;
import defpackage.zx0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProfileDrawerCardAvatarKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f3591a = SetsKt.g(IconType.IC_PROFILE);

    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:65:0x0126  */
    /* JADX WARN: Code duplicated, block: B:66:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x015c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0165  */
    /* JADX WARN: Code duplicated, block: B:75:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0185  */
    /* JADX WARN: Code duplicated, block: B:79:0x0198 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, float f, IconType iconType, float f2, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        zx0 zx0Var;
        Modifier modifier4;
        Modifier modifierClip;
        Modifier modifier5;
        float fM7278constructorimpl;
        Composer composerStartRestartGroup = composer.startRestartGroup(-423991375);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(iconType.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i4 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-423991375, i3, -1, "app.chalo.home.ui.profile.ProfileAvatarImage (ProfileDrawerCardAvatar.kt:92)");
                }
                modifierClip = ClipKt.clip(SizeKt.m828size3ABfNKs(modifier4, f), RoundedCornerShapeKt.getCircleShape());
                if (str != null || StringsKt.F(str)) {
                    modifier5 = modifier4;
                    composerStartRestartGroup.startReplaceGroup(372062575);
                    Painter painterA = PainterResourceHelperKt.a(iconType, composerStartRestartGroup, (i3 >> 6) & 14);
                    Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(modifierClip, ChaloTheme.a(composerStartRestartGroup, 0).t, RoundedCornerShapeKt.getCircleShape());
                    if (f3591a.contains(iconType)) {
                        fM7278constructorimpl = Dp.m7278constructorimpl(0);
                    } else {
                        fM7278constructorimpl = f2;
                    }
                    ImageKt.Image(painterA, (String) null, PaddingKt.m788paddingqDBjuR0$default(modifierM263backgroundbw27NRU, 0.0f, fM7278constructorimpl, 0.0f, 0.0f, 13, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    } else {
                        zx0Var = new zx0(str, f, iconType, f2, modifier5, i, i2, 0);
                    }
                } else {
                    composerStartRestartGroup.startReplaceGroup(368576625);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier6 = modifier4;
                    SingletonSubcomposeAsyncImageKt.a(str, null, modifierClip, ComposableLambdaKt.rememberComposableLambda(-792653558, true, new ay0(iconType, modifierClip, 0), composerStartRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(134109204, true, new wv0(iconType, modifierClip, f2), composerStartRestartGroup, 54), null, null, null, ContentScale.INSTANCE.getCrop(), composerStartRestartGroup, (i3 & 14) | 1597488, 48, 63400);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier6;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(zx0Var);
            }
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                zx0Var = new zx0(str, f, iconType, f2, modifier3, i, i2, 1);
                scopeUpdateScopeEndRestartGroup.updateScope(zx0Var);
            }
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            if (i4 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-423991375, i3, -1, "app.chalo.home.ui.profile.ProfileAvatarImage (ProfileDrawerCardAvatar.kt:92)");
            }
            modifierClip = ClipKt.clip(SizeKt.m828size3ABfNKs(modifier4, f), RoundedCornerShapeKt.getCircleShape());
            if (str != null) {
            }
            modifier5 = modifier4;
            composerStartRestartGroup.startReplaceGroup(372062575);
            Painter painterA2 = PainterResourceHelperKt.a(iconType, composerStartRestartGroup, (i3 >> 6) & 14);
            Modifier modifierM263backgroundbw27NRU2 = BackgroundKt.m263backgroundbw27NRU(modifierClip, ChaloTheme.a(composerStartRestartGroup, 0).t, RoundedCornerShapeKt.getCircleShape());
            if (f3591a.contains(iconType)) {
                fM7278constructorimpl = Dp.m7278constructorimpl(0);
            } else {
                fM7278constructorimpl = f2;
            }
            ImageKt.Image(painterA2, (String) null, PaddingKt.m788paddingqDBjuR0$default(modifierM263backgroundbw27NRU2, 0.0f, fM7278constructorimpl, 0.0f, 0.0f, 13, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                zx0Var = new zx0(str, f, iconType, f2, modifier5, i, i2, 0);
                scopeUpdateScopeEndRestartGroup.updateScope(zx0Var);
            }
            return;
        }
        composerStartRestartGroup.skipToGroupEnd();
        modifier3 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            zx0Var = new zx0(str, f, iconType, f2, modifier3, i, i2, 1);
            scopeUpdateScopeEndRestartGroup.updateScope(zx0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0129  */
    /* JADX WARN: Code duplicated, block: B:103:0x012e  */
    /* JADX WARN: Code duplicated, block: B:104:0x014c  */
    /* JADX WARN: Code duplicated, block: B:107:0x015f  */
    /* JADX WARN: Code duplicated, block: B:110:0x016f  */
    /* JADX WARN: Code duplicated, block: B:112:0x019f  */
    /* JADX WARN: Code duplicated, block: B:114:0x01da  */
    /* JADX WARN: Code duplicated, block: B:116:0x01df  */
    /* JADX WARN: Code duplicated, block: B:117:0x0230  */
    /* JADX WARN: Code duplicated, block: B:120:0x0263  */
    /* JADX WARN: Code duplicated, block: B:122:0x026d  */
    /* JADX WARN: Code duplicated, block: B:125:0x027b  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:90:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x010a  */
    /* JADX WARN: Code duplicated, block: B:92:0x010d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x011b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0120  */
    public static final void b(final ProfileDrawerCardData profileCardData, final IconType fallbackIcon, Modifier modifier, final float f, float f2, float f3, float f4, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        float f5;
        float f6;
        float f7;
        boolean z;
        Composer composer2;
        final Modifier modifier3;
        final float f8;
        final float f9;
        final float f10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        float f11;
        float f12;
        int i4;
        Modifier modifier5;
        float f13;
        float f14;
        float fM7278constructorimpl;
        float fM7278constructorimpl2;
        Modifier modifier6;
        Modifier modifier7;
        float f15;
        float f16;
        float f17;
        int i5;
        Intrinsics.i(profileCardData, "profileCardData");
        Intrinsics.i(fallbackIcon, "fallbackIcon");
        Composer composerStartRestartGroup = composer.startRestartGroup(1799080848);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(profileCardData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(fallbackIcon.ordinal()) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    f5 = f2;
                    int i7 = composerStartRestartGroup.changed(f5) ? 16384 : 8192;
                    i3 |= i7;
                } else {
                    f5 = f2;
                }
                i3 |= i7;
            } else {
                f5 = f2;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    f6 = f3;
                    int i8 = composerStartRestartGroup.changed(f6) ? 131072 : 65536;
                    i3 |= i8;
                } else {
                    f6 = f3;
                }
                i3 |= i8;
            } else {
                f6 = f3;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    f7 = f4;
                    int i9 = composerStartRestartGroup.changed(f7) ? 1048576 : 524288;
                    i3 |= i9;
                } else {
                    f7 = f4;
                }
                i3 |= i9;
            } else {
                f7 = f4;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i6 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i2 & 16) != 0) {
                        f11 = ChaloTheme.b(composerStartRestartGroup, 0).c;
                        i3 &= -57345;
                    } else {
                        f11 = f5;
                    }
                    if ((i2 & 32) != 0) {
                        f12 = ChaloTheme.b(composerStartRestartGroup, 0).c;
                        i3 &= -458753;
                    } else {
                        f12 = f6;
                    }
                    if ((i2 & 64) != 0) {
                        Modifier modifier8 = modifier4;
                        i4 = i3 & (-3670017);
                        modifier5 = modifier8;
                        f13 = f11;
                        f14 = f12;
                        fM7278constructorimpl = Dp.m7278constructorimpl(ChaloTheme.b(composerStartRestartGroup, 0).c + ChaloTheme.b(composerStartRestartGroup, 0).b);
                    } else {
                        Modifier modifier9 = modifier4;
                        i4 = i3;
                        modifier5 = modifier9;
                        f13 = f11;
                        f14 = f12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1799080848, i4, -1, "app.chalo.home.ui.profile.ProfileDrawerCardAvatar (ProfileDrawerCardAvatar.kt:33)");
                    }
                    fM7278constructorimpl2 = ChaloTheme.b(composerStartRestartGroup, 0).c;
                    if (profileCardData.f3592a) {
                        modifier6 = modifier5;
                        if (profileCardData.f) {
                            modifier7 = modifier6;
                            f15 = f13;
                            f16 = f14;
                            f17 = fM7278constructorimpl;
                            composerStartRestartGroup.startReplaceGroup(-477347552);
                            a(profileCardData.b, f, fallbackIcon, fM7278constructorimpl2, modifier7, composerStartRestartGroup, ((i4 >> 6) & 112) | ((i4 << 3) & 896) | (57344 & (i4 << 6)), 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-478215180);
                            int i10 = i4 << 3;
                            int i11 = ((i4 >> 3) & 896) | 805334016 | (458752 & i10) | (3670016 & i10) | (i10 & 29360128) | ((i4 << 18) & 234881024);
                            modifier7 = modifier6;
                            float f18 = f13;
                            float f19 = f14;
                            float f20 = fM7278constructorimpl;
                            ProfileCompletionTrackerKt.a(profileCardData.i, profileCardData.h, f, ChaloColorToken.AmountAddedText.f9758a, ChaloColorToken.Black_20.f9762a, f18, f19, f20, modifier7, ComposableLambdaKt.rememberComposableLambda(1242858191, true, new fn0(profileCardData, f, fallbackIcon, fM7278constructorimpl2), composerStartRestartGroup, 54), composerStartRestartGroup, i11, 0);
                            f16 = f19;
                            composerStartRestartGroup = composerStartRestartGroup;
                            f17 = f20;
                            f15 = f18;
                            composerStartRestartGroup.endReplaceGroup();
                        }
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-478859515);
                        Painter painterA = PainterResourceHelperKt.a(fallbackIcon, composerStartRestartGroup, (i4 >> 3) & 14);
                        Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(ClipKt.clip(SizeKt.m828size3ABfNKs(modifier5, f), RoundedCornerShapeKt.getCircleShape()), ChaloTheme.a(composerStartRestartGroup, 0).t, RoundedCornerShapeKt.getCircleShape());
                        if (f3591a.contains(fallbackIcon)) {
                            fM7278constructorimpl2 = Dp.m7278constructorimpl(0);
                        }
                        ImageKt.Image(painterA, (String) null, PaddingKt.m788paddingqDBjuR0$default(modifierM263backgroundbw27NRU, 0.0f, fM7278constructorimpl2, 0.0f, 0.0f, 13, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                        modifier7 = modifier5;
                        f15 = f13;
                        f16 = f14;
                        f17 = fM7278constructorimpl;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    float f21 = f17;
                    composer2 = composerStartRestartGroup;
                    f10 = f21;
                    f8 = f15;
                    modifier3 = modifier7;
                    f9 = f16;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    i4 = i3;
                    modifier5 = modifier2;
                    f13 = f5;
                    f14 = f6;
                }
                fM7278constructorimpl = f7;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1799080848, i4, -1, "app.chalo.home.ui.profile.ProfileDrawerCardAvatar (ProfileDrawerCardAvatar.kt:33)");
                }
                fM7278constructorimpl2 = ChaloTheme.b(composerStartRestartGroup, 0).c;
                if (profileCardData.f3592a) {
                    composerStartRestartGroup.startReplaceGroup(-478859515);
                    Painter painterA2 = PainterResourceHelperKt.a(fallbackIcon, composerStartRestartGroup, (i4 >> 3) & 14);
                    Modifier modifierM263backgroundbw27NRU2 = BackgroundKt.m263backgroundbw27NRU(ClipKt.clip(SizeKt.m828size3ABfNKs(modifier5, f), RoundedCornerShapeKt.getCircleShape()), ChaloTheme.a(composerStartRestartGroup, 0).t, RoundedCornerShapeKt.getCircleShape());
                    if (f3591a.contains(fallbackIcon)) {
                        fM7278constructorimpl2 = Dp.m7278constructorimpl(0);
                    }
                    ImageKt.Image(painterA2, (String) null, PaddingKt.m788paddingqDBjuR0$default(modifierM263backgroundbw27NRU2, 0.0f, fM7278constructorimpl2, 0.0f, 0.0f, 13, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                    modifier7 = modifier5;
                    f15 = f13;
                    f16 = f14;
                    f17 = fM7278constructorimpl;
                } else {
                    modifier6 = modifier5;
                    if (profileCardData.f) {
                        composerStartRestartGroup.startReplaceGroup(-478215180);
                        int i12 = i4 << 3;
                        int i13 = ((i4 >> 3) & 896) | 805334016 | (458752 & i12) | (3670016 & i12) | (i12 & 29360128) | ((i4 << 18) & 234881024);
                        modifier7 = modifier6;
                        float f110 = f13;
                        float f111 = f14;
                        float f22 = fM7278constructorimpl;
                        ProfileCompletionTrackerKt.a(profileCardData.i, profileCardData.h, f, ChaloColorToken.AmountAddedText.f9758a, ChaloColorToken.Black_20.f9762a, f110, f111, f22, modifier7, ComposableLambdaKt.rememberComposableLambda(1242858191, true, new fn0(profileCardData, f, fallbackIcon, fM7278constructorimpl2), composerStartRestartGroup, 54), composerStartRestartGroup, i13, 0);
                        f16 = f111;
                        composerStartRestartGroup = composerStartRestartGroup;
                        f17 = f22;
                        f15 = f110;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        modifier7 = modifier6;
                        f15 = f13;
                        f16 = f14;
                        f17 = fM7278constructorimpl;
                        composerStartRestartGroup.startReplaceGroup(-477347552);
                        a(profileCardData.b, f, fallbackIcon, fM7278constructorimpl2, modifier7, composerStartRestartGroup, ((i4 >> 6) & 112) | ((i4 << 3) & 896) | (57344 & (i4 << 6)), 0);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                float f23 = f17;
                composer2 = composerStartRestartGroup;
                f10 = f23;
                f8 = f15;
                modifier3 = modifier7;
                f9 = f16;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
                f8 = f5;
                f9 = f6;
                f10 = f7;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: yx0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer3 = (Composer) obj;
                        ((Integer) obj2).getClass();
                        Set set = ProfileDrawerCardAvatarKt.f3591a;
                        ProfileDrawerCardAvatarKt.b(profileCardData, fallbackIcon, modifier3, f, f8, f9, f10, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) == 0) {
            if (composerStartRestartGroup.changed(f)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                f5 = f2;
                if (composerStartRestartGroup.changed(f5)) {
                }
                i3 |= i7;
            } else {
                f5 = f2;
            }
            i3 |= i7;
        } else {
            f5 = f2;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                f6 = f3;
                if (composerStartRestartGroup.changed(f6)) {
                }
                i3 |= i8;
            } else {
                f6 = f3;
            }
            i3 |= i8;
        } else {
            f6 = f3;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                f7 = f4;
                if (composerStartRestartGroup.changed(f7)) {
                }
                i3 |= i9;
            } else {
                f7 = f4;
            }
            i3 |= i9;
        } else {
            f7 = f4;
        }
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if ((i2 & 16) != 0) {
                    f11 = ChaloTheme.b(composerStartRestartGroup, 0).c;
                    i3 &= -57345;
                } else {
                    f11 = f5;
                }
                if ((i2 & 32) != 0) {
                    f12 = ChaloTheme.b(composerStartRestartGroup, 0).c;
                    i3 &= -458753;
                } else {
                    f12 = f6;
                }
                if ((i2 & 64) != 0) {
                    Modifier modifier10 = modifier4;
                    i4 = i3 & (-3670017);
                    modifier5 = modifier10;
                    f13 = f11;
                    f14 = f12;
                    fM7278constructorimpl = Dp.m7278constructorimpl(ChaloTheme.b(composerStartRestartGroup, 0).c + ChaloTheme.b(composerStartRestartGroup, 0).b);
                } else {
                    Modifier modifier11 = modifier4;
                    i4 = i3;
                    modifier5 = modifier11;
                    f13 = f11;
                    f14 = f12;
                    fM7278constructorimpl = f7;
                }
            } else {
                if (i6 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if ((i2 & 16) != 0) {
                    f11 = ChaloTheme.b(composerStartRestartGroup, 0).c;
                    i3 &= -57345;
                } else {
                    f11 = f5;
                }
                if ((i2 & 32) != 0) {
                    f12 = ChaloTheme.b(composerStartRestartGroup, 0).c;
                    i3 &= -458753;
                } else {
                    f12 = f6;
                }
                if ((i2 & 64) != 0) {
                    Modifier modifier12 = modifier4;
                    i4 = i3 & (-3670017);
                    modifier5 = modifier12;
                    f13 = f11;
                    f14 = f12;
                    fM7278constructorimpl = Dp.m7278constructorimpl(ChaloTheme.b(composerStartRestartGroup, 0).c + ChaloTheme.b(composerStartRestartGroup, 0).b);
                } else {
                    Modifier modifier13 = modifier4;
                    i4 = i3;
                    modifier5 = modifier13;
                    f13 = f11;
                    f14 = f12;
                    fM7278constructorimpl = f7;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1799080848, i4, -1, "app.chalo.home.ui.profile.ProfileDrawerCardAvatar (ProfileDrawerCardAvatar.kt:33)");
            }
            fM7278constructorimpl2 = ChaloTheme.b(composerStartRestartGroup, 0).c;
            if (profileCardData.f3592a) {
                composerStartRestartGroup.startReplaceGroup(-478859515);
                Painter painterA3 = PainterResourceHelperKt.a(fallbackIcon, composerStartRestartGroup, (i4 >> 3) & 14);
                Modifier modifierM263backgroundbw27NRU3 = BackgroundKt.m263backgroundbw27NRU(ClipKt.clip(SizeKt.m828size3ABfNKs(modifier5, f), RoundedCornerShapeKt.getCircleShape()), ChaloTheme.a(composerStartRestartGroup, 0).t, RoundedCornerShapeKt.getCircleShape());
                if (f3591a.contains(fallbackIcon)) {
                    fM7278constructorimpl2 = Dp.m7278constructorimpl(0);
                }
                ImageKt.Image(painterA3, (String) null, PaddingKt.m788paddingqDBjuR0$default(modifierM263backgroundbw27NRU3, 0.0f, fM7278constructorimpl2, 0.0f, 0.0f, 13, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                modifier7 = modifier5;
                f15 = f13;
                f16 = f14;
                f17 = fM7278constructorimpl;
            } else {
                modifier6 = modifier5;
                if (profileCardData.f) {
                    composerStartRestartGroup.startReplaceGroup(-478215180);
                    int i14 = i4 << 3;
                    int i15 = ((i4 >> 3) & 896) | 805334016 | (458752 & i14) | (3670016 & i14) | (i14 & 29360128) | ((i4 << 18) & 234881024);
                    modifier7 = modifier6;
                    float f112 = f13;
                    float f113 = f14;
                    float f24 = fM7278constructorimpl;
                    ProfileCompletionTrackerKt.a(profileCardData.i, profileCardData.h, f, ChaloColorToken.AmountAddedText.f9758a, ChaloColorToken.Black_20.f9762a, f112, f113, f24, modifier7, ComposableLambdaKt.rememberComposableLambda(1242858191, true, new fn0(profileCardData, f, fallbackIcon, fM7278constructorimpl2), composerStartRestartGroup, 54), composerStartRestartGroup, i15, 0);
                    f16 = f113;
                    composerStartRestartGroup = composerStartRestartGroup;
                    f17 = f24;
                    f15 = f112;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    modifier7 = modifier6;
                    f15 = f13;
                    f16 = f14;
                    f17 = fM7278constructorimpl;
                    composerStartRestartGroup.startReplaceGroup(-477347552);
                    a(profileCardData.b, f, fallbackIcon, fM7278constructorimpl2, modifier7, composerStartRestartGroup, ((i4 >> 6) & 112) | ((i4 << 3) & 896) | (57344 & (i4 << 6)), 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            float f25 = f17;
            composer2 = composerStartRestartGroup;
            f10 = f25;
            f8 = f15;
            modifier3 = modifier7;
            f9 = f16;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
            f8 = f5;
            f9 = f6;
            f10 = f7;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: yx0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer3 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    Set set = ProfileDrawerCardAvatarKt.f3591a;
                    ProfileDrawerCardAvatarKt.b(profileCardData, fallbackIcon, modifier3, f, f8, f9, f10, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return Unit.f17538a;
                }
            });
        }
    }
}
