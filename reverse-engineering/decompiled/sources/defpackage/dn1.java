package defpackage;

import app.chalo.constants.Source;
import app.chalo.login.data.models.response.DpdpaConsentInfoResponseApiModel$$serializer;
import app.chalo.login.data.models.response.UpdateUserConsentStatusRequestApiModel;
import app.chalo.login.userprofiling.data.UserProfilingHooksRuleConfig;
import app.chalo.login.userprofiling.data.UserProfilingHooksRuleConfig$$serializer;
import app.chalo.login.userprofiling.data.UserProfilingHooksRulesCityConfig;
import app.chalo.login.userprofiling.data.UserProfilingHooksRulesForCity;
import app.chalo.login.userprofiling.data.UserProfilingHooksRulesForCity$$serializer;
import app.chalo.models.userprofile.UserAgencyInfo;
import app.chalo.models.userprofile.UserAgencyInfo$$serializer;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.api.UserProfile;
import app.chalo.productpurchase.productselection.data.models.api.UnknownProductFareMappingApiResponseModel;
import app.chalo.ridehailing.data.app.PostRideFeedbackSubtagConfigData$$serializer;
import app.chalo.ridehailing.data.app.UserFeedbackRatingConfigData;
import app.chalo.ridehailing.data.app.UserFeedbackReasonConfigData;
import app.chalo.ridehailing.data.app.UserFeedbackReasonConfigData$$serializer;
import app.chalo.scenes.args.UserConsentScreenArgs;
import app.chalo.scenes.args.UserProfileFormArgs;
import app.chalo.usercommutepreference.data.api.UserCommutePreferenceApiResponseModel;
import app.chalo.usercommutepreference.data.api.UserCommutePreferenceSavedRideApiModel$$serializer;
import app.chalo.usercommutepreference.data.api.UserCommutePreferenceStopPlaceApiModel$$serializer;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel$Place$$serializer;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel$Stop$$serializer;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceStopPlaceResultType;
import app.chalo.userconsent.UserConsentFlowType;
import app.chalo.userconsent.UserConsentFlowType$ExistingUser$$serializer;
import app.chalo.userprofile.Gender;
import io.ktor.util.collections.ConcurrentSetKt$ConcurrentSet$1;
import j$.time.format.DateTimeFormatterBuilder;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.datetime.UtcOffsetJvmKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dn1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15480a;

    public /* synthetic */ dn1(int i) {
        this.f15480a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15480a) {
            case 0:
                UnknownProductFareMappingApiResponseModel.Companion companion = UnknownProductFareMappingApiResponseModel.Companion;
                return new ArrayListSerializer(BuiltinSerializersKt.c(StringSerializer.f18170a));
            case 1:
                return new ConcurrentSetKt$ConcurrentSet$1();
            case 2:
                return new ConcurrentSetKt$ConcurrentSet$1();
            case 3:
                return new ConcurrentSetKt$ConcurrentSet$1();
            case 4:
                return new ConcurrentSetKt$ConcurrentSet$1();
            case 5:
                UpdateUserConsentStatusRequestApiModel.Companion companion2 = UpdateUserConsentStatusRequestApiModel.INSTANCE;
                return new ArrayListSerializer(DpdpaConsentInfoResponseApiModel$$serializer.f5212a);
            case 6:
                UserAgencyInfo.Companion companion3 = UserAgencyInfo.Companion;
                return EnumsKt.b("app.chalo.models.userprofile.UserAgencyInfo.STATUS", UserAgencyInfo.STATUS.values());
            case 7:
                UserAgencyInfo.Companion companion4 = UserAgencyInfo.Companion;
                StringSerializer stringSerializer = StringSerializer.f18170a;
                return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
            case 8:
                UserAgencyInfo.Companion companion5 = UserAgencyInfo.Companion;
                StringSerializer stringSerializer2 = StringSerializer.f18170a;
                return new LinkedHashMapSerializer(stringSerializer2, stringSerializer2);
            case 9:
                UserCommutePreferenceApiResponseModel.Companion companion6 = UserCommutePreferenceApiResponseModel.INSTANCE;
                return new ArrayListSerializer(UserCommutePreferenceStopPlaceApiModel$$serializer.f10237a);
            case 10:
                UserCommutePreferenceApiResponseModel.Companion companion7 = UserCommutePreferenceApiResponseModel.INSTANCE;
                return new ArrayListSerializer(UserCommutePreferenceSavedRideApiModel$$serializer.f10235a);
            case 11:
                UserCommutePreferencePlaceLocationAppModel.Companion companion8 = UserCommutePreferencePlaceLocationAppModel.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel", Reflection.a(UserCommutePreferencePlaceLocationAppModel.class), new KClass[]{Reflection.a(UserCommutePreferencePlaceLocationAppModel.Place.class), Reflection.a(UserCommutePreferencePlaceLocationAppModel.Stop.class)}, new KSerializer[]{UserCommutePreferencePlaceLocationAppModel$Place$$serializer.f10250a, UserCommutePreferencePlaceLocationAppModel$Stop$$serializer.f10251a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 12:
                UserCommutePreferencePlaceLocationAppModel.Place.Companion companion9 = UserCommutePreferencePlaceLocationAppModel.Place.INSTANCE;
                return UserCommutePreferenceStopPlaceResultType.INSTANCE.serializer();
            case 13:
                UserCommutePreferencePlaceLocationAppModel.Stop.Companion companion10 = UserCommutePreferencePlaceLocationAppModel.Stop.INSTANCE;
                return UserCommutePreferenceStopPlaceResultType.INSTANCE.serializer();
            case 14:
                return UserCommutePreferenceStopPlaceResultType._init_$_anonymous_();
            case 15:
                UserConsentFlowType.Companion companion11 = UserConsentFlowType.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.userconsent.UserConsentFlowType", Reflection.a(UserConsentFlowType.class), new KClass[]{Reflection.a(UserConsentFlowType.ExistingUser.class), Reflection.a(UserConsentFlowType.FreshLogin.class)}, new KSerializer[]{UserConsentFlowType$ExistingUser$$serializer.f10302a, new ObjectSerializer("app.chalo.userconsent.UserConsentFlowType.FreshLogin", UserConsentFlowType.FreshLogin.INSTANCE, new Annotation[0])});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 16:
                return new ObjectSerializer("app.chalo.userconsent.UserConsentFlowType.FreshLogin", UserConsentFlowType.FreshLogin.INSTANCE, new Annotation[0]);
            case 17:
                UserConsentScreenArgs.Companion companion12 = UserConsentScreenArgs.INSTANCE;
                return UserConsentFlowType.INSTANCE.serializer();
            case 18:
                UserFeedbackRatingConfigData.Companion companion13 = UserFeedbackRatingConfigData.INSTANCE;
                return new ArrayListSerializer(UserFeedbackReasonConfigData$$serializer.f9122a);
            case 19:
                UserFeedbackReasonConfigData.Companion companion14 = UserFeedbackReasonConfigData.INSTANCE;
                return new ArrayListSerializer(PostRideFeedbackSubtagConfigData$$serializer.f9105a);
            case 20:
                UserProfile.Companion companion15 = UserProfile.INSTANCE;
                StringSerializer stringSerializer3 = StringSerializer.f18170a;
                return new LinkedHashMapSerializer(stringSerializer3, stringSerializer3);
            case 21:
                app.chalo.models.userprofile.UserProfile.Companion companion16 = app.chalo.models.userprofile.UserProfile.INSTANCE;
                return Gender.INSTANCE.serializer();
            case 22:
                app.chalo.models.userprofile.UserProfile.Companion companion17 = app.chalo.models.userprofile.UserProfile.INSTANCE;
                return new HashMapSerializer(StringSerializer.f18170a, UserAgencyInfo$$serializer.f5689a);
            case 23:
                UserProfileFormArgs.Companion companion18 = UserProfileFormArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            case 24:
                UserProfilingHooksRuleConfig.Companion companion19 = UserProfilingHooksRuleConfig.INSTANCE;
                return new ArrayListSerializer(LongSerializer.f18151a);
            case 25:
                UserProfilingHooksRulesCityConfig.Companion companion20 = UserProfilingHooksRulesCityConfig.INSTANCE;
                return new ArrayListSerializer(UserProfilingHooksRulesForCity$$serializer.f5373a);
            case 26:
                UserProfilingHooksRulesForCity.Companion companion21 = UserProfilingHooksRulesForCity.INSTANCE;
                return new ArrayListSerializer(UserProfilingHooksRuleConfig$$serializer.f5369a);
            case 27:
                Lazy lazy = UtcOffsetJvmKt.f17939a;
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
            case 28:
                Lazy lazy2 = UtcOffsetJvmKt.f17939a;
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
            default:
                Lazy lazy3 = UtcOffsetJvmKt.f17939a;
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
        }
    }
}
