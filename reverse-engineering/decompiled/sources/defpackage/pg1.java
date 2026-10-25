package defpackage;

import androidx.arch.core.util.Function;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.TextFieldPressGestureFilterKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.material3.AnalogTimePickerState;
import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TooltipScopeImpl;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Transformations;
import app.cash.sqldelight.db.SqlCursor;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.behaviour.policy.TicketReceiptFormatConfig;
import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.compose.components.ChaloRecentlySearchedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.constants.Source;
import app.chalo.core.Super_pass_bookings_table;
import app.chalo.core.Super_pass_bookings_tableQueries;
import app.chalo.core.Ticket;
import app.chalo.core.TicketQueries;
import app.chalo.core.Tito_validation_table;
import app.chalo.core.Tito_validation_tableQueries;
import app.chalo.data.BookingsRequestType;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.home.ui.regularbus.RecentSearchedItem;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsState;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerPurchaseHooksUiState;
import app.chalo.models.mticketing.MTicketTripReceipt;
import app.chalo.models.userprofile.UserProfile;
import app.chalo.premiumbus.ui.faredetails.TicketPurchaseThroughPassDelegate;
import app.chalo.premiumbus.ui.faredetails.TicketPurchaseWithPassUpsellNudgeDelegate;
import app.chalo.productsummary.ui.ticket.TicketSummaryComponent;
import app.chalo.productsummary.ui.ticket.TicketSummaryDataState;
import app.chalo.productsummary.ui.ticket.TicketSummaryIntent;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.receipt.ReceiptFareDataAppModel;
import app.chalo.receipt.UserDetailsForProducts;
import app.chalo.recent.model.app.RecentLocationPairAppModel;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.recent.model.app.RecentRouteAppModel;
import app.chalo.recent.model.app.RecentStopAppModel;
import app.chalo.recent.model.app.RecentStopBasedTripAppModel;
import app.chalo.recent.model.app.RecentTripAppModel;
import app.chalo.recent.model.app.RecentsType;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.MinProfileUpdateArgs;
import app.chalo.titoridedetail.data.app.TitoRideDataAppModel;
import app.chalo.titoridedetail.data.ui.TitoRideDetailsScreenLiveBusMarker;
import app.chalo.titoridedetail.ui.TitoRideDetailsViewState;
import app.chalo.uistate.text.StyledTextClickHandler;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.hq0;
import defpackage.pk0;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pg1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19034a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pg1(int i, Object obj, Object obj2) {
        this.f19034a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19034a) {
            case 0:
                Function21 function21 = (Function21) this.c;
                Super_pass_bookings_tableQueries super_pass_bookings_tableQueries = (Super_pass_bookings_tableQueries) this.b;
                SqlCursor sqlCursor = (SqlCursor) obj;
                String strI = cb0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                Long lJ = uf0.j(string, sqlCursor, 2);
                Long l = sqlCursor.getLong(3);
                Intrinsics.f(l);
                String string2 = sqlCursor.getString(4);
                String string3 = sqlCursor.getString(5);
                String string4 = sqlCursor.getString(6);
                String string5 = sqlCursor.getString(7);
                String string6 = sqlCursor.getString(8);
                String string7 = sqlCursor.getString(9);
                Super_pass_bookings_table.Adapter adapter = super_pass_bookings_tableQueries.b;
                Object objG = cb0.g(sqlCursor, 10, adapter.f2016a);
                String string8 = sqlCursor.getString(11);
                List list = string8 != null ? (List) adapter.b.a(string8) : null;
                String string9 = sqlCursor.getString(12);
                String string10 = sqlCursor.getString(13);
                String string11 = sqlCursor.getString(14);
                String string12 = sqlCursor.getString(15);
                String string13 = sqlCursor.getString(16);
                String string14 = sqlCursor.getString(17);
                String string15 = sqlCursor.getString(18);
                Long l2 = sqlCursor.getLong(19);
                String string16 = sqlCursor.getString(20);
                return function21.invoke(strI, string, lJ, l, string2, string3, string4, string5, string6, string7, objG, list, string9, string10, string11, string12, string13, string14, string15, l2, string16 != null ? (ReceiptFareDataAppModel) adapter.c.a(string16) : null);
            case 1:
                Super_pass_bookings_table super_pass_bookings_table = (Super_pass_bookings_table) this.c;
                Super_pass_bookings_tableQueries super_pass_bookings_tableQueries2 = (Super_pass_bookings_tableQueries) this.b;
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, super_pass_bookings_table.f2015a);
                execute.bindString(1, super_pass_bookings_table.b);
                execute.d(2, Long.valueOf(super_pass_bookings_table.c));
                execute.d(3, Long.valueOf(super_pass_bookings_table.d));
                execute.bindString(4, super_pass_bookings_table.e);
                execute.bindString(5, super_pass_bookings_table.f);
                execute.bindString(6, super_pass_bookings_table.g);
                execute.bindString(7, super_pass_bookings_table.h);
                execute.bindString(8, super_pass_bookings_table.i);
                execute.bindString(9, super_pass_bookings_table.j);
                Super_pass_bookings_table.Adapter adapter2 = super_pass_bookings_tableQueries2.b;
                execute.bindString(10, (String) adapter2.f2016a.encode(super_pass_bookings_table.k));
                List list2 = super_pass_bookings_table.l;
                execute.bindString(11, list2 != null ? (String) adapter2.b.encode(list2) : null);
                execute.bindString(12, super_pass_bookings_table.m);
                execute.bindString(13, super_pass_bookings_table.n);
                execute.bindString(14, super_pass_bookings_table.o);
                execute.bindString(15, super_pass_bookings_table.p);
                execute.bindString(16, super_pass_bookings_table.q);
                execute.bindString(17, super_pass_bookings_table.r);
                execute.bindString(18, super_pass_bookings_table.s);
                execute.d(19, super_pass_bookings_table.t);
                ReceiptFareDataAppModel receiptFareDataAppModel = super_pass_bookings_table.u;
                execute.bindString(20, receiptFareDataAppModel != null ? (String) adapter2.c.encode(receiptFareDataAppModel) : null);
                return Unit.f17538a;
            case 2:
                return SuspendAnimationKt.animate$lambda$1((Function2) this.c, (TwoWayConverter) this.b, (AnimationScope) obj);
            case 3:
                DragScope dragScope = (DragScope) this.c;
                Ref.FloatRef floatRef = (Ref.FloatRef) this.b;
                Animatable animatable = (Animatable) obj;
                dragScope.dragBy(((Number) animatable.getValue()).floatValue() - floatRef.element);
                floatRef.element = ((Number) animatable.getValue()).floatValue();
                return Unit.f17538a;
            case 4:
                final List list3 = (List) this.c;
                final Function2 function2 = (Function2) this.b;
                LazyListScope LazyRow = (LazyListScope) obj;
                Intrinsics.i(LazyRow, "$this$LazyRow");
                LazyRow.items(list3.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.home.ui.common.TabHeaderKt$RegularBusRecentSearchesRow$lambda$0$0$$inlined$itemsIndexed$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list3.get(((Number) obj2).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.home.ui.common.TabHeaderKt$RegularBusRecentSearchesRow$lambda$0$0$$inlined$itemsIndexed$default$3
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i;
                        IconType iconType;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                        final int iIntValue = ((Number) obj3).intValue();
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
                            final RecentSearchedItem recentSearchedItem = (RecentSearchedItem) list3.get(iIntValue);
                            composer.startReplaceGroup(1543577190);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
                            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            if (iIntValue == 0) {
                                composer.startReplaceGroup(-1610953788);
                                ChaloSpacersKt.y(composer, 0);
                            } else {
                                composer.startReplaceGroup(-1627380347);
                            }
                            composer.endReplaceGroup();
                            RecentsType recentsType = recentSearchedItem.c;
                            if ((recentsType instanceof RecentPlaceAppModel) || (recentsType instanceof RecentRouteAppModel) || (recentsType instanceof RecentStopAppModel)) {
                                iconType = IconType.IC_BUS_TINTED;
                            } else {
                                if (!(recentsType instanceof RecentStopBasedTripAppModel) && !(recentsType instanceof RecentTripAppModel) && !(recentsType instanceof RecentLocationPairAppModel)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iconType = IconType.IC_FROM_TO_TINTED;
                            }
                            IconType iconType2 = iconType;
                            Modifier modifierC = hq0.c("PL_Recent_Searched_Item_", iIntValue, companion);
                            String str = recentSearchedItem.f3617a;
                            boolean z = true;
                            String str2 = recentSearchedItem.b;
                            final Function2 function3 = function2;
                            boolean zChanged = composer.changed(function3);
                            if ((((i & 112) ^ 48) <= 32 || !composer.changed(iIntValue)) && (i & 48) != 32) {
                                z = false;
                            }
                            boolean zChangedInstance = zChanged | z | composer.changedInstance(recentSearchedItem);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0<Unit>() { // from class: app.chalo.home.ui.common.TabHeaderKt$RegularBusRecentSearchesRow$1$1$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function3.invoke(Integer.valueOf(iIntValue), recentSearchedItem.c);
                                        return Unit.f17538a;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            ChaloRecentlySearchedCardKt.b(modifierC, str, str2, iconType2, (Function0) objRememberedValue, composer, 0);
                            if (iIntValue == CollectionsKt.K(list3)) {
                                composer.startReplaceGroup(-1610024284);
                                ChaloSpacersKt.y(composer, 0);
                                composer.endReplaceGroup();
                            } else {
                                composer.startReplaceGroup(-1609953852);
                                ChaloSpacersKt.w(composer, 0);
                                composer.endReplaceGroup();
                            }
                            composer.endNode();
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
                return Unit.f17538a;
            case 5:
                return TextFieldImplKt.textFieldBackground$lambda$24$lambda$23((Outline) this.c, (ColorProducer) this.b, (DrawScope) obj);
            case 6:
                return TextFieldImplKt.textFieldBackground$lambda$24((Shape) this.c, (ColorProducer) this.b, (CacheDrawScope) obj);
            case 7:
                return TextFieldPressGestureFilterKt.tapPressTextFieldModifier$lambda$0$1$0((MutableState) this.c, (MutableInteractionSource) this.b, (DisposableEffectScope) obj);
            case 8:
                TextUIState.StyledTextUIState styledTextUIState = (TextUIState.StyledTextUIState) this.c;
                AnnotatedString annotatedString = (AnnotatedString) this.b;
                int iIntValue = ((Integer) obj).intValue();
                Iterator it = styledTextUIState.b.iterator();
                while (it.hasNext()) {
                    StyledTextClickHandler styledTextClickHandler = ((StyledTextDataUIState) it.next()).g;
                    if (styledTextClickHandler != null && ((AnnotatedString.Range) CollectionsKt.H(annotatedString.getStringAnnotations(styledTextClickHandler.getF10085a(), iIntValue, iIntValue))) != null) {
                        styledTextClickHandler.a();
                    }
                }
                return Unit.f17538a;
            case 9:
                return TextLinkScope.clipLink$lambda$0((TextLinkScope) this.c, (AnnotatedString.Range) this.b, (GraphicsLayerScope) obj);
            case 10:
                ((TicketPurchaseThroughPassDelegate) this.c).n.remove((Job) this.b);
                return Unit.f17538a;
            case 11:
                ((TicketPurchaseWithPassUpsellNudgeDelegate) this.c).y.remove((Job) this.b);
                return Unit.f17538a;
            case 12:
                ((TicketPurchaseWithPassUpsellNudgeDelegate) this.c).m.b(new ChaloNavigationRequest.Navigate(new MinProfileUpdateArgs((String) this.b, ((Boolean) obj).booleanValue(), Source.PREMIUM_BUS_FARE_DETAILS_SCREEN), null, null, 6));
                return Unit.f17538a;
            case 13:
                Ticket ticket = (Ticket) this.c;
                TicketQueries ticketQueries = (TicketQueries) this.b;
                SqlPreparedStatement execute2 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute2, "$this$execute");
                execute2.bindString(0, ticket.f2019a);
                execute2.bindString(1, ticket.b);
                execute2.bindString(2, ticket.c);
                execute2.bindString(3, ticket.d);
                execute2.bindString(4, ticket.e);
                execute2.bindString(5, ticket.f);
                Ticket.Adapter adapter3 = ticketQueries.b;
                execute2.bindString(6, (String) adapter3.f2020a.encode(ticket.g));
                RouteStopsInfo routeStopsInfo = ticket.h;
                execute2.bindString(7, routeStopsInfo != null ? (String) adapter3.b.encode(routeStopsInfo) : null);
                execute2.bindString(8, (String) adapter3.c.encode(ticket.i));
                execute2.d(9, Long.valueOf(ticket.j));
                execute2.d(10, Long.valueOf(ticket.k));
                execute2.b(11, Boolean.valueOf(ticket.l));
                execute2.d(12, Long.valueOf(ticket.m));
                execute2.b(13, Boolean.valueOf(ticket.n));
                execute2.d(14, ticket.o);
                UserProfile userProfile = ticket.p;
                execute2.bindString(15, userProfile != null ? (String) adapter3.d.encode(userProfile) : null);
                execute2.bindString(16, ticket.q);
                execute2.bindString(17, ticket.r);
                execute2.bindString(18, (String) adapter3.e.encode(ticket.s));
                execute2.b(19, ticket.t);
                execute2.b(20, Boolean.valueOf(ticket.u));
                execute2.bindString(21, ticket.v);
                execute2.bindString(22, ticket.w);
                execute2.bindString(23, ticket.x);
                execute2.bindString(24, ticket.y);
                execute2.bindString(25, ticket.z);
                execute2.bindString(26, ticket.A);
                MTicketTripReceipt mTicketTripReceipt = ticket.B;
                execute2.bindString(27, mTicketTripReceipt != null ? (String) adapter3.f.encode(mTicketTripReceipt) : null);
                return Unit.f17538a;
            case 14:
                return TicketSummaryDataState.a((TicketSummaryDataState) obj, null, false, false, false, null, TicketSummaryComponent.F0((TicketSummaryComponent) this.c, (BookingsRequestType.SuperPassRideType) ((BookingsRequestType) this.b)), null, null, null, null, null, false, null, null, null, 32669);
            case 15:
                return TicketSummaryDataState.a((TicketSummaryDataState) obj, null, false, false, false, null, (ChaloUserBookingType) this.c, null, null, (UserDetailsForProducts) this.b, null, null, false, null, null, null, 32405);
            case 16:
                return TicketSummaryDataState.a((TicketSummaryDataState) obj, ((TicketSummaryIntent.InitializationIntent) this.c).b, false, false, false, null, null, null, null, null, null, null, false, null, null, (TicketReceiptFormatConfig) this.b, 16382);
            case 17:
                return TimePickerKt.drawSelector$lambda$61((AnalogTimePickerState) this.c, (TimePickerColors) this.b, (ContentDrawScope) obj);
            case 18:
                TitoRideDataAppModel titoRideDataAppModel = (TitoRideDataAppModel) this.c;
                TitoRideDetailsScreenLiveBusMarker titoRideDetailsScreenLiveBusMarker = (TitoRideDetailsScreenLiveBusMarker) this.b;
                TitoRideDetailsViewState currentState = (TitoRideDetailsViewState) obj;
                Intrinsics.i(currentState, "currentState");
                return TitoRideDetailsViewState.a(currentState, titoRideDataAppModel, null, null, false, null, null, titoRideDetailsScreenLiveBusMarker, null, 0.0d, false, 1918);
            case 19:
                Tito_validation_table tito_validation_table = (Tito_validation_table) this.c;
                Tito_validation_tableQueries tito_validation_tableQueries = (Tito_validation_tableQueries) this.b;
                SqlPreparedStatement execute3 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute3, "$this$execute");
                execute3.bindString(0, tito_validation_table.f2021a);
                execute3.d(1, Long.valueOf(tito_validation_table.b));
                execute3.d(2, Long.valueOf(tito_validation_table.c));
                execute3.d(3, Long.valueOf(tito_validation_table.d));
                execute3.bindString(4, tito_validation_table.e);
                execute3.bindString(5, tito_validation_table.f);
                execute3.bindString(6, tito_validation_table.g);
                execute3.bindString(7, tito_validation_table.h);
                execute3.d(8, Long.valueOf(tito_validation_table.i));
                execute3.bindString(9, tito_validation_table.j);
                execute3.bindString(10, tito_validation_table.k);
                execute3.bindString(11, (String) tito_validation_tableQueries.b.f2022a.encode(tito_validation_table.l));
                execute3.bindString(12, tito_validation_table.m);
                execute3.bindString(13, tito_validation_table.n);
                Tito_validation_table.Adapter adapter4 = tito_validation_tableQueries.b;
                execute3.bindString(14, (String) adapter4.b.encode(tito_validation_table.o));
                execute3.bindString(15, (String) adapter4.c.encode(tito_validation_table.p));
                execute3.d(16, Long.valueOf(tito_validation_table.q));
                execute3.d(17, tito_validation_table.r);
                execute3.d(18, tito_validation_table.s);
                execute3.bindString(19, tito_validation_table.t);
                execute3.bindString(20, tito_validation_table.u);
                execute3.bindString(21, tito_validation_table.v);
                execute3.d(22, tito_validation_table.w);
                return Unit.f17538a;
            case 20:
                return TooltipScopeImpl.drawCaret$lambda$0((Function2) this.c, (TooltipScopeImpl) this.b, (CacheDrawScope) obj);
            case 21:
                return Transformations.map$lambda$0((MediatorLiveData) this.c, (Function1) this.b, obj);
            case 22:
                return Transformations.distinctUntilChanged$lambda$4((MediatorLiveData) this.c, (Ref.BooleanRef) this.b, obj);
            case 23:
                return Transformations.map$lambda$1((MediatorLiveData) this.c, (Function) this.b, obj);
            case 24:
                return Transition.animateTo$lambda$2$0((CoroutineScope) this.c, (Transition) this.b, (DisposableEffectScope) obj);
            case 25:
                return TransitionKt.createChildTransitionInternal$lambda$1$0((Transition) this.c, (Transition) this.b, (DisposableEffectScope) obj);
            case 26:
                return TransitionKt.createDeferredAnimation$lambda$1$0((Transition) this.c, (Transition.DeferredAnimation) this.b, (DisposableEffectScope) obj);
            case 27:
                return TransitionKt.createTransitionAnimation$lambda$1$0((Transition) this.c, (Transition.TransitionAnimationState) this.b, (DisposableEffectScope) obj);
            case 28:
                List list4 = (List) this.c;
                TripPlannerPurchaseHooksUiState tripPlannerPurchaseHooksUiState = (TripPlannerPurchaseHooksUiState) this.b;
                TripPlannerDetailsState it2 = (TripPlannerDetailsState) obj;
                Intrinsics.i(it2, "it");
                return TripPlannerDetailsState.a(it2, null, null, null, list4, tripPlannerPurchaseHooksUiState, null, null, null, 487);
            default:
                Function2 function3 = (Function2) this.c;
                Density toDp = (Density) this.b;
                LayoutCoordinates it3 = (LayoutCoordinates) obj;
                Intrinsics.i(it3, "it");
                int iMo5941getSizeYbymL2g = (int) (it3.mo5941getSizeYbymL2g() >> 32);
                Intrinsics.i(toDp, "$this$toDp");
                function3.invoke(Dp.m7276boximpl(toDp.mo401toDpu2uoSUM(iMo5941getSizeYbymL2g)), Dp.m7276boximpl(toDp.mo401toDpu2uoSUM((int) (it3.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax))));
                return Unit.f17538a;
        }
    }
}
