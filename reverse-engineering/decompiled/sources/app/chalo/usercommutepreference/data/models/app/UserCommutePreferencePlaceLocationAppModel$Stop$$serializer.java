package app.chalo.usercommutepreference.data.models.app;

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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/usercommutepreference/data/models/app/UserCommutePreferencePlaceLocationAppModel.Stop.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferencePlaceLocationAppModel$Stop;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class UserCommutePreferencePlaceLocationAppModel$Stop$$serializer implements GeneratedSerializer<UserCommutePreferencePlaceLocationAppModel.Stop> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UserCommutePreferencePlaceLocationAppModel$Stop$$serializer f10251a;
    private static final SerialDescriptor descriptor;

    static {
        UserCommutePreferencePlaceLocationAppModel$Stop$$serializer userCommutePreferencePlaceLocationAppModel$Stop$$serializer = new UserCommutePreferencePlaceLocationAppModel$Stop$$serializer();
        f10251a = userCommutePreferencePlaceLocationAppModel$Stop$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel.Stop", userCommutePreferencePlaceLocationAppModel$Stop$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("cityId", false);
        pluginGeneratedSerialDescriptor.j("stopName", false);
        pluginGeneratedSerialDescriptor.j("stopAddress", false);
        pluginGeneratedSerialDescriptor.j("latitude", false);
        pluginGeneratedSerialDescriptor.j("longitude", false);
        pluginGeneratedSerialDescriptor.j("searchPartner", false);
        pluginGeneratedSerialDescriptor.j("placeLocationType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = UserCommutePreferencePlaceLocationAppModel.Stop.j;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        DoubleSerializer doubleSerializer = DoubleSerializer.f18137a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.c(stringSerializer), doubleSerializer, doubleSerializer, stringSerializer, lazyArr[7].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        UserCommutePreferenceStopPlaceResultType userCommutePreferenceStopPlaceResultType;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        double d;
        double d2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = UserCommutePreferencePlaceLocationAppModel.Stop.j;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, null);
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 4);
            double dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 5);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            userCommutePreferenceStopPlaceResultType = (UserCommutePreferenceStopPlaceResultType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), null);
            str = strDecodeStringElement2;
            str5 = strDecodeStringElement5;
            i = 255;
            str4 = str6;
            str3 = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            d = dDecodeDoubleElement;
            d2 = dDecodeDoubleElement2;
        } else {
            boolean z = true;
            int i2 = 0;
            UserCommutePreferenceStopPlaceResultType userCommutePreferenceStopPlaceResultType2 = null;
            String str7 = null;
            String strDecodeStringElement6 = null;
            double dDecodeDoubleElement3 = 0.0d;
            double dDecodeDoubleElement4 = 0.0d;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i2 |= 1;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        continue;
                    case 1:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                        continue;
                    case 2:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str7);
                        i2 |= 8;
                        break;
                    case 4:
                        dDecodeDoubleElement3 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        dDecodeDoubleElement4 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 5);
                        i2 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 |= 64;
                        break;
                    case 7:
                        userCommutePreferenceStopPlaceResultType2 = (UserCommutePreferenceStopPlaceResultType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), userCommutePreferenceStopPlaceResultType2);
                        i2 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i2;
            userCommutePreferenceStopPlaceResultType = userCommutePreferenceStopPlaceResultType2;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement7;
            str3 = strDecodeStringElement8;
            str4 = str7;
            str5 = strDecodeStringElement6;
            d = dDecodeDoubleElement3;
            d2 = dDecodeDoubleElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UserCommutePreferencePlaceLocationAppModel.Stop(i, str, str2, str3, str4, d, d2, str5, userCommutePreferenceStopPlaceResultType);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        UserCommutePreferencePlaceLocationAppModel.Stop value = (UserCommutePreferencePlaceLocationAppModel.Stop) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = UserCommutePreferencePlaceLocationAppModel.Stop.j;
        String str = value.b;
        UserCommutePreferenceStopPlaceResultType userCommutePreferenceStopPlaceResultType = value.i;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, value.e);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 4, value.f);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 5, value.g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.h);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || userCommutePreferenceStopPlaceResultType != UserCommutePreferenceStopPlaceResultType.STOP) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, (SerializationStrategy) lazyArr[7].getValue(), userCommutePreferenceStopPlaceResultType);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
