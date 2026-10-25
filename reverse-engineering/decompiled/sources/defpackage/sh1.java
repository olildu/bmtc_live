package defpackage;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.text.TextFieldScrollKt;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.webkit.ProxyConfig;
import app.cash.sqldelight.db.SqlCursor;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.compose.utils.ContentAnimationTransitionSpecKt;
import app.chalo.core.Tito_validation_tableQueries;
import app.chalo.core.User_commute_preference_place_table;
import app.chalo.livetracking.tripplanner.ui.details.MetroGroupLegAppModel;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsBottomSheetType;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsIntent;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsState;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultIntent;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsState;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerIntent;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerViewState;
import app.chalo.login.ui.userconsent.UserConsentComponent;
import app.chalo.login.ui.userconsent.UserConsentDataState;
import app.chalo.login.ui.userconsent.UserConsentIntent;
import app.chalo.models.bookinghelp.BookingHelpAvailabilityAppModel;
import app.chalo.productsummary.ui.ticket.TicketSummaryDataState;
import app.chalo.productsummary.ui.ticket.TicketSummaryIntent;
import app.chalo.titoridedetail.data.app.TitoValidationStatus;
import app.chalo.titoridedetail.ui.TITORideDetailScreenType;
import app.chalo.titoridedetail.ui.TitoRideDetailsViewState;
import app.chalo.titoridedetail.ui.compose.TitoRideDataScreenKt;
import app.chalo.usecase.FeedbackTags;
import app.chalo.userprofile.ui.UserProfileFieldType;
import app.chalo.userprofile.ui.UserProfileFormComponent;
import app.chalo.userprofile.ui.UserProfileFormDataState;
import app.chalo.userprofile.ui.UserProfileFormIntent;
import app.chalo.userprofile.ui.UserProfileTextField;
import com.google.firebase.messaging.ServiceStarter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeReference;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.internal.TripleSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sh1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19304a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sh1(Object obj, int i) {
        this.f19304a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strB;
        UserProfileFieldType userProfileFieldType;
        switch (this.f19304a) {
            case 0:
                return TextFieldCoreModifierNode.textContextMenuToolbarHandlerNode$lambda$0((TextFieldCoreModifierNode) this.b, (LayoutCoordinates) obj);
            case 1:
                return Float.valueOf(TextFieldScrollKt.textFieldScrollable$lambda$1$0$0((TextFieldScrollerPosition) this.b, ((Float) obj).floatValue()));
            case 2:
                return TextKt.createTextWithLinkStyles$lambda$21((TextLinkStyles) this.b, (AnnotatedString.Range) obj);
            case 3:
                BookingHelpAvailabilityAppModel bookingHelpAvailabilityAppModel = (BookingHelpAvailabilityAppModel) this.b;
                TicketSummaryDataState it = (TicketSummaryDataState) obj;
                Intrinsics.i(it, "it");
                return TicketSummaryDataState.a(it, null, false, false, false, null, null, null, null, null, null, null, false, null, bookingHelpAvailabilityAppModel.f5602a, null, 24575);
            case 4:
                TicketSummaryIntent.OnImageClickIntent onImageClickIntent = (TicketSummaryIntent.OnImageClickIntent) this.b;
                TicketSummaryDataState it2 = (TicketSummaryDataState) obj;
                Intrinsics.i(it2, "it");
                return TicketSummaryDataState.a(it2, null, false, false, false, null, null, null, onImageClickIntent.f8811a, null, null, null, false, null, null, null, 32639);
            case 5:
                TicketSummaryIntent.OnMultiModalFareLegClicked onMultiModalFareLegClicked = (TicketSummaryIntent.OnMultiModalFareLegClicked) this.b;
                TicketSummaryDataState state = (TicketSummaryDataState) obj;
                Intrinsics.i(state, "state");
                LinkedHashSet linkedHashSetF0 = CollectionsKt.F0(state.m);
                int i = onMultiModalFareLegClicked.f8812a;
                boolean zContains = linkedHashSetF0.contains(Integer.valueOf(i));
                Integer numValueOf = Integer.valueOf(i);
                if (zContains) {
                    linkedHashSetF0.remove(numValueOf);
                } else {
                    linkedHashSetF0.add(numValueOf);
                }
                return TicketSummaryDataState.a(state, null, false, false, false, null, null, null, null, null, null, null, false, linkedHashSetF0, null, null, 28671);
            case 6:
                final ExoPlayer exoPlayer = (ExoPlayer) this.b;
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.i(DisposableEffect, "$this$DisposableEffect");
                return new DisposableEffectResult() { // from class: app.chalo.titoridedetail.ui.compose.TitoRideDataScreenKt$TitoRideDataScreen$lambda$6$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        ExoPlayer exoPlayer2 = exoPlayer;
                        exoPlayer2.stop();
                        exoPlayer2.release();
                    }
                };
            case 7:
                TitoRideDetailsViewState titoRideDetailsViewState = (TitoRideDetailsViewState) this.b;
                AnimatedContentTransitionScope AnimatedContent = (AnimatedContentTransitionScope) obj;
                Intrinsics.i(AnimatedContent, "$this$AnimatedContent");
                TITORideDetailScreenType viewType = titoRideDetailsViewState.b;
                Intrinsics.i(viewType, "viewType");
                int i2 = TitoRideDataScreenKt.WhenMappings.f9729a[viewType.ordinal()];
                if (i2 == 1) {
                    AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.INSTANCE;
                    return AnimatedContentKt.togetherWith(AnimatedContentTransitionScope.CC.c(AnimatedContent, companion.m56getRightDKzdypw(), AnimationSpecKt.tween$default(250, 0, null, 6, null), null, 4, null), AnimatedContentTransitionScope.CC.d(AnimatedContent, companion.m56getRightDKzdypw(), AnimationSpecKt.tween$default(250, 0, null, 6, null), null, 4, null));
                }
                if (i2 == 2) {
                    AnimatedContentTransitionScope.SlideDirection.Companion companion2 = AnimatedContentTransitionScope.SlideDirection.INSTANCE;
                    return AnimatedContentKt.togetherWith(AnimatedContentTransitionScope.CC.c(AnimatedContent, companion2.m58getUpDKzdypw(), AnimationSpecKt.tween$default(ServiceStarter.ERROR_UNKNOWN, 0, null, 6, null), null, 4, null), AnimatedContentTransitionScope.CC.d(AnimatedContent, companion2.m53getDownDKzdypw(), AnimationSpecKt.tween$default(ServiceStarter.ERROR_UNKNOWN, 0, null, 6, null), null, 4, null));
                }
                if (i2 == 3) {
                    return AnimatedContentKt.togetherWith(AnimatedContentTransitionScope.CC.c(AnimatedContent, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m55getLeftDKzdypw(), AnimationSpecKt.tween$default(250, 0, null, 6, null), null, 4, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                }
                if (i2 == 4) {
                    return ContentAnimationTransitionSpecKt.d(AnimatedContent);
                }
                throw new NoWhenBranchMatchedException();
            case 8:
                Tito_validation_tableQueries tito_validation_tableQueries = (Tito_validation_tableQueries) this.b;
                SqlCursor cursor = (SqlCursor) obj;
                Intrinsics.i(cursor, "cursor");
                return (TitoValidationStatus) cb0.g(cursor, 0, tito_validation_tableQueries.b.f2022a);
            case 9:
                MetroGroupLegAppModel metroGroupLegAppModel = (MetroGroupLegAppModel) this.b;
                TripPlannerDetailsState it3 = (TripPlannerDetailsState) obj;
                Intrinsics.i(it3, "it");
                return TripPlannerDetailsState.a(it3, null, null, null, null, null, null, null, new TripPlannerDetailsBottomSheetType.MetroTicketPurchaseBottomSheet(metroGroupLegAppModel), 255);
            case 10:
                TripPlannerDetailsComponent tripPlannerDetailsComponent = (TripPlannerDetailsComponent) this.b;
                TripPlannerDetailsIntent it4 = (TripPlannerDetailsIntent) obj;
                Intrinsics.i(it4, "it");
                tripPlannerDetailsComponent.S0(it4);
                return Unit.f17538a;
            case 11:
                return TripPlannerResultsState.a((TripPlannerResultsState) obj, null, null, null, null, false, null, false, null, null, null, null, null, null, ((TripPlannerResultIntent.QuickFilterTabClickedIntent) this.b).f4776a, false, null, false, false, false, false, 319487);
            case 12:
                TripleSerializer tripleSerializer = (TripleSerializer) this.b;
                ClassSerialDescriptorBuilder buildClassSerialDescriptor = (ClassSerialDescriptorBuilder) obj;
                Intrinsics.i(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                ClassSerialDescriptorBuilder.b(buildClassSerialDescriptor, "first", tripleSerializer.f18173a.getDescriptor());
                ClassSerialDescriptorBuilder.b(buildClassSerialDescriptor, "second", tripleSerializer.b.getDescriptor());
                ClassSerialDescriptorBuilder.b(buildClassSerialDescriptor, "third", tripleSerializer.c.getDescriptor());
                return Unit.f17538a;
            case 13:
                TypeReference typeReference = (TypeReference) this.b;
                KTypeProjection it5 = (KTypeProjection) obj;
                Intrinsics.i(it5, "it");
                typeReference.getClass();
                KVariance kVariance = it5.f17639a;
                KType kType = it5.b;
                if (kVariance == null) {
                    return ProxyConfig.MATCH_ALL_SCHEMES;
                }
                TypeReference typeReference2 = kType instanceof TypeReference ? (TypeReference) kType : null;
                String strValueOf = (typeReference2 == null || (strB = typeReference2.b(true)) == null) ? String.valueOf(kType) : strB;
                int i3 = TypeReference.WhenMappings.f17622a[kVariance.ordinal()];
                if (i3 == 1) {
                    return strValueOf;
                }
                if (i3 == 2) {
                    return "in ".concat(strValueOf);
                }
                if (i3 == 3) {
                    return "out ".concat(strValueOf);
                }
                throw new NoWhenBranchMatchedException();
            case 14:
                UniversalPickerIntent.SearchBarTextChangeIntent searchBarTextChangeIntent = (UniversalPickerIntent.SearchBarTextChangeIntent) this.b;
                UniversalPickerViewState it6 = (UniversalPickerViewState) obj;
                Intrinsics.i(it6, "it");
                return UniversalPickerViewState.a(it6, null, null, null, false, false, null, null, !Intrinsics.d(it6.k, searchBarTextChangeIntent.f5075a), false, false, searchBarTextChangeIntent.f5075a, null, null, null, null, null, false, null, false, false, null, null, null, 8386943);
            case 15:
                UserConsentIntent.WebViewPageLoadIntent webViewPageLoadIntent = (UserConsentIntent.WebViewPageLoadIntent) this.b;
                UserConsentDataState it7 = (UserConsentDataState) obj;
                Intrinsics.i(it7, "it");
                return UserConsentDataState.a(it7, null, null, null, false, null, false, webViewPageLoadIntent.f5358a, false, 191);
            case 16:
                ((UserConsentComponent) this.b).L0(new UserConsentIntent.WebViewPageLoadIntent(true));
                return Unit.f17538a;
            case 17:
                UserProfileFormIntent.NameEntered nameEntered = (UserProfileFormIntent.NameEntered) this.b;
                UserProfileFormDataState it8 = (UserProfileFormDataState) obj;
                Intrinsics.i(it8, "it");
                String str = nameEntered.f10364a;
                List list = it8.n;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!Intrinsics.d(((Pair) obj2).d(), UserProfileFieldType.NameField.f10345a)) {
                        arrayList.add(obj2);
                    }
                }
                return UserProfileFormDataState.a(it8, str, null, null, null, null, null, null, null, false, null, arrayList, 8190);
            case 18:
                UserProfileFormIntent.EmailIdEntered emailIdEntered = (UserProfileFormIntent.EmailIdEntered) this.b;
                UserProfileFormDataState it9 = (UserProfileFormDataState) obj;
                Intrinsics.i(it9, "it");
                String str2 = emailIdEntered.f10360a;
                List list2 = it9.n;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (!Intrinsics.d(((Pair) obj3).d(), UserProfileFieldType.EmailField.f10344a)) {
                        arrayList2.add(obj3);
                    }
                }
                return UserProfileFormDataState.a(it9, null, null, str2, null, null, null, null, null, false, null, arrayList2, 8187);
            case 19:
                UserProfileFormIntent.GenderSelected genderSelected = (UserProfileFormIntent.GenderSelected) this.b;
                UserProfileFormDataState it10 = (UserProfileFormDataState) obj;
                Intrinsics.i(it10, "it");
                return UserProfileFormDataState.a(it10, null, genderSelected.f10362a, null, null, null, null, null, null, false, null, null, 16125);
            case 20:
                UserProfileFormIntent.AgeEntered ageEntered = (UserProfileFormIntent.AgeEntered) this.b;
                UserProfileFormDataState it11 = (UserProfileFormDataState) obj;
                Intrinsics.i(it11, "it");
                String str3 = ageEntered.f10353a;
                List list3 = it11.n;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list3) {
                    if (!Intrinsics.d(((Pair) obj4).d(), UserProfileFieldType.AgeField.f10343a)) {
                        arrayList3.add(obj4);
                    }
                }
                return UserProfileFormDataState.a(it11, null, null, null, str3, null, null, null, null, false, null, arrayList3, 8183);
            case 21:
                UserProfileFormIntent.DobSelected dobSelected = (UserProfileFormIntent.DobSelected) this.b;
                UserProfileFormDataState it12 = (UserProfileFormDataState) obj;
                Intrinsics.i(it12, "it");
                Long l = dobSelected.f10359a;
                List list4 = it12.n;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : list4) {
                    if (!Intrinsics.d(((Pair) obj5).d(), UserProfileFieldType.AgeField.f10343a)) {
                        arrayList4.add(obj5);
                    }
                }
                return UserProfileFormDataState.a(it12, null, null, null, null, l, null, null, null, false, null, arrayList4, 4079);
            case 22:
                UserProfileFormIntent.ProfilePhotoSelected profilePhotoSelected = (UserProfileFormIntent.ProfilePhotoSelected) this.b;
                UserProfileFormDataState it13 = (UserProfileFormDataState) obj;
                Intrinsics.i(it13, "it");
                return UserProfileFormDataState.a(it13, null, null, null, null, null, null, null, profilePhotoSelected.f10366a, false, null, null, 14847);
            case 23:
                UserProfileFormIntent.FieldFocusChanged fieldFocusChanged = (UserProfileFormIntent.FieldFocusChanged) this.b;
                UserProfileFormDataState state2 = (UserProfileFormDataState) obj;
                Intrinsics.i(state2, "state");
                UserProfileFieldType userProfileFieldType2 = state2.i;
                boolean z = fieldFocusChanged.b;
                UserProfileFieldType userProfileFieldType3 = fieldFocusChanged.f10361a;
                if (z) {
                    userProfileFieldType = userProfileFieldType3;
                } else {
                    if (Intrinsics.d(userProfileFieldType2, userProfileFieldType3)) {
                        userProfileFieldType2 = null;
                    }
                    userProfileFieldType = userProfileFieldType2;
                }
                return UserProfileFormDataState.a(state2, null, null, null, null, null, userProfileFieldType, null, null, false, null, null, 16127);
            case 24:
                return (UserProfileFormDataState) this.b;
            case 25:
                ((UserProfileFormComponent) this.b).I0(new UserProfileFormIntent.DobSelected((Long) obj));
                return Unit.f17538a;
            case 26:
                UserProfileTextField userProfileTextField = (UserProfileTextField) this.b;
                FocusState focusState = (FocusState) obj;
                Intrinsics.i(focusState, "focusState");
                userProfileTextField.c.b.getB().a(focusState.isFocused());
                return Unit.f17538a;
            case 27:
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.b;
                FeedbackTags it14 = (FeedbackTags) obj;
                Intrinsics.i(it14, "it");
                if (snapshotStateList.contains(it14)) {
                    snapshotStateList.remove(it14);
                } else {
                    snapshotStateList.add(it14);
                }
                return Unit.f17538a;
            case 28:
                User_commute_preference_place_table user_commute_preference_place_table = (User_commute_preference_place_table) this.b;
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, user_commute_preference_place_table.f2023a);
                execute.bindString(1, user_commute_preference_place_table.b);
                execute.bindString(2, user_commute_preference_place_table.c);
                execute.bindString(3, user_commute_preference_place_table.d);
                execute.bindString(4, user_commute_preference_place_table.e);
                execute.bindString(5, "PLACE");
                execute.bindString(6, user_commute_preference_place_table.f);
                execute.bindString(7, user_commute_preference_place_table.g);
                execute.bindString(8, user_commute_preference_place_table.h);
                execute.c(9, Double.valueOf(user_commute_preference_place_table.i));
                execute.c(10, Double.valueOf(user_commute_preference_place_table.j));
                execute.bindString(11, user_commute_preference_place_table.k);
                return Unit.f17538a;
            default:
                Function12 function12 = (Function12) this.b;
                SqlCursor sqlCursor = (SqlCursor) obj;
                String strI = cb0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                String strJ = cb0.j(string, sqlCursor, 2);
                String string2 = sqlCursor.getString(3);
                String strJ2 = cb0.j(string2, sqlCursor, 4);
                String string3 = sqlCursor.getString(5);
                String strJ3 = cb0.j(string3, sqlCursor, 6);
                String string4 = sqlCursor.getString(7);
                Intrinsics.f(string4);
                String string5 = sqlCursor.getString(8);
                Double d = sqlCursor.getDouble(9);
                Intrinsics.f(d);
                Double d2 = sqlCursor.getDouble(10);
                Intrinsics.f(d2);
                String string6 = sqlCursor.getString(11);
                Intrinsics.f(string6);
                return function12.b(strI, string, strJ, string2, strJ2, string3, strJ3, string4, string5, d, d2, string6);
        }
    }
}
