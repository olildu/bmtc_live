package app.chalo.compose.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.TooltipPopupComposableKt;
import app.chalo.compose.theme.ChaloTheme;
import defpackage.ag1;
import defpackage.fc;
import defpackage.k20;
import defpackage.ln;
import defpackage.pk0;
import defpackage.s50;
import defpackage.t8;
import defpackage.vi1;
import defpackage.xq0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0006²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/compose/components/TooltipPopupPosition;", "position", "Landroidx/compose/ui/layout/LayoutCoordinates;", "requesterCoordinates", "", "arrowPositionX", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TooltipPopupComposableKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1850a;

        static {
            int[] iArr = new int[TooltipPopupPlacement.values().length];
            try {
                iArr[TooltipPopupPlacement.BelowAnchor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TooltipPopupPlacement.AboveAnchor.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1850a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0137  */
    /* JADX WARN: Code duplicated, block: B:106:0x0140  */
    /* JADX WARN: Code duplicated, block: B:124:0x0186  */
    /* JADX WARN: Code duplicated, block: B:126:0x018a  */
    /* JADX WARN: Code duplicated, block: B:127:0x018d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0193  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:141:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:143:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:151:0x0200  */
    /* JADX WARN: Code duplicated, block: B:152:0x0222  */
    /* JADX WARN: Code duplicated, block: B:155:0x022f  */
    /* JADX WARN: Code duplicated, block: B:158:0x023a  */
    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    /* JADX WARN: Code duplicated, block: B:160:0x024c  */
    /* JADX WARN: Code duplicated, block: B:161:0x024e  */
    /* JADX WARN: Code duplicated, block: B:166:0x025c  */
    /* JADX WARN: Code duplicated, block: B:169:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:172:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:173:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:176:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:181:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:184:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:186:0x0302  */
    /* JADX WARN: Code duplicated, block: B:189:0x031c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00da  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:85:0x0104  */
    /* JADX WARN: Code duplicated, block: B:87:0x010a  */
    /* JADX WARN: Code duplicated, block: B:88:0x010d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x011c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Modifier modifier, Modifier modifier2, boolean z, Shape shape, long j, float f, float f2, TooltipPopupPlacement tooltipPopupPlacement, boolean z2, Function0 onDismissToolTip, Function3 requesterView, Function2 tooltipContent, Composer composer, int i, int i2, int i3) {
        Shape shape2;
        long j2;
        float f3;
        float f4;
        int i4;
        int iOrdinal;
        int i5;
        int i6;
        int i7;
        boolean z3;
        float f5;
        long j3;
        Modifier modifier3;
        Shape shape3;
        float f6;
        Modifier modifier4;
        TooltipPopupPlacement tooltipPopupPlacement2;
        boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier5;
        Shape medium;
        float f7;
        TooltipPopupPlacement tooltipPopupPlacement3;
        Shape shape4;
        float f8;
        float f9;
        long j4;
        TooltipPopupPlacement tooltipPopupPlacement4;
        int i8;
        int i9;
        boolean z5;
        Object objRememberedValue;
        Composer.Companion companion;
        int i10;
        MutableState mutableState;
        Object objRememberedValue2;
        MutableState mutableState2;
        int i11;
        boolean z6;
        boolean z7;
        boolean z8;
        Object objRememberedValue3;
        boolean z9;
        Object objRememberedValue4;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Intrinsics.i(onDismissToolTip, "onDismissToolTip");
        Intrinsics.i(requesterView, "requesterView");
        Intrinsics.i(tooltipContent, "tooltipContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-149662783);
        int i18 = i | 6;
        int i19 = i3 & 2;
        if (i19 == 0) {
            if ((i & 48) == 0) {
                i18 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i18 |= i17;
            }
            if ((i & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    shape2 = shape;
                    int i20 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                    i18 |= i20;
                } else {
                    shape2 = shape;
                }
                i18 |= i20;
            } else {
                shape2 = shape;
            }
            if ((i & 24576) == 0) {
                j2 = j;
                if ((i3 & 16) == 0 || !composerStartRestartGroup.changed(j2)) {
                    i16 = 8192;
                } else {
                    i16 = 16384;
                }
                i18 |= i16;
            } else {
                j2 = j;
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                f3 = f;
                if ((i3 & 32) == 0 || !composerStartRestartGroup.changed(f3)) {
                    i15 = 65536;
                } else {
                    i15 = 131072;
                }
                i18 |= i15;
            } else {
                f3 = f;
            }
            if ((i & 1572864) == 0) {
                f4 = f2;
                if ((i3 & 64) == 0 || !composerStartRestartGroup.changed(f4)) {
                    i14 = 524288;
                } else {
                    i14 = 1048576;
                }
                i18 |= i14;
            } else {
                f4 = f2;
            }
            i4 = i3 & 128;
            if (i4 != 0) {
                i18 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (tooltipPopupPlacement == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = tooltipPopupPlacement.ordinal();
                }
                if (composerStartRestartGroup.changed(iOrdinal)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i18 |= i5;
            }
            i6 = 905969664 | i18;
            if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(onDismissToolTip)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                i7 = i13 | i2;
            } else {
                i7 = i2;
            }
            if ((i2 & 48) == 0) {
                if (composerStartRestartGroup.changedInstance(requesterView)) {
                    i12 = 32;
                } else {
                    i12 = 16;
                }
                i7 |= i12;
            }
            if ((i2 & 384) == 0) {
                i7 |= composerStartRestartGroup.changedInstance(tooltipContent) ? 256 : 128;
            }
            if ((306783379 & i6) == 306783378 || (i7 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i6 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = Modifier.INSTANCE;
                    if (i19 != 0) {
                        modifier5 = modifier3;
                    } else {
                        modifier5 = modifier2;
                    }
                    if ((i3 & 8) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getMedium();
                        i6 &= -7169;
                    } else {
                        medium = shape2;
                    }
                    if ((i3 & 16) != 0) {
                        j2 = ChaloTheme.a(composerStartRestartGroup, 6).e;
                        i6 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        f3 = ChaloTheme.b(composerStartRestartGroup, 6).h;
                        i6 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        f7 = ChaloTheme.c(composerStartRestartGroup, 6).f1917a;
                        i6 &= -3670017;
                    } else {
                        f7 = f4;
                    }
                    if (i4 != 0) {
                        tooltipPopupPlacement3 = TooltipPopupPlacement.BelowAnchor;
                    } else {
                        tooltipPopupPlacement3 = tooltipPopupPlacement;
                    }
                    shape4 = medium;
                    f8 = f7;
                    f9 = f3;
                    j4 = j2;
                    tooltipPopupPlacement4 = tooltipPopupPlacement3;
                    i8 = 4;
                    i9 = -149662783;
                    z5 = true;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 8) != 0) {
                        i6 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        i6 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        i6 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        i6 &= -3670017;
                    }
                    modifier3 = modifier;
                    modifier5 = modifier2;
                    tooltipPopupPlacement4 = tooltipPopupPlacement;
                    z5 = z2;
                    f9 = f3;
                    j4 = j2;
                    shape4 = shape2;
                    f8 = f4;
                    i8 = 4;
                    i9 = -149662783;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(i9, i6, i7, "app.chalo.compose.components.ChaloTooltipPopupComposable (TooltipPopupComposable.kt:69)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    long j5 = 0;
                    i10 = 2;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TooltipPopupPosition(IntOffset.m7396constructorimpl((j5 << 32) | (j5 & BodyPartID.bodyIdMax)), 0.0f), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i10 = 2;
                }
                mutableState = (MutableState) objRememberedValue;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i10, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState2 = (MutableState) objRememberedValue2;
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-427081916);
                    TooltipPopupPosition tooltipPopupPosition = (TooltipPopupPosition) mutableState.getValue();
                    if ((i7 & 14) == i8) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (z9 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new ag1(onDismissToolTip, 9);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    i11 = 29360128;
                    z6 = true;
                    int i21 = i6 << 3;
                    d(modifier5, tooltipPopupPosition, shape4, j4, z5, f9, 0.0f, f8, tooltipPopupPlacement4, (Function0) objRememberedValue4, ComposableLambdaKt.rememberComposableLambda(-1203052532, true, new fc(6, tooltipContent), composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 >> 3) & 8078) | ((i6 >> 12) & 57344) | (458752 & i6) | (i21 & 29360128) | (i21 & 234881024), 6);
                } else {
                    i11 = 29360128;
                    z6 = true;
                    composerStartRestartGroup.startReplaceGroup(-430068735);
                }
                composerStartRestartGroup.endReplaceGroup();
                if ((1879048192 & i6) == 536870912) {
                    z7 = z6;
                } else {
                    z7 = false;
                }
                z8 = z7 | ((i6 & i11) == 8388608 ? z6 : false);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z8 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new vi1(4, tooltipPopupPlacement4, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                requesterView.invoke(OnGloballyPositionedModifierKt.onGloballyPositioned(modifier3, (Function1) objRememberedValue3), composerStartRestartGroup, Integer.valueOf(i7 & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                tooltipPopupPlacement2 = tooltipPopupPlacement4;
                modifier4 = modifier5;
                shape3 = shape4;
                j3 = j4;
                z4 = z5;
                f5 = f9;
                f6 = f8;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                long j6 = j2;
                f5 = f3;
                j3 = j6;
                modifier3 = modifier;
                shape3 = shape2;
                f6 = f4;
                modifier4 = modifier2;
                tooltipPopupPlacement2 = tooltipPopupPlacement;
                z4 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new k20(modifier3, modifier4, z, shape3, j3, f5, f6, tooltipPopupPlacement2, z4, onDismissToolTip, requesterView, tooltipContent, i, i2, i3));
            }
        }
        i18 = i | 54;
        if ((i & 384) == 0) {
            if (composerStartRestartGroup.changed(z)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i18 |= i17;
        }
        if ((i & 3072) == 0) {
            if ((i3 & 8) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i18 |= i20;
            } else {
                shape2 = shape;
            }
            i18 |= i20;
        } else {
            shape2 = shape;
        }
        if ((i & 24576) == 0) {
            j2 = j;
            if ((i3 & 16) == 0) {
                i16 = 8192;
            } else {
                i16 = 8192;
            }
            i18 |= i16;
        } else {
            j2 = j;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            f3 = f;
            if ((i3 & 32) == 0) {
                i15 = 65536;
            } else {
                i15 = 65536;
            }
            i18 |= i15;
        } else {
            f3 = f;
        }
        if ((i & 1572864) == 0) {
            f4 = f2;
            if ((i3 & 64) == 0) {
                i14 = 524288;
            } else {
                i14 = 524288;
            }
            i18 |= i14;
        } else {
            f4 = f2;
        }
        i4 = i3 & 128;
        if (i4 != 0) {
            i18 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (tooltipPopupPlacement == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = tooltipPopupPlacement.ordinal();
            }
            if (composerStartRestartGroup.changed(iOrdinal)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i18 |= i5;
        }
        i6 = 905969664 | i18;
        if ((i2 & 6) == 0) {
            if (composerStartRestartGroup.changedInstance(onDismissToolTip)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i7 = i13 | i2;
        } else {
            i7 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerStartRestartGroup.changedInstance(requesterView)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i7 |= i12;
        }
        if ((i2 & 384) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(tooltipContent) ? 256 : 128;
        }
        if ((306783379 & i6) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i6 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                modifier3 = Modifier.INSTANCE;
                if (i19 != 0) {
                    modifier5 = modifier3;
                } else {
                    modifier5 = modifier2;
                }
                if ((i3 & 8) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getMedium();
                    i6 &= -7169;
                } else {
                    medium = shape2;
                }
                if ((i3 & 16) != 0) {
                    j2 = ChaloTheme.a(composerStartRestartGroup, 6).e;
                    i6 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    f3 = ChaloTheme.b(composerStartRestartGroup, 6).h;
                    i6 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    f7 = ChaloTheme.c(composerStartRestartGroup, 6).f1917a;
                    i6 &= -3670017;
                } else {
                    f7 = f4;
                }
                if (i4 != 0) {
                    tooltipPopupPlacement3 = TooltipPopupPlacement.BelowAnchor;
                } else {
                    tooltipPopupPlacement3 = tooltipPopupPlacement;
                }
                shape4 = medium;
                f8 = f7;
                f9 = f3;
                j4 = j2;
                tooltipPopupPlacement4 = tooltipPopupPlacement3;
                i8 = 4;
                i9 = -149662783;
                z5 = true;
            } else {
                modifier3 = Modifier.INSTANCE;
                if (i19 != 0) {
                    modifier5 = modifier3;
                } else {
                    modifier5 = modifier2;
                }
                if ((i3 & 8) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getMedium();
                    i6 &= -7169;
                } else {
                    medium = shape2;
                }
                if ((i3 & 16) != 0) {
                    j2 = ChaloTheme.a(composerStartRestartGroup, 6).e;
                    i6 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    f3 = ChaloTheme.b(composerStartRestartGroup, 6).h;
                    i6 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    f7 = ChaloTheme.c(composerStartRestartGroup, 6).f1917a;
                    i6 &= -3670017;
                } else {
                    f7 = f4;
                }
                if (i4 != 0) {
                    tooltipPopupPlacement3 = TooltipPopupPlacement.BelowAnchor;
                } else {
                    tooltipPopupPlacement3 = tooltipPopupPlacement;
                }
                shape4 = medium;
                f8 = f7;
                f9 = f3;
                j4 = j2;
                tooltipPopupPlacement4 = tooltipPopupPlacement3;
                i8 = 4;
                i9 = -149662783;
                z5 = true;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(i9, i6, i7, "app.chalo.compose.components.ChaloTooltipPopupComposable (TooltipPopupComposable.kt:69)");
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                long j7 = 0;
                i10 = 2;
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TooltipPopupPosition(IntOffset.m7396constructorimpl((j7 << 32) | (j7 & BodyPartID.bodyIdMax)), 0.0f), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                i10 = 2;
            }
            mutableState = (MutableState) objRememberedValue;
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i10, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            mutableState2 = (MutableState) objRememberedValue2;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-427081916);
                TooltipPopupPosition tooltipPopupPosition2 = (TooltipPopupPosition) mutableState.getValue();
                if ((i7 & 14) == i8) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z9) {
                    objRememberedValue4 = new ag1(onDismissToolTip, 9);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new ag1(onDismissToolTip, 9);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                i11 = 29360128;
                z6 = true;
                int i22 = i6 << 3;
                d(modifier5, tooltipPopupPosition2, shape4, j4, z5, f9, 0.0f, f8, tooltipPopupPlacement4, (Function0) objRememberedValue4, ComposableLambdaKt.rememberComposableLambda(-1203052532, true, new fc(6, tooltipContent), composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 >> 3) & 8078) | ((i6 >> 12) & 57344) | (458752 & i6) | (i22 & 29360128) | (i22 & 234881024), 6);
            } else {
                i11 = 29360128;
                z6 = true;
                composerStartRestartGroup.startReplaceGroup(-430068735);
            }
            composerStartRestartGroup.endReplaceGroup();
            if ((1879048192 & i6) == 536870912) {
                z7 = z6;
            } else {
                z7 = false;
            }
            z8 = z7 | ((i6 & i11) == 8388608 ? z6 : false);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z8) {
                objRememberedValue3 = new vi1(4, tooltipPopupPlacement4, mutableState2, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new vi1(4, tooltipPopupPlacement4, mutableState2, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            requesterView.invoke(OnGloballyPositionedModifierKt.onGloballyPositioned(modifier3, (Function1) objRememberedValue3), composerStartRestartGroup, Integer.valueOf(i7 & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            tooltipPopupPlacement2 = tooltipPopupPlacement4;
            modifier4 = modifier5;
            shape3 = shape4;
            j3 = j4;
            z4 = z5;
            f5 = f9;
            f6 = f8;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            long j8 = j2;
            f5 = f3;
            j3 = j8;
            modifier3 = modifier;
            shape3 = shape2;
            f6 = f4;
            modifier4 = modifier2;
            tooltipPopupPlacement2 = tooltipPopupPlacement;
            z4 = z2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new k20(modifier3, modifier4, z, shape3, j3, f5, f6, tooltipPopupPlacement2, z4, onDismissToolTip, requesterView, tooltipContent, i, i2, i3));
        }
    }

    public static final void b(final Modifier modifier, final Shape shape, long j, final float f, final float f2, final float f3, final Function2 function2, Composer composer, final int i) {
        int i2;
        int i3;
        final long j2 = j;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1705069701);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(shape) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1705069701, i2, -1, "app.chalo.compose.components.TooltipAboveAnchorLayout (TooltipPopupComposable.kt:363)");
            }
            float fMo400toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo400toDpu2uoSUM(f3);
            float fM7278constructorimpl = Dp.m7278constructorimpl(1.67f * f2);
            Modifier modifierWidth = IntrinsicKt.width(modifier, IntrinsicSize.Max);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWidth);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            SurfaceKt.m2480SurfaceT9BRK9s(null, shape, j2, 0L, 0.0f, f, null, ComposableLambdaKt.rememberComposableLambda(-885262076, true, new fc(5, function2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 << 6) & 458752) | (i2 & 112) | 12582912 | (i2 & 896), 89);
            j2 = j2;
            if (f3 > 0.0f) {
                composerStartRestartGroup.startReplaceGroup(-996526972);
                i3 = 0;
                BoxKt.Box(BackgroundKt.m263backgroundbw27NRU(SizeKt.m814height3ABfNKs(SizeKt.m833width3ABfNKs(OffsetKt.m743offsetVpY3zN4(boxScopeInstance.align(companion3, companion.getBottomStart()), Dp.m7278constructorimpl(fMo400toDpu2uoSUM - Dp.m7278constructorimpl(fM7278constructorimpl / 2.0f)), f2), fM7278constructorimpl), f2), j2, new TriangleShape()), composerStartRestartGroup, 0);
            } else {
                i3 = 0;
                composerStartRestartGroup.startReplaceGroup(-1010501245);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            BoxKt.Box(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), f2), composerStartRestartGroup, i3);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: gk1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    TooltipPopupComposableKt.b(modifier, shape, j2, f, f2, f3, function2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void c(Modifier modifier, float f, long j, float f2, Function2 content, Composer composer, int i) {
        int i2;
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-712835632);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 16384 : 8192;
        }
        boolean z = true;
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-712835632, i2, -1, "app.chalo.compose.components.TooltipLayout (TooltipPopupComposable.kt:318)");
            }
            float fMo404toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo404toPx0680j_4(f);
            boolean zChanged = ((i2 & 7168) == 2048) | composerStartRestartGroup.changed(fMo404toPx0680j_4);
            if ((((i2 & 896) ^ 384) <= 256 || !composerStartRestartGroup.changed(j)) && (i2 & 384) != 256) {
                z = false;
            }
            boolean z2 = zChanged | z;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ln(f2, j, fMo404toPx0680j_4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierDrawBehind = DrawModifierKt.drawBehind(modifier, (Function1) objRememberedValue);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierDrawBehind);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (t8.w(composerStartRestartGroup, (i2 >> 12) & 14, content)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s50(modifier, f, j, f2, content, i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final Modifier modifier, final TooltipPopupPosition tooltipPopupPosition, final Shape shape, final long j, final boolean z, final float f, float f2, final float f3, final TooltipPopupPlacement tooltipPopupPlacement, final Function0 function0, final Function2 content, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composer2;
        float f4;
        float fM7278constructorimpl;
        long jM7398copyiSbpLlY$default;
        int i5;
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-210129210);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(tooltipPopupPosition) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(shape) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 131072 : 65536;
        }
        int i6 = i3 | 1572864;
        if ((i & 12582912) == 0) {
            i6 |= composerStartRestartGroup.changed(f3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i6 |= composerStartRestartGroup.changed(tooltipPopupPlacement == null ? -1 : tooltipPopupPlacement.ordinal()) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function0) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(content) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (composerStartRestartGroup.shouldExecute(((i6 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i6 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                fM7278constructorimpl = Dp.m7278constructorimpl(16);
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                fM7278constructorimpl = f2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-210129210, i6, i4, "app.chalo.compose.components.TooltipPopupComposable (TooltipPopupComposable.kt:117)");
            }
            long j2 = tooltipPopupPosition.f1851a;
            float f5 = tooltipPopupPosition.b;
            float fMo404toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo404toPx0680j_4(fM7278constructorimpl);
            final float f6 = fM7278constructorimpl;
            String message = "horizontalPaddingInPx: " + Dp.m7289toStringimpl(f6);
            Intrinsics.i(message, "message");
            String message2 = "offset: " + IntOffset.m7409toStringimpl(j2);
            Intrinsics.i(message2, "message");
            String message3 = "centerPositionX: " + f5;
            Intrinsics.i(message3, "message");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f5), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            String message4 = "arrowPositionX: " + ((Number) mutableState.getValue()).floatValue();
            Intrinsics.i(message4, "message");
            if (tooltipPopupPlacement == TooltipPopupPlacement.BelowAnchor) {
                composerStartRestartGroup.startReplaceGroup(2104162764);
                jM7398copyiSbpLlY$default = IntOffset.m7398copyiSbpLlY$default(j2, 0, IntOffset.m7403getYimpl(tooltipPopupPosition.f1851a) + ((int) (((double) MathKt.f(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo404toPx0680j_4(f))) * 1.5d)), 1, null);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(2099056444);
                composerStartRestartGroup.endReplaceGroup();
                jM7398copyiSbpLlY$default = j2;
            }
            Alignment.Companion companion2 = Alignment.INSTANCE;
            companion2.getTopCenter();
            boolean zChanged = composerStartRestartGroup.changed(jM7398copyiSbpLlY$default) | ((i6 & 234881024) == 67108864) | ((((i6 & 112) ^ 48) > 32 && composerStartRestartGroup.changed(tooltipPopupPosition)) || (i6 & 48) == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                i5 = i6;
                TooltipAlignmentOffsetPositionProvider tooltipAlignmentOffsetPositionProvider = new TooltipAlignmentOffsetPositionProvider(companion2.getTopCenter(), jM7398copyiSbpLlY$default, tooltipPopupPosition.b, fMo404toPx0680j_4, tooltipPopupPlacement, new xq0(mutableState, 14));
                composerStartRestartGroup.updateRememberedValue(tooltipAlignmentOffsetPositionProvider);
                objRememberedValue2 = tooltipAlignmentOffsetPositionProvider;
            } else {
                i5 = i6;
            }
            f4 = f6;
            composer2 = composerStartRestartGroup;
            AndroidPopup_androidKt.Popup((TooltipAlignmentOffsetPositionProvider) objRememberedValue2, function0, new PopupProperties(false, false, z, false, 9, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(1828620392, true, new Function2() { // from class: hk1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer3 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1828620392, iIntValue, -1, "app.chalo.compose.components.TooltipPopupComposable.<anonymous> (TooltipPopupComposable.kt:154)");
                        }
                        int i7 = TooltipPopupComposableKt.WhenMappings.f1850a[tooltipPopupPlacement.ordinal()];
                        Modifier modifier2 = modifier;
                        float f7 = f6;
                        long j3 = j;
                        Shape shape2 = shape;
                        float f8 = f;
                        MutableState mutableState2 = mutableState;
                        Function2 function2 = content;
                        if (i7 == 1) {
                            composer3.startReplaceGroup(-934974588);
                            TooltipPopupComposableKt.c(BackgroundKt.m263backgroundbw27NRU(PaddingKt.m786paddingVpY3zN4$default(modifier2, f7, 0.0f, 2, null), j3, shape2), f8, j3, ((Number) mutableState2.getValue()).floatValue(), ComposableLambdaKt.rememberComposableLambda(353324222, true, new fc(7, function2), composer3, 54), composer3, 24576);
                            composer3.endReplaceGroup();
                        } else {
                            if (i7 != 2) {
                                throw pk0.p(composer3, 662574103);
                            }
                            composer3.startReplaceGroup(-934413023);
                            TooltipPopupComposableKt.b(PaddingKt.m786paddingVpY3zN4$default(modifier2, f7, 0.0f, 2, null), shape2, j3, f3, f8, ((Number) mutableState2.getValue()).floatValue(), ComposableLambdaKt.rememberComposableLambda(1490956949, true, new fc(8, function2), composer3, 54), composer3, 1572864);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composer2, ((i5 >> 24) & 112) | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            f4 = f2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final float f7 = f4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ik1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                    TooltipPopupComposableKt.d(modifier, tooltipPopupPosition, shape, j, z, f, f7, f3, tooltipPopupPlacement, function0, content, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return Unit.f17538a;
                }
            });
        }
    }
}
