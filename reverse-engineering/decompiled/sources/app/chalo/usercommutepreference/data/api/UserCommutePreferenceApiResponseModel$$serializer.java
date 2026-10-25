package app.chalo.usercommutepreference.data.api;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/usercommutepreference/data/api/UserCommutePreferenceApiResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/usercommutepreference/data/api/UserCommutePreferenceApiResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class UserCommutePreferenceApiResponseModel$$serializer implements GeneratedSerializer<UserCommutePreferenceApiResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UserCommutePreferenceApiResponseModel$$serializer f10231a;
    private static final SerialDescriptor descriptor;

    static {
        UserCommutePreferenceApiResponseModel$$serializer userCommutePreferenceApiResponseModel$$serializer = new UserCommutePreferenceApiResponseModel$$serializer();
        f10231a = userCommutePreferenceApiResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.usercommutepreference.data.api.UserCommutePreferenceApiResponseModel", userCommutePreferenceApiResponseModel$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("places", false);
        pluginGeneratedSerialDescriptor.j("commutePreference", false);
        pluginGeneratedSerialDescriptor.j("savedRides", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = UserCommutePreferenceApiResponseModel.d;
        return new KSerializer[]{BuiltinSerializersKt.c((KSerializer) lazyArr[0].getValue()), BuiltinSerializersKt.c(UserCommutePreferenceApiModel$$serializer.f10229a), BuiltinSerializersKt.c((KSerializer) lazyArr[2].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        List list;
        UserCommutePreferenceApiModel userCommutePreferenceApiModel;
        List list2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = UserCommutePreferenceApiResponseModel.d;
        List list3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            userCommutePreferenceApiModel = (UserCommutePreferenceApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, UserCommutePreferenceApiModel$$serializer.f10229a, null);
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            UserCommutePreferenceApiModel userCommutePreferenceApiModel2 = null;
            List list4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    userCommutePreferenceApiModel2 = (UserCommutePreferenceApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, UserCommutePreferenceApiModel$$serializer.f10229a, userCommutePreferenceApiModel2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), list4);
                    i2 |= 4;
                }
            }
            i = i2;
            list = list3;
            userCommutePreferenceApiModel = userCommutePreferenceApiModel2;
            list2 = list4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UserCommutePreferenceApiResponseModel(i, list, userCommutePreferenceApiModel, list2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        UserCommutePreferenceApiResponseModel value = (UserCommutePreferenceApiResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = UserCommutePreferenceApiResponseModel.d;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, (SerializationStrategy) lazyArr[0].getValue(), value.f10230a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, UserCommutePreferenceApiModel$$serializer.f10229a, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), value.c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
