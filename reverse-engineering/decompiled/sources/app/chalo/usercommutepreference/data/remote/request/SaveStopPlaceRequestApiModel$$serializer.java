package app.chalo.usercommutepreference.data.remote.request;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/usercommutepreference/data/remote/request/SaveStopPlaceRequestApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/usercommutepreference/data/remote/request/SaveStopPlaceRequestApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SaveStopPlaceRequestApiModel$$serializer implements GeneratedSerializer<SaveStopPlaceRequestApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SaveStopPlaceRequestApiModel$$serializer f10261a;
    private static final SerialDescriptor descriptor;

    static {
        SaveStopPlaceRequestApiModel$$serializer saveStopPlaceRequestApiModel$$serializer = new SaveStopPlaceRequestApiModel$$serializer();
        f10261a = saveStopPlaceRequestApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.usercommutepreference.data.remote.request.SaveStopPlaceRequestApiModel", saveStopPlaceRequestApiModel$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("tag", false);
        pluginGeneratedSerialDescriptor.j("label", false);
        pluginGeneratedSerialDescriptor.j(FirebaseAnalytics.Param.LOCATION, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{stringSerializer, stringSerializer, UserCommutePreferencePlaceLocationApiRequestModel$$serializer.f10263a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        UserCommutePreferencePlaceLocationApiRequestModel userCommutePreferencePlaceLocationApiRequestModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            userCommutePreferencePlaceLocationApiRequestModel = (UserCommutePreferencePlaceLocationApiRequestModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, UserCommutePreferencePlaceLocationApiRequestModel$$serializer.f10263a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String strDecodeStringElement4 = null;
            UserCommutePreferencePlaceLocationApiRequestModel userCommutePreferencePlaceLocationApiRequestModel2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    userCommutePreferencePlaceLocationApiRequestModel2 = (UserCommutePreferencePlaceLocationApiRequestModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, UserCommutePreferencePlaceLocationApiRequestModel$$serializer.f10263a, userCommutePreferencePlaceLocationApiRequestModel2);
                    i2 |= 4;
                }
            }
            i = i2;
            strDecodeStringElement = strDecodeStringElement3;
            strDecodeStringElement2 = strDecodeStringElement4;
            userCommutePreferencePlaceLocationApiRequestModel = userCommutePreferencePlaceLocationApiRequestModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SaveStopPlaceRequestApiModel(i, strDecodeStringElement, strDecodeStringElement2, userCommutePreferencePlaceLocationApiRequestModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SaveStopPlaceRequestApiModel value = (SaveStopPlaceRequestApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f10260a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, UserCommutePreferencePlaceLocationApiRequestModel$$serializer.f10263a, value.c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
