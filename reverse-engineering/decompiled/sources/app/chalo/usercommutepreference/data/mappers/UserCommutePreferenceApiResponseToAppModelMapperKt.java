package app.chalo.usercommutepreference.data.mappers;

import app.chalo.location.LatLng;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusSelectedLocationType;
import app.chalo.usercommutepreference.data.api.UserCommutePreferencePlaceLocationApiModel;
import app.chalo.usercommutepreference.data.api.UserCommutePreferenceStopPlaceApiModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceStopPlaceAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceStopPlaceResultType;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceTag;
import app.chalo.usercommutepreference.data.remote.request.SaveStopPlaceRequestApiModel;
import app.chalo.usercommutepreference.data.remote.request.UserCommutePreferencePlaceLocationApiRequestModel;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UserCommutePreferenceApiResponseToAppModelMapperKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10240a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[UserCommutePreferenceStopPlaceResultType.values().length];
            try {
                iArr[UserCommutePreferenceStopPlaceResultType.PLACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserCommutePreferenceStopPlaceResultType.STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10240a = iArr;
            int[] iArr2 = new int[PremiumBusSelectedLocationType.values().length];
            try {
                iArr2[PremiumBusSelectedLocationType.PLACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PremiumBusSelectedLocationType.STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PremiumBusSelectedLocationType.LOCATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    public static final UserCommutePreferencePlaceLocationAppModel a(UserCommutePreferencePlaceLocationApiModel userCommutePreferencePlaceLocationApiModel, String str) {
        String str2;
        String str3;
        Intrinsics.i(userCommutePreferencePlaceLocationApiModel, "<this>");
        String str4 = userCommutePreferencePlaceLocationApiModel.j;
        Double d = userCommutePreferencePlaceLocationApiModel.f;
        Double d2 = userCommutePreferencePlaceLocationApiModel.e;
        String str5 = userCommutePreferencePlaceLocationApiModel.f10232a;
        UserCommutePreferenceStopPlaceResultType.Companion companion = UserCommutePreferenceStopPlaceResultType.INSTANCE;
        String str6 = userCommutePreferencePlaceLocationApiModel.h;
        companion.getClass();
        UserCommutePreferenceStopPlaceResultType userCommutePreferenceStopPlaceResultTypeA = UserCommutePreferenceStopPlaceResultType.Companion.a(str6);
        if (userCommutePreferenceStopPlaceResultTypeA == null) {
            return null;
        }
        int i = WhenMappings.f10240a[userCommutePreferenceStopPlaceResultTypeA.ordinal()];
        if (i == 1) {
            if (str5 == null || (str2 = userCommutePreferencePlaceLocationApiModel.b) == null || d2 == null) {
                return null;
            }
            double dDoubleValue = d2.doubleValue();
            if (d == null) {
                return null;
            }
            double dDoubleValue2 = d.doubleValue();
            if (str4 == null) {
                return null;
            }
            return new UserCommutePreferencePlaceLocationAppModel.Place(str5, str, str2, dDoubleValue, dDoubleValue2, str4, userCommutePreferenceStopPlaceResultTypeA);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (str5 == null || (str3 = userCommutePreferencePlaceLocationApiModel.c) == null) {
            return null;
        }
        String str7 = userCommutePreferencePlaceLocationApiModel.g;
        if (d2 == null) {
            return null;
        }
        double dDoubleValue3 = d2.doubleValue();
        if (d == null) {
            return null;
        }
        double dDoubleValue4 = d.doubleValue();
        if (str4 == null) {
            return null;
        }
        return new UserCommutePreferencePlaceLocationAppModel.Stop(str5, str, str3, str7, dDoubleValue3, dDoubleValue4, str4, userCommutePreferenceStopPlaceResultTypeA);
    }

    public static final UserCommutePreferenceStopPlaceAppModel b(UserCommutePreferenceStopPlaceApiModel userCommutePreferenceStopPlaceApiModel, String str) {
        UserCommutePreferenceTag userCommutePreferenceTagValueOf;
        String str2;
        Intrinsics.i(userCommutePreferenceStopPlaceApiModel, "<this>");
        UserCommutePreferenceTag.Companion companion = UserCommutePreferenceTag.INSTANCE;
        String str3 = userCommutePreferenceStopPlaceApiModel.b;
        companion.getClass();
        if (str3 != null) {
            try {
                String upperCase = str3.toUpperCase(Locale.ROOT);
                Intrinsics.h(upperCase, "toUpperCase(...)");
                userCommutePreferenceTagValueOf = UserCommutePreferenceTag.valueOf(upperCase);
            } catch (IllegalArgumentException unused) {
                userCommutePreferenceTagValueOf = null;
            }
        } else {
            userCommutePreferenceTagValueOf = null;
        }
        if (userCommutePreferenceTagValueOf != null) {
            UserCommutePreferencePlaceLocationApiModel userCommutePreferencePlaceLocationApiModel = userCommutePreferenceStopPlaceApiModel.d;
            UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModelA = userCommutePreferencePlaceLocationApiModel != null ? a(userCommutePreferencePlaceLocationApiModel, str) : null;
            String str4 = userCommutePreferenceStopPlaceApiModel.f10236a;
            if (str4 != null && (str2 = userCommutePreferenceStopPlaceApiModel.c) != null && userCommutePreferencePlaceLocationAppModelA != null) {
                return new UserCommutePreferenceStopPlaceAppModel(str4, userCommutePreferenceTagValueOf, str2, userCommutePreferencePlaceLocationAppModelA);
            }
        }
        return null;
    }

    public static final SaveStopPlaceRequestApiModel c(UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModel) {
        UserCommutePreferencePlaceLocationApiRequestModel userCommutePreferencePlaceLocationApiRequestModel;
        Intrinsics.i(userCommutePreferenceStopPlaceAppModel, "<this>");
        UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel = userCommutePreferenceStopPlaceAppModel.d;
        if (userCommutePreferencePlaceLocationAppModel instanceof UserCommutePreferencePlaceLocationAppModel.Place) {
            userCommutePreferencePlaceLocationApiRequestModel = new UserCommutePreferencePlaceLocationApiRequestModel(((UserCommutePreferencePlaceLocationAppModel.Place) userCommutePreferencePlaceLocationAppModel).b, ((UserCommutePreferencePlaceLocationAppModel.Place) userCommutePreferencePlaceLocationAppModel).d, null, ((UserCommutePreferencePlaceLocationAppModel.Place) userCommutePreferencePlaceLocationAppModel).e, ((UserCommutePreferencePlaceLocationAppModel.Place) userCommutePreferencePlaceLocationAppModel).f, null, ((UserCommutePreferencePlaceLocationAppModel.Place) userCommutePreferencePlaceLocationAppModel).h.name(), ((UserCommutePreferencePlaceLocationAppModel.Place) userCommutePreferencePlaceLocationAppModel).g);
        } else {
            if (!(userCommutePreferencePlaceLocationAppModel instanceof UserCommutePreferencePlaceLocationAppModel.Stop)) {
                if (userCommutePreferencePlaceLocationAppModel == null) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            userCommutePreferencePlaceLocationApiRequestModel = new UserCommutePreferencePlaceLocationApiRequestModel(((UserCommutePreferencePlaceLocationAppModel.Stop) userCommutePreferencePlaceLocationAppModel).b, ((UserCommutePreferencePlaceLocationAppModel.Stop) userCommutePreferencePlaceLocationAppModel).d, ((UserCommutePreferencePlaceLocationAppModel.Stop) userCommutePreferencePlaceLocationAppModel).d, ((UserCommutePreferencePlaceLocationAppModel.Stop) userCommutePreferencePlaceLocationAppModel).f, ((UserCommutePreferencePlaceLocationAppModel.Stop) userCommutePreferencePlaceLocationAppModel).g, ((UserCommutePreferencePlaceLocationAppModel.Stop) userCommutePreferencePlaceLocationAppModel).e, ((UserCommutePreferencePlaceLocationAppModel.Stop) userCommutePreferencePlaceLocationAppModel).i.name(), ((UserCommutePreferencePlaceLocationAppModel.Stop) userCommutePreferencePlaceLocationAppModel).h);
        }
        return new SaveStopPlaceRequestApiModel(userCommutePreferenceStopPlaceAppModel.b.name(), userCommutePreferenceStopPlaceAppModel.c, userCommutePreferencePlaceLocationApiRequestModel);
    }

    public static final UserCommutePreferencePlaceLocationApiRequestModel d(UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel) {
        Intrinsics.i(userCommutePreferencePlaceLocationAppModel, "<this>");
        if (userCommutePreferencePlaceLocationAppModel instanceof UserCommutePreferencePlaceLocationAppModel.Place) {
            UserCommutePreferencePlaceLocationAppModel.Place place = (UserCommutePreferencePlaceLocationAppModel.Place) userCommutePreferencePlaceLocationAppModel;
            return new UserCommutePreferencePlaceLocationApiRequestModel(place.b, place.d, null, place.e, place.f, null, place.h.name(), place.g);
        }
        if (!(userCommutePreferencePlaceLocationAppModel instanceof UserCommutePreferencePlaceLocationAppModel.Stop)) {
            throw new NoWhenBranchMatchedException();
        }
        UserCommutePreferencePlaceLocationAppModel.Stop stop = (UserCommutePreferencePlaceLocationAppModel.Stop) userCommutePreferencePlaceLocationAppModel;
        String str = stop.b;
        String str2 = stop.d;
        return new UserCommutePreferencePlaceLocationApiRequestModel(str, str2, str2, stop.f, stop.g, stop.e, stop.i.name(), stop.h);
    }

    public static final UserCommutePreferencePlaceLocationAppModel e(PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, String str) {
        Intrinsics.i(pBStopPlaceSelectedAppModel, "<this>");
        String str2 = pBStopPlaceSelectedAppModel.c;
        String str3 = pBStopPlaceSelectedAppModel.d;
        LatLng latLng = pBStopPlaceSelectedAppModel.e;
        int i = WhenMappings.b[pBStopPlaceSelectedAppModel.f.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new UserCommutePreferencePlaceLocationAppModel.Stop(pBStopPlaceSelectedAppModel.f7095a, str, pBStopPlaceSelectedAppModel.c, pBStopPlaceSelectedAppModel.d, latLng != null ? latLng.f5134a : 0.0d, latLng != null ? latLng.b : 0.0d, "searchPartnerChaloStop", UserCommutePreferenceStopPlaceResultType.STOP);
            }
            if (i == 3) {
                return new UserCommutePreferencePlaceLocationAppModel.Place(pBStopPlaceSelectedAppModel.f7095a, str, str3 == null ? str2 : str3, latLng != null ? latLng.f5134a : 0.0d, latLng != null ? latLng.b : 0.0d, "userLocation", UserCommutePreferenceStopPlaceResultType.PLACE);
            }
            throw new NoWhenBranchMatchedException();
        }
        String str4 = str2;
        String str5 = pBStopPlaceSelectedAppModel.f7095a;
        if (str3 != null) {
            str4 = str3;
        }
        return new UserCommutePreferencePlaceLocationAppModel.Place(str5, str, str4, latLng != null ? latLng.f5134a : 0.0d, latLng != null ? latLng.b : 0.0d, pBStopPlaceSelectedAppModel.b, UserCommutePreferenceStopPlaceResultType.PLACE);
    }
}
