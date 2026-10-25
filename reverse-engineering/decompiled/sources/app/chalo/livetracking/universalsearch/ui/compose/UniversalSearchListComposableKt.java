package app.chalo.livetracking.universalsearch.ui.compose;

import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.core.app.FrameMetricsAggregator;
import app.chalo.compose.components.ChaloDividerComposableKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchResultType;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchItem;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchPlacesAndStopsInfoModel;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchRoutesDetailModel;
import app.chalo.livetracking.universalsearch.ui.compose.UniversalSearchListComposableKt;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.ag1;
import defpackage.b80;
import defpackage.gp;
import defpackage.lh;
import defpackage.pk0;
import defpackage.q01;
import defpackage.u10;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UniversalSearchListComposableKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5111a;

        static {
            int[] iArr = new int[UniversalSearchResultType.values().length];
            try {
                iArr[UniversalSearchResultType.PLACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UniversalSearchResultType.STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UniversalSearchResultType.ROUTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UniversalSearchResultType.TRIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5111a = iArr;
        }
    }

    public static final void a(UniversalSearchItem.PlacesAndStopsItem placesAndStopsItem, Function1 function1, boolean z, TextFieldValue textFieldValue, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = placesAndStopsItem.f5001a;
        Composer composerStartRestartGroup = composer.startRestartGroup(42346348);
        int i5 = 2;
        int i6 = 4;
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(placesAndStopsItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i7 = 32;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        boolean z2 = z;
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(textFieldValue) ? 2048 : 1024;
        }
        int i8 = 1;
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(42346348, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.PlaceAndStopSearchItemComposable (UniversalSearchListComposable.kt:69)");
            }
            if (arrayList.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(-1182887146);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1180033906);
                int size = arrayList.size();
                int i9 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    int i11 = i10 + 1;
                    int i12 = i9 + 1;
                    if (i9 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    UniversalSearchPlacesAndStopsInfoModel universalSearchPlacesAndStopsInfoModel = (UniversalSearchPlacesAndStopsInfoModel) obj;
                    int i13 = WhenMappings.f5111a[universalSearchPlacesAndStopsInfoModel.f5003a.ordinal()];
                    if (i13 == i8) {
                        i3 = i7;
                        i4 = i8;
                        composerStartRestartGroup.startReplaceGroup(-2078053922);
                        String text = textFieldValue.getText();
                        String str = universalSearchPlacesAndStopsInfoModel.b;
                        int i14 = (composerStartRestartGroup.changedInstance(universalSearchPlacesAndStopsInfoModel) ? 1 : 0) | ((i2 & 112) == i3 ? i4 : 0) | (composerStartRestartGroup.changed(i9) ? 1 : 0);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (i14 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new gp(function1, universalSearchPlacesAndStopsInfoModel, i9, 1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Composer composer2 = composerStartRestartGroup;
                        SetUpUniversalItemListKt.a(text, str, z, (Function0) objRememberedValue, composer2, i2 & 896);
                        composerStartRestartGroup = composer2;
                        ChaloDividerComposableKt.b(null, 0L, composerStartRestartGroup, 0, 3);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i13 == i5) {
                        composerStartRestartGroup.startReplaceGroup(-2077292469);
                        String text2 = textFieldValue.getText();
                        ChaloTransitMode chaloTransitMode = universalSearchPlacesAndStopsInfoModel.f;
                        String str2 = universalSearchPlacesAndStopsInfoModel.e;
                        String str3 = universalSearchPlacesAndStopsInfoModel.h;
                        boolean zChangedInstance = ((i2 & 112) == i7) | composerStartRestartGroup.changedInstance(universalSearchPlacesAndStopsInfoModel) | composerStartRestartGroup.changed(i9);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new gp(function1, universalSearchPlacesAndStopsInfoModel, i9, 2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        Composer composer3 = composerStartRestartGroup;
                        i4 = 1;
                        i3 = 32;
                        SetUpUniversalItemListKt.c(text2, str2, str3, chaloTransitMode, z2, (Function0) objRememberedValue2, composer3, (i2 << 6) & 57344);
                        composerStartRestartGroup = composer3;
                        ChaloDividerComposableKt.b(null, 0L, composerStartRestartGroup, 0, 3);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (i13 != 3 && i13 != i6) {
                            throw pk0.p(composerStartRestartGroup, 1595532364);
                        }
                        composerStartRestartGroup.startReplaceGroup(-2076413340);
                        composerStartRestartGroup.endReplaceGroup();
                        i3 = i7;
                        i4 = i8;
                    }
                    z2 = z;
                    i8 = i4;
                    i7 = i3;
                    i10 = i11;
                    i9 = i12;
                    i5 = 2;
                    i6 = 4;
                }
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new lh(placesAndStopsItem, function1, z, textFieldValue, i, 15));
        }
    }

    public static final void b(UniversalSearchItem.RouteList routeList, boolean z, boolean z2, TextFieldValue textFieldValue, Function0 function0, Function2 function2, Composer composer, int i) {
        int i2;
        Composer composer2;
        boolean z3;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1279982102);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(routeList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        boolean z4 = z2;
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(textFieldValue) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        int i4 = 131072;
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1279982102, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.RouteSearchItemComposable (UniversalSearchListComposable.kt:124)");
            }
            ArrayList arrayList = routeList.f5002a;
            if (arrayList.isEmpty()) {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(-1231815144);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1226782883);
                composerStartRestartGroup.startReplaceGroup(-1702141033);
                int size = arrayList.size();
                int i5 = 0;
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    int i7 = i6 + 1;
                    int i8 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    UniversalSearchRoutesDetailModel universalSearchRoutesDetailModel = (UniversalSearchRoutesDetailModel) obj;
                    if (z || i5 < 2) {
                        String text = textFieldValue.getText();
                        boolean zChangedInstance = ((i2 & 458752) == i4) | composerStartRestartGroup.changedInstance(universalSearchRoutesDetailModel) | composerStartRestartGroup.changed(i5);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new u10(function2, universalSearchRoutesDetailModel, i5, 8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Composer composer3 = composerStartRestartGroup;
                        i3 = 131072;
                        SetUpUniversalItemListKt.b(text, universalSearchRoutesDetailModel, z4, (Function0) objRememberedValue, composer3, i2 & 896);
                        composerStartRestartGroup = composer3;
                        ChaloDividerComposableKt.b(null, 0L, composerStartRestartGroup, 0, 3);
                    } else {
                        i3 = i4;
                    }
                    z4 = z2;
                    composerStartRestartGroup = composerStartRestartGroup;
                    size = size;
                    i6 = i7;
                    i5 = i8;
                    i4 = i3;
                }
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
                if (arrayList.size() > 2) {
                    composer2.startReplaceGroup(-1226299686);
                    if (z) {
                        composer2.startReplaceGroup(-1702120873);
                        String strC = StringResourcesHelperKt.c(StringEnum.SEE_LESS, new Object[0], composer2, 6);
                        z3 = (57344 & i2) == 16384;
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new ag1(function0, 15);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        SeeMoreOrLessPickRouteComposableKt.a(strC, (Function0) objRememberedValue2, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1702124937);
                        String strC2 = StringResourcesHelperKt.c(StringEnum.SEE_MORE, new Object[0], composer2, 6);
                        z3 = (57344 & i2) == 16384;
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new ag1(function0, 14);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        SeeMoreOrLessPickRouteComposableKt.a(strC2, (Function0) objRememberedValue3, composer2, 0);
                        composer2.endReplaceGroup();
                    }
                } else {
                    composer2.startReplaceGroup(-1231815144);
                }
                composer2.endReplaceGroup();
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new q01(routeList, z, z2, textFieldValue, function0, function2, i));
        }
    }

    public static final void c(final List universalSearchItem, final boolean z, final boolean z2, final TextFieldValue textFieldState, final Function1 sendIntent, Composer composer, final int i) {
        int i2;
        boolean z3;
        boolean z4;
        Intrinsics.i(universalSearchItem, "universalSearchItem");
        Intrinsics.i(textFieldState, "textFieldState");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(476955755);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(universalSearchItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i2 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            z4 = z2;
            i2 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
        } else {
            z4 = z2;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(textFieldState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(476955755, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.UniversalSearchListComposable (UniversalSearchListComposable.kt:21)");
            }
            if (universalSearchItem.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(1237363519);
                NoResultFoundComposableKt.a(0, 3, composerStartRestartGroup, null, null);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i3 = 0;
                    final boolean z5 = z3;
                    final boolean z6 = z4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: an1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i3) {
                                case 0:
                                    ((Integer) obj2).intValue();
                                    UniversalSearchListComposableKt.c(universalSearchItem, z5, z6, textFieldState, sendIntent, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    ((Integer) obj2).intValue();
                                    UniversalSearchListComposableKt.c(universalSearchItem, z5, z6, textFieldState, sendIntent, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    });
                    return;
                }
                return;
            }
            composerStartRestartGroup.startReplaceGroup(1236370775);
            composerStartRestartGroup.endReplaceGroup();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(universalSearchItem) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((i2 & 57344) == 16384);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                b80 b80Var = new b80(universalSearchItem, z, z2, textFieldState, sendIntent);
                composerStartRestartGroup.updateRememberedValue(b80Var);
                objRememberedValue = b80Var;
            }
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, FrameMetricsAggregator.EVERY_DURATION);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i4 = 1;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: an1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i4) {
                        case 0:
                            ((Integer) obj2).intValue();
                            UniversalSearchListComposableKt.c(universalSearchItem, z, z2, textFieldState, sendIntent, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            UniversalSearchListComposableKt.c(universalSearchItem, z, z2, textFieldState, sendIntent, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
        }
    }
}
