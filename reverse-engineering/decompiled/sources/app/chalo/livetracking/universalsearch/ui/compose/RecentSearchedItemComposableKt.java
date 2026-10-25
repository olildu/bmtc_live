package app.chalo.livetracking.universalsearch.ui.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.extractor.ts.PsExtractor;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchItem;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchRecentSearchedItemLayoutUiModel;
import app.chalo.livetracking.universalsearch.ui.compose.RecentSearchedItemComposableKt;
import app.chalo.livetracking.utils.TrackingUtils;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.recent.model.app.RecentRouteAppModel;
import app.chalo.recent.model.app.RecentStopAppModel;
import app.chalo.recent.model.app.RecentTripAppModel;
import defpackage.ar0;
import defpackage.e01;
import defpackage.fr0;
import defpackage.h20;
import defpackage.lh;
import defpackage.lu0;
import defpackage.o01;
import defpackage.p01;
import defpackage.pk0;
import defpackage.q01;
import defpackage.s01;
import defpackage.sn0;
import defpackage.vo1;
import defpackage.xd;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RecentSearchedItemComposableKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5097a;

        static {
            int[] iArr = new int[RouteNamingSchemeType.values().length];
            try {
                iArr[RouteNamingSchemeType.VIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteNamingSchemeType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5097a = iArr;
        }
    }

    public static final void a(final String title, final String str, final Function0 onClick, final Function0 onRemoveClick, final Function1 onSaveClick, Composer composer, final int i) {
        int i2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Intrinsics.i(title, "title");
        Intrinsics.i(onClick, "onClick");
        Intrinsics.i(onRemoveClick, "onRemoveClick");
        Intrinsics.i(onSaveClick, "onSaveClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1208610020);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onRemoveClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSaveClick) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1208610020, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.FavPlaceAndStopItemComposable (RecentSearchedItemComposable.kt:245)");
            }
            if (str == null || str.length() == 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i3 = 0;
                function2 = new Function2() { // from class: n01
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i3) {
                            case 0:
                                ((Integer) obj2).intValue();
                                RecentSearchedItemComposableKt.a(title, str, onClick, onRemoveClick, onSaveClick, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                ((Integer) obj2).intValue();
                                RecentSearchedItemComposableKt.a(title, str, onClick, onRemoveClick, onSaveClick, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            } else {
                int i4 = i2;
                UniversalSearchRecentSearchedItemLayoutUiModel universalSearchRecentSearchedItemLayoutUiModel = new UniversalSearchRecentSearchedItemLayoutUiModel(IconType.FAVORITE_ADDED, GenerateAnnotatedStringKt.a("", title, composerStartRestartGroup, ((i2 << 3) & 112) | 6), str, IconType.FAVORITE_OVERFLOW, false, null, false, null, false, PsExtractor.VIDEO_STREAM_MASK);
                boolean z = (i4 & 896) == 256;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ar0(onClick, 29);
                    composer2 = composerStartRestartGroup;
                    composer2.updateRememberedValue(objRememberedValue);
                } else {
                    composer2 = composerStartRestartGroup;
                }
                Function0 function0 = (Function0) objRememberedValue;
                boolean z2 = (i4 & 7168) == 2048;
                Object objRememberedValue2 = composer2.rememberedValue();
                if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new o01(onRemoveClick, 0);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                Function0 function1 = (Function0) objRememberedValue2;
                boolean z3 = (i4 & 57344) == 16384;
                Object objRememberedValue3 = composer2.rememberedValue();
                if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new sn0(onSaveClick, 29);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                SearchStopAndLocationItemComposableKt.b(universalSearchRecentSearchedItemLayoutUiModel, true, function0, function1, (Function1) objRememberedValue3, composer2, 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        composer2 = composerStartRestartGroup;
        composer2.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i5 = 1;
            function2 = new Function2() { // from class: n01
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i5) {
                        case 0:
                            ((Integer) obj2).intValue();
                            RecentSearchedItemComposableKt.a(title, str, onClick, onRemoveClick, onSaveClick, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            RecentSearchedItemComposableKt.a(title, str, onClick, onRemoveClick, onSaveClick, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    public static final void b(UniversalSearchRecentSearchItem searchItem, boolean z, boolean z2, Function1 sendIntent, Composer composer, int i) {
        int i2;
        boolean z3;
        Intrinsics.i(searchItem, "searchItem");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(274206154);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(searchItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(274206154, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.RecentSearchedItemComposable (RecentSearchedItemComposable.kt:18)");
            }
            if (searchItem instanceof UniversalSearchRecentSearchItem.Place) {
                composerStartRestartGroup.startReplaceGroup(-151941055);
                UniversalSearchRecentSearchItem.Place place = (UniversalSearchRecentSearchItem.Place) searchItem;
                int i3 = i2 & 7168;
                boolean z4 = i3 == 2048;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new sn0(sendIntent, 28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                boolean z5 = i3 == 2048;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new xd(sendIntent, 7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function2 function2 = (Function2) objRememberedValue2;
                z3 = i3 == 2048;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new xd(sendIntent, 8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                c(place, z, z2, function1, function2, (Function2) objRememberedValue3, composerStartRestartGroup, i2 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                composerStartRestartGroup.endReplaceGroup();
            } else if (searchItem instanceof UniversalSearchRecentSearchItem.Route) {
                composerStartRestartGroup.startReplaceGroup(1519153445);
                UniversalSearchRecentSearchItem.Route route = (UniversalSearchRecentSearchItem.Route) searchItem;
                int i4 = i2 & 7168;
                boolean z6 = i4 == 2048;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z6 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new s01(sendIntent, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Function1 function3 = (Function1) objRememberedValue4;
                z3 = i4 == 2048;
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new xd(sendIntent, 9);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                d(route, z, function3, (Function2) objRememberedValue5, composerStartRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                composerStartRestartGroup.endReplaceGroup();
            } else if (searchItem instanceof UniversalSearchRecentSearchItem.Stop) {
                composerStartRestartGroup.startReplaceGroup(-150272077);
                UniversalSearchRecentSearchItem.Stop stop = (UniversalSearchRecentSearchItem.Stop) searchItem;
                int i5 = i2 & 7168;
                boolean z7 = i5 == 2048;
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (z7 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new xd(sendIntent, 10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                Function2 function4 = (Function2) objRememberedValue6;
                boolean z8 = i5 == 2048;
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (z8 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new s01(sendIntent, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                Function1 function5 = (Function1) objRememberedValue7;
                z3 = i5 == 2048;
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new xd(sendIntent, 11);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                e(stop, z, z2, function4, function5, (Function2) objRememberedValue8, composerStartRestartGroup, i2 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(searchItem instanceof UniversalSearchRecentSearchItem.Trip)) {
                    throw pk0.p(composerStartRestartGroup, 1519119057);
                }
                composerStartRestartGroup.startReplaceGroup(1519204828);
                UniversalSearchRecentSearchItem.Trip trip = (UniversalSearchRecentSearchItem.Trip) searchItem;
                int i6 = i2 & 7168;
                boolean z9 = i6 == 2048;
                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (z9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = new s01(sendIntent, 2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                Function1 function6 = (Function1) objRememberedValue9;
                z3 = i6 == 2048;
                Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue10 = new xd(sendIntent, 6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                f(trip, function6, (Function2) objRememberedValue10, composerStartRestartGroup, i2 & 14);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h20(searchItem, z, z2, sendIntent, i, 2));
        }
    }

    public static final void c(UniversalSearchRecentSearchItem.Place placeRecentItem, boolean z, boolean z2, Function1 onClick, Function2 onSaveClick, Function2 function2, Composer composer, int i) {
        int i2;
        Composer composer2;
        Function2 function3;
        CharSequence charSequenceU0;
        Function2 onRemoveClick = function2;
        Intrinsics.i(placeRecentItem, "placeRecentItem");
        Intrinsics.i(onClick, "onClick");
        Intrinsics.i(onSaveClick, "onSaveClick");
        Intrinsics.i(onRemoveClick, "onRemoveClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(265835741);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(placeRecentItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSaveClick) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onRemoveClick) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(265835741, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.RecentSearchedPlacesComposable (RecentSearchedItemComposable.kt:209)");
            }
            RecentPlaceAppModel recentPlaceAppModel = placeRecentItem.c;
            String str = recentPlaceAppModel.g;
            int iD = StringsKt.D(str, ",", 0, false, 6);
            if (iD != -1) {
                String strSubstring = str.substring(0, iD);
                Intrinsics.h(strSubstring, "substring(...)");
                charSequenceU0 = StringsKt.u0(strSubstring);
            } else {
                charSequenceU0 = StringsKt.u0(str);
            }
            String string = charSequenceU0.toString();
            String str2 = recentPlaceAppModel.i;
            if (str2 != null) {
                str = str2;
            }
            int i3 = i2;
            composer2 = composerStartRestartGroup;
            UniversalSearchRecentSearchedItemLayoutUiModel universalSearchRecentSearchedItemLayoutUiModel = new UniversalSearchRecentSearchedItemLayoutUiModel(IconType.LOCATION_SEARCH, GenerateAnnotatedStringKt.a("", string, composerStartRestartGroup, 6), str, z2 ? IconType.FAVORITE_ADD : IconType.FAVORITE_OVERFLOW, z2, null, false, null, z, 224);
            boolean zChangedInstance = composer2.changedInstance(placeRecentItem) | ((i3 & 7168) == 2048);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new fr0(29, onClick, placeRecentItem);
                composer2.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            boolean zChangedInstance2 = composer2.changedInstance(recentPlaceAppModel) | ((458752 & i3) == 131072);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                onRemoveClick = function2;
                objRememberedValue2 = new p01(0, onRemoveClick, recentPlaceAppModel);
                composer2.updateRememberedValue(objRememberedValue2);
            } else {
                onRemoveClick = function2;
            }
            Function0 function1 = (Function0) objRememberedValue2;
            boolean zChangedInstance3 = composer2.changedInstance(placeRecentItem) | ((57344 & i3) == 16384);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                function3 = onSaveClick;
                objRememberedValue3 = new lu0(28, function3, placeRecentItem);
                composer2.updateRememberedValue(objRememberedValue3);
            } else {
                function3 = onSaveClick;
            }
            SearchStopAndLocationItemComposableKt.b(universalSearchRecentSearchedItemLayoutUiModel, z2, function0, function1, (Function1) objRememberedValue3, composer2, (i3 >> 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            function3 = onSaveClick;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new q01(placeRecentItem, z, z2, onClick, function3, onRemoveClick, i));
        }
    }

    public static final void d(UniversalSearchRecentSearchItem.Route routeRecentItem, boolean z, Function1 onClick, Function2 onRemoveClick, Composer composer, int i) {
        int i2;
        boolean z2;
        String strC;
        String strN;
        String upperCase;
        Intrinsics.i(routeRecentItem, "routeRecentItem");
        Intrinsics.i(onClick, "onClick");
        Intrinsics.i(onRemoveClick, "onRemoveClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1803638259);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(routeRecentItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onRemoveClick) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1803638259, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.RecentSearchedRoutesComposable (RecentSearchedItemComposable.kt:161)");
            }
            RecentRouteAppModel recentRouteAppModel = routeRecentItem.c;
            String str = recentRouteAppModel.h;
            String str2 = recentRouteAppModel.i;
            int i3 = WhenMappings.f5097a[recentRouteAppModel.s.ordinal()];
            if (i3 == 1) {
                composerStartRestartGroup.startReplaceGroup(2146998430);
                strC = StringResourcesHelperKt.c(StringEnum.TO_, new Object[]{str2}, composerStartRestartGroup, 6);
                String str3 = recentRouteAppModel.r;
                strN = str3 == null ? vo1.n(str, " - ", str2) : str3;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i3 != 2) {
                    throw pk0.p(composerStartRestartGroup, -1870406741);
                }
                composerStartRestartGroup.startReplaceGroup(2147246275);
                composerStartRestartGroup.endReplaceGroup();
                strC = recentRouteAppModel.g;
                strN = vo1.n(str, " - ", str2);
            }
            String str4 = strN;
            String str5 = recentRouteAppModel.j;
            if (str5 != null) {
                upperCase = str5.toUpperCase(Locale.ROOT);
                Intrinsics.h(upperCase, "toUpperCase(...)");
            } else {
                upperCase = null;
            }
            UniversalSearchRecentSearchedItemLayoutUiModel universalSearchRecentSearchedItemLayoutUiModel = new UniversalSearchRecentSearchedItemLayoutUiModel(IconType.BUS_NEARBY_CARD_ITEM_ICON, GenerateAnnotatedStringKt.a("", strC, composerStartRestartGroup, 6), str4, IconType.FAVORITE_OVERFLOW, false, upperCase, recentRouteAppModel.k, recentRouteAppModel.l, z2, 16);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(routeRecentItem) | ((i2 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new fr0(27, onClick, routeRecentItem);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            boolean zChangedInstance2 = ((i2 & 7168) == 2048) | composerStartRestartGroup.changedInstance(recentRouteAppModel);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new fr0(28, onRemoveClick, recentRouteAppModel);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function1 = (Function0) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new e01(7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            SearchStopAndLocationItemComposableKt.b(universalSearchRecentSearchedItemLayoutUiModel, false, function0, function1, (Function1) objRememberedValue3, composerStartRestartGroup, 24576, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new lh(routeRecentItem, z, onClick, onRemoveClick, i, 11));
        }
    }

    public static final void e(UniversalSearchRecentSearchItem.Stop stop, boolean z, boolean z2, Function2 function2, Function1 function1, Function2 function3, Composer composer, int i) {
        int i2;
        boolean z3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-160143983);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(stop) ? 4 : 2) | i;
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
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-160143983, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.RecentSearchedStopsComposable (RecentSearchedItemComposable.kt:113)");
            }
            RecentStopAppModel recentStopAppModel = stop.c;
            StopAppModel stopAppModel = recentStopAppModel.g;
            UniversalSearchRecentSearchedItemLayoutUiModel universalSearchRecentSearchedItemLayoutUiModel = new UniversalSearchRecentSearchedItemLayoutUiModel(TrackingUtils.c(stopAppModel.d), GenerateAnnotatedStringKt.a("", stopAppModel.b, composerStartRestartGroup, 6), stopAppModel.e, IconType.FAVORITE_OVERFLOW, z2, null, false, null, z3, 224);
            boolean zChangedInstance = ((57344 & i2) == 16384) | composerStartRestartGroup.changedInstance(stop);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new p01(1, function1, stop);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            boolean zChangedInstance2 = ((458752 & i2) == 131072) | composerStartRestartGroup.changedInstance(recentStopAppModel);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new p01(2, function3, recentStopAppModel);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function4 = (Function0) objRememberedValue2;
            boolean zChangedInstance3 = ((i2 & 7168) == 2048) | composerStartRestartGroup.changedInstance(stop);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new lu0(29, function2, stop);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            SearchStopAndLocationItemComposableKt.b(universalSearchRecentSearchedItemLayoutUiModel, z2, function0, function4, (Function1) objRememberedValue3, composerStartRestartGroup, (i2 >> 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new q01(stop, z, z2, function2, function1, function3, i));
        }
    }

    public static final void f(final UniversalSearchRecentSearchItem.Trip trip, final Function1 function1, final Function2 function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2015948911);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(trip) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2015948911, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.RecentSearchedTripsComposable (RecentSearchedItemComposable.kt:139)");
            }
            RecentTripAppModel recentTripAppModel = trip.c;
            String str = recentTripAppModel.g.b;
            String str2 = recentTripAppModel.h.b;
            if (str.length() == 0 || str2.length() == 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i3 = 0;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: r01
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i4) {
                                case 0:
                                    RecentSearchedItemComposableKt.f(trip, function1, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    RecentSearchedItemComposableKt.f(trip, function1, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    });
                    return;
                }
                return;
            }
            boolean zChangedInstance = ((i2 & 112) == 32) | composerStartRestartGroup.changedInstance(trip);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new p01(3, function1, trip);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(recentTripAppModel) | ((i2 & 896) == 256);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new p01(4, function2, recentTripAppModel);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            UniversalSearchTripStopAndLocationComposableKt.b(str, str2, true, function0, (Function0) objRememberedValue2, composerStartRestartGroup, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i4 = 1;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: r01
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            RecentSearchedItemComposableKt.f(trip, function1, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            RecentSearchedItemComposableKt.f(trip, function1, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
        }
    }
}
