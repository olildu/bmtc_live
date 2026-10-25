package app.chalo.compose.components.shimmer;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.theme.ChaloTheme;
import defpackage.fu0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "size", "", "startOffset", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ShimmerEffectKt {
    /* JADX WARN: Code duplicated, block: B:102:0x014b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0152  */
    /* JADX WARN: Code duplicated, block: B:107:0x015c  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x0102  */
    /* JADX WARN: Code duplicated, block: B:96:0x010f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0120  */
    public static final void a(Modifier modifier, final float f, float f2, Shape shape, long j, long j2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float f3;
        Shape shape2;
        long j3;
        long j4;
        boolean z;
        final float f4;
        final Shape shape3;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-253359089);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                f3 = f2;
                i3 |= composerStartRestartGroup.changed(f3) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    shape2 = shape;
                    int i6 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    shape2 = shape;
                }
                i3 |= i6;
            } else {
                shape2 = shape;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j3 = j;
                    int i7 = composerStartRestartGroup.changed(j3) ? 16384 : 8192;
                    i3 |= i7;
                } else {
                    j3 = j;
                }
                i3 |= i7;
            } else {
                j3 = j;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j4 = j2;
                    int i8 = composerStartRestartGroup.changed(j4) ? 131072 : 65536;
                    i3 |= i8;
                } else {
                    j4 = j2;
                }
                i3 |= i8;
            } else {
                j4 = j2;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        f3 = 1.0f;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shape2 = ChaloTheme.d(composerStartRestartGroup, 6).b;
                    }
                    if ((i2 & 16) != 0) {
                        j3 = ChaloTheme.a(composerStartRestartGroup, 6).A;
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        j4 = ChaloTheme.a(composerStartRestartGroup, 6).n;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-253359089, i3, -1, "app.chalo.compose.components.shimmer.ShimmerBox (ShimmerEffect.kt:69)");
                }
                BoxKt.Box(b(ClipKt.clip(SizeKt.fillMaxWidth(SizeKt.m814height3ABfNKs(modifier2, f), f3), shape2), Color.m4595boximpl(j3), Color.m4595boximpl(j4), 4), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            f4 = f3;
            shape3 = shape2;
            j5 = j4;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier3 = modifier2;
                final long j6 = j3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: l81
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ShimmerEffectKt.a(modifier3, f, f4, shape3, j6, j5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i3 |= 384;
        f3 = f2;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i3 |= i6;
            } else {
                shape2 = shape;
            }
            i3 |= i6;
        } else {
            shape2 = shape;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                j3 = j;
                if (composerStartRestartGroup.changed(j3)) {
                }
                i3 |= i7;
            } else {
                j3 = j;
            }
            i3 |= i7;
        } else {
            j3 = j;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                j4 = j2;
                if (composerStartRestartGroup.changed(j4)) {
                }
                i3 |= i8;
            } else {
                j4 = j2;
            }
            i3 |= i8;
        } else {
            j4 = j2;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    f3 = 1.0f;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    shape2 = ChaloTheme.d(composerStartRestartGroup, 6).b;
                }
                if ((i2 & 16) != 0) {
                    j3 = ChaloTheme.a(composerStartRestartGroup, 6).A;
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    j4 = ChaloTheme.a(composerStartRestartGroup, 6).n;
                }
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    f3 = 1.0f;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    shape2 = ChaloTheme.d(composerStartRestartGroup, 6).b;
                }
                if ((i2 & 16) != 0) {
                    j3 = ChaloTheme.a(composerStartRestartGroup, 6).A;
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    j4 = ChaloTheme.a(composerStartRestartGroup, 6).n;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-253359089, i3, -1, "app.chalo.compose.components.shimmer.ShimmerBox (ShimmerEffect.kt:69)");
            }
            BoxKt.Box(b(ClipKt.clip(SizeKt.fillMaxWidth(SizeKt.m814height3ABfNKs(modifier2, f), f3), shape2), Color.m4595boximpl(j3), Color.m4595boximpl(j4), 4), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        f4 = f3;
        shape3 = shape2;
        j5 = j4;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            final long j7 = j3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: l81
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ShimmerEffectKt.a(modifier4, f, f4, shape3, j7, j5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return Unit.f17538a;
                }
            });
        }
    }

    public static Modifier b(Modifier shimmerEffect, Color color, Color color2, int i) {
        if ((i & 1) != 0) {
            color = null;
        }
        if ((i & 2) != 0) {
            color2 = null;
        }
        Intrinsics.i(shimmerEffect, "$this$shimmerEffect");
        return ComposedModifierKt.composed$default(shimmerEffect, null, new fu0(23, color, color2), 1, null);
    }
}
