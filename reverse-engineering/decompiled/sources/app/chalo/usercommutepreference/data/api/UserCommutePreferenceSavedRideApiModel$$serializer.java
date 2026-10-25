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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/usercommutepreference/data/api/UserCommutePreferenceSavedRideApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/usercommutepreference/data/api/UserCommutePreferenceSavedRideApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class UserCommutePreferenceSavedRideApiModel$$serializer implements GeneratedSerializer<UserCommutePreferenceSavedRideApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UserCommutePreferenceSavedRideApiModel$$serializer f10235a;
    private static final SerialDescriptor descriptor;

    static {
        UserCommutePreferenceSavedRideApiModel$$serializer userCommutePreferenceSavedRideApiModel$$serializer = new UserCommutePreferenceSavedRideApiModel$$serializer();
        f10235a = userCommutePreferenceSavedRideApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.usercommutepreference.data.api.UserCommutePreferenceSavedRideApiModel", userCommutePreferenceSavedRideApiModel$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("origin", false);
        pluginGeneratedSerialDescriptor.j(FirebaseAnalytics.Param.DESTINATION, false);
        pluginGeneratedSerialDescriptor.j("preferredTime", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = BuiltinSerializersKt.c(StringSerializer.f18170a);
        UserCommutePreferencePlaceLocationApiModel$$serializer userCommutePreferencePlaceLocationApiModel$$serializer = UserCommutePreferencePlaceLocationApiModel$$serializer.f10233a;
        return new KSerializer[]{kSerializerC, BuiltinSerializersKt.c(userCommutePreferencePlaceLocationApiModel$$serializer), BuiltinSerializersKt.c(userCommutePreferencePlaceLocationApiModel$$serializer), BuiltinSerializersKt.c(LongSerializer.f18151a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        UserCommutePreferencePlaceLocationApiModel userCommutePreferencePlaceLocationApiModel;
        UserCommutePreferencePlaceLocationApiModel userCommutePreferencePlaceLocationApiModel2;
        Long l;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, null);
            UserCommutePreferencePlaceLocationApiModel$$serializer userCommutePreferencePlaceLocationApiModel$$serializer = UserCommutePreferencePlaceLocationApiModel$$serializer.f10233a;
            UserCommutePreferencePlaceLocationApiModel userCommutePreferencePlaceLocationApiModel3 = (UserCommutePreferencePlaceLocationApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, userCommutePreferencePlaceLocationApiModel$$serializer, null);
            UserCommutePreferencePlaceLocationApiModel userCommutePreferencePlaceLocationApiModel4 = (UserCommutePreferencePlaceLocationApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, userCommutePreferencePlaceLocationApiModel$$serializer, null);
            str = str3;
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.f18151a, null);
            userCommutePreferencePlaceLocationApiModel2 = userCommutePreferencePlaceLocationApiModel4;
            userCommutePreferencePlaceLocationApiModel = userCommutePreferencePlaceLocationApiModel3;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            UserCommutePreferencePlaceLocationApiModel userCommutePreferencePlaceLocationApiModel5 = null;
            UserCommutePreferencePlaceLocationApiModel userCommutePreferencePlaceLocationApiModel6 = null;
            Long l2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    userCommutePreferencePlaceLocationApiModel5 = (UserCommutePreferencePlaceLocationApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, UserCommutePreferencePlaceLocationApiModel$$serializer.f10233a, userCommutePreferencePlaceLocationApiModel5);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    userCommutePreferencePlaceLocationApiModel6 = (UserCommutePreferencePlaceLocationApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, UserCommutePreferencePlaceLocationApiModel$$serializer.f10233a, userCommutePreferencePlaceLocationApiModel6);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.f18151a, l2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str2;
            userCommutePreferencePlaceLocationApiModel = userCommutePreferencePlaceLocationApiModel5;
            userCommutePreferencePlaceLocationApiModel2 = userCommutePreferencePlaceLocationApiModel6;
            l = l2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UserCommutePreferenceSavedRideApiModel(i, str, userCommutePreferencePlaceLocationApiModel, userCommutePreferencePlaceLocationApiModel2, l);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        UserCommutePreferenceSavedRideApiModel value = (UserCommutePreferenceSavedRideApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, value.f10234a);
        UserCommutePreferencePlaceLocationApiModel$$serializer userCommutePreferencePlaceLocationApiModel$$serializer = UserCommutePreferencePlaceLocationApiModel$$serializer.f10233a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, userCommutePreferencePlaceLocationApiModel$$serializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, userCommutePreferencePlaceLocationApiModel$$serializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.f18151a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
