package app.chalo.validationsdk.legacy.ios;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/validationsdk/legacy/ios/BLEValidationInitializationOptions.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/validationsdk/legacy/ios/BLEValidationInitializationOptions;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class BLEValidationInitializationOptions$$serializer implements GeneratedSerializer<BLEValidationInitializationOptions> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BLEValidationInitializationOptions$$serializer f10670a;
    private static final SerialDescriptor descriptor;

    static {
        BLEValidationInitializationOptions$$serializer bLEValidationInitializationOptions$$serializer = new BLEValidationInitializationOptions$$serializer();
        f10670a = bLEValidationInitializationOptions$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.validationsdk.legacy.ios.BLEValidationInitializationOptions", bLEValidationInitializationOptions$$serializer, 13);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("tone", false);
        pluginGeneratedSerialDescriptor.j("qrCode", false);
        pluginGeneratedSerialDescriptor.j("activationTime", false);
        pluginGeneratedSerialDescriptor.j("bleOnboardingTutorialAppearanceCount", false);
        pluginGeneratedSerialDescriptor.j("timeoutToShowQrValidationOption", false);
        pluginGeneratedSerialDescriptor.j("bleTutorialGif", false);
        pluginGeneratedSerialDescriptor.j("bleOnboardingTutorialGif", false);
        pluginGeneratedSerialDescriptor.j("bleTapToPayGif", false);
        pluginGeneratedSerialDescriptor.j("blePermissionTutorialGif", false);
        pluginGeneratedSerialDescriptor.j("pass", true);
        pluginGeneratedSerialDescriptor.j("mobileTicket", true);
        pluginGeneratedSerialDescriptor.j("instantTicket", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{BLEValidationInitializationOptions.n[0].getValue(), stringSerializer, stringSerializer, intSerializer, intSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.c(ViewProductPass$$serializer.f10678a), BuiltinSerializersKt.c(ViewProductMobileTicket$$serializer.f10676a), BuiltinSerializersKt.c(ViewProductInstantTicket$$serializer.f10672a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        ViewProductType viewProductType;
        ViewProductPass viewProductPass;
        ViewProductInstantTicket viewProductInstantTicket;
        ViewProductMobileTicket viewProductMobileTicket;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        int i3;
        int i4;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = BLEValidationInitializationOptions.n;
        int i5 = 10;
        int i6 = 9;
        int i7 = 4;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            ViewProductType viewProductType2 = (ViewProductType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            ViewProductPass viewProductPass2 = (ViewProductPass) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, ViewProductPass$$serializer.f10678a, null);
            ViewProductMobileTicket viewProductMobileTicket2 = (ViewProductMobileTicket) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, ViewProductMobileTicket$$serializer.f10676a, null);
            i = 8191;
            viewProductInstantTicket = (ViewProductInstantTicket) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, ViewProductInstantTicket$$serializer.f10672a, null);
            str = strDecodeStringElement;
            str2 = strDecodeStringElement2;
            viewProductPass = viewProductPass2;
            str6 = strDecodeStringElement6;
            str4 = strDecodeStringElement4;
            str3 = strDecodeStringElement3;
            i2 = iDecodeIntElement3;
            i3 = iDecodeIntElement;
            str5 = strDecodeStringElement5;
            i4 = iDecodeIntElement2;
            viewProductMobileTicket = viewProductMobileTicket2;
            viewProductType = viewProductType2;
        } else {
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            ViewProductType viewProductType3 = null;
            ViewProductInstantTicket viewProductInstantTicket2 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            boolean z = true;
            i = 0;
            ViewProductPass viewProductPass3 = null;
            ViewProductMobileTicket viewProductMobileTicket3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i6 = 9;
                        break;
                    case 0:
                        viewProductType3 = (ViewProductType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), viewProductType3);
                        i |= 1;
                        i7 = i7;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 1:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        i7 = i7;
                        i5 = 10;
                        break;
                    case 2:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        i7 = i7;
                        i5 = 10;
                        break;
                    case 3:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i |= 8;
                        i7 = i7;
                        i5 = 10;
                        break;
                    case 4:
                        int i8 = i7;
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i8);
                        i |= 16;
                        i7 = i8;
                        break;
                    case 5:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i |= 32;
                        i7 = 4;
                        break;
                    case 6:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        i7 = 4;
                        break;
                    case 7:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i |= 128;
                        i7 = 4;
                        break;
                    case 8:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i |= 256;
                        i7 = 4;
                        break;
                    case 9:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i |= 512;
                        i7 = 4;
                        break;
                    case 10:
                        viewProductPass3 = (ViewProductPass) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, ViewProductPass$$serializer.f10678a, viewProductPass3);
                        i |= 1024;
                        i7 = 4;
                        break;
                    case 11:
                        viewProductMobileTicket3 = (ViewProductMobileTicket) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, ViewProductMobileTicket$$serializer.f10676a, viewProductMobileTicket3);
                        i |= 2048;
                        i7 = 4;
                        break;
                    case 12:
                        viewProductInstantTicket2 = (ViewProductInstantTicket) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, ViewProductInstantTicket$$serializer.f10672a, viewProductInstantTicket2);
                        i |= 4096;
                        i7 = 4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            viewProductType = viewProductType3;
            viewProductPass = viewProductPass3;
            viewProductInstantTicket = viewProductInstantTicket2;
            viewProductMobileTicket = viewProductMobileTicket3;
            str = strDecodeStringElement7;
            str2 = strDecodeStringElement8;
            str3 = strDecodeStringElement9;
            str4 = strDecodeStringElement10;
            str5 = strDecodeStringElement11;
            str6 = strDecodeStringElement12;
            i2 = iDecodeIntElement4;
            i3 = iDecodeIntElement5;
            i4 = iDecodeIntElement6;
        }
        int i9 = i;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BLEValidationInitializationOptions(i9, viewProductType, str, str2, i3, i4, i2, str3, str4, str5, str6, viewProductPass, viewProductMobileTicket, viewProductInstantTicket);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        BLEValidationInitializationOptions value = (BLEValidationInitializationOptions) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SerializationStrategy serializationStrategy = (SerializationStrategy) BLEValidationInitializationOptions.n[0].getValue();
        ViewProductType viewProductType = value.f10669a;
        ViewProductInstantTicket viewProductInstantTicket = value.m;
        ViewProductMobileTicket viewProductMobileTicket = value.l;
        ViewProductPass viewProductPass = value.k;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, serializationStrategy, viewProductType);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.h);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 9, value.j);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || viewProductPass != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, ViewProductPass$$serializer.f10678a, viewProductPass);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || viewProductMobileTicket != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, ViewProductMobileTicket$$serializer.f10676a, viewProductMobileTicket);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || viewProductInstantTicket != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, ViewProductInstantTicket$$serializer.f10672a, viewProductInstantTicket);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
