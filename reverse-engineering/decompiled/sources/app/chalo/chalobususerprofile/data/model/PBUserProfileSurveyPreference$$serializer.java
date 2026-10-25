package app.chalo.chalobususerprofile.data.model;

import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.recent.model.app.RecentPlaceAppModel$$serializer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/chalobususerprofile/data/model/PBUserProfileSurveyPreference.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/chalobususerprofile/data/model/PBUserProfileSurveyPreference;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PBUserProfileSurveyPreference$$serializer implements GeneratedSerializer<PBUserProfileSurveyPreference> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PBUserProfileSurveyPreference$$serializer f1197a;
    private static final SerialDescriptor descriptor;

    static {
        PBUserProfileSurveyPreference$$serializer pBUserProfileSurveyPreference$$serializer = new PBUserProfileSurveyPreference$$serializer();
        f1197a = pBUserProfileSurveyPreference$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference", pBUserProfileSurveyPreference$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("homeLocation", false);
        pluginGeneratedSerialDescriptor.j("workLocation", false);
        pluginGeneratedSerialDescriptor.j("homeWorkTiming", false);
        pluginGeneratedSerialDescriptor.j("travelFrequency", false);
        pluginGeneratedSerialDescriptor.j("updatedAt", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        RecentPlaceAppModel$$serializer recentPlaceAppModel$$serializer = RecentPlaceAppModel$$serializer.f9002a;
        return new KSerializer[]{BuiltinSerializersKt.c(recentPlaceAppModel$$serializer), BuiltinSerializersKt.c(recentPlaceAppModel$$serializer), BuiltinSerializersKt.c(HomeWorkTimingModel$$serializer.f1195a), BuiltinSerializersKt.c(TravelFrequencyModel$$serializer.f1201a), BuiltinSerializersKt.c(LongSerializer.f18151a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        RecentPlaceAppModel recentPlaceAppModel;
        RecentPlaceAppModel recentPlaceAppModel2;
        HomeWorkTimingModel homeWorkTimingModel;
        TravelFrequencyModel travelFrequencyModel;
        Long l;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        RecentPlaceAppModel recentPlaceAppModel3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            RecentPlaceAppModel$$serializer recentPlaceAppModel$$serializer = RecentPlaceAppModel$$serializer.f9002a;
            RecentPlaceAppModel recentPlaceAppModel4 = (RecentPlaceAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, recentPlaceAppModel$$serializer, null);
            RecentPlaceAppModel recentPlaceAppModel5 = (RecentPlaceAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, recentPlaceAppModel$$serializer, null);
            HomeWorkTimingModel homeWorkTimingModel2 = (HomeWorkTimingModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, HomeWorkTimingModel$$serializer.f1195a, null);
            recentPlaceAppModel2 = recentPlaceAppModel5;
            travelFrequencyModel = (TravelFrequencyModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, TravelFrequencyModel$$serializer.f1201a, null);
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.f18151a, null);
            homeWorkTimingModel = homeWorkTimingModel2;
            i = 31;
            recentPlaceAppModel = recentPlaceAppModel4;
        } else {
            boolean z = true;
            int i2 = 0;
            RecentPlaceAppModel recentPlaceAppModel6 = null;
            HomeWorkTimingModel homeWorkTimingModel3 = null;
            TravelFrequencyModel travelFrequencyModel2 = null;
            Long l2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    recentPlaceAppModel3 = (RecentPlaceAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, RecentPlaceAppModel$$serializer.f9002a, recentPlaceAppModel3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    recentPlaceAppModel6 = (RecentPlaceAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, RecentPlaceAppModel$$serializer.f9002a, recentPlaceAppModel6);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    homeWorkTimingModel3 = (HomeWorkTimingModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, HomeWorkTimingModel$$serializer.f1195a, homeWorkTimingModel3);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    travelFrequencyModel2 = (TravelFrequencyModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, TravelFrequencyModel$$serializer.f1201a, travelFrequencyModel2);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.f18151a, l2);
                    i2 |= 16;
                }
            }
            i = i2;
            recentPlaceAppModel = recentPlaceAppModel3;
            recentPlaceAppModel2 = recentPlaceAppModel6;
            homeWorkTimingModel = homeWorkTimingModel3;
            travelFrequencyModel = travelFrequencyModel2;
            l = l2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PBUserProfileSurveyPreference(i, recentPlaceAppModel, recentPlaceAppModel2, homeWorkTimingModel, travelFrequencyModel, l);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PBUserProfileSurveyPreference value = (PBUserProfileSurveyPreference) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RecentPlaceAppModel$$serializer recentPlaceAppModel$$serializer = RecentPlaceAppModel$$serializer.f9002a;
        RecentPlaceAppModel recentPlaceAppModel = value.f1196a;
        Long l = value.e;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, recentPlaceAppModel$$serializer, recentPlaceAppModel);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, recentPlaceAppModel$$serializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, HomeWorkTimingModel$$serializer.f1195a, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, TravelFrequencyModel$$serializer.f1201a, value.d);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || l != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.f18151a, l);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
