package app.chalo.chalobususerprofile.data.model;

import app.chalo.recent.model.app.RecentPlaceAppModel;
import defpackage.pk0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/chalobususerprofile/data/model/PBUserProfileSurveyPreference;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PBUserProfileSurveyPreference {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecentPlaceAppModel f1196a;
    public final RecentPlaceAppModel b;
    public final HomeWorkTimingModel c;
    public final TravelFrequencyModel d;
    public final Long e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/chalobususerprofile/data/model/PBUserProfileSurveyPreference$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/chalobususerprofile/data/model/PBUserProfileSurveyPreference;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PBUserProfileSurveyPreference> serializer() {
            return PBUserProfileSurveyPreference$$serializer.f1197a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1198a;

        static {
            int[] iArr = new int[SurveyStep.values().length];
            try {
                iArr[SurveyStep.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyStep.WORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyStep.TIMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SurveyStep.FREQUENCY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1198a = iArr;
        }
    }

    public /* synthetic */ PBUserProfileSurveyPreference(int i, RecentPlaceAppModel recentPlaceAppModel, RecentPlaceAppModel recentPlaceAppModel2, HomeWorkTimingModel homeWorkTimingModel, TravelFrequencyModel travelFrequencyModel, Long l) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(PBUserProfileSurveyPreference$$serializer.f1197a.getDescriptor(), i, 15);
            throw null;
        }
        this.f1196a = recentPlaceAppModel;
        this.b = recentPlaceAppModel2;
        this.c = homeWorkTimingModel;
        this.d = travelFrequencyModel;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l;
        }
    }

    public static PBUserProfileSurveyPreference a(PBUserProfileSurveyPreference pBUserProfileSurveyPreference, RecentPlaceAppModel recentPlaceAppModel, RecentPlaceAppModel recentPlaceAppModel2, HomeWorkTimingModel homeWorkTimingModel, TravelFrequencyModel travelFrequencyModel, int i) {
        if ((i & 1) != 0) {
            recentPlaceAppModel = pBUserProfileSurveyPreference.f1196a;
        }
        RecentPlaceAppModel recentPlaceAppModel3 = recentPlaceAppModel;
        if ((i & 2) != 0) {
            recentPlaceAppModel2 = pBUserProfileSurveyPreference.b;
        }
        RecentPlaceAppModel recentPlaceAppModel4 = recentPlaceAppModel2;
        if ((i & 4) != 0) {
            homeWorkTimingModel = pBUserProfileSurveyPreference.c;
        }
        HomeWorkTimingModel homeWorkTimingModel2 = homeWorkTimingModel;
        if ((i & 8) != 0) {
            travelFrequencyModel = pBUserProfileSurveyPreference.d;
        }
        return new PBUserProfileSurveyPreference(recentPlaceAppModel3, recentPlaceAppModel4, homeWorkTimingModel2, travelFrequencyModel, pBUserProfileSurveyPreference.e);
    }

    public final Set b() {
        SurveyStep.INSTANCE.getClass();
        List list = SurveyStep.ORDERED;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int i = WhenMappings.f1198a[((SurveyStep) obj).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (this.d != null) {
                            arrayList.add(obj);
                        }
                    } else if (this.c != null) {
                        arrayList.add(obj);
                    }
                } else if (this.b != null) {
                    arrayList.add(obj);
                }
            } else if (this.f1196a != null) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.G0(arrayList);
    }

    public final ArrayList c() {
        SurveyStep.INSTANCE.getClass();
        List list = SurveyStep.ORDERED;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!b().contains((SurveyStep) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBUserProfileSurveyPreference)) {
            return false;
        }
        PBUserProfileSurveyPreference pBUserProfileSurveyPreference = (PBUserProfileSurveyPreference) obj;
        return Intrinsics.d(this.f1196a, pBUserProfileSurveyPreference.f1196a) && Intrinsics.d(this.b, pBUserProfileSurveyPreference.b) && Intrinsics.d(this.c, pBUserProfileSurveyPreference.c) && Intrinsics.d(this.d, pBUserProfileSurveyPreference.d) && Intrinsics.d(this.e, pBUserProfileSurveyPreference.e);
    }

    public final int hashCode() {
        RecentPlaceAppModel recentPlaceAppModel = this.f1196a;
        int iHashCode = (recentPlaceAppModel == null ? 0 : recentPlaceAppModel.hashCode()) * 31;
        RecentPlaceAppModel recentPlaceAppModel2 = this.b;
        int iHashCode2 = (iHashCode + (recentPlaceAppModel2 == null ? 0 : recentPlaceAppModel2.hashCode())) * 31;
        HomeWorkTimingModel homeWorkTimingModel = this.c;
        int iHashCode3 = (iHashCode2 + (homeWorkTimingModel == null ? 0 : homeWorkTimingModel.hashCode())) * 31;
        TravelFrequencyModel travelFrequencyModel = this.d;
        int iHashCode4 = (iHashCode3 + (travelFrequencyModel == null ? 0 : travelFrequencyModel.f1200a.hashCode())) * 31;
        Long l = this.e;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PBUserProfileSurveyPreference(homeLocation=");
        sb.append(this.f1196a);
        sb.append(", workLocation=");
        sb.append(this.b);
        sb.append(", homeWorkTiming=");
        sb.append(this.c);
        sb.append(", travelFrequency=");
        sb.append(this.d);
        sb.append(", updatedAt=");
        return pk0.l(sb, this.e, ")");
    }

    public PBUserProfileSurveyPreference(RecentPlaceAppModel recentPlaceAppModel, RecentPlaceAppModel recentPlaceAppModel2, HomeWorkTimingModel homeWorkTimingModel, TravelFrequencyModel travelFrequencyModel, Long l) {
        this.f1196a = recentPlaceAppModel;
        this.b = recentPlaceAppModel2;
        this.c = homeWorkTimingModel;
        this.d = travelFrequencyModel;
        this.e = l;
    }

    public /* synthetic */ PBUserProfileSurveyPreference() {
        this(null, null, null, null, null);
    }
}
