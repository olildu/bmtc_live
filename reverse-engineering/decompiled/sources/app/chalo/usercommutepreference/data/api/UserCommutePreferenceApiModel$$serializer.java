package app.chalo.usercommutepreference.data.api;

import com.google.firebase.analytics.FirebaseAnalytics;
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
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/usercommutepreference/data/api/UserCommutePreferenceApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/usercommutepreference/data/api/UserCommutePreferenceApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class UserCommutePreferenceApiModel$$serializer implements GeneratedSerializer<UserCommutePreferenceApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UserCommutePreferenceApiModel$$serializer f10229a;
    private static final SerialDescriptor descriptor;

    static {
        UserCommutePreferenceApiModel$$serializer userCommutePreferenceApiModel$$serializer = new UserCommutePreferenceApiModel$$serializer();
        f10229a = userCommutePreferenceApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.usercommutepreference.data.api.UserCommutePreferenceApiModel", userCommutePreferenceApiModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("origin", false);
        pluginGeneratedSerialDescriptor.j(FirebaseAnalytics.Param.DESTINATION, false);
        pluginGeneratedSerialDescriptor.j("leaveByTime", false);
        pluginGeneratedSerialDescriptor.j("leaveByVarianceMin", false);
        pluginGeneratedSerialDescriptor.j("reachByTime", false);
        pluginGeneratedSerialDescriptor.j("reachByVarianceMin", false);
        pluginGeneratedSerialDescriptor.j("commuteFrequency", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        UserCommutePreferenceStopPlaceApiModel$$serializer userCommutePreferenceStopPlaceApiModel$$serializer = UserCommutePreferenceStopPlaceApiModel$$serializer.f10237a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(userCommutePreferenceStopPlaceApiModel$$serializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(userCommutePreferenceStopPlaceApiModel$$serializer);
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{kSerializerC, kSerializerC2, BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(StringSerializer.f18170a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        UserCommutePreferenceStopPlaceApiModel userCommutePreferenceStopPlaceApiModel;
        UserCommutePreferenceStopPlaceApiModel userCommutePreferenceStopPlaceApiModel2;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 6;
        UserCommutePreferenceStopPlaceApiModel userCommutePreferenceStopPlaceApiModel3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            UserCommutePreferenceStopPlaceApiModel$$serializer userCommutePreferenceStopPlaceApiModel$$serializer = UserCommutePreferenceStopPlaceApiModel$$serializer.f10237a;
            UserCommutePreferenceStopPlaceApiModel userCommutePreferenceStopPlaceApiModel4 = (UserCommutePreferenceStopPlaceApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, userCommutePreferenceStopPlaceApiModel$$serializer, null);
            UserCommutePreferenceStopPlaceApiModel userCommutePreferenceStopPlaceApiModel5 = (UserCommutePreferenceStopPlaceApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, userCommutePreferenceStopPlaceApiModel$$serializer, null);
            LongSerializer longSerializer = LongSerializer.f18151a;
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, longSerializer, null);
            Long l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, longSerializer, null);
            Long l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, longSerializer, null);
            Long l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, longSerializer, null);
            userCommutePreferenceStopPlaceApiModel2 = userCommutePreferenceStopPlaceApiModel5;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, null);
            l4 = l8;
            l2 = l6;
            l3 = l7;
            l = l5;
            i = 127;
            userCommutePreferenceStopPlaceApiModel = userCommutePreferenceStopPlaceApiModel4;
        } else {
            boolean z = true;
            int i3 = 0;
            String str2 = null;
            UserCommutePreferenceStopPlaceApiModel userCommutePreferenceStopPlaceApiModel6 = null;
            Long l9 = null;
            Long l10 = null;
            Long l11 = null;
            Long l12 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        break;
                    case 0:
                        userCommutePreferenceStopPlaceApiModel3 = (UserCommutePreferenceStopPlaceApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, UserCommutePreferenceStopPlaceApiModel$$serializer.f10237a, userCommutePreferenceStopPlaceApiModel3);
                        i3 |= 1;
                        i2 = 6;
                        break;
                    case 1:
                        userCommutePreferenceStopPlaceApiModel6 = (UserCommutePreferenceStopPlaceApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, UserCommutePreferenceStopPlaceApiModel$$serializer.f10237a, userCommutePreferenceStopPlaceApiModel6);
                        i3 |= 2;
                        i2 = 6;
                        break;
                    case 2:
                        l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.f18151a, l9);
                        i3 |= 4;
                        break;
                    case 3:
                        l10 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.f18151a, l10);
                        i3 |= 8;
                        break;
                    case 4:
                        l11 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.f18151a, l11);
                        i3 |= 16;
                        break;
                    case 5:
                        l12 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.f18151a, l12);
                        i3 |= 32;
                        break;
                    case 6:
                        str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.f18170a, str2);
                        i3 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            str = str2;
            userCommutePreferenceStopPlaceApiModel = userCommutePreferenceStopPlaceApiModel3;
            userCommutePreferenceStopPlaceApiModel2 = userCommutePreferenceStopPlaceApiModel6;
            l = l9;
            l2 = l10;
            l3 = l11;
            l4 = l12;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UserCommutePreferenceApiModel(i, userCommutePreferenceStopPlaceApiModel, userCommutePreferenceStopPlaceApiModel2, l, l2, l3, l4, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        UserCommutePreferenceApiModel value = (UserCommutePreferenceApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UserCommutePreferenceStopPlaceApiModel$$serializer userCommutePreferenceStopPlaceApiModel$$serializer = UserCommutePreferenceStopPlaceApiModel$$serializer.f10237a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, userCommutePreferenceStopPlaceApiModel$$serializer, value.f10228a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, userCommutePreferenceStopPlaceApiModel$$serializer, value.b);
        LongSerializer longSerializer = LongSerializer.f18151a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, longSerializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, longSerializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, longSerializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, longSerializer, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, value.g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
