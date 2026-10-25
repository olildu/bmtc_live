package app.chalo.home.ui.common;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.home.ui.common.ImageResourceSectionUIKt;
import app.chalo.home.ui.common.ImageResourceSurface;
import app.chalo.homescreen.data.model.app.ImageResourceSectionAppModel;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import defpackage.pk0;
import defpackage.vm;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003¨\u0006\u0003²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "failed", "loaded", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ImageResourceSectionUIKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3379a;

        static {
            int[] iArr = new int[ImageResourceSurface.values().length];
            try {
                iArr[ImageResourceSurface.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageResourceSurface.FLAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3379a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0150  */
    /* JADX WARN: Code duplicated, block: B:107:0x015d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0161  */
    /* JADX WARN: Code duplicated, block: B:111:0x0163  */
    /* JADX WARN: Code duplicated, block: B:118:0x0180  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:127:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:131:0x0202  */
    /* JADX WARN: Code duplicated, block: B:133:0x0205  */
    /* JADX WARN: Code duplicated, block: B:135:0x0215  */
    /* JADX WARN: Code duplicated, block: B:137:0x0226  */
    /* JADX WARN: Code duplicated, block: B:139:0x0231  */
    /* JADX WARN: Code duplicated, block: B:141:0x0239  */
    /* JADX WARN: Code duplicated, block: B:144:0x0276  */
    /* JADX WARN: Code duplicated, block: B:146:0x027b  */
    /* JADX WARN: Code duplicated, block: B:149:0x0287  */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:83:0x010c  */
    /* JADX WARN: Code duplicated, block: B:86:0x011d  */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final ImageResourceSectionAppModel image, final boolean z, final float f, final Function0 onClick, ImageResourceSurface imageResourceSurface, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        final ImageResourceSurface imageResourceSurface2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        ImageResourceSurface imageResourceSurface3;
        final Modifier modifier4;
        boolean zChanged;
        Object objRememberedValue;
        final MutableState mutableState;
        boolean zChanged2;
        Object objRememberedValue2;
        final MutableState mutableState2;
        boolean z3;
        final boolean z4;
        boolean z5;
        Modifier.Companion companion;
        Function0<ComposeUiNode> constructor;
        boolean z6;
        ComposableLambda composableLambdaRememberComposableLambda;
        int i5;
        String str;
        boolean z7;
        Intrinsics.i(image, "image");
        String str2 = image.f3755a;
        Intrinsics.i(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(2083049059);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(image) : composerStartRestartGroup.changedInstance(image) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(imageResourceSurface == null ? -1 : imageResourceSurface.ordinal()) ? 16384 : 8192;
        }
        int i7 = i2 & 32;
        if (i7 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i4 = i3;
            if ((74899 & i4) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                if (i6 != 0) {
                    imageResourceSurface3 = ImageResourceSurface.FLAT;
                } else {
                    imageResourceSurface3 = imageResourceSurface;
                }
                if (i7 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2083049059, i4, -1, "app.chalo.home.ui.common.ImageResourceSectionUI (ImageResourceSectionUI.kt:39)");
                }
                zChanged = composerStartRestartGroup.changed(str2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                    objRememberedValue = mutableStateMutableStateOf$default;
                }
                mutableState = (MutableState) objRememberedValue;
                zChanged2 = composerStartRestartGroup.changed(str2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default2);
                    objRememberedValue2 = mutableStateMutableStateOf$default2;
                }
                mutableState2 = (MutableState) objRememberedValue2;
                if (image.h != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (((Boolean) mutableState.getValue()).booleanValue() || z3) {
                    final Modifier modifier5 = modifier4;
                    if (image.f != null) {
                        z4 = true;
                    } else {
                        str = image.c;
                        if (str != null || StringsKt.F(str)) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                    }
                    if (z || !(((Boolean) mutableState2.getValue()).booleanValue() || ((Boolean) mutableState.getValue()).booleanValue())) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    constructor = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!z6) {
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
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i8), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    final ImageResourceSurface imageResourceSurface4 = imageResourceSurface3;
                    Function2 function3 = new Function2() { // from class: da0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer2 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(45367578, iIntValue, -1, "app.chalo.home.ui.common.ImageResourceSectionUI.<anonymous>.<anonymous> (ImageResourceSectionUI.kt:53)");
                                }
                                ImageResourceSectionAppModel imageResourceSectionAppModel = image;
                                String str3 = imageResourceSectionAppModel.f3755a;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                                ImageResourceSurface imageResourceSurface5 = imageResourceSurface4;
                                Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(PaddingKt.m787paddingqDBjuR0(modifierFillMaxWidth$default, ImageResourceSectionUIKt.b(imageResourceSectionAppModel, imageResourceSurface5), ImageResourceSectionUIKt.b(imageResourceSectionAppModel, imageResourceSurface5), ImageResourceSectionUIKt.b(imageResourceSectionAppModel, imageResourceSurface5), imageResourceSectionAppModel.e ? ImageResourceSectionUIKt.b(imageResourceSectionAppModel, imageResourceSurface5) : Dp.m7278constructorimpl(0)), z4, null, null, null, onClick, 14, null);
                                ContentScale fillWidth = ContentScale.INSTANCE.getFillWidth();
                                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1474805737, true, new o4(imageResourceSectionAppModel, 4), composer2, 54);
                                MutableState mutableState3 = mutableState2;
                                boolean zChanged3 = composer2.changed(mutableState3);
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new g5(mutableState3, 19);
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                Function1 function1 = (Function1) objRememberedValue3;
                                MutableState mutableState4 = mutableState;
                                boolean zChanged4 = composer2.changed(mutableState4);
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new g5(mutableState4, 20);
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                SingletonSubcomposeAsyncImageKt.a(str3, null, modifierM299clickableoSLSa3U$default, null, null, composableLambdaRememberComposableLambda2, function1, (Function1) objRememberedValue4, null, fillWidth, composer2, 1572912, 48, 62648);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    };
                    imageResourceSurface2 = imageResourceSurface4;
                    composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(45367578, true, function3, composerStartRestartGroup, 54);
                    i5 = WhenMappings.f3379a[imageResourceSurface2.ordinal()];
                    if (i5 != 1) {
                        composerStartRestartGroup.startReplaceGroup(154218259);
                        ChaloRoundedCardKt.b(PaddingKt.m786paddingVpY3zN4$default(companion, Dp.m7278constructorimpl(image.b), 0.0f, 2, null), ChaloTheme.d(composerStartRestartGroup, 0).g, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-175810512, true, new vm(1, composableLambdaRememberComposableLambda), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (i5 == 2) {
                            throw pk0.p(composerStartRestartGroup, 154210834);
                        }
                        composerStartRestartGroup.startReplaceGroup(486055477);
                        composableLambdaRememberComposableLambda.invoke(composerStartRestartGroup, 6);
                        if (z5) {
                            composerStartRestartGroup.startReplaceGroup(486114625);
                            SectionDividerBarKt.a(f, composerStartRestartGroup, (i4 >> 6) & 14);
                        } else {
                            composerStartRestartGroup.startReplaceGroup(481895401);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final ImageResourceSurface imageResourceSurface5 = imageResourceSurface3;
                    final int i9 = 0;
                    function2 = new Function2() { // from class: ca0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i9) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    ImageResourceSectionUIKt.a(image, z, f, onClick, imageResourceSurface5, modifier4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    ImageResourceSectionUIKt.a(image, z, f, onClick, imageResourceSurface5, modifier4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                }
                scopeUpdateScopeEndRestartGroup.updateScope(function2);
            }
            composerStartRestartGroup.skipToGroupEnd();
            imageResourceSurface2 = imageResourceSurface;
            modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final int i10 = 1;
                function2 = new Function2() { // from class: ca0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i10) {
                            case 0:
                                ((Integer) obj2).getClass();
                                ImageResourceSectionUIKt.a(image, z, f, onClick, imageResourceSurface2, modifier3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                ImageResourceSectionUIKt.a(image, z, f, onClick, imageResourceSurface2, modifier3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                scopeUpdateScopeEndRestartGroup.updateScope(function2);
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        modifier2 = modifier;
        i4 = i3;
        if ((74899 & i4) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
            if (i6 != 0) {
                imageResourceSurface3 = ImageResourceSurface.FLAT;
            } else {
                imageResourceSurface3 = imageResourceSurface;
            }
            if (i7 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2083049059, i4, -1, "app.chalo.home.ui.common.ImageResourceSectionUI (ImageResourceSectionUI.kt:39)");
            }
            zChanged = composerStartRestartGroup.changed(str2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                MutableState mutableStateMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default3);
                objRememberedValue = mutableStateMutableStateOf$default3;
            } else {
                MutableState mutableStateMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default4);
                objRememberedValue = mutableStateMutableStateOf$default4;
            }
            mutableState = (MutableState) objRememberedValue;
            zChanged2 = composerStartRestartGroup.changed(str2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                MutableState mutableStateMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default5);
                objRememberedValue2 = mutableStateMutableStateOf$default5;
            } else {
                MutableState mutableStateMutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default6);
                objRememberedValue2 = mutableStateMutableStateOf$default6;
            }
            mutableState2 = (MutableState) objRememberedValue2;
            if (image.h != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (((Boolean) mutableState.getValue()).booleanValue()) {
            }
            final Modifier modifier6 = modifier4;
            if (image.f != null) {
                z4 = true;
            } else {
                str = image.c;
                if (str != null) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (z7) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            if (z) {
                z5 = false;
            } else {
                z5 = false;
            }
            companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i11 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!z6) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i11), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            final ImageResourceSurface imageResourceSurface6 = imageResourceSurface3;
            Function2 function4 = new Function2() { // from class: da0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(45367578, iIntValue, -1, "app.chalo.home.ui.common.ImageResourceSectionUI.<anonymous>.<anonymous> (ImageResourceSectionUI.kt:53)");
                        }
                        ImageResourceSectionAppModel imageResourceSectionAppModel = image;
                        String str3 = imageResourceSectionAppModel.f3755a;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier6, 0.0f, 1, null);
                        ImageResourceSurface imageResourceSurface7 = imageResourceSurface6;
                        Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(PaddingKt.m787paddingqDBjuR0(modifierFillMaxWidth$default, ImageResourceSectionUIKt.b(imageResourceSectionAppModel, imageResourceSurface7), ImageResourceSectionUIKt.b(imageResourceSectionAppModel, imageResourceSurface7), ImageResourceSectionUIKt.b(imageResourceSectionAppModel, imageResourceSurface7), imageResourceSectionAppModel.e ? ImageResourceSectionUIKt.b(imageResourceSectionAppModel, imageResourceSurface7) : Dp.m7278constructorimpl(0)), z4, null, null, null, onClick, 14, null);
                        ContentScale fillWidth = ContentScale.INSTANCE.getFillWidth();
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1474805737, true, new o4(imageResourceSectionAppModel, 4), composer2, 54);
                        MutableState mutableState3 = mutableState2;
                        boolean zChanged3 = composer2.changed(mutableState3);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new g5(mutableState3, 19);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        Function1 function1 = (Function1) objRememberedValue3;
                        MutableState mutableState4 = mutableState;
                        boolean zChanged4 = composer2.changed(mutableState4);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new g5(mutableState4, 20);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        SingletonSubcomposeAsyncImageKt.a(str3, null, modifierM299clickableoSLSa3U$default, null, null, composableLambdaRememberComposableLambda2, function1, (Function1) objRememberedValue4, null, fillWidth, composer2, 1572912, 48, 62648);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            };
            imageResourceSurface2 = imageResourceSurface6;
            composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(45367578, true, function4, composerStartRestartGroup, 54);
            i5 = WhenMappings.f3379a[imageResourceSurface2.ordinal()];
            if (i5 != 1) {
                composerStartRestartGroup.startReplaceGroup(154218259);
                ChaloRoundedCardKt.b(PaddingKt.m786paddingVpY3zN4$default(companion, Dp.m7278constructorimpl(image.b), 0.0f, 2, null), ChaloTheme.d(composerStartRestartGroup, 0).g, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-175810512, true, new vm(1, composableLambdaRememberComposableLambda), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i5 == 2) {
                    throw pk0.p(composerStartRestartGroup, 154210834);
                }
                composerStartRestartGroup.startReplaceGroup(486055477);
                composableLambdaRememberComposableLambda.invoke(composerStartRestartGroup, 6);
                if (z5) {
                    composerStartRestartGroup.startReplaceGroup(486114625);
                    SectionDividerBarKt.a(f, composerStartRestartGroup, (i4 >> 6) & 14);
                } else {
                    composerStartRestartGroup.startReplaceGroup(481895401);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier6;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            imageResourceSurface2 = imageResourceSurface;
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i12 = 1;
            function2 = new Function2() { // from class: ca0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i12) {
                        case 0:
                            ((Integer) obj2).getClass();
                            ImageResourceSectionUIKt.a(image, z, f, onClick, imageResourceSurface2, modifier3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            ImageResourceSectionUIKt.a(image, z, f, onClick, imageResourceSurface2, modifier3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    public static final float b(ImageResourceSectionAppModel imageResourceSectionAppModel, ImageResourceSurface imageResourceSurface) {
        return Dp.m7278constructorimpl(imageResourceSurface == ImageResourceSurface.CARD ? 0 : imageResourceSectionAppModel.b);
    }
}
