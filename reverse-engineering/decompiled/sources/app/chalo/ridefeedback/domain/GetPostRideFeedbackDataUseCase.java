package app.chalo.ridefeedback.domain;

import app.chalo.ridehailing.data.app.PostRideFeedbackSubtagConfigData;
import app.chalo.ridehailing.data.app.RideHailingRemoteConfigAppModel;
import app.chalo.ridehailing.data.app.RideHailingRemoteConfigModel;
import app.chalo.ridehailing.data.app.UserFeedbackRatingConfigData;
import app.chalo.ridehailing.data.app.UserFeedbackReasonConfigData;
import app.chalo.ridehailing.feedback.RatingReaction;
import app.chalo.ridehailing.feedback.UserFeedbackRatingData;
import app.chalo.ridehailing.feedback.UserFeedbackReasonData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridefeedback/domain/GetPostRideFeedbackDataUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetPostRideFeedbackDataUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchRideFeedbackRemoteConfigListUseCase f9079a;

    public GetPostRideFeedbackDataUseCase(FetchRideFeedbackRemoteConfigListUseCase fetchRideFeedbackRemoteConfigListUseCase) {
        this.f9079a = fetchRideFeedbackRemoteConfigListUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        GetPostRideFeedbackDataUseCase$invoke$1 getPostRideFeedbackDataUseCase$invoke$1;
        String str3;
        Object objA;
        String str4;
        Object next;
        Object next2;
        RatingReaction next3;
        boolean z;
        if (continuationImpl instanceof GetPostRideFeedbackDataUseCase$invoke$1) {
            getPostRideFeedbackDataUseCase$invoke$1 = (GetPostRideFeedbackDataUseCase$invoke$1) continuationImpl;
            int i = getPostRideFeedbackDataUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getPostRideFeedbackDataUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getPostRideFeedbackDataUseCase$invoke$1 = new GetPostRideFeedbackDataUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getPostRideFeedbackDataUseCase$invoke$1 = new GetPostRideFeedbackDataUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = getPostRideFeedbackDataUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getPostRideFeedbackDataUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            str3 = str;
            getPostRideFeedbackDataUseCase$invoke$1.L$0 = str3;
            getPostRideFeedbackDataUseCase$invoke$1.L$1 = str2;
            getPostRideFeedbackDataUseCase$invoke$1.label = 1;
            objA = this.f9079a.a(getPostRideFeedbackDataUseCase$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            str4 = str2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str4 = (String) getPostRideFeedbackDataUseCase$invoke$1.L$1;
            String str5 = (String) getPostRideFeedbackDataUseCase$invoke$1.L$0;
            ResultKt.b(obj);
            objA = obj;
            str3 = str5;
        }
        Iterator it = ((Iterable) objA).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            RideHailingRemoteConfigModel rideHailingRemoteConfigModel = (RideHailingRemoteConfigModel) next;
            if (Intrinsics.d(rideHailingRemoteConfigModel.f9115a, str3) && Intrinsics.d(rideHailingRemoteConfigModel.b, str4)) {
                break;
            }
        }
        RideHailingRemoteConfigModel rideHailingRemoteConfigModel2 = (RideHailingRemoteConfigModel) next;
        if (rideHailingRemoteConfigModel2 == null || rideHailingRemoteConfigModel2.c.isEmpty()) {
            RideHailingRemoteConfigModel.INSTANCE.getClass();
            Iterator it2 = RideHailingRemoteConfigModel.m.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                RideHailingRemoteConfigModel rideHailingRemoteConfigModel3 = (RideHailingRemoteConfigModel) next2;
                if (Intrinsics.d(rideHailingRemoteConfigModel3.f9115a, str3) && Intrinsics.d(rideHailingRemoteConfigModel3.b, str4)) {
                    break;
                }
            }
            rideHailingRemoteConfigModel2 = (RideHailingRemoteConfigModel) next2;
        }
        if (rideHailingRemoteConfigModel2 == null) {
            return null;
        }
        String str6 = rideHailingRemoteConfigModel2.f9115a;
        String str7 = rideHailingRemoteConfigModel2.b;
        List list = rideHailingRemoteConfigModel2.c;
        int i3 = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            UserFeedbackRatingConfigData userFeedbackRatingConfigData = (UserFeedbackRatingConfigData) it3.next();
            RatingReaction.Companion companion = RatingReaction.INSTANCE;
            int i4 = userFeedbackRatingConfigData.f9119a;
            companion.getClass();
            Iterator<RatingReaction> it4 = RatingReaction.getEntries().iterator();
            do {
                if (!it4.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it4.next();
            } while (next3.getId() != i4);
            RatingReaction ratingReaction = next3;
            if (ratingReaction == null) {
                ratingReaction = RatingReaction.NEUTRAL;
            }
            String str8 = userFeedbackRatingConfigData.b;
            List list2 = userFeedbackRatingConfigData.c;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list2, i3));
            int i5 = 0;
            for (Object obj2 : list2) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                UserFeedbackReasonConfigData userFeedbackReasonConfigData = (UserFeedbackReasonConfigData) obj2;
                String str9 = userFeedbackReasonConfigData.f9121a;
                boolean z2 = userFeedbackReasonConfigData.b;
                List list3 = userFeedbackReasonConfigData.c;
                if (list3.isEmpty()) {
                    z = false;
                } else {
                    List list4 = list3;
                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                        Iterator it5 = list4.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                if (((PostRideFeedbackSubtagConfigData) it5.next()).c != null) {
                                    z = false;
                                }
                            }
                        }
                    }
                    z = true;
                }
                List list5 = list3;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.v(list5, i3));
                Iterator it6 = list5.iterator();
                while (it6.hasNext()) {
                    PostRideFeedbackSubtagConfigData postRideFeedbackSubtagConfigData = (PostRideFeedbackSubtagConfigData) it6.next();
                    Boolean bool = postRideFeedbackSubtagConfigData.c;
                    Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : z);
                    Iterator it7 = it6;
                    String id = postRideFeedbackSubtagConfigData.f9104a;
                    String label = postRideFeedbackSubtagConfigData.b;
                    Intrinsics.i(id, "id");
                    Intrinsics.i(label, "label");
                    arrayList3.add(new PostRideFeedbackSubtagConfigData(id, label, boolValueOf));
                    it6 = it7;
                    it3 = it3;
                }
                arrayList2.add(new UserFeedbackReasonData(i5, str9, arrayList3, false, z2));
                i5 = i6;
                i3 = 10;
            }
            arrayList.add(new UserFeedbackRatingData(str8, ratingReaction, false, arrayList2));
            it3 = it3;
            i3 = 10;
        }
        return new RideHailingRemoteConfigAppModel(str6, str7, arrayList);
    }
}
