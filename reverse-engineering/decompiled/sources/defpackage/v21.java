package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.Density;
import app.cash.sqldelight.TransactionWithoutReturn;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.ads.HomeInlineNativeTemplateBinder_androidKt;
import app.chalo.ads.HomeInlineTemplateLayoutConfig;
import app.chalo.ads.UnifiedAdDebugRenderedContent;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.repository.local.room.entity.RouteEntityLiveDataDetails;
import app.chalo.compose.components.chalomap.LatLngBoundsBuilder;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.core.Ride_feedback_offline_queue_tableQueries;
import app.chalo.core.Routes_tableQueries;
import app.chalo.core.database.dao.RideFeedbackOfflineQueueDaoImpl;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsState;
import app.chalo.livetracking.tripplanner.ui.details.compose.ComposableSingletons$TripPlannerDetailsScreenKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerItineraryUiModelKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.titoridedetail.ui.TitoRideDetailsComponent;
import app.chalo.usecase.FeedbackData;
import app.chalo.vault.Wallet_transaction_tableQueries;
import app.chalo.vault.dao.WalletDaoImpl;
import app.chalo.vault.mapper.WalletTransactionEntityMapperKt;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountComponent;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountDataState;
import app.chalo.walletframework.wallet.data.repository.entity.WalletTransactionEntity;
import defpackage.pk0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v21 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19796a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v21(Context context, HomeInlineTemplateLayoutConfig homeInlineTemplateLayoutConfig, UnifiedAdDebugRenderedContent unifiedAdDebugRenderedContent, String str) {
        this.f19796a = 7;
        this.d = context;
        this.e = homeInlineTemplateLayoutConfig;
        this.c = unifiedAdDebugRenderedContent;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        switch (this.f19796a) {
            case 0:
                List<String> list = (List) this.d;
                RideFeedbackOfflineQueueDaoImpl rideFeedbackOfflineQueueDaoImpl = (RideFeedbackOfflineQueueDaoImpl) this.e;
                String userId = (String) this.b;
                String cityId = (String) this.c;
                for (String bookingId : list) {
                    Ride_feedback_offline_queue_tableQueries ride_feedback_offline_queue_tableQueries = rideFeedbackOfflineQueueDaoImpl.f2078a;
                    ride_feedback_offline_queue_tableQueries.getClass();
                    Intrinsics.i(bookingId, "bookingId");
                    Intrinsics.i(userId, "userId");
                    Intrinsics.i(cityId, "cityId");
                    ride_feedback_offline_queue_tableQueries.f697a.A0(1791765373, "DELETE FROM ride_feedback_offline_queue_table WHERE bookingId = ? AND userId = ? AND cityId = ?", new yi0(bookingId, userId, cityId, 7));
                    ride_feedback_offline_queue_tableQueries.T(1791765373, new x21(17));
                }
                return Unit.f17538a;
            case 1:
                Routes_tableQueries routes_tableQueries = (Routes_tableQueries) this.d;
                RouteEntityLiveDataDetails routeEntityLiveDataDetails = (RouteEntityLiveDataDetails) this.e;
                String str = (String) this.b;
                String str2 = (String) this.c;
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, (String) routes_tableQueries.b.b.encode(routeEntityLiveDataDetails));
                execute.bindString(1, str);
                execute.bindString(2, str2);
                return Unit.f17538a;
            case 2:
                Animatable animatable = (Animatable) this.d;
                Animatable animatable2 = (Animatable) this.e;
                Animatable animatable3 = (Animatable) this.b;
                Animatable animatable4 = (Animatable) this.c;
                GraphicsLayerScope graphicsLayer = (GraphicsLayerScope) obj;
                Intrinsics.i(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.setTranslationX(((Number) animatable.getValue()).floatValue());
                graphicsLayer.setTranslationY(((Number) animatable2.getValue()).floatValue());
                graphicsLayer.setScaleX(((Number) animatable3.getValue()).floatValue());
                graphicsLayer.setScaleY(((Number) animatable3.getValue()).floatValue());
                graphicsLayer.setRotationZ(((Number) animatable4.getValue()).floatValue());
                return Unit.f17538a;
            case 3:
                return TextFieldSelectionStateKt.contextMenuBuilder$lambda$0((State) this.d, (ContextMenuState) this.e, (Function2) this.b, (TextFieldSelectionState) this.c, (ContextMenuScope) obj);
            case 4:
                return TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$0((Function0) this.d, (Function0) this.e, (TextFieldSelectionState) this.b, (TextToolbarState) this.c, (TextContextMenuSession) obj);
            case 5:
                StopAppModel stopAppModel = (StopAppModel) this.d;
                RouteAppModel routeAppModel = (RouteAppModel) this.e;
                LatLng latLng = (LatLng) this.b;
                TitoRideDetailsComponent titoRideDetailsComponent = (TitoRideDetailsComponent) this.c;
                LatLngBoundsBuilder latLngBoundsBuilder = (LatLngBoundsBuilder) obj;
                LatLng latLng2 = stopAppModel.c;
                latLngBoundsBuilder.getClass();
                Intrinsics.i(latLng2, "latLng");
                ArrayList arrayList = latLngBoundsBuilder.f1876a;
                arrayList.add(latLng2);
                List list2 = routeAppModel.e;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((StopAppModel) it.next()).c);
                }
                arrayList.addAll(arrayList2);
                if (latLng != null && CityProviderKt.a(titoRideDetailsComponent.p, latLng)) {
                    arrayList.add(latLng);
                }
                return Unit.f17538a;
            case 6:
                final TripPlannerDetailsState tripPlannerDetailsState = (TripPlannerDetailsState) this.d;
                Function2 function2 = (Function2) this.e;
                Density density = (Density) this.b;
                final Function1 function1 = (Function1) this.c;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                LazyListScope.CC.s(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(131938548, true, new q80(6, tripPlannerDetailsState, function2, density)), 3, null);
                LazyListScope.CC.m(LazyColumn, null, null, ComposableSingletons$TripPlannerDetailsScreenKt.f4745a, 3, null);
                final List list3 = tripPlannerDetailsState.d;
                LazyColumn.items(list3.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreenKt$TripPlannerDetailsBottomSheetContent_942rkJo$lambda$0$0$0$$inlined$itemsIndexed$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list3.get(((Number) obj2).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreenKt$TripPlannerDetailsBottomSheetContent_942rkJo$lambda$0$0$0$$inlined$itemsIndexed$default$3
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int iIntValue2 = ((Number) obj5).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i & 147) != 146, i & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                            }
                            Object obj6 = list3.get(iIntValue);
                            int i2 = i & WebSocketProtocol.PAYLOAD_SHORT;
                            TripPlannerLegUiModel tripPlannerLegUiModel = (TripPlannerLegUiModel) obj6;
                            composer.startReplaceGroup(746640403);
                            IconType iconType = iIntValue == CollectionsKt.K(tripPlannerDetailsState.d) ? IconType.LOCATION_STOP_DETAILS : IconType.BUS_NEARBY_UNSELECTED;
                            if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Auto) {
                                composer.startReplaceGroup(746871135);
                                TripPlannerLegUiModel.Auto auto = (TripPlannerLegUiModel.Auto) tripPlannerLegUiModel;
                                TripPlannerDetailsScreenKt.a(TripPlannerItineraryUiModelKt.a(tripPlannerLegUiModel), auto.b, tripPlannerLegUiModel.a(), auto.c, iIntValue, PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, ChaloTheme.b(composer, 0).f, 0.0f, 0.0f, 0.0f, 14, null), iconType, composer, (i2 << 9) & 57344, 0);
                                composer = composer;
                                composer.endReplaceGroup();
                            } else if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Bus) {
                                composer.startReplaceGroup(747496095);
                                TripPlannerLegUiModel.Bus bus = (TripPlannerLegUiModel.Bus) tripPlannerLegUiModel;
                                TripPlannerDetailsScreenKt.e(TripPlannerItineraryUiModelKt.a(tripPlannerLegUiModel), function1, bus, bus.f4755a, iIntValue, PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, ChaloTheme.b(composer, 0).f, 0.0f, 0.0f, 0.0f, 14, null), composer, (i2 << 9) & 57344, 0);
                                composer.endReplaceGroup();
                            } else if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Walk) {
                                composer.startReplaceGroup(748094767);
                                TripPlannerDetailsScreenKt.n(TripPlannerItineraryUiModelKt.a(tripPlannerLegUiModel), ((TripPlannerLegUiModel.Walk) tripPlannerLegUiModel).b, tripPlannerLegUiModel.a(), iIntValue, PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, ChaloTheme.b(composer, 0).f, 0.0f, 0.0f, 0.0f, 14, null), iconType, composer, (i2 << 6) & 7168, 0);
                                composer.endReplaceGroup();
                            } else if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Taxi) {
                                composer.startReplaceGroup(748705343);
                                TripPlannerLegUiModel.Taxi taxi = (TripPlannerLegUiModel.Taxi) tripPlannerLegUiModel;
                                TripPlannerDetailsScreenKt.m(TripPlannerItineraryUiModelKt.a(tripPlannerLegUiModel), taxi.b, tripPlannerLegUiModel.a(), taxi.c, iIntValue, PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, ChaloTheme.b(composer, 0).f, 0.0f, 0.0f, 0.0f, 14, null), iconType, composer, (i2 << 9) & 57344);
                                composer = composer;
                                composer.endReplaceGroup();
                            } else if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Metro) {
                                composer.startReplaceGroup(749328598);
                                TripPlannerDetailsScreenKt.j(TripPlannerItineraryUiModelKt.a(tripPlannerLegUiModel), function1, (TripPlannerLegUiModel.Metro) tripPlannerLegUiModel, iIntValue, PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, ChaloTheme.b(composer, 0).f, 0.0f, 0.0f, 0.0f, 14, null), composer, (i2 << 6) & 7168);
                                composer = composer;
                                composer.endReplaceGroup();
                            } else {
                                if (!Intrinsics.d(tripPlannerLegUiModel, TripPlannerLegUiModel.Ferry.f4756a) && !Intrinsics.d(tripPlannerLegUiModel, TripPlannerLegUiModel.MonoRail.f4758a) && !Intrinsics.d(tripPlannerLegUiModel, TripPlannerLegUiModel.Railway.f4759a)) {
                                    throw pk0.p(composer, 1963755202);
                                }
                                composer.startReplaceGroup(749976467);
                                TripPlannerDetailsScreenKt.h(TripPlannerItineraryUiModelKt.a(tripPlannerLegUiModel), iIntValue, PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, ChaloTheme.b(composer, 0).f, 0.0f, 0.0f, 0.0f, 14, null), iconType, composer, i & 112);
                                composer.endReplaceGroup();
                            }
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }));
                LazyListScope.CC.m(LazyColumn, null, null, ComposableSingletons$TripPlannerDetailsScreenKt.b, 3, null);
                return Unit.f17538a;
            case 7:
                Context context = (Context) this.d;
                HomeInlineTemplateLayoutConfig homeInlineTemplateLayoutConfig = (HomeInlineTemplateLayoutConfig) this.e;
                UnifiedAdDebugRenderedContent unifiedAdDebugRenderedContent = (UnifiedAdDebugRenderedContent) this.c;
                String str3 = (String) this.b;
                FrameLayout frameLayout = (FrameLayout) obj;
                if (frameLayout != null) {
                    HomeInlineNativeTemplateBinder_androidKt.a(context, frameLayout, homeInlineTemplateLayoutConfig, unifiedAdDebugRenderedContent.f, str3, "debugFixture");
                    Context context2 = frameLayout.getContext();
                    View childAt = frameLayout.getChildAt(0);
                    ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
                    if (imageView == null) {
                        imageView = new ImageView(context2);
                        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        frameLayout.removeAllViews();
                        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
                    }
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{Color.parseColor("#DDEEFF"), Color.parseColor("#B9DCF8")});
                    gradientDrawable.setCornerRadius(0.0f);
                    imageView.setImageDrawable(gradientDrawable);
                }
                return Unit.f17538a;
            case 8:
                List list4 = (List) this.d;
                Function1 function3 = (Function1) this.e;
                MutableIntState mutableIntState = (MutableIntState) this.b;
                MutableState mutableState = (MutableState) this.c;
                Integer num = (Integer) obj;
                mutableIntState.setIntValue(num.intValue());
                Iterator it2 = list4.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        FeedbackData feedbackData = (FeedbackData) next;
                        if (((Number) feedbackData.f10169a.d()).intValue() > mutableIntState.getIntValue() || ((Number) feedbackData.f10169a.e()).intValue() < mutableIntState.getIntValue()) {
                        }
                    } else {
                        next = null;
                    }
                }
                FeedbackData feedbackData2 = (FeedbackData) next;
                if (feedbackData2 == null) {
                    feedbackData2 = (FeedbackData) list4.get(0);
                }
                mutableState.setValue(feedbackData2);
                function3.invoke(num);
                return Unit.f17538a;
            case 9:
                WalletDaoImpl walletDaoImpl = (WalletDaoImpl) this.e;
                String userId2 = (String) this.b;
                String str4 = (String) this.c;
                List list5 = (List) this.d;
                TransactionWithoutReturn transaction = (TransactionWithoutReturn) obj;
                Intrinsics.i(transaction, "$this$transaction");
                Wallet_transaction_tableQueries wallet_transaction_tableQueriesA = walletDaoImpl.A();
                wallet_transaction_tableQueriesA.getClass();
                Intrinsics.i(userId2, "userId");
                wallet_transaction_tableQueriesA.f697a.A0(428726711, "DELETE FROM wallet_transaction_table\nWHERE userId = ?\nAND walletId = ?", new gw(userId2, str4, 18));
                wallet_transaction_tableQueriesA.T(428726711, new hp1(15));
                Iterator it3 = list5.iterator();
                while (it3.hasNext()) {
                    walletDaoImpl.A().b0(WalletTransactionEntityMapperKt.a((WalletTransactionEntity) it3.next()));
                }
                return Unit.f17538a;
            default:
                ArrayList arrayList3 = (ArrayList) this.e;
                WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent = (WalletLoadBalanceEnterAmountComponent) this.c;
                List list6 = (List) this.d;
                Number number = (Number) this.b;
                return WalletLoadBalanceEnterAmountDataState.a((WalletLoadBalanceEnterAmountDataState) obj, false, false, null, null, arrayList3, number.longValue(), walletLoadBalanceEnterAmountComponent.B.a(number.longValue(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), list6, null, null, null, walletLoadBalanceEnterAmountComponent.B.d(), 0, false, 28207);
        }
    }

    public /* synthetic */ v21(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f19796a = i;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = obj4;
    }

    public /* synthetic */ v21(Object obj, Object obj2, Object obj3, List list, int i) {
        this.f19796a = i;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = list;
    }
}
