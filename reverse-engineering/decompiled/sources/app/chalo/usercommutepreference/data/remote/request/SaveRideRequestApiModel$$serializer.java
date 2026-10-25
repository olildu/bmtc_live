package app.chalo.usercommutepreference.data.remote.request;

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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/usercommutepreference/data/remote/request/SaveRideRequestApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/usercommutepreference/data/remote/request/SaveRideRequestApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SaveRideRequestApiModel$$serializer implements GeneratedSerializer<SaveRideRequestApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SaveRideRequestApiModel$$serializer f10259a;
    private static final SerialDescriptor descriptor;

    static {
        SaveRideRequestApiModel$$serializer saveRideRequestApiModel$$serializer = new SaveRideRequestApiModel$$serializer();
        f10259a = saveRideRequestApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.usercommutepreference.data.remote.request.SaveRideRequestApiModel", saveRideRequestApiModel$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("origin", false);
        pluginGeneratedSerialDescriptor.j(FirebaseAnalytics.Param.DESTINATION, false);
        pluginGeneratedSerialDescriptor.j("preferredTime", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        UserCommutePreferencePlaceLocationApiRequestModel$$serializer userCommutePreferencePlaceLocationApiRequestModel$$serializer = UserCommutePreferencePlaceLocationApiRequestModel$$serializer.f10263a;
        return new KSerializer[]{BuiltinSerializersKt.c(StringSerializer.f18170a), userCommutePreferencePlaceLocationApiRequestModel$$serializer, userCommutePreferencePlaceLocationApiRequestModel$$serializer, LongSerializer.f18151a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        long jDecodeLongElement;
        UserCommutePreferencePlaceLocationApiRequestModel userCommutePreferencePlaceLocationApiRequestModel;
        UserCommutePreferencePlaceLocationApiRequestModel userCommutePreferencePlaceLocationApiRequestModel2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, null);
            UserCommutePreferencePlaceLocationApiRequestModel$$serializer userCommutePreferencePlaceLocationApiRequestModel$$serializer = UserCommutePreferencePlaceLocationApiRequestModel$$serializer.f10263a;
            UserCommutePreferencePlaceLocationApiRequestModel userCommutePreferencePlaceLocationApiRequestModel3 = (UserCommutePreferencePlaceLocationApiRequestModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, userCommutePreferencePlaceLocationApiRequestModel$$serializer, null);
            str = str3;
            i = 15;
            userCommutePreferencePlaceLocationApiRequestModel2 = (UserCommutePreferencePlaceLocationApiRequestModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, userCommutePreferencePlaceLocationApiRequestModel$$serializer, null);
            userCommutePreferencePlaceLocationApiRequestModel = userCommutePreferencePlaceLocationApiRequestModel3;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
        } else {
            long jDecodeLongElement2 = 0;
            boolean z = true;
            int i2 = 0;
            UserCommutePreferencePlaceLocationApiRequestModel userCommutePreferencePlaceLocationApiRequestModel4 = null;
            UserCommutePreferencePlaceLocationApiRequestModel userCommutePreferencePlaceLocationApiRequestModel5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    userCommutePreferencePlaceLocationApiRequestModel4 = (UserCommutePreferencePlaceLocationApiRequestModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, UserCommutePreferencePlaceLocationApiRequestModel$$serializer.f10263a, userCommutePreferencePlaceLocationApiRequestModel4);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    userCommutePreferencePlaceLocationApiRequestModel5 = (UserCommutePreferencePlaceLocationApiRequestModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, UserCommutePreferencePlaceLocationApiRequestModel$$serializer.f10263a, userCommutePreferencePlaceLocationApiRequestModel5);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str2;
            jDecodeLongElement = jDecodeLongElement2;
            userCommutePreferencePlaceLocationApiRequestModel = userCommutePreferencePlaceLocationApiRequestModel4;
            userCommutePreferencePlaceLocationApiRequestModel2 = userCommutePreferencePlaceLocationApiRequestModel5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SaveRideRequestApiModel(i, str, userCommutePreferencePlaceLocationApiRequestModel, userCommutePreferencePlaceLocationApiRequestModel2, jDecodeLongElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SaveRideRequestApiModel value = (SaveRideRequestApiModel) obj;
        Intrinsics.i(value, "value");
        String str = value.f10258a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str);
        }
        UserCommutePreferencePlaceLocationApiRequestModel$$serializer userCommutePreferencePlaceLocationApiRequestModel$$serializer = UserCommutePreferencePlaceLocationApiRequestModel$$serializer.f10263a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, userCommutePreferencePlaceLocationApiRequestModel$$serializer, value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, userCommutePreferencePlaceLocationApiRequestModel$$serializer, value.c);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
