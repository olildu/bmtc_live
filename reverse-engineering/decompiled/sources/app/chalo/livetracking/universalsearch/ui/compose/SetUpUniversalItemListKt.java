package app.chalo.livetracking.universalsearch.ui.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchRecentSearchedItemLayoutUiModel;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchRouteSearchViewItemLayoutUiModel;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchRoutesDetailModel;
import app.chalo.livetracking.universalsearch.ui.compose.SetUpUniversalItemListKt;
import app.chalo.livetracking.utils.TrackingUtils;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.d71;
import defpackage.lh;
import defpackage.o01;
import defpackage.pk0;
import defpackage.vo1;
import defpackage.wb;
import defpackage.wc;
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
public final class SetUpUniversalItemListKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5098a;

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
            f5098a = iArr;
        }
    }

    public static final void a(final String queryString, final String str, final boolean z, final Function0 onItemClick, Composer composer, final int i) {
        int i2;
        boolean z2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        CharSequence charSequenceU0;
        String string;
        Intrinsics.i(queryString, "queryString");
        Intrinsics.i(onItemClick, "onItemClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2135998384);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(queryString) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onItemClick) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2135998384, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.UniversalSearchLocationItem (SetUpUniversalItemList.kt:20)");
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
                function2 = new Function2() { // from class: j71
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i3) {
                            case 0:
                                ((Integer) obj2).intValue();
                                SetUpUniversalItemListKt.a(queryString, str, z, onItemClick, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                ((Integer) obj2).intValue();
                                SetUpUniversalItemListKt.a(queryString, str, z, onItemClick, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            } else {
                int iD = StringsKt.D(str, ",", 0, false, 6);
                if (iD != -1) {
                    String strSubstring = str.substring(0, iD);
                    Intrinsics.h(strSubstring, "substring(...)");
                    charSequenceU0 = StringsKt.u0(strSubstring);
                } else {
                    charSequenceU0 = StringsKt.u0(str);
                }
                String string2 = charSequenceU0.toString();
                if (iD != -1) {
                    String strSubstring2 = str.substring(iD + 1);
                    Intrinsics.h(strSubstring2, "substring(...)");
                    string = StringsKt.u0(strSubstring2).toString();
                } else {
                    string = null;
                }
                UniversalSearchRecentSearchedItemLayoutUiModel universalSearchRecentSearchedItemLayoutUiModel = new UniversalSearchRecentSearchedItemLayoutUiModel(IconType.LOCATION_SEARCH, GenerateAnnotatedStringKt.a(queryString, string2, composerStartRestartGroup, i2 & 14), string, null, false, null, false, null, z2, 248);
                boolean z3 = (i2 & 7168) == 2048;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new o01(onItemClick, 20);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new wb(8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function1 = (Function0) objRememberedValue2;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new d71(6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                SearchStopAndLocationItemComposableKt.b(universalSearchRecentSearchedItemLayoutUiModel, false, function0, function1, (Function1) objRememberedValue3, composerStartRestartGroup, 27648, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i4 = 1;
            function2 = new Function2() { // from class: j71
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i4) {
                        case 0:
                            ((Integer) obj2).intValue();
                            SetUpUniversalItemListKt.a(queryString, str, z, onItemClick, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            SetUpUniversalItemListKt.a(queryString, str, z, onItemClick, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    public static final void b(String queryString, UniversalSearchRoutesDetailModel routeInfo, boolean z, Function0 onItemClick, Composer composer, int i) {
        int i2;
        boolean z2;
        String strC;
        int i3;
        String strC2;
        String strN;
        Intrinsics.i(queryString, "queryString");
        Intrinsics.i(routeInfo, "routeInfo");
        String str = routeInfo.g;
        String str2 = routeInfo.h;
        Intrinsics.i(onItemClick, "onItemClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-316866812);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(queryString) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(routeInfo) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onItemClick) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-316866812, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.UniversalSearchRouteItem (SetUpUniversalItemList.kt:48)");
            }
            int i4 = WhenMappings.f5098a[routeInfo.k.ordinal()];
            if (i4 == 1) {
                composerStartRestartGroup.startReplaceGroup(559291574);
                strC = StringResourcesHelperKt.c(StringEnum.TO_, new Object[]{str2}, composerStartRestartGroup, 6);
                String str3 = routeInfo.j;
                if (str3 == null) {
                    composerStartRestartGroup.startReplaceGroup(559403762);
                    composerStartRestartGroup.endReplaceGroup();
                    i3 = 0;
                    strC2 = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(559403763);
                    i3 = 0;
                    strC2 = StringResourcesHelperKt.c(StringEnum.VIA_, new Object[]{str3}, composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                strN = strC2 == null ? vo1.n(str, " - ", str2) : strC2;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i4 != 2) {
                    throw pk0.p(composerStartRestartGroup, 433681488);
                }
                composerStartRestartGroup.startReplaceGroup(559560406);
                composerStartRestartGroup.endReplaceGroup();
                strC = routeInfo.b;
                strN = vo1.n(str, " - ", str2);
                i3 = 0;
            }
            String str4 = routeInfo.c;
            String str5 = strN;
            int i5 = i3;
            UniversalSearchRouteSearchViewItemLayoutUiModel universalSearchRouteSearchViewItemLayoutUiModel = new UniversalSearchRouteSearchViewItemLayoutUiModel(TrackingUtils.b(str4 != null ? ChaloTransitMode.Companion.b(ChaloTransitMode.INSTANCE, str4) : null), routeInfo.e, routeInfo.f, routeInfo.d, str5, GenerateAnnotatedStringKt.a(queryString, strC, composerStartRestartGroup, i2 & 14), routeInfo.i, z2);
            int i6 = (i2 & 7168) == 2048 ? 1 : i5;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o01(onItemClick, 19);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SearchRouteItemComposableKt.b(universalSearchRouteSearchViewItemLayoutUiModel, (Function0) objRememberedValue, composerStartRestartGroup, i5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new lh((Object) queryString, (Object) routeInfo, z, onItemClick, i, 13));
        }
    }

    public static final void c(String queryString, String stopName, String str, ChaloTransitMode chaloTransitMode, boolean z, Function0 onItemClick, Composer composer, int i) {
        int i2;
        String str2;
        boolean z2;
        Intrinsics.i(queryString, "queryString");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(onItemClick, "onItemClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2024011933);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(queryString) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(stopName) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str2 = str;
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(chaloTransitMode == null ? -1 : chaloTransitMode.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onItemClick) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2024011933, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.UniversalSearchStopItem (SetUpUniversalItemList.kt:91)");
            }
            UniversalSearchRecentSearchedItemLayoutUiModel universalSearchRecentSearchedItemLayoutUiModel = new UniversalSearchRecentSearchedItemLayoutUiModel(chaloTransitMode == ChaloTransitMode.ALL ? TrackingUtils.c(chaloTransitMode) : TrackingUtils.c(chaloTransitMode), GenerateAnnotatedStringKt.a(queryString, stopName, composerStartRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT), str2, null, false, null, false, null, z2, 248);
            boolean z3 = (458752 & i2) == 131072;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o01(onItemClick, 21);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new wb(8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function1 = (Function0) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new d71(7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            SearchStopAndLocationItemComposableKt.b(universalSearchRecentSearchedItemLayoutUiModel, false, function0, function1, (Function1) objRememberedValue3, composerStartRestartGroup, 27648, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wc(queryString, stopName, str, chaloTransitMode, z, onItemClick, i));
        }
    }
}
